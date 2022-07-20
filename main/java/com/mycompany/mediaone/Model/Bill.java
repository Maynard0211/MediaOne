package com.mycompany.mediaone.Model;

import java.util.Date;
import java.util.List;

public class Bill {

    private String id;
    private double total; //grand total
    private Date createdAt;
    private Customer customer;
    private List<BillItem> items;
    private String type;

    public Bill() {
    }

    public Bill(String id, double total, Date createdAt, Customer customer, List<BillItem> items, String type) {
        this.id = id;
        this.total = total;
        this.createdAt = createdAt;
        this.customer = customer;
        this.items = items;
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(List<BillItem> items) {
        this.items = items;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @return
 m    */
    public List<BillItem> getItems() {
        return items;
    }

    public String getType() {
        return type;
    }
}
