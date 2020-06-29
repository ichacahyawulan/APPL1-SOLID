package com.appl.solid.Main;

import com.appl.solid.Models.*;
import com.appl.solid.Models.SecurityManager;

public class Main {

	public static void main(String[] args) {
		ScannerUI scannerUi = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
	}

}
