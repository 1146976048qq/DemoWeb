package com.demo.model;

import java.sql.Timestamp;


/**
 * AbstractCampaignUpdates entity provides the base persistence definition of the CampaignUpdates entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCampaignUpdates  implements java.io.Serializable {


    // Fields    

     private Integer updateId;
     private Campaign campaign;
     private String content;
     private String imageUrl;
     private String modifier;
     private Timestamp modifyTime;
     private Timestamp publishTime;


    // Constructors

    /** default constructor */
    public AbstractCampaignUpdates() {
    }

	/** minimal constructor */
    public AbstractCampaignUpdates(Integer updateId) {
        this.updateId = updateId;
    }
    
    /** full constructor */
    public AbstractCampaignUpdates(Integer updateId, Campaign campaign, String content, String imageUrl, String modifier, Timestamp modifyTime, Timestamp publishTime) {
        this.updateId = updateId;
        this.campaign = campaign;
        this.content = content;
        this.imageUrl = imageUrl;
        this.modifier = modifier;
        this.modifyTime = modifyTime;
        this.publishTime = publishTime;
    }

   
    // Property accessors

    public Integer getUpdateId() {
        return this.updateId;
    }
    
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }
    
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getModifier() {
        return this.modifier;
    }
    
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Timestamp getModifyTime() {
        return this.modifyTime;
    }
    
    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Timestamp getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }
   








}