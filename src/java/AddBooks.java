/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import POJO.Books;
import BooksServletsAndDAO.BooksHome;
import POJO.Categories;
import BooksServletsAndDAO.CategoriesHome;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Mohamed-ITI
 */
public class AddBooks {
    static Categories cat;
    public static void main(String[] args)
    {
        try {
            BooksHome bookDAO = new BooksHome();
            
            CategoriesHome categoryDAO = new CategoriesHome();
            Session categorySession = categoryDAO.getSessionFactory().getCurrentSession();
            categorySession.beginTransaction().begin();
            Criteria criteria = categorySession.createCriteria(Categories.class, "c")
                    .add(Restrictions.idEq("MC_ENG"));
            
            List result = criteria.list();
            
            for(Object c : result)
            {
                cat = (Categories)c;
                System.out.println(cat.getCategoryName());
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            //Date date = dateFormat.parse("31/05/2011");
            Books book1 = new Books("ISBN1", cat, "introduction to java", "Dietil", dateFormat.parse("31/05/2011"), "Desktop", dateFormat.parse("21/03/2014"), "image1", 150, "Description1", 0);
            Books book2 = new Books("ISBN2", cat, "servlet", "Dietil", dateFormat.parse("5/05/2011"), "Enterprise", dateFormat.parse("21/03/2014"), "image2", 200, "Description2", 0);
            Books book3 = new Books("ISBN3", cat, "jsp", "Dietil", dateFormat.parse("28/07/2011"), "Enterprise", dateFormat.parse("21/03/2014"), "image3", 200, "Description3", 0);
            
            bookDAO.persist(book1);
            bookDAO.persist(book2);
            bookDAO.persist(book3);
            
            bookDAO.closeSession();
            
            System.out.println("Doneeeeeeeeeeeeeeeeeeeeee");
            
        } catch (ParseException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
