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

public class Stack {

    private ArrayList<String> strings;

    public Stack(){
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty(){

        if(strings.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        strings.add(value);
    }

    public ArrayList<String> values(){

        return this.strings;
    }

    public String take(){

        String lastValue = strings.get(strings.size() - 1);
        strings.remove(strings.size() - 1);
        return lastValue;
    }
}
