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

public class Package {
        private ArrayList<Gift> gifts;

    public Package(){
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift initGift){
        gifts.add(initGift);
    }

    public int totalWeight(){

        int sum = 0;

        for(Gift item: gifts){
            sum = sum + item.getWeight();
        }
        return sum;
    }
}
