package com.Example.ChainOfResponsibility;

public class Chain {

    cardValidator chain;

    public Chain(){

        buildChain();

    }

    private void buildChain(){

        chain = new VisaCardValidator(new MasterCardValidator(new AmericanExpressValidator(null)));
    }
    public void validate(Card card){

        chain.validate(card);
    }
}
