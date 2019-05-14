package com.qhit.label.service.impl;

import com.qhit.label.service.ILabelService;
import java.util.List;
import com.qhit.label.dao.ILabelDao;
import com.qhit.label.pojo.Label;
import org.springframework.stereotype.Service;
import javax.annotation.Resource; 

/**
* Created by GeneratorCode on 2019/05/14
*/

@Service 
public class LabelServiceImpl  implements ILabelService {

    @Resource 
    ILabelDao dao;

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
        Label label = findById(id); 
        return dao.delete(label); 
    } 

    @Override 
    public List findAll() { 
        return dao.findAll(); 
    } 

    @Override 
    public Label findById(Object id) { 
        List<Label> list = dao.findById(id); 
        return  list.get(0); 
    } 

    @Override 
    public List<Label> search(Label label) { 
        return dao.search(label); 
    }

    @Override
    public List<Label> findByAsId(Integer asId) {
        return dao.findByAsId(asId);
    }

}