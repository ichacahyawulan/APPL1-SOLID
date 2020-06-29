package com.appl.solid.Models;

import com.appl.solid.Interface.IRechargeable;

public class Robot extends Worker implements IRechargeable {
	private int capacity;
    private int currentPower;
    
    public Robot(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public int getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    @Override
    public void work(int hours) {
        if (hours > this.currentPower) {
            hours = currentPower;
        }
        super.work(hours);
        this.currentPower -= hours;
    }

    @Override
    public void recharge() {
        this.currentPower = this.capacity;
    }
}
