/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosIngresa;
import ConexionDB.DataSource;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Julian Salinas
 */
public class EmpresaDAO {
    
    Connection c = null;
    PreparedStatement p = null;
    
    
    
    //Comienza metodos customers/////////////////////////////////////////
    
    public boolean altacustomer (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " insert into customers (customerNumber,customerName,contactLastName,"
                    + "contactFirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,"
                    + "salesRepEmployeeNumber,creditLimit)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            p = c.prepareStatement(sql);
            if( o instanceof Customers){
            Customers cus = (Customers) o;
            
            p.setInt(1, cus.getCustomerNumber());
            p.setString(2, cus.getCustomerName());
            p.setString(3, cus.getContactLastName());
            p.setString(4, cus.getContactLastName());
            p.setString(5, cus.getPhone());
            p.setString(6, cus.getAnddresLine1());
            p.setString(7, cus.getAnddresLine2());
            p.setString(8, cus.getCity());
            p.setString(9,cus.getState());
            p.setString(10,cus.getPostalCode());
            p.setString(11, cus.getCountry());
            p.setInt(12,cus.getSalesRepEmployeeNumber());
            p.setDouble(13, cus.getCreditLimit());
            
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se inserto Correctamente"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
 
    public ArrayList consultacustomer()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM customers ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            
            while(r.next())
            {
                
                Customers cus = new Customers();
                cus.setCustomerNumber(r.getInt("customerNumber"));
                cus.setCustomerName(r.getString("customerName"));
                cus.setContactLastName(r.getString("contactLastName"));
                cus.setContactFirstName(r.getString("contactFirstName"));
                cus.setPhone(r.getString("phone"));
                cus.setAnddresLine1(r.getString("addressLine1"));
                cus.setAnddresLine2(r.getString("addressLine2"));
                cus.setCity(r.getString("city"));
                cus.setState(r.getString("state"));
                cus.setPostalCode(r.getString("postalCode"));
                cus.setCountry(r.getString("country"));
                cus.setSalesRepEmployeeNumber(r.getInt("salesRepEmployeeNumber"));
                cus.setCreditLimit(r.getDouble("creditLimit"));
                
                lista.add(cus);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    public boolean actualizarcustomer (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE customers set "
                    + "customerName=?,contactLastName=?,"
                    + "contactFirstName=?,phone=?,addressLine1=?,addressLine2=?,"
                    + "city=?,state=?,postalCode=?,country=?,"
                    + "salesRepEmployeeNumber=?,creditLimit=? "
                    + "where customerNumber=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Customers){
            Customers cus = (Customers) o;
            
            
            p.setString(1, cus.getCustomerName());
            p.setString(2, cus.getContactLastName());
            p.setString(3, cus.getContactLastName());
            p.setString(4, cus.getPhone());
            p.setString(5, cus.getAnddresLine1());
            p.setString(6, cus.getAnddresLine2());
            p.setString(7, cus.getCity());
            p.setString(8,cus.getState());
            p.setString(9,cus.getPostalCode());
            p.setString(10, cus.getCountry());
            p.setInt(11,cus.getSalesRepEmployeeNumber());
            p.setDouble(12, cus.getCreditLimit());
            p.setInt(13, cus.getCustomerNumber());
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    public boolean borrarcustomer (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = "delete from customers where customerNumber=?";
                    
                   
            
            
            p = c.prepareStatement(sql);
            if( o instanceof Customers){
            Customers cus = (Customers) o;
            
            p.setInt(1, cus.getCustomerNumber());
            
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }

     //Comienza metodos Employess/////////////////////////////////////////   
    public boolean altaemployess (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " insert into employees(employeeNumber,lastName,firstName,"
                    + "extension,email,officeCode,reportsTo,jobTitle)"
                    + "values (?,?,?,?,?,?,?,?)";
            
            p = c.prepareStatement(sql);
            if( o instanceof Employess){
            Employess emp = (Employess) o;
            
            p.setInt(1, emp.getEmployeeNumber());
            p.setString(2, emp.getLastName());
            p.setString(3, emp.getFirstName());
            p.setString(4, emp.getExtension());
            p.setString(5, emp.getEmail());
            p.setString(6, emp.getOfficeCode());
            p.setInt(7, emp.getReportsTo());
            p.setString(8, emp.getJobTitle());
    
            
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se inserto Correctamente"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
       
    public ArrayList consultaemployess ()
       {
            ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM employees ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            
            while(r.next())
            {
                
                Employess emp = new Employess();
                emp.setEmployeeNumber(r.getInt("employeeNumber"));
                emp.setLastName(r.getString("lastName"));
                emp.setFirstName(r.getString("firstName"));
                emp.setExtension(r.getString("extension"));
                emp.setEmail(r.getString("email"));
                emp.setOfficeCode(r.getString("officeCode"));
                emp.setJobTitle(r.getString("jobTitle"));                              
                lista.add(emp);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
       }
       
    public boolean actualizaremployess (Object o)
    {
         boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE employees set "
                    + "lastName=?,"
                    + "firstName=?,"
                    + "extension=?,"
                    + "email=?,"
                    + "officeCode=?,"
                    + "reportsTo=?,"
                    + "jobTitle=?"
                    + "WHERE employeeNumber=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Employess){
            Employess e = (Employess) o;
            
            
            p.setString(1, e.getLastName());
            p.setString(2, e.getFirstName());
            p.setString(3, e.getExtension());
            p.setString(4, e.getEmail());
            p.setString(5, e.getOfficeCode());
            p.setInt(6,e.getReportsTo());
            p.setString(7,e.getJobTitle());
            p.setInt(8, e.getEmployeeNumber());
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    
    public boolean borraremployess (Object o)
    {
              boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " deleted from employees employeeNumber=?,";
            
            p = c.prepareStatement(sql);
            if( o instanceof Employess){
            Employess e = (Employess) o;
            
            p.setInt(1,e.getEmployeeNumber());
            
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else{
                        System.out.print(sql);
                    System.out.println("no se elimino");
                    }
            
        }
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    
    
     //Comienza metodos Offices/////////////////////////////////////////   
       
   public boolean altaOffices(Object o )
    {
        boolean b = false;
        try
        {
            c = new DataSource().getConexion();
            String sql = "INSERT INTO employees (officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            p = c.prepareStatement(sql);
            if(o instanceof Offices)
            {
                Offices of = (Offices) o;
            p.setString(1,of.getOfficeCode());
            p.setString(2,of.getCity());
            p.setString(3,of.getPhone());
            p.setString(4,of.getAddressLine1());
            p.setString(5,of.getAddressLine2());
            p.setString(6,of.getState());
            p.setString(7,of.getCountry());
            p.setString(8,of.getPostalCode());
            p.setString(9,of.getTerritory());
            
            int r = p.executeUpdate();
            if(r<0)
            {
                boolean a = true;
                System.out.println("Se inserto");
            }
            else
            {
                System.out.println("no Se inserto");
            }
            }
                               
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b; 
    }
      
     public ArrayList consultaOffices()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM offices ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            
            while(r.next())
            {
                
                Offices of = new Offices();
                of.setOfficeCode(r.getString("officeCode"));
                of.setCity(r.getString("city"));
                of.setPhone(r.getString("phone"));
                of.setAddressLine1(r.getString("addressLine1"));
                of.setAddressLine2(r.getString("addressLine2"));
                of.setState(r.getString("state"));
                of.setPostalCode(r.getString("postalCode"));
                of.setTerritory(r.getString("territory"));
                lista.add(of);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
     
     public boolean actualizaOffices(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE offices set "
                    + "city=?,"
                    + "phone=?,"
                    + "addressLine1=?,"
                    + "addressLine2=?,"
                    + "state=?,"
                    + "country=?,"
                    + "postalCode=?,"
                    + "territory=?"
                    + "WHERE officeCode=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Offices){
            Offices of= (Offices) o;
            
            
            
            p.setString(1, of.getCity());
            p.setString(2, of.getPhone());
            p.setString(3, of.getAddressLine1());
            p.setString(4, of.getAddressLine2());
            p.setString(5,of.getState());
            p.setString(6,of.getCountry());
            p.setString(7,of.getPostalCode());
            p.setString(8, of.getTerritory());
            p.setString(9, of.getOfficeCode());
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
     
     public boolean borrarOffices (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " deleted from offices "
                    + "officeCode=?,";
            
            p = c.prepareStatement(sql);
            if( o instanceof Offices){
            Offices of = (Offices) o;
            
            p.setString(1,of.getOfficeCode());
            
            int r = p.executeUpdate();
                    
                    if(r < 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else{
                        System.out.print(sql);
                    System.out.println("no se elimino");
                    }
            
        }
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    
     
     //Comienza metodos Orderdetails/////////////////////////////////////////   
         
       public boolean altaOrderdetails(Object o )
    {
        boolean b = false;
        try
        {
            c = new DataSource().getConexion();
            String sql = "INSERT INTO orderdetails (orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber)"
                    + "values(?,?,?,?,?)";
            p = c.prepareStatement(sql);
            if(o instanceof Orderdetails)
            {
                Orderdetails or = (Orderdetails) o;
            p.setInt(1,or.getOrderNumber());
            p.setString(2,or.getProductCode());
            p.setInt(3,or.getQuantityOrdered());
            p.setDouble(4,or.getPriceEach());
            p.setInt(5,or.getOrderLineNumber());
                      
            int r = p.executeUpdate();
            if(r > 0)
            {
                boolean a = true;
                System.out.println("Se inserto");
            }
            else
            {
                System.out.println("no Se inserto");
            }
            }
                               
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b; 
    }
      
     public ArrayList consultaOrderdetails()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM orderdetails ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            
            while(r.next())
            {
                
                Orderdetails or = new Orderdetails();
                or.setOrderNumber(r.getInt("orderNumber"));
                or.setProductCode(r.getString("productCode"));
                or.setQuantityOrdered(r.getInt("quantityOrdered"));
                or.setPriceEach(r.getDouble("priceEach"));
                or.setOrderLineNumber(r.getInt("orderLineNumber"));
                lista.add(or);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
     
     public boolean actualizaOrderdetails(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE orderdetails set "
                    + "productCode=?,"
                    + "quantityOrdered=?,"
                    + "priceEach=?,"
                    + "orderLineNumber=?,"
                    + "WHERE orderNumber=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Orderdetails){
            Orderdetails or = (Orderdetails) o;
            
            
            p.setInt(1, or.getOrderNumber());
            p.setString(2,or.getProductCode());
            p.setInt(3,or.getQuantityOrdered());
            p.setDouble(4,or.getPriceEach());
            p.setInt(5, or.getOrderLineNumber());
                    
            int r = p.executeUpdate();
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
     
     public boolean borrarOrderdetails(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " deleted from orderdetails "
                    + "orderNumber=?,";
            
            p = c.prepareStatement(sql);
            if( o instanceof Orderdetails){
            Orderdetails or = (Orderdetails) o;
            
            p.setInt(1,or.getOrderNumber());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else{
                        System.out.print(sql);
                    System.out.println("no se elimino");
                    }
            
        }
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
     
     
         
     //Comienza metodos Orders/////////////////////////////////////////   
     
     public boolean altaOrders(Object o )
    {
        boolean b = false;
        try
        {
            c = new DataSource().getConexion();
            String sql = "INSERT INTO orders  (orderNumber,orderDate,requiredDate,shippedDate,status,comments,customerNumber)"
                    + "values(?,?,?,?,?,?,?)";
            p = c.prepareStatement(sql);
            if(o instanceof Orders)
            {
                Orders or = (Orders) o;
            p.setInt(1,or.getOrderNumber());
            p.setString(2,or.getOrderDate());
            p.setString(3,or.getRequiredDate());
            p.setString(4,or.getShippedDate());
            p.setString(5,or.getStatus());
            p.setString(6,or.getComments());
            p.setInt(7,or.getCustomerNumber());
                      
            int r = p.executeUpdate();
            if(r > 0)
            {
                boolean a = true;
                System.out.println("Se inserto");
            }
            else
            {
                System.out.println("no Se inserto");
            }
            }
                               
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b; 
    }
        
     public ArrayList consultaOrders()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM orders ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            
            while(r.next())
            {
                
                Orders or = new Orders();
                or.setOrderNumber(r.getInt("orderNumber"));
                or.setOrderDate(r.getString("orderDate"));
                or.setRequiredDate(r.getString("requiredDate"));
                or.setShippedDate(r.getString("shippedDate"));
                or.setStatus(r.getString("status"));
                or.setComments(r.getString("status"));
                or.setCustomerNumber(r.getInt("customerNumber"));
                lista.add(or);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
     
     public boolean actualizaOrders(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE orders set "
                    + "orderDate=?,"
                    + "requiredDate=?,"
                    + "shippedDate=?,"
                    + "status=?,"
                    + "comments=?"
                    + "customerNumber=?"
                    + "WHERE orderNumber=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Orders){
            Orders or = (Orders) o;
            
            
            p.setString(1, or.getOrderDate());
            p.setString(2,or.getRequiredDate());
            p.setString(3,or.getShippedDate());
            p.setString(4,or.getStatus());
            p.setString(5,or.getComments());
            p.setInt(6,or.getCustomerNumber());
            p.setInt(7, or.getOrderNumber());
                    
            int r = p.executeUpdate();
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
     
     public boolean borrarOrders(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " deleted from orders "
                    + "orderNumber=?,";
            
            p = c.prepareStatement(sql);
            if( o instanceof Orders){
            Orders or = (Orders) o;
            
            p.setInt(1,or.getOrderNumber());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else{
                        System.out.print(sql);
                    System.out.println("no se elimino");
                    }
            
        }
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
     
     
      //Comienza metodos Payments/////////////////////////////////////////   
     
       public boolean altaPayments (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " insert into payments (customerNumber,checkNumber,paymentDate,amount)"
                    + "values (?,?,?,?)";
            
            p = c.prepareStatement(sql);
            if( o instanceof Payments){
            Payments pay = (Payments) o;
            
            p.setInt(1, pay.getCustomerNumber());
            p.setString(2, pay.getCheckNumber());
            p.setString(3, pay.getPaymentDate());
            p.setDouble(4, pay.getAmount());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se inserto Correctamente"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
 
    public ArrayList consultaPayments()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM payments ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();


            
            while(r.next())
            {
                
                Payments pay = new Payments();
                pay.setCustomerNumber(r.getInt("customerNumber"));
                pay.setCheckNumber(r.getString("checkNumber"));
                pay.setPaymentDate(r.getString("paymentDate"));
                pay.setAmount(r.getDouble("amount"));
                
                lista.add(pay);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    public boolean actualizarPayments (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE payments set "
                    + "checkNumber=?,paymentDate=?,"
                    + "amount=? "
                    + "where customerNumber=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Payments){
            Payments pay = (Payments) o;

            p.setString(1, pay.getCheckNumber());
            p.setString(2, pay.getPaymentDate());
            p.setDouble(3, pay.getAmount());
            p.setInt(4, pay.getCustomerNumber());
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    public boolean borrarPayments (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " DELETE  FROM payments where customerNumber = ?";
                   
            
            p = c.prepareStatement(sql);
            if( o instanceof Payments){
            Payments pay = (Payments) o;
            
            p.setInt(1, pay.getCustomerNumber());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    
    
      //Comienza metodos Productlines/////////////////////////////////////////  
     
     public boolean altaProductlines(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " insert into productlines (productLine,textDescription,htmlDescription,image)"
                    + "values (?,?,?,?)";
            
            p = c.prepareStatement(sql);
            if( o instanceof Productlines){
            Productlines prodl = (Productlines) o;
            
            p.setString(1, prodl.getProductLine());
            p.setString(2, prodl.getTextDescription());
            p.setString(3, prodl.getHtmlDescription());
            p.setString(4, prodl.getImage());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se inserto Correctamente"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
 
    public ArrayList consultaProductlines()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM productlines ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();

            
            while(r.next())
            {
                
                Productlines prodl = new Productlines();
                prodl.setProductLine(r.getString("productLine"));
                prodl.setTextDescription(r.getString("textDescription"));
                prodl.setHtmlDescription(r.getString("htmlDescription"));
                prodl.setImage(r.getString("image"));
                
                lista.add(prodl);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    public boolean actualizarProductlines (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE productlines set "
                    + "textDescription=?,htmlDescription=?,"
                    + "image=? "
                    + "where productLine=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Productlines){
            Productlines prodl = (Productlines) o;

            p.setString(1, prodl.getTextDescription());
            p.setString(2, prodl.getHtmlDescription());
            p.setString(3, prodl.getImage());
            p.setString(4, prodl.getProductLine());
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    public boolean borrarProductlines(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " DELETE  FROM productlines where productLine = ?";
                   
            
            p = c.prepareStatement(sql);
            if( o instanceof Productlines){
            Productlines prodl = (Productlines) o;
            
            p.setString(1, prodl.getProductLine());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
     
    
     //Comienza metodos Products/////////////////////////////////////////  
    
        public boolean altaProducts (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " insert into products (productCode,productName,productLine,productScale,"
                    + "productVendor,productDescription,quantityInStock,buyPrice,MSRP)"
                    + "values (?,?,?,?,?,?,?,?,?)";
            
            p = c.prepareStatement(sql);
            if( o instanceof Products){
            Products prod = (Products) o;
            
            p.setString(1, prod.getProductCode());
            p.setString(2, prod.getProductName());
            p.setString(3, prod.getProductLine());
            p.setString(4, prod.getProductScale());
            p.setString(5, prod.getProductVendor());
            p.setString(6, prod.getProductDescription());
            p.setInt(7, prod.getQuantityInStock());
            p.setDouble(8, prod.getBuyPrice());
            p.setDouble(9, prod.getMSRP());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se inserto Correctamente"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
 
    public ArrayList consultaProducts()
    {
        ArrayList lista = new ArrayList();
        try{
            c = new DataSource().getConexion();
            String sql = "SELECT * FROM products ";
            p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery();
            
            while(r.next())
            {
                
                Products prod = new Products();
                prod.setProductCode(r.getString("productCode"));
                prod.setProductName(r.getString("productName"));
                prod.setProductLine(r.getString("productLine"));
                prod.setProductScale(r.getString("productScale"));
                prod.setProductVendor(r.getString("productVendor"));
                prod.setProductDescription(r.getString("productDescription"));
                prod.setQuantityInStock(r.getInt("quantityInStock"));
                prod.setBuyPrice(r.getDouble("buyPrice"));
                prod.setMSRP(r.getDouble("MSRP"));
                
                lista.add(prod);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return lista;
        
    }
    public boolean actualizarProducts (Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " UPDATE products set "
                    + "productName=?,productLine=?,productScale=?,productVendor=?,productDescription=?"
                    + "quantityInStock=?,buyPrice=?,MSRP=? "
                    + "where productCode=?";
                  
            
            p = c.prepareStatement(sql);
            if( o instanceof Products){
            Products prod = (Products) o;

            p.setString(1, prod.getProductCode());
            p.setString(2, prod.getProductName());
            p.setString(3, prod.getProductLine());
            p.setString(4, prod.getProductScale());
            p.setString(5, prod.getProductVendor());
            p.setString(6, prod.getProductDescription());
            p.setInt(7, prod.getQuantityInStock());
            p.setDouble(8, prod.getBuyPrice());
            p.setDouble(9, prod.getMSRP());
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se  Actualizo"+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    public boolean borrarProducts(Object o)
    {
        boolean b = false;
        
        try{
            
            c = new DataSource().getConexion();
            String sql = " DELETE  FROM products where productCode = ?";
                   
            
            p = c.prepareStatement(sql);
            if( o instanceof Products){
            Products prod = (Products) o;
            
            p.setString(1, prod.getProductCode());
            
            int r = p.executeUpdate();
                    
                    if(r > 0)
                    {
                        boolean a=true;
                        System.out.println("Se elimino "+a);
                        System.out.print(sql);
                       
                    }else
                        System.out.print(sql);
                    }else
                        System.out.print(o);
            
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return b;
    }
    
    
    
    
    
}
