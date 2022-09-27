package com.example;

public class Сonditioner {
    private boolean isOn = false;

    public void start(){
        isOn = true;
        System.out.println("Кондиционер включен");
    }
    public void stop(){
        isOn = false;
        System.out.println("Кондиционер выключен");
    }
}
