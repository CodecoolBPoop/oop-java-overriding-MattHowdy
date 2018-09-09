package com.codecool.uml.overriding;

public abstract class AbstractProcess{


    public void process(Orderable item){
        stepBefore();
        action(item);
        stepAfter();
    }

    public void stepBefore(){
        System.out.println("Order is under processing.");
    };

    protected abstract void action(Orderable item);

    public void stepAfter(){
        System.out.println("The item is shipped.");
    };
}
