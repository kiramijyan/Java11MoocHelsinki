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
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager (){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }

    public String drawJoke(){

        if (jokes.isEmpty()) {
             return "Jokes are in short supply.";
        } else {
            int randomIndex = (int) (Math.random() * jokes.size());
            return jokes.get(randomIndex);
        }
    }

    public void printJokes(){

        if (jokes.isEmpty()){
            System.out.println("Jokes are in short supply");
        }

        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}

