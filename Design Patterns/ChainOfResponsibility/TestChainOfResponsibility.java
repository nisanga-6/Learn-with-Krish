package com.Example.ChainOfResponsibility;

public class TestChainOfResponsibility {

    public static void main(String[] args){

   Chain chain = new Chain();

   Card card = new Card("6789543256789876","VISA",6,2025);
   chain.validate(card);

        Card card1 = new Card("6789543234567890","MASTER_CARD",5,2025);
        chain.validate(card1);

        Card card2 = new Card("6789543256789876","AmericanExpress",12,2027);
        chain.validate(card2);

    }
}
