package com.qhit.baseDevtype.service;

import com.qhit.baseDevtype.pojo.BaseDevtype;

import java.util.List;

/**
* Created by GeneratorCode on 2019/04/02
*/
public interface IBaseDevtypeService {

    boolean insert(Object object);

    boolean  update(Object object);

    boolean  updateSelective(Object object);

    boolean delete(Object id);

    List findAll();

    BaseDevtype findById(Object id);

    List<BaseDevtype> search(BaseDevtype baseDevtype);

}