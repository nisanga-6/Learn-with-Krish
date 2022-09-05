package com.Example.ChainOfResponsibility;

public class AmericanExpressValidator extends cardValidator{
    public AmericanExpressValidator(cardValidator validator) {
        super(validator);
    }

    public void validate(Card card){

        if(card.getType().equals("AmericanExpress")){

            System.out.println("Validating AmericanExpress Card");
        }
        else{

            super.validate(card);
        }
    }
}
