package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess{

    protected void action(Orderable item){
        if(item.pay()){
            System.out.println("Checkout process was successful.");
        } else{
            System.out.println("Some problem occurred during the checkout process.");
        }
    }
}
