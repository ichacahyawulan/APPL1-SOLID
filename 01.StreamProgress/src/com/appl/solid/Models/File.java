package com.appl.solid.Models;

import com.appl.solid.Interface.IStreamable;

public class File implements IStreamable{
	private String name;
	private int length;
    private int bytesSent;
    
    public File(String name, int length, int bytesSent) {
        this.name = name;
        this.length = length;
        this.bytesSent = bytesSent;
    }
    
    public void setLength(int length) {
    	this.length = length;
    }
    
    public void setBytesSent(int bytesSent) {
    	this.bytesSent = bytesSent;
    }

	@Override
	public int getLength() {
		return this.length;
	}

	@Override
	public int getBytesSent() {
		return this.bytesSent;
	}
}