package edu.upc.dsa.models;

import java.util.LinkedList;
import java.util.List;

public class brote {

    private String name;
    private List<caso> casos;

    public brote(){

    }

    public brote (String nombre){

        this.name = nombre;
        casos = new LinkedList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addcaso(caso caso){
        casos.add(caso);
    }

    public List<caso> allcasos() {
        return this.casos;
    }

}
