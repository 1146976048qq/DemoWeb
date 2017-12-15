package com.demo.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractUser entity provides the base persistence definition of the User entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private String userName;
     private String usrPsw;
     private String sex;
     private String tel;
     private String emial;
     private String iconUrl;
     private String resume;
     private Timestamp registetime;
     private Timestamp firstLoginTime;
     private Timestamp lastLoginTime;
     private Boolean isContributor;
     private Boolean isSponsor;
     private Set campaigns = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractUser() {
    }

	/** minimal constructor */
    public AbstractUser(Integer userId) {
        this.userId = userId;
    }
    
    /** full constructor */
    public AbstractUser(Integer userId, String userName, String usrPsw, String sex, String tel, String emial, String iconUrl, String resume, Timestamp registetime, Timestamp firstLoginTime, Timestamp lastLoginTime, Boolean isContributor, Boolean isSponsor, Set campaigns) {
        this.userId = userId;
        this.userName = userName;
        this.usrPsw = usrPsw;
        this.sex = sex;
        this.tel = tel;
        this.emial = emial;
        this.iconUrl = iconUrl;
        this.resume = resume;
        this.registetime = registetime;
        this.firstLoginTime = firstLoginTime;
        this.lastLoginTime = lastLoginTime;
        this.isContributor = isContributor;
        this.isSponsor = isSponsor;
        this.campaigns = campaigns;
    }

   
    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUsrPsw() {
        return this.usrPsw;
    }
    
    public void setUsrPsw(String usrPsw) {
        this.usrPsw = usrPsw;
    }

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmial() {
        return this.emial;
    }
    
    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }
    
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getResume() {
        return this.resume;
    }
    
    public void setResume(String resume) {
        this.resume = resume;
    }

    public Timestamp getRegistetime() {
        return this.registetime;
    }
    
    public void setRegistetime(Timestamp registetime) {
        this.registetime = registetime;
    }

    public Timestamp getFirstLoginTime() {
        return this.firstLoginTime;
    }
    
    public void setFirstLoginTime(Timestamp firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }
    
    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Boolean getIsContributor() {
        return this.isContributor;
    }
    
    public void setIsContributor(Boolean isContributor) {
        this.isContributor = isContributor;
    }

    public Boolean getIsSponsor() {
        return this.isSponsor;
    }
    
    public void setIsSponsor(Boolean isSponsor) {
        this.isSponsor = isSponsor;
    }

    public Set getCampaigns() {
        return this.campaigns;
    }
    
    public void setCampaigns(Set campaigns) {
        this.campaigns = campaigns;
    }
   








}