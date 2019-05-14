package com.qhit.label.dao;

import org.apache.ibatis.annotations.Mapper;
import com.qhit.label.pojo.Label;
import java.util.List;

/** 
* Created by GeneratorCode on 2019/05/14
*/

@Mapper  
public interface ILabelDao {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object object);

    List freeFind(String sql);

    List findAll();

    List findById(Object id);

    boolean freeUpdate(String sql);

    List<Label> search(Label label);

    List findByLabelName(Object labelName);

    List<Label> findByAsId(Integer asId);
}