package com.demo.model;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */
public class Manager extends AbstractManager implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Manager() {
    }

	/** minimal constructor */
    public Manager(Integer manageId) {
        super(manageId);        
    }
    
    /** full constructor */
    public Manager(Integer manageId, String managePsd, String phone, String email) {
        super(manageId, managePsd, phone, email);        
    }
   
}
