package com.demo.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.model.Manager;

/**
 	* A data access object (DAO) providing persistence and search support for Manager entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.demo.model.Manager
  * @author MyEclipse Persistence Tools 
 */
public class ManagerDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ManagerDAO.class);
		//property constants
	public static final String MANAGE_PSD = "managePsd";
	public static final String PHONE = "phone";
	public static final String EMAIL = "email";



    
    public void save(Manager transientInstance) {
        log.debug("saving Manager instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Manager persistentInstance) {
        log.debug("deleting Manager instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Manager findById( java.lang.Integer id) {
        log.debug("getting Manager instance with id: " + id);
        try {
            Manager instance = (Manager) getSession()
                    .get("com.xxxxxx.Manager", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Manager instance) {
        log.debug("finding Manager instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.xxxxxx.Manager")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Manager instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Manager as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByManagePsd(Object managePsd
	) {
		return findByProperty(MANAGE_PSD, managePsd
		);
	}
	
	public List findByPhone(Object phone
	) {
		return findByProperty(PHONE, phone
		);
	}
	
	public List findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	

	public List findAll() {
		log.debug("finding all Manager instances");
		try {
			String queryString = "from Manager";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Manager merge(Manager detachedInstance) {
        log.debug("merging Manager instance");
        try {
            Manager result = (Manager) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Manager instance) {
        log.debug("attaching dirty Manager instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Manager instance) {
        log.debug("attaching clean Manager instance");
        try {
                      	getSession().lock(instance, LockMode.NONE);
                        log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}