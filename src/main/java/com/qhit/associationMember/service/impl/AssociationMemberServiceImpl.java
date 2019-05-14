package com.qhit.associationMember.service.impl;

import com.qhit.associationMember.service.IAssociationMemberService;
import java.util.List;
import com.qhit.associationMember.dao.IAssociationMemberDao;
import com.qhit.associationMember.pojo.AssociationMember;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2019/05/14
*/

@Service 
public class AssociationMemberServiceImpl  implements IAssociationMemberService {

    @Resource 
    IAssociationMemberDao dao;

    @Override 
    public boolean insert(Object object) { 
        return dao.insert(object); 
    } 

    @Override 
    public boolean update(Object object) { 
        return dao.update(object); 
    } 

    @Override 
    public boolean updateSelective(Object object) { 
        return dao.updateSelective(object); 
    } 

    @Override 
    public boolean delete(Object id) { 
        AssociationMember associationMember = findById(id); 
        return dao.delete(associationMember); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public AssociationMember findById(Object id) { 
        List<AssociationMember> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<AssociationMember> search(AssociationMember associationMember) { 
        return dao.search(associationMember); 
    } 

}