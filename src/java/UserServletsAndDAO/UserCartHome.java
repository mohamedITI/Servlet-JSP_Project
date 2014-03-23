package UserServletsAndDAO;

// Generated Mar 22, 2014 10:38:49 AM by Hibernate Tools 3.4.0.CR1

import BooksServletsAndDAO.HibernateUtil;
import POJO.Books;
import POJO.UserCart;
import POJO.Userinfo;
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
 * Home object for domain model class UserCart.
 * @see POJO.UserCart
 * @author Hibernate Tools
 */
public class UserCartHome {

	private static final Log log = LogFactory.getLog(UserCartHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();
        private Session session;
        
	protected SessionFactory getSessionFactory() {            
            return HibernateUtil.getSessionFactory();
	}

        public UserCartHome() {
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
        
	public void persist(UserCart transientInstance) {
		log.debug("persisting UserCart instance");
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

	public void attachDirty(UserCart instance) {
		log.debug("attaching dirty UserCart instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserCart instance) {
		log.debug("attaching clean UserCart instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UserCart persistentInstance) {
		log.debug("deleting UserCart instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserCart merge(UserCart detachedInstance) {
		log.debug("merging UserCart instance");
		try {
			UserCart result = (UserCart) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserCart findById(java.lang.String id) {
		log.debug("getting UserCart instance with id: " + id);
		try {
			UserCart instance = (UserCart) sessionFactory.getCurrentSession()
					.get("POJO.UserCart", id);
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

	public List findByExample(UserCart instance) {
		log.debug("finding UserCart instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("POJO.UserCart")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
        
        public boolean addProductToShopingCart(Books book,String email)
        {
            UserinfoHome userinfoDAO = new UserinfoHome();
            
            if(session.createCriteria(Userinfo.class).add(Restrictions.eq("bookName", book.getBookName())).list().size() > 0)
            {
                getQuantity(book.getBookName());
            }
            else
            {
                UserCart cart = new UserCart();
                
                cart.setBookImage(book.getBookImage());
                cart.setBookName(book.getBookName());
                cart.setQuantity((short)1);
                cart.setBookUnitprice(book.getBookPrice());
                cart.setUserinfo(userinfoDAO.findByEmail(email));
            
                persist(cart);
            
                System.out.println("addProductToShopingCart in UserinfoHome called :) " + "+++++++++++++++++++++++++");
                
                return true;
            }
            return false;
        }
        
        private double getTotalPrice(double bookPrice)
        {
            return 100;
        }
        private short getQuantity(String bookName)
        {
            Criteria criteria = session.createCriteria(UserCart.class)
                        .add(Restrictions.like("bookName", bookName));
                
            List result = criteria.list();
            for(Object obj : result)
            {
                UserCart u = (UserCart)obj;
                short quantity = u.getQuantity();
                return quantity;
            }
            return -1;
        }
}
