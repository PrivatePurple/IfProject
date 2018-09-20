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
		String userInput = JOptionPane.showInputDialog(null, "What should it's name be?");
		userGuardian.setName(userInput);
		
		userInput = JOptionPane.showInputDialog(null, "How many Legs should it have?");
		userGuardian.setLegCount(Integer.parseInt(userInput));
		JOptionPane.showMessageDialog(null, "Your monster has "+ userGuardian.getLegCount()+" legs.");
		
		
	}
	
}
