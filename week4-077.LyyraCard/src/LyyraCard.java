/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bao
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double startingBalance) {
        this.balance = startingBalance;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
    
    public void loadMoney(double amount) {
        if(amount > 0 && amount < 150) {
        this.balance += amount;
            if(this.balance>=150) {
                this.balance = 150;
            }
        }
    }

    public void payEconomical() {
        double price = 2.50;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void payGourmet() {
        double price = 4.00;
        if (this.balance >= price) {
            this.balance -= 4.00;

        }
    }

}
