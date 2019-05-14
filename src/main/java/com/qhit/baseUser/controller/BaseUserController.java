package com.qhit.baseUser.controller; 

import com.qhit.baseUser.pojo.BaseUser; 
import com.qhit.baseUser.service.IBaseUserService;
import com.qhit.util.HttpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2019/05/07
*/ 

@RestController 
@RequestMapping("/baseUser") 
public class BaseUserController { 

    @Resource 
    IBaseUserService baseUserService;
    @Resource
    HttpUtil httpUtil;

    @RequestMapping("/insert") 
    public void insert(BaseUser baseUser) { 
        baseUserService.insert(baseUser); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer userId) { 
        baseUserService.delete(userId); 
    } 

    @RequestMapping("/update") 
    public void update(BaseUser baseUser) { 
        baseUserService.update(baseUser); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(BaseUser baseUser) { 
        baseUserService.updateSelective(baseUser); 
    } 

    @RequestMapping("/load") 
    public BaseUser load(Integer userId) { 
        BaseUser baseUser = baseUserService.findById(userId); 
        return baseUser; 
    } 

    @RequestMapping("/list") 
    public List<BaseUser> list(HttpSession session)  {
        List<BaseUser> list = baseUserService.findAll();
        session.setAttribute("nn","sdasda");
        return list;
    } 

    @RequestMapping("/search") 
    public List<BaseUser> search(BaseUser baseUser, HttpSession session) {
        List<BaseUser> list = baseUserService.search(baseUser);
        Object baseUserLogin = session.getAttribute("zeng");
        System.out.println(baseUserLogin);
        return list; 
    } 

} 
