


import BooksServletsAndDAO.BooksHome;
import POJO.Categories;
import BooksServletsAndDAO.CategoriesHome;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed-ITI
 */
public class NewClass {
    public static void main(String[] args)
    {
        try {
            
            DriverManager.registerDriver(new OracleDriver());
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","bookstore","bookstore");;
            PreparedStatement stm;
            stm = conn.prepareStatement("select * from categories");
            ResultSet rs = stm.executeQuery();
            
            while(rs.next())
            {
                
            }
            System.out.println(stm);
            
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        //BooksHome bookDAO = new BooksHome();
        CategoriesHome categoriesDAO = new CategoriesHome();
        
        
        
        Categories category1 = new Categories("MC_ENG", null, "Engineering");
        Categories category2 = new Categories("SMC_COMMERCE", category1, "Commerce");
        
        
        categoriesDAO.persist(category1);
        categoriesDAO.persist(category2);
        categoriesDAO.closeSession();
        System.out.println("Doneeeeeeee");
    }
    
}
