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

public class MessagingService {

    private ArrayList<Message> messageList;

    public MessagingService(){
        this.messageList = new ArrayList<Message>();
    }

    public void add(Message message){

        if (message.getContent().length() < 281){
           this.messageList.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
       return this.messageList;
    }
}

