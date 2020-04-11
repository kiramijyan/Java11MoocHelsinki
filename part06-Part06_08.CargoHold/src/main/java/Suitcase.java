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

public class Suitcase {

    private ArrayList<Item> items;
    private int maximum;

    public Suitcase(int initMax){

        this.maximum = initMax;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
        int itemsWeightSum = 0;

        for(int i = 0; i < items.size(); i++){
            itemsWeightSum = itemsWeightSum + items.get(i).getWeight();
        }

        if(itemsWeightSum > this.maximum){
            items.remove(item);
        }
    }

    public String toString(){

        int itemsWeightSum = 0;

        if (items.isEmpty()){
            return "no items (0 kg)";
        }

        if (items.size() == 1 && this.maximum != 0) {
            return items.size() + " item (" + items.get(0).getWeight() + "kg)";
        }

        for(int i = 0; i < items.size(); i++){
            itemsWeightSum = itemsWeightSum + items.get(i).getWeight();
        }

        return items.size() + " items (" + itemsWeightSum + "kg)";
    }

    public void printItems(){
        for (Item itemInList : items ){
            System.out.println(itemInList.toString());
        }
    }

    public int totalWeight(){

        int totalWeight = 0;

        for(int i = 0; i < items.size(); i++){
            totalWeight = totalWeight + items.get(i).getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem(){


        if(items.isEmpty()){
            return null;
        }

        int maxIndex = 0;
        int heaviestWeight = 0;

        for(int i = 0; i < items.size(); i++){

            if(items.get(i).getWeight() > heaviestWeight){
                heaviestWeight = items.get(i).getWeight();
                maxIndex = i;
            }
        }

        Item heaviestItem = items.get(maxIndex);

        return heaviestItem;
    }
}
