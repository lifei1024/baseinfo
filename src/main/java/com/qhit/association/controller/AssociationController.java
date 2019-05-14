package com.qhit.association.controller; 

import com.qhit.association.pojo.Association; 
import com.qhit.association.service.IAssociationService;
import com.qhit.label.pojo.Label;
import com.qhit.label.service.ILabelService;
import com.qhit.util.CommonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

/** 
* Created by GeneratorCode on 2019/05/14
*/ 

@RestController 
@RequestMapping("/association") 
public class AssociationController { 

    @Resource 
    IAssociationService associationService; 
    @Resource
    ILabelService labelService;
    @RequestMapping("/insert") 
    public void insert(Association association) { 
        associationService.insert(association); 
    }

    @RequestMapping("/delete") 
    public void delete(Integer asId) { 
        associationService.delete(asId); 
    } 

    @RequestMapping("/update") 
    public void update(Association association) { 
        associationService.update(association); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(Association association) { 
        associationService.updateSelective(association); 
    } 

    @RequestMapping("/load") 
    public Association load(Integer asId) { 
        Association association = associationService.findById(asId); 
        return association; 
    } 

    @RequestMapping("/list") 
    public List<Association> list()  { 
        List<Association> list = associationService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<Association> search(Association association) { 
        List<Association> list = associationService.search(association); 
        return list; 
    }
    @RequestMapping("/exportToExcel")
    public void exportToExcel(Integer asId) throws Exception {
        String title = "社团成员信息表";
        String[] name = {"序号","姓名","性别","年龄","社团","邮箱","电话"};
        //获取数据
        Connection connection = CommonUtil.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT bu.user_id,bu.name,\n" +
                "CASE bu.user_sex WHEN 1 THEN '男' ELSE '女' END AS user_age,\n" +
                "bu.user_age,ass.as_name,bu.email,bu.telno\n" +
                "FROM base_user bu \n" +
                "JOIN association_member am ON bu.user_id=am.user_id\n" +
                "JOIN association ass ON am.as_id = ass.as_id \n" +
                "WHERE ass.as_id="+asId;
        ResultSet rs = statement.executeQuery(sql);

        CommonUtil.exportExcel(title,name,rs);

    }

    @RequestMapping("/associationInfo")
    public List associationInfo() {
        List<Association> list = associationService.findAll();
        List lists = new ArrayList();
        for (int i = 0; i <list.size() ; i++) {
            Map map = new HashMap();
            map.put("asId",list.get(i).getAsId());
            map.put("asName",list.get(i).getAsName());
            map.put("name",list.get(i).getName());
            map.put("describe",list.get(i).getDescribe());
            map.put("asImage",list.get(i).getAsImage());
            map.put("exaState",list.get(i).getExaState());
            List<Label> labellist=labelService.findByAsId(list.get(i).getAsId());
            List listLabel = new ArrayList();
            for (int j = 0; j <labellist.size(); j++) {
                Map lableMap = new HashMap();
                lableMap.put("labelId",labellist.get(j).getLabelId());
                lableMap.put("labelName",labellist.get(j).getLabelName());
                listLabel.add(lableMap);
            }
            map.put("asLabel",listLabel);
            lists.add(map);
        }
        return lists;
    }
} 
