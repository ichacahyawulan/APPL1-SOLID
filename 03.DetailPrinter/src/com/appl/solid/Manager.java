package com.appl.solid;

import java.util.ArrayList;

public class Manager extends Employee{
	ArrayList<String> documents;
	
	public Manager(String name, ArrayList<String> documents) {
		super(name);
		this.documents = documents;
	}

	public ArrayList<String> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<String> documents) {
		this.documents = documents;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + String.join("\n", this.documents);
	}
}