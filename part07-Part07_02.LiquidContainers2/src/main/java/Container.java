/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
public class Container {

    private int amountSum;

    public Container(){
        this.amountSum = 0;
    }

    public int contains (){
        return this.amountSum;
    }

    public void add(int amount){

        if(amount >= 0){
            this.amountSum = amountSum + amount;

            if(this.amountSum > 100){
                this.amountSum = 100;
            }

        }
    }

    public void remove (int amount){

        if(amount >= 0){
            this.amountSum = this.amountSum - amount;

            if(this.amountSum < 0){
                this.amountSum = 0;
            }
        }
    }

    public String toString(){
        return this.amountSum + "/100";
    }
}

