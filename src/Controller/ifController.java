package Controller;

//Import Section
import Model.Guardian;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ifController
{
	private Guardian userGuardian;
	
	public ifController()
	{
		userGuardian = new Guardian();
	}
	
	/**
	 * this is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		Scanner inputGuardian = new Scanner(System.in);
		String userInput = JOptionPane.showInputDialog(null, "What should it's name be?");
		userGuardian.setName(userInput);
	}
}
