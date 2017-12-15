package com.demo.model;

import java.sql.Timestamp;


/**
 * Contribution entity. @author MyEclipse Persistence Tools
 */
public class Contribution extends AbstractContribution implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Contribution() {
    }

    
    /** full constructor */
    public Contribution(Campaign campaign, Integer perkId, Integer amount, String contributeBy, String funderId, Timestamp contributionTime) {
        super(campaign, perkId, amount, contributeBy, funderId, contributionTime);        
    }
   
}
