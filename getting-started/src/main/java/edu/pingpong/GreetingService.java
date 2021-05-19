package edu.pingpong;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService{

    public String toUpperCase(String msg){
        return msg.toUpperCase();
    }
}