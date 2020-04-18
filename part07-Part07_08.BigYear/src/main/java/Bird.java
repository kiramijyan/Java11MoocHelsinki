/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Bird {

    private String name;
    private String nameLatin;
    private int observation;
    private ArrayList<String> observationList = new ArrayList<>();
    private Scanner scanner;

    public Bird(String name, String nameLatin){
        this.observation = 0;
        this.name = name;
        this.nameLatin = nameLatin;
    }

    public String getName(){
        String str = this.name;
        return str;
    }

    public String getNameLatin(){
        String str = this.nameLatin;
        return str;
    }

    public void observation(){
        this.observation++;
    }

    public int getObservation(){
        return this.observation;
    }


    public String toString(){
        return this.name + "(" + this.nameLatin + "): " + getObservation() + " observations" ;
    }
}

