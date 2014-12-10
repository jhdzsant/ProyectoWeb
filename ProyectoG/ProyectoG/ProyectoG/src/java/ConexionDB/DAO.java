/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;
import java.util.*;
/**
 *
 * @author Julian
 */
public interface DAO {
    
    //customers
    public boolean altacustomer(Object o);
    public ArrayList consultacustomer();
    public boolean actualizarcustomer(Object o);
    public boolean borrarcustomer(Object o);
    
    //Employess
    public boolean altaemployess(Object o);
    public ArrayList consultaemployess ();
    public boolean actualizaremployess (Object o);
    public boolean borraremployess (Object o);

     //Comienza metodos Offices
   public boolean altaOffices(Object o );
   public ArrayList consultaOffices();
   public boolean actualizaOffices(Object o);
   public boolean borrarOffices (Object o);
  
     //Comienza metodos Orderdetails
   public boolean altaOrderdetails(Object o );
   public ArrayList consultaOrderdetails();
   public boolean actualizaOrderdetails(Object o);
   public boolean borrarOrderdetails(Object o);
  
     //Comienza metodos Orders
   public boolean altaOrders(Object o );
   public ArrayList consultaOrders();
   public boolean actualizaOrders(Object o);
   public boolean borrarOrders(Object o);
 
     //Comienza metodos Payments
   public boolean altaPayments (Object o);
   public ArrayList consultaPayments();
   public boolean actualizarPayments (Object o);
   public boolean borrarPayments (Object o);

    //Comienza metodos Productlines
   public boolean altaProductlines(Object o);
   public ArrayList consultaProductlines();
   public boolean actualizarProductlines (Object o);
   public boolean borrarProductlines(Object o);
    
     //Comienza metodos Products
    public boolean altaProducts (Object o);
    public ArrayList consultaProducts();
    public boolean actualizarProducts (Object o);
    public boolean borrarProducts(Object o);

    
     
     
    
    
}
