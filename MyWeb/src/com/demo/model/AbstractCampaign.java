package com.demo.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractCampaign entity provides the base persistence definition of the Campaign entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCampaign  implements java.io.Serializable {


    // Fields    

     private Integer campaignId;
     private User user;
     private Integer catagoryId;
     private String title;
     private String titleUrl;
     private String descrip;
     private String descripUrl;
     private String status;
     private Timestamp createdTime;
     private Timestamp updatedTime;
     private Integer fundGoal;
     private Integer fundCollected;
     private String donePercent;
     private Integer fundingDays;
     private String fundingType;
     private String categoryName;
     private Integer supportAmount;
     private Boolean isPassed;
     private Set contributions = new HashSet(0);
     private Set campaignUpdateses = new HashSet(0);
     private Set comments = new HashSet(0);
     private Set perks = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractCampaign() {
    }

	/** minimal constructor */
    public AbstractCampaign(Integer campaignId) {
        this.campaignId = campaignId;
    }
    
    /** full constructor */
    public AbstractCampaign(Integer campaignId, User user, Integer catagoryId, String title, String titleUrl, String descrip, String descripUrl, String status, Timestamp createdTime, Timestamp updatedTime, Integer fundGoal, Integer fundCollected, String donePercent, Integer fundingDays, String fundingType, String categoryName, Integer supportAmount, Boolean isPassed, Set contributions, Set campaignUpdateses, Set comments, Set perks) {
        this.campaignId = campaignId;
        this.user = user;
        this.catagoryId = catagoryId;
        this.title = title;
        this.titleUrl = titleUrl;
        this.descrip = descrip;
        this.descripUrl = descripUrl;
        this.status = status;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.fundGoal = fundGoal;
        this.fundCollected = fundCollected;
        this.donePercent = donePercent;
        this.fundingDays = fundingDays;
        this.fundingType = fundingType;
        this.categoryName = categoryName;
        this.supportAmount = supportAmount;
        this.isPassed = isPassed;
        this.contributions = contributions;
        this.campaignUpdateses = campaignUpdateses;
        this.comments = comments;
        this.perks = perks;
    }

   
    // Property accessors

    public Integer getCampaignId() {
        return this.campaignId;
    }
    
    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCatagoryId() {
        return this.catagoryId;
    }
    
    public void setCatagoryId(Integer catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleUrl() {
        return this.titleUrl;
    }
    
    public void setTitleUrl(String titleUrl) {
        this.titleUrl = titleUrl;
    }

    public String getDescrip() {
        return this.descrip;
    }
    
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getDescripUrl() {
        return this.descripUrl;
    }
    
    public void setDescripUrl(String descripUrl) {
        this.descripUrl = descripUrl;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getUpdatedTime() {
        return this.updatedTime;
    }
    
    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getFundGoal() {
        return this.fundGoal;
    }
    
    public void setFundGoal(Integer fundGoal) {
        this.fundGoal = fundGoal;
    }

    public Integer getFundCollected() {
        return this.fundCollected;
    }
    
    public void setFundCollected(Integer fundCollected) {
        this.fundCollected = fundCollected;
    }

    public String getDonePercent() {
        return this.donePercent;
    }
    
    public void setDonePercent(String donePercent) {
        this.donePercent = donePercent;
    }

    public Integer getFundingDays() {
        return this.fundingDays;
    }
    
    public void setFundingDays(Integer fundingDays) {
        this.fundingDays = fundingDays;
    }

    public String getFundingType() {
        return this.fundingType;
    }
    
    public void setFundingType(String fundingType) {
        this.fundingType = fundingType;
    }

    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getSupportAmount() {
        return this.supportAmount;
    }
    
    public void setSupportAmount(Integer supportAmount) {
        this.supportAmount = supportAmount;
    }

    public Boolean getIsPassed() {
        return this.isPassed;
    }
    
    public void setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
    }

    public Set getContributions() {
        return this.contributions;
    }
    
    public void setContributions(Set contributions) {
        this.contributions = contributions;
    }

    public Set getCampaignUpdateses() {
        return this.campaignUpdateses;
    }
    
    public void setCampaignUpdateses(Set campaignUpdateses) {
        this.campaignUpdateses = campaignUpdateses;
    }

    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }

    public Set getPerks() {
        return this.perks;
    }
    
    public void setPerks(Set perks) {
        this.perks = perks;
    }
   








}