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

	public void start()
	{
		
		
		String userInput = JOptionPane.showInputDialog(null, "What should it's name be?");
		userGuardian.setName(userInput);
		
		userInput = JOptionPane.showInputDialog(null, "How many Legs should it have?");
		userGuardian.setLegCount(Integer.parseInt(userInput));
		JOptionPane.showMessageDialog(null, "Your Guardian has "+ userGuardian.getLegCount()+" legs.");
		
		userInput = JOptionPane.showInputDialog(null, "How much Health should it have?");
		userGuardian.setHP(Integer.parseInt(userInput));
		JOptionPane.showMessageDialog(null, "Your Guardian has "+ userGuardian.getHP()+" Health.");
		
		JOptionPane.showInputDialog(null, "Do you want your Guardian to be Active?");
		
		if(userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("true"))
				{
				userGuardian.setIsActive(true);
				JOptionPane.showMessageDialog(null, "Your Guardian has activated itself, and is now searching for a possible target.");
				}
					else if(userInput.toLowerCase().equals("no") || userInput.toLowerCase().equals("false")) 
				{
					JOptionPane.showMessageDialog(null,"Your Guardian lays dormant, waiting for someone to shoot at.");
				}
		
		JOptionPane.showInputDialog(null, "Once your Guardian finds a target to shoot at, do you want it to fire a Charged shot?");
		
		if(userInput.toLowerCase().equals("yes") || userInput.toLowerCase().equals("true"))
				{
				userGuardian.setIsCharging(true);
				JOptionPane.showMessageDialog(null, "Once your Guardian locks on to an enemy, your Guardian charges up a devastating blast of energy. ");
				}
					else if(userInput.toLowerCase().equals("no") || userInput.toLowerCase().equals("false")) 
				{
					JOptionPane.showMessageDialog(null,"Once your Guardian locks on to an enemy, your Guardian fires a quick volley of shots, making sure that nothing is left standing.");
				}
		woomy();
		
	}
	
	public void woomy()
	{
		//define a variable before the lööp
		boolean isFinished = false;
		int someCount= 0;
		{
			String response = JOptionPane.showInputDialog(null, "Pop quiz: What did you name your Guardian?");
			while(!response.equals(userGuardian.getName()))
			{
				JOptionPane.showMessageDialog(null, "WRONG! Try again!");
			}
			
			if (someCount > 10)
			{
			isFinished = true;
			}	
			
		}
		
		
	}




}
