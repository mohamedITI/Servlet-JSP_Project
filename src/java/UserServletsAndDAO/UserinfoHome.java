package UserServletsAndDAO;

// Generated Mar 22, 2014 10:38:49 AM by Hibernate Tools 3.4.0.CR1

import BooksServletsAndDAO.HibernateUtil;
import POJO.UserCart;
import POJO.Userinfo;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Userinfo.
 * @see POJO.Userinfo
 * @author Hibernate Tools
 */
public class UserinfoHome {

	private static final Log log = LogFactory.getLog(UserinfoHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();
        private Session session;

	protected SessionFactory getSessionFactory() {
            return HibernateUtil.getSessionFactory();
	}
        
        public UserinfoHome() {
            session = sessionFactory.openSession();
        }

        public void closeSession()
        {
            session.close();
        }
        private void beginTransaction()
        {
            session.beginTransaction().begin();
        }
        private void commitTransaction()
        {
            session.getTransaction().commit();
        }

	public void persist(Userinfo transientInstance) {
		log.debug("persisting Userinfo instance");
		try {
			beginTransaction();
                        session.persist(transientInstance);
                        commitTransaction();
			log.debug("persist successful");
                        
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Userinfo findById(java.lang.String id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) sessionFactory.getCurrentSession()
					.get("POJO.Userinfo", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("POJO.Userinfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
        
        public String register(Userinfo user)
        {
            Userinfo userinfo = new Userinfo(user.getUserId(), user.getUserName(), user.getUserEmail(), user.getUserPassword(), user.getUserPassword(), user.getUserBirthdate(), user.getUserJob(), user.getUserCreditbalance(), user.getUserInterests(), user.getUserImage(), null);
            
            return null;
        }
}
