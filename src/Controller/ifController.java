package Controller;

//Import Section
import Model.Guardian;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ifController
{
	private Guardian userGuardian;
	
	public ifController()
	{
		userGuardian = new Guardian();
	}

	public void start()
	{
		JOptionPane.showMessageDialog(null, "Time to make a new Guardian!");
		
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
		
		loops();
		
	}
	
	public void woomy()
	
	{
		boolean isFinished = false;
		int someCount= 0;
			String response = JOptionPane.showInputDialog(null, "Pop quiz: What did you name your Guardian?");
			while(!response.equals(userGuardian.getName()))
			{
				JOptionPane.showMessageDialog(null, "WRONG! Try again!");
				someCount++;
			}
			if (someCount > 10)
			{
			isFinished = true;
			}
	}
	
	private void loops()
	{
		String loops = JOptionPane.showInputDialog(null, "Bröther, do you want the lööps?");
		
		boolean wantsLoops = false;
		int promptCount = 3;
		
		while(!wantsLoops)
		{
			if(loops.toLowerCase().equals("yes") || loops.toLowerCase().equals("true"))
			{
			JOptionPane.showMessageDialog(null, "Good bröther, enjoy your lööps.");
			}
			
			else if(loops.toLowerCase().equals("no") || loops.toLowerCase().equals("false"))
			JOptionPane.showMessageDialog(null, "Silly bröther, you know you want the lööps.");
		
			if (promptCount >= 3)
			{
				wantsLoops = true;
			}
		}
	}

	public void lotsOfRun()
	{
		//local variables are only visible in the method they are defined in!
		//they only have SCOPE to that method
		
		ArrayList<Guardian> myGuardians = new ArrayList<Guardian>();
		
		Guardian userGuardian = new Guardian();
		
		
		myGuardians.add(userGuardian);
		
		//Standard forward loop
		for(int index = 0; index < myGuardians.size();index += 1)
		{
			
		}
		
		//Standard backward loop
		for (int index = myGuardians.size()  - 1; index >=  0; index -=1) 
		{
			
		}
		
		for (Guardian current : myGuardians)
		{
			JOptionPane.showMessageDialog(null, "The Guardian is named: " + current.getName());
		}
	}
	
	//Learn more about arrays on own time
	
	{
		
	}
}
