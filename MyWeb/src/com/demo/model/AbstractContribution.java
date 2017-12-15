package com.demo.model;

import java.sql.Timestamp;


/**
 * AbstractContribution entity provides the base persistence definition of the Contribution entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractContribution  implements java.io.Serializable {


    // Fields    

     private Integer contributeId;
     private Campaign campaign;
     private Integer perkId;
     private Integer amount;
     private String contributeBy;
     private String funderId;
     private Timestamp contributionTime;


    // Constructors

    /** default constructor */
    public AbstractContribution() {
    }

    
    /** full constructor */
    public AbstractContribution(Campaign campaign, Integer perkId, Integer amount, String contributeBy, String funderId, Timestamp contributionTime) {
        this.campaign = campaign;
        this.perkId = perkId;
        this.amount = amount;
        this.contributeBy = contributeBy;
        this.funderId = funderId;
        this.contributionTime = contributionTime;
    }

   
    // Property accessors

    public Integer getContributeId() {
        return this.contributeId;
    }
    
    public void setContributeId(Integer contributeId) {
        this.contributeId = contributeId;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }
    
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public Integer getPerkId() {
        return this.perkId;
    }
    
    public void setPerkId(Integer perkId) {
        this.perkId = perkId;
    }

    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getContributeBy() {
        return this.contributeBy;
    }
    
    public void setContributeBy(String contributeBy) {
        this.contributeBy = contributeBy;
    }

    public String getFunderId() {
        return this.funderId;
    }
    
    public void setFunderId(String funderId) {
        this.funderId = funderId;
    }

    public Timestamp getContributionTime() {
        return this.contributionTime;
    }
    
    public void setContributionTime(Timestamp contributionTime) {
        this.contributionTime = contributionTime;
    }
   








}