package com.tutorialspoint;

public class HiWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("HiWorld Your message :" + message);
    }
    public void init(){
        System.out.println("Init HiWorld...");
    }
    public void destroy(){
        System.out.println("Destroy HiWorld...");
    }
}
