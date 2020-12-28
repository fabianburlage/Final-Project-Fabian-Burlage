package com.fabianburlage.ds.chicagoanalysis.model;

public class Person {

    protected String name;
    protected String lastname;


    public Person(final String name, final String lastname) {
        this.name = name.replace("\"", "").replace(" ", "");
        this.lastname = lastname.replace("\"", "");

    }

    public String toString(){
        return "{ \"name\":\""+ this.name + "\", \"lastname\":\""+this.lastname+"\"}"; }


    public String getName() {
        return name;
    } // METHOD GET NAME ENDS -----------------------------

    /**
     *
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    } // METHOD SET NAME ENDS -----------------------

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }




}
