package POJO;

// Generated Mar 20, 2014 1:15:32 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Categories.
 * @see POJO.Categories
 * @author Hibernate Tools
 */
public class CategoriesHome {

	private static final Log log = LogFactory.getLog(CategoriesHome.class);
        private Session session;
	private final SessionFactory sessionFactory = getSessionFactory();
        
        public SessionFactory getSessionFactory() {
		return HibernateUtil.getSessionFactory();
	}

        public CategoriesHome() {
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

	public void persist(Categories transientInstance) {
		log.debug("persisting Categories instance");
		try {
			beginTransaction();
			session.persist(transientInstance);
			commitTransaction();
                        
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Categories instance) {
		log.debug("attaching dirty Categories instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Categories instance) {
		log.debug("attaching clean Categories instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Categories persistentInstance) {
		log.debug("deleting Categories instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Categories merge(Categories detachedInstance) {
		log.debug("merging Categories instance");
		try {
			Categories result = (Categories) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Categories findById(java.lang.String id) {
		log.debug("getting Categories instance with id: " + id);
		try {
			Categories instance = (Categories) sessionFactory
					.getCurrentSession().get("POJO.Categories", id);
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

	public List findByExample(Categories instance) {
		log.debug("finding Categories instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("POJO.Categories")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
