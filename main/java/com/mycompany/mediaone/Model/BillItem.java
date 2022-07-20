package com.mycompany.mediaone.Model;

public class BillItem {

    private int quantity;
    private String name;
    private double unitPrice;
    private String id;
    private double amount;

    public BillItem() {
    }

    public BillItem(String id, String name, int quantity,double unitPrice, double amount) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Object getNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
}
