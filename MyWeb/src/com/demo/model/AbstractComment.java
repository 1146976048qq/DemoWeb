package com.demo.model;

import java.sql.Timestamp;


/**
 * AbstractComment entity provides the base persistence definition of the Comment entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComment  implements java.io.Serializable {


    // Fields    

     private Integer commentId;
     private Campaign campaign;
     private String commentText;
     private Timestamp publishTime;
     private String modifier;
     private Timestamp modifyTime;


    // Constructors

    /** default constructor */
    public AbstractComment() {
    }

	/** minimal constructor */
    public AbstractComment(Integer commentId) {
        this.commentId = commentId;
    }
    
    /** full constructor */
    public AbstractComment(Integer commentId, Campaign campaign, String commentText, Timestamp publishTime, String modifier, Timestamp modifyTime) {
        this.commentId = commentId;
        this.campaign = campaign;
        this.commentText = commentText;
        this.publishTime = publishTime;
        this.modifier = modifier;
        this.modifyTime = modifyTime;
    }

   
    // Property accessors

    public Integer getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }
    
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public String getCommentText() {
        return this.commentText;
    }
    
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Timestamp getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
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
   








}