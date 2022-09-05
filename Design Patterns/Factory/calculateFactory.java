package com.Example.Factory;

public class calculateFactory {

    public Calculate getCalculation(String type){

        Calculate obj=null;

        if(type.equals("Add")) {

            obj = new Add();
        }
        else if(type.equals("Devide")){

            obj=new Devide();
        }
        else if(type.equals("Substract")){

            obj=new Substract();
        }
        else{

            System.out.println("Invalid Parameter");
        }
        return obj;
    }
}
