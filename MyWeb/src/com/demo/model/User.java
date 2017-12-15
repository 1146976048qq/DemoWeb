package com.demo.model;

import java.sql.Timestamp;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(Integer userId) {
        super(userId);        
    }
    
    /** full constructor */
    public User(Integer userId, String userName, String usrPsw, String sex, String tel, String emial, String iconUrl, String resume, Timestamp registetime, Timestamp firstLoginTime, Timestamp lastLoginTime, Boolean isContributor, Boolean isSponsor, Set campaigns) {
        super(userId, userName, usrPsw, sex, tel, emial, iconUrl, resume, registetime, firstLoginTime, lastLoginTime, isContributor, isSponsor, campaigns);        
    }
   
}
