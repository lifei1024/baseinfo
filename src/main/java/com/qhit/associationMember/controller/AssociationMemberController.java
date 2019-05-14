package com.qhit.associationMember.controller; 

import com.qhit.associationMember.pojo.AssociationMember; 
import com.qhit.associationMember.service.IAssociationMemberService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 

/** 
* Created by GeneratorCode on 2019/05/14
*/ 

@RestController 
@RequestMapping("/associationMember") 
public class AssociationMemberController { 

    @Resource 
    IAssociationMemberService associationMemberService; 

    @RequestMapping("/insert") 
    public void insert(AssociationMember associationMember) { 
        associationMemberService.insert(associationMember); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer amId) { 
        associationMemberService.delete(amId); 
    } 

    @RequestMapping("/update") 
    public void update(AssociationMember associationMember) { 
        associationMemberService.update(associationMember); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(AssociationMember associationMember) { 
        associationMemberService.updateSelective(associationMember); 
    } 

    @RequestMapping("/load") 
    public AssociationMember load(Integer amId) { 
        AssociationMember associationMember = associationMemberService.findById(amId); 
        return associationMember; 
    } 

    @RequestMapping("/list") 
    public List<AssociationMember> list()  { 
        List<AssociationMember> list = associationMemberService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<AssociationMember> search(AssociationMember associationMember) { 
        List<AssociationMember> list = associationMemberService.search(associationMember); 
        return list; 
    } 

} 
