package com.Example.Memento;

public class MomentoPatternMain {

    public static void main(String[] args){

  OriginatorState originatorState = new OriginatorState();
  careTaker careTaker = new careTaker();

  originatorState.setState("memento-state-1");
  originatorState.setState("memento-state-2");
  originatorState.setState("memento-state-3");
  originatorState.setState("memento-state-4");

  careTaker.addMomentoState(originatorState.saveStateIntoMemento());

  originatorState.setState("memento-state-5");
  originatorState.setState("memento-state-6");
  originatorState.setState("memento-state-7");

  careTaker.addMomentoState(originatorState.saveStateIntoMemento());

  originatorState.getStateFromMemento(careTaker.get(0));
  System.out.println("First Saved State:" +originatorState.getState());
  originatorState.getStateFromMemento(careTaker.get(1));
  System.out.println("Second Saved State:" +originatorState.getState());

    }
}
