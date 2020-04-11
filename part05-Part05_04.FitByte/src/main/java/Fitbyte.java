/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    
    public Fitbyte (int ageInitial, int restingHeartRateInitial){
        this.age = ageInitial;
        this.restingHeartRate = restingHeartRateInitial;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
         return ((206.3 - (0.711 * this.age)) - this.restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
