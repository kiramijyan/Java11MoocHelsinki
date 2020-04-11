/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */

public class Archive {
    private String identifier;
    private String name;

    public Archive(String initIdentifier, String initName){
        this.name = initName;
        this.identifier = initIdentifier;
    }

    public String getName(){
        return this.name;
    }

    public String getIdentifier(){
        return this.identifier;
    }
    
    public boolean equals(Object compared){

        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        if(this.identifier.contains(comparedArchive.identifier)){
            return true;
        }

        return false;
    }

    public String toString(){
        return this.identifier + ": " + this.name;
    }
}