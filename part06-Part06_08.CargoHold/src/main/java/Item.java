/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
public class Item {
    
    private String name;
    private int weight;
    
    public Item(String initName, int initWeight){
        this.name = initName;
        this.weight = initWeight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name + " (" + this.weight + " kg)";  
    }
}
