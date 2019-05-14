package com.qhit.associationMember.pojo;


/** 
* Created by GeneratorCode on 2019/05/14
*/ 

public class AssociationMember { 
    private Integer amId;    //成员——主键 
    private Integer userId;    //成员 
    private Integer asId;    //社团id 

    public Integer getAmId() { 
        return amId;
    }

    public void setAmId(Integer amId) { 
        this.amId = amId;
    } 

    public Integer getUserId() { 
        return userId;
    }

    public void setUserId(Integer userId) { 
        this.userId = userId;
    } 

    public Integer getAsId() { 
        return asId;
    }

    public void setAsId(Integer asId) { 
        this.asId = asId;
    } 


 }