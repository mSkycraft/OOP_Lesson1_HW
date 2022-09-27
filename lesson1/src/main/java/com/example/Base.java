package com.example;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;
    private boolean blockStartOnOpenDoor = true;
    private Rudder rudder;
    private Сonditioner conder;
    
    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel1.setSteeringWheel();
        wheel2 = new Wheel();
        wheel2.setSteeringWheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        door1 = new Door();
        door2 = new Door();
        door3 = new Door();
        door4 = new Door();
        rudder = new Rudder();
        conder = new Сonditioner();
    }
    
    public void start() {
        engine.start();
    }
    
    public void drive () {
        if((door1.getStatus())&&(door2.getStatus())&&(door3.getStatus())&&(door4.getStatus())){
            lockDoors();
            if (engine.getWork()) {
                transmission.switchGear(1);
                wheel1.rotate();
                wheel2.rotate();
                wheel3.rotate();
                wheel4.rotate();
                //Имитация действий пользователя авто, тут специально чтобы не усложнять код
                door1.open();
                rudder.rotateRudder();
                conder.start();
                conder.stop();
            }
            unlockDoors();
        } else {
            System.out.println("Дверь открыта, пожалуйста закройте дверь перед поездкой");
        }
    }
    
    public void changeDirect(){
        rudder.rotateRudder();
        wheel1.isRudderRotate();
        wheel2.isRudderRotate();
    }

    public void stop() {
        engine.stop();
    }
    
    public void lockDoors(){
        door1.lockDoor();
        door2.lockDoor();
        door3.lockDoor();
        door4.lockDoor();
    }
    public void unlockDoors(){
        door1.unlockDoor();
        door2.unlockDoor();
        door3.unlockDoor();
        door4.unlockDoor();
    }

    public void startCondition(){
        conder.start();
    }
    public void stopCondition(){
        conder.stop();
    }
}