package com.demo.model;

import java.sql.Timestamp;


/**
 * Comment entity. @author MyEclipse Persistence Tools
 */
public class Comment extends AbstractComment implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Comment() {
    }

	/** minimal constructor */
    public Comment(Integer commentId) {
        super(commentId);        
    }
    
    /** full constructor */
    public Comment(Integer commentId, Campaign campaign, String commentText, Timestamp publishTime, String modifier, Timestamp modifyTime) {
        super(commentId, campaign, commentText, publishTime, modifier, modifyTime);        
    }
   
}
