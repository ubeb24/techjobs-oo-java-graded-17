package org.launchcode.techjobs.oo;
import java.util.Objects;
//Create a new class called JobField in the package org.launchcode.techjobs.oo.
//
//Consider the following questions to help you decide what code to put in the JobField class:
//
//What fields do ALL FOUR of the classes have in common?
//id, nextid, and value
//Which constructors are the same in ALL FOUR classes?
//empty (for the id aggregation) and string value to set the value for the class
//What getters and setters do ALL of the classes share?
//get id, get and set value
//Which custom methods are identical in ALL of the classes?
//hashcode, equals, and toString

//In JobField, declare each of the common fields.

import java.util.Objects;

//Code the constructors.
//
//Use Generate to create the appropriate getters and setters.
//
//Add in the custom methods.
//
//Finally, to prevent the creation of a JobField object, make this class abstract.
public abstract class JobField {
    //declare the common fields
    private int id;
    private static int nextId = 1;
    private String value;


    //code constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    //generate getters and setters
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
//add in custom methods

    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }

}
