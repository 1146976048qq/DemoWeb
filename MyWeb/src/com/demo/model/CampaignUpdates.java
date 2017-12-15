package com.demo.model;

import java.sql.Timestamp;


/**
 * CampaignUpdates entity. @author MyEclipse Persistence Tools
 */
public class CampaignUpdates extends AbstractCampaignUpdates implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public CampaignUpdates() {
    }

	/** minimal constructor */
    public CampaignUpdates(Integer updateId) {
        super(updateId);        
    }
    
    /** full constructor */
    public CampaignUpdates(Integer updateId, Campaign campaign, String content, String imageUrl, String modifier, Timestamp modifyTime, Timestamp publishTime) {
        super(updateId, campaign, content, imageUrl, modifier, modifyTime, publishTime);        
    }
   
}
