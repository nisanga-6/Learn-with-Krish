package com.Example.Memento;

public class OriginatorState {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public mementoState saveStateIntoMemento(){

        return new mementoState(this.state);
    }

    public void getStateFromMemento(mementoState m){

        this.state=m.getState();


    }
}
