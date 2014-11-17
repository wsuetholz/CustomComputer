/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suetholz.net.customcomputer;

import suetholz.net.customcomputer.api.CustomComputer;

/**
 *
 * @author BillS
 */
public class CustomizedComputer implements CustomComputer {

    @Override
    public String getDescription() {
	return "Customized Computer" ;
    }

    @Override
    public double getCost() {
	return 0.00;
    }
    
}
