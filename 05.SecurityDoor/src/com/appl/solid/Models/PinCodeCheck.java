package com.appl.solid.Models;

import com.appl.solid.Interface.ISecurityUI;

public class PinCodeCheck extends SecurityCheck {
	private ISecurityUI securityUI;

    public PinCodeCheck(ISecurityUI securityUI) {
        this.securityUI = securityUI;
    }

    private boolean isValid(int pin) {
        return true;
    }

	@Override
	public boolean ValidateUser() {
		int pin = securityUI.requestPinCode();
        if (isValid(pin)) {
            return true;
        }
		return false;
	}
}
