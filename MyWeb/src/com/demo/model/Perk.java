package com.demo.model;

/**
 * Perk entity. @author MyEclipse Persistence Tools
 */
public class Perk extends AbstractPerk implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Perk() {
    }

	/** minimal constructor */
    public Perk(Integer perkId) {
        super(perkId);        
    }
    
    /** full constructor */
    public Perk(Integer perkId, Campaign campaign, String perkAmount, String description, Integer numberClaimed, Integer numberAvailiable) {
        super(perkId, campaign, perkAmount, description, numberClaimed, numberAvailiable);        
    }
   
}
