package com.qhit.label.controller; 

import com.qhit.label.pojo.Label; 
import com.qhit.label.service.ILabelService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2019/05/14
*/ 

@RestController 
@RequestMapping("/label") 
public class LabelController { 

    @Resource 
    ILabelService labelService; 

    @RequestMapping("/insert") 
    public void insert(Label label) { 
        labelService.insert(label); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer labelId) { 
        labelService.delete(labelId); 
    } 

    @RequestMapping("/update") 
    public void update(Label label) { 
        labelService.update(label); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(Label label) { 
        labelService.updateSelective(label); 
    } 

    @RequestMapping("/load") 
    public Label load(Integer labelId) { 
        Label label = labelService.findById(labelId); 
        return label; 
    } 

    @RequestMapping("/list") 
    public List<Label> list()  { 
        List<Label> list = labelService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<Label> search(Label label) { 
        List<Label> list = labelService.search(label); 
        return list; 
    } 

} 
