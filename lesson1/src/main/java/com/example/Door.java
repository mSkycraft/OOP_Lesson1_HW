package com.example;

public class Door {
    private boolean isOpen = false;
    private boolean isLocked = false;

    public boolean getStatus(){
        return !isOpen;
    }

    public void open(){
        if(isLocked == false){
            if(isOpen == false)
            {
                isOpen = true;
                System.out.printf("Состояние двери: %b",this.isOpen);
            } else {
                System.out.println("Невозможно открыть дверь");
            }
        } else {
            System.out.println("Дверь заблокирована");
        }
    }

    public void close(){
        if(isOpen == true){
            isOpen = false;
            System.out.printf("Состояние двери: %b",this.isOpen);
        } else {
            System.out.println("Дверь и так уже закрыта");
        }
    }

    public void lockDoor(){
        isLocked = true;
    }
    public void unlockDoor(){
        isLocked = false;
    }
}
