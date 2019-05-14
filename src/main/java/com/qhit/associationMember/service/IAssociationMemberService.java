package com.qhit.associationMember.service;

import java.util.List;
import com.qhit.associationMember.pojo.AssociationMember;
/**
* Created by GeneratorCode on 2019/05/14
*/
public interface IAssociationMemberService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    AssociationMember findById(Object id);

    List<AssociationMember> search(AssociationMember associationMember);

}