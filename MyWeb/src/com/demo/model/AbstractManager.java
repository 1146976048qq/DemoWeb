package com.demo.model;



/**
 * AbstractManager entity provides the base persistence definition of the Manager entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractManager  implements java.io.Serializable {


    // Fields    

     private Integer manageId;
     private String managePsd;
     private String phone;
     private String email;


    // Constructors

    /** default constructor */
    public AbstractManager() {
    }

	/** minimal constructor */
    public AbstractManager(Integer manageId) {
        this.manageId = manageId;
    }
    
    /** full constructor */
    public AbstractManager(Integer manageId, String managePsd, String phone, String email) {
        this.manageId = manageId;
        this.managePsd = managePsd;
        this.phone = phone;
        this.email = email;
    }

   
    // Property accessors

    public Integer getManageId() {
        return this.manageId;
    }
    
    public void setManageId(Integer manageId) {
        this.manageId = manageId;
    }

    public String getManagePsd() {
        return this.managePsd;
    }
    
    public void setManagePsd(String managePsd) {
        this.managePsd = managePsd;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
   








}