package com.demo.model;

import java.sql.Timestamp;
import java.util.Set;


/**
 * Campaign entity. @author MyEclipse Persistence Tools
 */
public class Campaign extends AbstractCampaign implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Campaign() {
    }

	/** minimal constructor */
    public Campaign(Integer campaignId) {
        super(campaignId);        
    }
    
    /** full constructor */
    public Campaign(Integer campaignId, User user, Integer catagoryId, String title, String titleUrl, String descrip, String descripUrl, String status, Timestamp createdTime, Timestamp updatedTime, Integer fundGoal, Integer fundCollected, String donePercent, Integer fundingDays, String fundingType, String categoryName, Integer supportAmount, Boolean isPassed, Set contributions, Set campaignUpdateses, Set comments, Set perks) {
        super(campaignId, user, catagoryId, title, titleUrl, descrip, descripUrl, status, createdTime, updatedTime, fundGoal, fundCollected, donePercent, fundingDays, fundingType, categoryName, supportAmount, isPassed, contributions, campaignUpdateses, comments, perks);        
    }
   
}
