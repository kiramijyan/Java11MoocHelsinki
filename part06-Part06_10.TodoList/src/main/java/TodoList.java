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

public class TodoList {

    private ArrayList<String> taskList = new ArrayList<>();

    public void add(String task){
        taskList.add(task);
    }

    public void remove(int number){
        int index = number - 1;
        taskList.remove(index);
    }

    public void print(){

        for(int i = 0; i < taskList.size(); i++){
            System.out.println(i + 1 + ": " + taskList.get(i));
        }
    }
}
