package com.qhit.session.controller;


import com.alibaba.fastjson.JSON;
import com.qhit.baseUser.pojo.BaseUser;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;



@RestController
@RequestMapping("/session")
public class sessionController {



    @RequestMapping("/setSession")
    public void setSession(HttpSession session, Class clazz , Map map, BaseUser baseUser) {
        System.out.println(baseUser.toString());
        JSONObject jsonObject = JSONObject.fromObject(baseUser);
        System.out.println(jsonObject);
        session.setAttribute("baseUser",jsonObject);
    }
    @RequestMapping("/getSession")
    public Map getSession(HttpSession session) {
        Object json = session.getAttribute("baseUser");
        JSONObject jsonObject = JSONObject.fromObject(json);
        Map map = (Map) JSON.parseObject(String.valueOf(jsonObject));
        return map;
    }
}
