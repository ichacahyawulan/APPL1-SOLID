package com.appl.solid.Models;

import com.appl.solid.Interface.ISecurityUI;

public class KeyCardCheck extends SecurityCheck {
	private ISecurityUI securityUI;

    public KeyCardCheck(ISecurityUI securityUI) {
        this.securityUI = securityUI;
    }

    private boolean isValid(String code) {
        return true;
    }

	@Override
	public boolean ValidateUser() {
		String code = securityUI.requestKeyCard();
        if (isValid(code)) {
            return true;
        }
		return false;
	}
}
