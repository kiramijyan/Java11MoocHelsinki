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

public class Room {

    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean isEmpty(){

        if (persons.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){

        return persons;
    }
    
        public Person shortest(){

        if(persons.isEmpty()){
            return null;
        }


        String personName = persons.get(0).getName();
        int personHeight = persons.get(0).getHeight();


        for(int i = 0; i < persons.size(); i++){
            if(persons.get(i).getHeight() < personHeight){
                personHeight = persons.get(i).getHeight();
                personName = persons.get(i).getName();
            }
        }

        return new Person(personName, personHeight);
    }
        
    public Person take(){

        if(persons.isEmpty()){
            return null;
        }

        Person removedPerson = shortest();
        persons.remove(shortest());

        return removedPerson;
    }
}
