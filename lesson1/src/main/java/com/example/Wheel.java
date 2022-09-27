package com.example;

public class Wheel {
    private boolean isSteeringWheel = false;

    public void rotate() {
        System.out.println("Колесо крутится");
    }

    public void isRudderRotate(){
        if(isSteeringWheel == true)
            System.out.println("Поворот колеса");
    }

    public void setSteeringWheel(){
        isSteeringWheel = true;
    }
}