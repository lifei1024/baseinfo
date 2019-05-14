package com.qhit.associationMember.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.associationMember.pojo.AssociationMember;
import java.util.List;

/** 
* Created by GeneratorCode on 2019/05/14
*/

@Mapper  
public interface IAssociationMemberDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<AssociationMember> search(AssociationMember associationMember);

    List findByUserId(Object userId);

    List findByAsId(Object asId);

}