/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author przemek
 */
public class Bird {

    private final String name;
    private final String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;

    }

    public String printName() {
        return this.name;
    }

    public String printLatinName() {
        return this.latinName;
    }
    
    public void addObservation() {
        this.observations++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations
                + " observations";
    }
}
