package com.Example.Memento;

import java.util.ArrayList;
import java.util.List;

public class careTaker {

    private List<mementoState> mementoStateList = new ArrayList<mementoState>();

    public void addMomentoState(mementoState mementoState){

        mementoStateList.add(mementoState);
    }

    public mementoState get(int index){

        return mementoStateList.get(index);
    }
}
