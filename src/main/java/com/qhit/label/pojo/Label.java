package com.qhit.label.pojo;


/** 
* Created by GeneratorCode on 2019/05/14
*/ 

public class Label { 
    private Integer labelId;    //标签——主键 
    private String labelName;    //标签名 

    public Integer getLabelId() { 
        return labelId;
    }

    public void setLabelId(Integer labelId) { 
        this.labelId = labelId;
    } 

    public String getLabelName() { 
        return labelName;
    }

    public void setLabelName(String labelName) { 
        this.labelName = labelName;
    }

 }