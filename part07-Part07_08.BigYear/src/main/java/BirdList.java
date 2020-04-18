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

public class BirdList {

    private ArrayList<Bird> birdList;

    public BirdList(){
        birdList = new ArrayList<>();
    }

    public void add(Bird birdToAdd){
        this.birdList.add(birdToAdd);
    }

    public ArrayList<Bird> getBirdList(){
        return this.birdList;
    }
}
