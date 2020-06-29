package com.appl.solid.Models;

import java.util.Scanner;

import com.appl.solid.Interface.ISecurityUI;

public class ScannerUI implements ISecurityUI {

	@Override
	public String requestKeyCard() {
		Scanner scan = new Scanner(System.in);
        System.out.println("Slide your key card");
        return scan.nextLine();
	}

	@Override
	public int requestPinCode() {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter your pin code: ");
        return scan.nextInt();
	}
	
}
