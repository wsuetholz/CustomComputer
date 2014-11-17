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
public class ComputerBasicProcessor implements CustomComputer {
    
    private CustomComputer customComputer;
    
    public ComputerBasicProcessor ( CustomComputer base ) {
	if (base == null) {
	    throw new IllegalArgumentException();
	}
	
	this.customComputer = base;
    }
    
    @Override
    public String getDescription() {
	return customComputer.getDescription() + ", Intel Core i3 Processor" ;
    }

    @Override
    public double getCost() {
	return customComputer.getCost() + 150.00;
    }
    

}
