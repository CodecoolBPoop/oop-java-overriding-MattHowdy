package com.codecool.uml.overriding;

import com.sun.tools.corba.se.idl.constExpr.Or;

public class Webshop {

    public static void main(String[] args) {


        Order firstOrder = new Order("DVD");
        Order secondOrder = new Order();

        System.out.println(firstOrder);


    }
}
