/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctl;

import DatosIngresa.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 *
 * @author Julian Salinas
 */
@WebServlet(name = "ControladorG", urlPatterns = {"/ControladorG"})
public class ControladorG extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {   
        
        ///Customers
        String pagina = request.getParameter("pagina");
        if(pagina.equals("altaCustomers"))
            altaCustomer(request,response);
        if(pagina.equals("consultaCustomer"))
            consultaCustomer(request,response);
        if(pagina.equals("actualizarCustomers"))
            actualizarCustomer(request,response);
        if(pagina.equals("borrarCustomers"))
            borrarCustomer(request,response);

        ///Employess
        if(pagina.equals("altaEmployess"))
           altaEmployess(request,response);
        if(pagina.equals("consultaEmployess"))
            consultaEmployess(request,response);
        if(pagina.equals("actualizarEmployess"))
            actualizarEmployess(request,response);
        if(pagina.equals("borrarEmployess"))
            borrarEmployess(request,response);
        
        ///Offices
        if(pagina.equals("altaOffice"))
           altaOffices(request,response);
        if(pagina.equals("consultaOffice"))
            consultaOffices(request,response);
        if(pagina.equals("actualizaroffices"))
            actualizarOffices(request,response);
        if(pagina.equals("borrarOffice"))
            borrarOffices(request,response);
        
        ///Orderdetails
        if(pagina.equals("altaOrderdetails"))
           altaOrderdetails(request,response);
        if(pagina.equals("consultaOrderdetails"))
            consultaOrderdetails(request,response);
        if(pagina.equals("actualizarOrderdetails"))
            actualizarOrderdetails(request,response);
        if(pagina.equals("borrarOrderdetails"))
            borrarOrderdetails(request,response);
        
        ///Order
         if(pagina.equals("altaOrders"))
           altaOrders(request,response);
        if(pagina.equals("consultaOrders"))
            consultaOrders(request,response);
        if(pagina.equals("actualizarOrders"))
            actualizarOrders(request,response);
        if(pagina.equals("borrarOrders"))
            borrarOrders(request,response);
        
          ///Payments
         if(pagina.equals("altaPayments"))
           altaPayments(request,response);
        if(pagina.equals("consultaPayments"))
            consultaPayments(request,response);
        if(pagina.equals("actualizarPayments"))
            actualizarPayments(request,response);
        if(pagina.equals("borrarPayments"))
            borrarPayments(request,response);
        
        //Productlines
           if(pagina.equals("altaProductlines"))
           altaProductlines(request,response);
        if(pagina.equals("consultaProductlines"))
            consultaProductlines(request,response);
        if(pagina.equals("actualizarProductlines"))
            actualizarProductlines(request,response);
        if(pagina.equals("borrarProductlines"))
            borrarProductlines(request,response);
        
          //Products
           if(pagina.equals("altaProducts"))
           altaProducts(request,response);
        if(pagina.equals("consultaProducts"))
            consultaProducts(request,response);
        if(pagina.equals("actualizarProducts"))
            actualizarProducts(request,response);
        if(pagina.equals("borrarProducts"))
            borrarProducts(request,response);
        
        
        
    }
    
     
///////////////Datos tabla Customers///////////////////////////
    
    
    protected void altaCustomer(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Customers cus = new Customers();
         
         cus.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         cus.setCustomerName(request.getParameter("customerName"));
         cus.setContactLastName(request.getParameter("contactLastName"));
         cus.setContactFirstName(request.getParameter("contactFirstName"));
         cus.setPhone(request.getParameter("phone"));
         cus.setAnddresLine1(request.getParameter("addressLine1"));
         cus.setAnddresLine2(request.getParameter("addressLine2"));
         cus.setCity(request.getParameter("city"));
         cus.setState(request.getParameter("state"));
         cus.setPostalCode(request.getParameter("postalCode"));
         cus.setCountry(request.getParameter("country"));
         cus.setSalesRepEmployeeNumber(Integer.parseInt(request.getParameter("salesRepEmployeeNumber")));
         cus.setCreditLimit(Double.parseDouble(request.getParameter("creditLimit")));
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.altacustomer(cus);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altacustomers.jsp");
           
     }
        
    protected void consultaCustomer(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaCustomer");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultacustomer();
            session.setAttribute("consultaCustomer", lista);
            
        
        response.sendRedirect("consultacustomer.jsp");
    }
    
      protected void actualizarCustomer(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
        Customers cus = new Customers();
         
         cus.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         cus.setCustomerName(request.getParameter("customerName"));
         cus.setContactLastName(request.getParameter("contactLastName"));
         cus.setContactFirstName(request.getParameter("contactFirstName"));
         cus.setPhone(request.getParameter("phone"));
         cus.setAnddresLine1(request.getParameter("addressLine1"));
         cus.setAnddresLine2(request.getParameter("addressLine2"));
         cus.setCity(request.getParameter("city"));
         cus.setState(request.getParameter("state"));
         cus.setPostalCode(request.getParameter("postalCode"));
         cus.setCountry(request.getParameter("country"));
         cus.setSalesRepEmployeeNumber(Integer.parseInt(request.getParameter("salesRepEmployeeNumber")));
         cus.setCreditLimit(Double.parseDouble(request.getParameter("creditLimit")));
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizarcustomer(cus);
       if(b)
       {
           response.sendRedirect("actualizarcustomers.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarCustomer(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
        Customers cus = new Customers();
         
         cus.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.borrarcustomer(cus);
       if(b)
       {
           response.sendRedirect("borrarcustomer.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
    

  
    ///////////////Datos tabla employess///////////////////////////
    
     protected void altaEmployess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Employess emp = new Employess();
         
         emp.setEmployeeNumber(Integer.parseInt(request.getParameter("EmployeeNumber")));
         emp.setLastName(request.getParameter("LastName"));
         emp.setFirstName(request.getParameter("FirstName"));
         emp.setExtension(request.getParameter("Extension"));
         emp.setEmail(request.getParameter("Email"));
         emp.setOfficeCode(request.getParameter("OfficeCode"));
         emp.setReportsTo(Integer.parseInt(request.getParameter("ReportsTo")));
         emp.setJobTitle(request.getParameter("JobTitle"));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.altaemployess(emp);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altaempleados.jsp");
           
     }
    
      protected void consultaEmployess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaEmployess");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultaemployess();
            session.setAttribute("consultaEmployess", lista);
            
        
        response.sendRedirect("consultaemployees.jsp");
    }
    
      protected void actualizarEmployess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
         Employess emp= new Employess();
         
         emp.setEmployeeNumber(Integer.parseInt(request.getParameter("EmployeeNumber")));
         emp.setLastName(request.getParameter("LastName"));
         emp.setFirstName(request.getParameter("FirstName"));
         emp.setExtension(request.getParameter("Extension"));
         emp.setEmail(request.getParameter("Email"));
         emp.setOfficeCode(request.getParameter("OfficeCode"));
         emp.setReportsTo(Integer.parseInt(request.getParameter("ReportsTo")));
         emp.setJobTitle(request.getParameter("JobTitle"));
         
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizaremployess(emp);
       if(b)
       {
           response.sendRedirect("actualizaremployess.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarEmployess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
        Employess emp= new Employess();
         
         emp.setEmployeeNumber(Integer.parseInt(request.getParameter("employeeNumber")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.borraremployess(emp);
       if(b)
       {
           response.sendRedirect("borraremployees.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
    

        ///////////////Datos tabla Offices///////////////////////////
    
     protected void altaOffices(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Offices of = new Offices();
         
         of.setOfficeCode(request.getParameter("officeCode"));
         of.setCity(request.getParameter("city"));
         of.setPhone(request.getParameter("phone"));
         of.setAddressLine1(request.getParameter("addressLine1"));
         of.setAddressLine2(request.getParameter("addressLine2"));
         of.setState(request.getParameter("state"));
         of.setCountry(request.getParameter("country"));
         of.setPostalCode(request.getParameter("postalCode"));
         of.setTerritory(request.getParameter("territory"));
         
         
         
       EmpresaDAO ef =new EmpresaDAO();
       
       boolean b = ef.altaOffices(of);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altaoficina.jsp");
           
     }
    
      protected void consultaOffices(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaOffice");
            EmpresaDAO eo = new EmpresaDAO ();
            ArrayList lista = eo.consultaOffices();
            session.setAttribute("consultaOffice", lista);
            
        
        response.sendRedirect("consultaoffices.jsp");
    }
    
      protected void actualizarOffices(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
        Offices of = new Offices();
         
         of.setOfficeCode(request.getParameter("officeCode"));
         of.setCity(request.getParameter("city"));
         of.setPhone(request.getParameter("phone"));
         of.setAddressLine1(request.getParameter("addressLine1"));
         of.setAddressLine2(request.getParameter("addressLine2"));
         of.setState(request.getParameter("state"));
         of.setCountry(request.getParameter("country"));
         of.setPostalCode(request.getParameter("postalCode"));
         of.setTerritory(request.getParameter("territory"));
         
         
       EmpresaDAO eo =new EmpresaDAO();
       
       boolean b = eo.actualizaOffices(of);
       if(b)
       {
           response.sendRedirect("actualizaroffices.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarOffices(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
         Offices of = new Offices();
         
         of.setOfficeCode(request.getParameter("officeCode"));
         
         
         
       EmpresaDAO eo =new EmpresaDAO();
       
       boolean b = eo.borrarOffices (of);
       if(b)
       {
           response.sendRedirect("borraroffices.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
    
    
    
    
    
            ///////////////Datos tabla Orderdetails///////////////////////////
    
     protected void altaOrderdetails(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Orderdetails or = new Orderdetails();
         
         or.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
         or.setProductCode(request.getParameter("productCode"));
         or.setQuantityOrdered(Integer.parseInt(request.getParameter("quantityOrdered")));
         or.setPriceEach(Double.parseDouble(request.getParameter("priceEach")));
         or.setOrderLineNumber(Integer.parseInt(request.getParameter("orderLineNumber")));
         
       EmpresaDAO eo =new EmpresaDAO();
       
       boolean b = eo.altaOrderdetails(or);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altaordersdetails.jsp");
           
     }
    
      protected void consultaOrderdetails(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaOrderdetails");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultaOrderdetails();
            session.setAttribute("consultaOrderdetails", lista);
            
        
        response.sendRedirect("consultaorderdetails.jsp");
    }
    
      protected void actualizarOrderdetails(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
        Orderdetails ord = new Orderdetails();
         
         ord.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
         ord.setProductCode(request.getParameter("productCode"));
         ord.setQuantityOrdered(Integer.parseInt(request.getParameter("quantityOrdered")));
         ord.setPriceEach(Double.parseDouble(request.getParameter("priceEach")));
         ord.setOrderLineNumber(Integer.parseInt(request.getParameter("orderLineNumber")));
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizaOrderdetails(ord);
       if(b)
       {
           response.sendRedirect("actualizarorderdetails.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarOrderdetails(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
        Orderdetails ord = new Orderdetails();
         ord.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.borrarOrderdetails(ord);
       if(b)
       {
           response.sendRedirect("borrarorderdetails.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }

    
    
    
    
                ///////////////Datos tabla Orders///////////////////////////
    
     protected void altaOrders(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Orders ord = new Orders();

         ord.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
         ord.setOrderDate(request.getParameter("orderDate"));
         ord.setRequiredDate(request.getParameter("requiredDate"));
         ord.setShippedDate(request.getParameter("shippedDate"));
         ord.setStatus(request.getParameter("status"));
         ord.setComments(request.getParameter("comments"));
         ord.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.altaOrders(ord);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altaorders.jsp");
           
     }
    
      protected void consultaOrders(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaOrders");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultaOrders();
            session.setAttribute("consultaOrders", lista);
            
        
        response.sendRedirect("consultaorders.jsp");
    }
    
      protected void actualizarOrders(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
               Orders ord = new Orders();

         ord.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
         ord.setOrderDate(request.getParameter("orderDate"));
         ord.setRequiredDate(request.getParameter("requiredDate"));
         ord.setShippedDate(request.getParameter("shippedDate"));
         ord.setStatus(request.getParameter("status"));
         ord.setComments(request.getParameter("comments"));
         ord.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizaOrders(ord);
       if(b)
       {
           response.sendRedirect("actualizarorders.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarOrders(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        Orders ord = new Orders();
         
         ord.setOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.borrarOrders(ord);
       if(b)
       {
           response.sendRedirect("borrarorders.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
    
    
    
                    ///////////////Datos tabla Payments///////////////////////////
    
     protected void altaPayments(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Payments pay = new Payments();
         
         pay.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         pay.setCheckNumber(request.getParameter("checkNumber"));
         pay.setPaymentDate(request.getParameter("paymentDate"));
         pay.setAmount(Double.parseDouble(request.getParameter("amount")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.altaPayments(pay);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altapayments.jsp");
           
     }
    
      protected void consultaPayments(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaPayments");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultaPayments();
            session.setAttribute("consultaPayments", lista);
            
        
        response.sendRedirect("consultapayments.jsp");
    }
    
      protected void actualizarPayments(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
        Payments pay = new Payments();
         
         pay.setCustomerNumber(Integer.parseInt(request.getParameter("paytomerNumber")));
         pay.setCheckNumber(request.getParameter("checkNumber"));
         pay.setPaymentDate(request.getParameter("paymentDate"));
         pay.setAmount(Double.parseDouble(request.getParameter("amount")));
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizarPayments(pay);
       if(b)
       {
           response.sendRedirect("actualizarpayments.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarPayments(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
        Payments pay = new Payments();
         
         pay.setCustomerNumber(Integer.parseInt(request.getParameter("customerNumber")));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.borrarPayments(pay);
       if(b)
       {
           response.sendRedirect("borrarpayments.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
    
    
    
    
                      ///////////////Datos tabla Productlines///////////////////////////
    
        protected void altaProductlines(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Productlines prodl = new Productlines();
         
         prodl.setProductLine(request.getParameter("productLine"));
         prodl.setTextDescription(request.getParameter("textDescription"));
         prodl.setHtmlDescription(request.getParameter("htmlDescription"));
         prodl.setImage(request.getParameter("image"));

         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.altaProductlines(prodl);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altaproductlines.jsp");
           
     }
    
      protected void consultaProductlines(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaProductlines");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultaProductlines();
            session.setAttribute("consultaProductlines", lista);
            
        
        response.sendRedirect("consultaproductlines.jsp");
    }
    
      protected void actualizarProductlines(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        
             
        Productlines prodl = new Productlines();
         
         prodl.setProductLine(request.getParameter("productLine"));
         prodl.setTextDescription(request.getParameter("textDescription"));
         prodl.setHtmlDescription(request.getParameter("htmlDescription"));
         prodl.setImage(request.getParameter("image"));
         
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizarProductlines(prodl);
       if(b)
       {
           response.sendRedirect("actualizarproductlines.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarProductlines(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
     {
         
        Productlines p = new Productlines();
         
         p.setProductLine(request.getParameter("productLine"));
         
         
         
       EmpresaDAO ep =new EmpresaDAO ();
       
       boolean b = ep.borrarProductlines(p);
       if(b)
       {
           response.sendRedirect("borrarproductslines.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }

    
    
                       ///////////////Datos tabla Products///////////////////////////
    
     protected void altaProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         Products pro = new Products();
         
         pro.setProductCode(request.getParameter("productCode"));
         pro.setProductName(request.getParameter("productName"));
         pro.setProductLine(request.getParameter("productLine"));
         pro.setProductScale(request.getParameter("productScale"));
         pro.setProductVendor(request.getParameter("productVendor"));
         pro.setProductDescription(request.getParameter("productDescription"));
         pro.setQuantityInStock(Integer.parseInt(request.getParameter("quantityInStock")));
         pro.setBuyPrice(Double.parseDouble(request.getParameter("buyPrice")));
         pro.setMSRP(Double.parseDouble(request.getParameter("MSRP")));

       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.altaProducts(pro);
       if(b)
       {
           response.sendRedirect("index.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("altaproducts.jsp");
           
     }
    
      protected void consultaProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         
        HttpSession session = request.getSession();
    
            session.removeAttribute("consultaProducts");
            EmpresaDAO au = new EmpresaDAO();
            ArrayList lista = au.consultaProducts();
            session.setAttribute("consultaProducts", lista);
        response.sendRedirect("consultaproducts.jsp");
    }
    
      protected void actualizarProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         Products pro = new Products();
         pro.setProductCode(request.getParameter("productCode"));
         pro.setProductName(request.getParameter("productName"));
         pro.setProductLine(request.getParameter("productLine"));
         pro.setProductScale(request.getParameter("productScale"));
         pro.setProductVendor(request.getParameter("productVendor"));
         pro.setProductDescription(request.getParameter("productDescription"));
         pro.setQuantityInStock(Integer.parseInt(request.getParameter("quantityInStock")));
         pro.setBuyPrice(Double.parseDouble(request.getParameter("buyPrice")));
         pro.setMSRP(Double.parseDouble(request.getParameter("MSRP")));
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.actualizarProducts(pro);
       if(b)
       {
           response.sendRedirect("actualizarproducts.jsp");
           
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
        
    protected void borrarProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
         
        Products prod = new Products();
         
         prod.setProductCode(request.getParameter("productCode"));
         
         
         
       EmpresaDAO au =new EmpresaDAO();
       
       boolean b = au.borrarProducts(prod);
       if(b)
       {
           response.sendRedirect("borrarproducts.jsp");
           System.out.println(b);
       }
       else
           response.sendRedirect("index.jsp");
           
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
