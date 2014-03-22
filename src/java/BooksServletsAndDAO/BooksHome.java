package BooksServletsAndDAO;

// Generated Mar 20, 2014 1:15:32 AM by Hibernate Tools 3.4.0.CR1

import POJO.Books;
import POJO.Categories;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

/**
 * Home object for domain model class Books.
 * @see POJO.Books
 * @author Hibernate Tools
 */
public class BooksHome {

	private static final Log log = LogFactory.getLog(BooksHome.class);

	private Session session;
	private final SessionFactory sessionFactory = getSessionFactory();

	public SessionFactory getSessionFactory() {
		return HibernateUtil.getSessionFactory();
	}

        public BooksHome() {
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

	public void persist(Books transientInstance) {
		log.debug("persisting Books instance");
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

	public void attachDirty(Books instance) {
		log.debug("attaching dirty Books instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Books instance) {
		log.debug("attaching clean Books instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Books persistentInstance) {
		log.debug("deleting Books instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Books merge(Books detachedInstance) {
		log.debug("merging Books instance");
		try {
			Books result = (Books) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Books findById(java.lang.String id) {
		log.debug("getting Books instance with id: " + id);
		try {
			Books instance = (Books) sessionFactory.getCurrentSession().get(
					"POJO.Books", id);
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

	public List findByExample(Books instance) {
		log.debug("finding Books instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("POJO.Books").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
        public Books getBookInfoByISBN(String isbn)
        {
            Criteria criteria = session.createCriteria(Books.class)
				.add(Restrictions.idEq(isbn));
            List result = criteria.list();
		
		for(Object book : result)
		{
			Books bok = (Books)book;
			return bok;
		}
            return null; 
        }
}
