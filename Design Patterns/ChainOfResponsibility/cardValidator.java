package com.Example.ChainOfResponsibility;

public abstract class cardValidator {

    private cardValidator validator;

    public cardValidator(cardValidator validator){

        this.validator=validator;


    }

    public void validate(Card card){


        if(validator!=null){

            validator.validate(card);
        }else{
            System.out.println("Invalid Card type");
        }
    }
}
