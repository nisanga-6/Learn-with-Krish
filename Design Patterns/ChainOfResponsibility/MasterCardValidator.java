package com.Example.ChainOfResponsibility;

public class MasterCardValidator extends cardValidator{
    public MasterCardValidator(cardValidator validator) {
        super(validator);
    }
        public void validate(Card card){

            if(card.getType().equals("MASTER_CARD")){

                System.out.println("Validating MASTER Card");
            }
            else{

                super.validate(card);
            }
        }

}
