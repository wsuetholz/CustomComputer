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
public class ComputerBasicMemory implements CustomComputer {
    
    private CustomComputer customComputer;
    
    public ComputerBasicMemory( CustomComputer base ) {
	if (base == null) {
	    throw new IllegalArgumentException();
	}
	
	this.customComputer = base;
    }
    
    @Override
    public String getDescription() {
	return customComputer.getDescription() + ", Basic Memory Stick" ;
    }

    @Override
    public double getCost() {
	return customComputer.getCost() + 15.00;
    }
    

}
