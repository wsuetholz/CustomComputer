/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suetholz.net.customcomputer.decoration;

import suetholz.net.customcomputer.api.CustomComputer;

/**
 *
 * @author BillS
 */
public class ComputerPremiumSystemBoard implements CustomComputer {
    
    private CustomComputer customComputer;
    
    public ComputerPremiumSystemBoard ( CustomComputer base ) {
	if (base == null) {
	    throw new IllegalArgumentException();
	}
	
	this.customComputer = base;
    }
    
    @Override
    public String getDescription() {
	return customComputer.getDescription() + ", Premium System Board" ;
    }

    @Override
    public double getCost() {
	return customComputer.getCost() + 350.00;
    }
    

}
