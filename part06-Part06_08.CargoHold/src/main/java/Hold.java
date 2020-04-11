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

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcaseList;


    public Hold (int initMaximumWeight){
        this.maximumWeight = initMaximumWeight;
        this.suitcaseList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        suitcaseList.add(suitcase);
        int suitcaseMaxWeightSum = 0;

        for(int i = 0; i < suitcaseList.size(); i++){
            suitcaseMaxWeightSum = suitcaseMaxWeightSum + suitcaseList.get(i).totalWeight();
        }
        
        if(suitcaseMaxWeightSum > this.maximumWeight){
            suitcaseList.remove(suitcase);
        }

    }
    
    public String toString(){

        int maxWeight = 0;
        if(suitcaseList.isEmpty()){
            return "no suitcases (0 kg)";
        }
        
        if (suitcaseList.size() == 1 && this.maximumWeight != 0){
            return suitcaseList.size() + " suitcase (" + suitcaseList.get(0).totalWeight()+ "kg)";
        }

        for(int i = 0; i < suitcaseList.size(); i++){
            maxWeight = maxWeight + suitcaseList.get(i).totalWeight();
        }

        return suitcaseList.size() + " suitcases (" + maxWeight + "kg)";
    }
    
    public void printItems(){

        for(Suitcase items: suitcaseList){
            items.printItems();
        }
    }
}