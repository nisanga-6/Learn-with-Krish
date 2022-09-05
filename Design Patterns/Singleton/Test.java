package com.Example.Singleton;

public class Test {

    public static void main(String[] args){

        spellCheck obj1 = spellCheck.getInstance();
        System.out.println(obj1.hashCode());

        spellCheck obj2 = spellCheck.getInstance();
        System.out.println(obj2.hashCode());
    }
}
