package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {

    protected void action(Orderable item){
        if(item.checkout()){
            System.out.println("Payment was successful.");
        } else{
            System.out.println("Some problem occurred during the payment process.");
        }
    }

}
