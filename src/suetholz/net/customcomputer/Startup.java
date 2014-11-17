/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suetholz.net.customcomputer;

import suetholz.net.customcomputer.api.CustomComputer;
import suetholz.net.customcomputer.decoration.ComputerBasicCase;
import suetholz.net.customcomputer.decoration.ComputerBasicMemory;
import suetholz.net.customcomputer.decoration.ComputerBasicProcessor;
import suetholz.net.customcomputer.decoration.ComputerBasicSystemBoard;
import suetholz.net.customcomputer.decoration.ComputerPremiumCase;
import suetholz.net.customcomputer.decoration.ComputerPremiumMemory;
import suetholz.net.customcomputer.decoration.ComputerPremiumProcessor;
import suetholz.net.customcomputer.decoration.ComputerPremiumSystemBoard;

/**
 *
 * @author BillS
 */
public class Startup {

    public static void main( String[] args ) {
	CustomComputer customComputer
		= new ComputerBasicSystemBoard(
			new ComputerBasicProcessor(
				new ComputerBasicMemory(
					new ComputerBasicMemory(
						new ComputerBasicCase(
							new CustomizedComputer() ) ) ) ) );
	System.out.println( "Built: " + customComputer.getDescription() );
	System.out.println( "Cost of Custom Computer is " + customComputer.getCost() );

	customComputer
		= new ComputerPremiumSystemBoard(
			new ComputerBasicProcessor(
				new ComputerBasicMemory(
					new ComputerBasicMemory(
						new ComputerBasicCase(
							new CustomizedComputer() ) ) ) ) );
	System.out.println( "Built: " + customComputer.getDescription() );
	System.out.println( "Cost of Custom Computer is " + customComputer.getCost() );

	customComputer
		= new ComputerPremiumSystemBoard(
			new ComputerPremiumProcessor(
				new ComputerBasicMemory(
					new ComputerBasicMemory(
						new ComputerBasicCase(
							new CustomizedComputer() ) ) ) ) );
	System.out.println( "Built: " + customComputer.getDescription() );
	System.out.println( "Cost of Custom Computer is " + customComputer.getCost() );

	customComputer
		= new ComputerPremiumSystemBoard(
			new ComputerPremiumProcessor(
				new ComputerPremiumMemory(
					new ComputerBasicMemory(
						new ComputerBasicCase(
							new CustomizedComputer() ) ) ) ) );
	System.out.println( "Built: " + customComputer.getDescription() );
	System.out.println( "Cost of Custom Computer is " + customComputer.getCost() );

	customComputer
		= new ComputerPremiumSystemBoard(
			new ComputerPremiumProcessor(
				new ComputerPremiumMemory(
					new ComputerPremiumMemory(
						new ComputerBasicCase(
							new CustomizedComputer() ) ) ) ) );
	System.out.println( "Built: " + customComputer.getDescription() );
	System.out.println( "Cost of Custom Computer is " + customComputer.getCost() );

	customComputer
		= new ComputerPremiumSystemBoard(
			new ComputerPremiumProcessor(
				new ComputerPremiumMemory(
					new ComputerPremiumMemory(
						new ComputerPremiumCase(
							new CustomizedComputer() ) ) ) ) );
	System.out.println( "Built: " + customComputer.getDescription() );
	System.out.println( "Cost of Custom Computer is " + customComputer.getCost() );
    }
}
