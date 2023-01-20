package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheese = false;
    private Boolean extraToppings = false;
    private Boolean takeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg)
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice(){
        int total = this.price;

        if (this.extraCheese){
            total+= 80;
        }
        if(this.extraToppings) {
            if (isVeg) {
                total += 70;
            }
            else{
                total += 120;
            }
        }
        if(this.takeaway){
            total+=20;
        }
        return total;
    }

    public void addExtraCheese(){
        // your code goes here
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.extraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        this.takeaway = true;
    }

    public String getBill(){
        int total = this.price;
        bill = "";
        bill += "Base Price Of The Pizza: " +this.price+ "\n";

        if (this.extraCheese){
            bill += "Extra Cheese Added: " +80+ "\n";
            total+= 80;
        }
        if(this.extraToppings) {
            if (isVeg) {
                bill += "Extra Toppings Added: " +70+ "\n";
                total += 70;
            }

            else{
                bill += "Extra Toppings Added: " +120+ "\n";
                total += 120;
            }

        }
        if(this.takeaway){
            bill += "Paperbag Added: " +20+ "\n";
            total+=20;
        }
        bill += "Total Price: " +total+ "\n";
        return this.bill;
    }
}