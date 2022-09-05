package com.Example.ChainOfResponsibility;

public class VisaCardValidator extends cardValidator{
    public VisaCardValidator(cardValidator validator) {
        super(validator);
    }

    public void validate(Card card){

        if(card.getType().equals("VISA")){

            System.out.println("Validating VISA Card");
        }
        else{

            super.validate(card);
        }
    }
}
