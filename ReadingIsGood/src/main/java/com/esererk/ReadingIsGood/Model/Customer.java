package com.esererk.ReadingIsGood.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int customerId;
    private String customerName;
    private String customerSurname;

    public Customer() {

    }

    public Customer(int customerId, String customerName, String customerSurname) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                '}';
    }
}
