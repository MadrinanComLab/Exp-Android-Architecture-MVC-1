package com.madrinancomlab.exp_android_mvc_architecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable
{
    // DECLARING A LIST OF INTEGER
    private List<Integer> list;

    // CONSTRUCTOR TO INITIALIZE THE LIST
    public Model()
    {
        // RESERVING THE SPACE FOR LIST ELEMENTS
        list = new ArrayList<Integer>(3);

        // ADDING THE ELEMENTS INTO THE LIST
        list.add(0);
        list.add(0);
        list.add(0);
    }

    // DEFINING THE GETTER AND SETTER FUNCTIONS

    // FUNCTION TO RETURN THE APPROPRIATE COUNT
    // VALUE OF THE CORRECT INDEX
    public int getValueAtIndex(final int index) throws IndexOutOfBoundsException
    {
        return list.get(index);
    }

    // FUNCTION TO MAKE CHANGES IN THE ACTIVITY BUTTON'S COUNT VALUE WHEN USER TOUCH IT
    public void setValueAtIndex(final int index) throws IndexOutOfBoundsException
    {
        list.set(index, list.get(index) + 1);
        setChanged();
        notifyObservers();
    }
}
