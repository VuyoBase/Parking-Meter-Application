/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gee
 */
public class Payment {

    double amount;
    int value;

    public Payment() {
    }

    public Payment(double amount, int value) {
        this.amount = amount;
        this.value = value;
    }

    public double getAmount() {
        return amount;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getValue() {
        return value;
    }
        
    public double getSum(){
        return this.value * this.amount;
    }
    
    @Override
    public String toString() {
        return String.format("R %sX%s", Math.round(amount), value);  //To change body of generated methods, choose Tools | Templates.
    }

}
