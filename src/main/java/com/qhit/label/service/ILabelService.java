package com.qhit.label.service;

import java.util.List;
import com.qhit.label.pojo.Label;
/**
* Created by GeneratorCode on 2019/05/14
*/
public interface ILabelService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    Label findById(Object id);

    List<Label> search(Label label);

    List<Label> findByAsId(Integer asId);
}