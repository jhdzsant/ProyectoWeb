/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosIngresa;

/**
 *
 * @author Julian
 */
public class Orderdetails 
{
   private int orderNumber;
    private String productCode;
    private int quantityOrdered;
    private double priceEach;
    private int orderLineNumber;    

    /**
     * @return the orderNumber
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber the orderNumber to set
     */
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return the quantityOrdered
     */
    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * @param quantityOrdered the quantityOrdered to set
     */
    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    /**
     * @return the priceEach
     */
    public double getPriceEach() {
        return priceEach;
    }

    /**
     * @param priceEach the priceEach to set
     */
    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    /**
     * @return the orderLineNumber
     */
    public int getOrderLineNumber() {
        return orderLineNumber;
    }

    /**
     * @param orderLineNumber the orderLineNumber to set
     */
    public void setOrderLineNumber(int orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }
}
