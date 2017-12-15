package com.demo.model;

/**
 * AbstractPerk entity provides the base persistence definition of the Perk entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPerk  implements java.io.Serializable {


    // Fields    

     private Integer perkId;
     private Campaign campaign;
     private String perkAmount;
     private String description;
     private Integer numberClaimed;
     private Integer numberAvailiable;


    // Constructors

    /** default constructor */
    public AbstractPerk() {
    }

	/** minimal constructor */
    public AbstractPerk(Integer perkId) {
        this.perkId = perkId;
    }
    
    /** full constructor */
    public AbstractPerk(Integer perkId, Campaign campaign, String perkAmount, String description, Integer numberClaimed, Integer numberAvailiable) {
        this.perkId = perkId;
        this.campaign = campaign;
        this.perkAmount = perkAmount;
        this.description = description;
        this.numberClaimed = numberClaimed;
        this.numberAvailiable = numberAvailiable;
    }

   
    // Property accessors

    public Integer getPerkId() {
        return this.perkId;
    }
    
    public void setPerkId(Integer perkId) {
        this.perkId = perkId;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }
    
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public String getPerkAmount() {
        return this.perkAmount;
    }
    
    public void setPerkAmount(String perkAmount) {
        this.perkAmount = perkAmount;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberClaimed() {
        return this.numberClaimed;
    }
    
    public void setNumberClaimed(Integer numberClaimed) {
        this.numberClaimed = numberClaimed;
    }

    public Integer getNumberAvailiable() {
        return this.numberAvailiable;
    }
    
    public void setNumberAvailiable(Integer numberAvailiable) {
        this.numberAvailiable = numberAvailiable;
    }
   








}