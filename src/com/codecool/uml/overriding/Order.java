package com.codecool.uml.overriding;


public class Order implements Orderable {
    private int id;
    private static int count = 0;
    private String status;
    private String name;

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public boolean checkout() {
        if(getStatus().equals("new")){
            this.status = "checked";
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean pay() {
        if(getStatus().equals("checked")){
            this.status = "payed";
            return true;
        } else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "The ordered item is: "+ getName()+ ". The number " + getId() + " item's status is: " + getStatus() + ".";
    }


    public Order(String name){
        this.id = count++;
        this.status = "new";
        this.name = name;
    }

    public Order(){
        this.id = count++;
        this.status = "new";
        this.name = "unknown";
    }

}
