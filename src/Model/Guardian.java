package Model;

public class Guardian
{
	//Declaration Section
	//Data Member Section
	//Also called instance variables
	//These are special - they get a default value  
	
	
	private String name;
	private int legCount;
	private boolean isActive;
	private double HP;
	private boolean isCharging;
	
	/**
	 * Default constructor for a Run.
	 * Initializes all variables to valid but "bad" values
	 * used for later customization
	 */
		public Guardian()
	{
		this.name = "unnamed guardian";
		this.legCount = -99;
		this.HP = -99;
		this.isActive = false;
		this.isCharging = false;
	}
	
		/**
		 * 
		 * @param name This is the Name of the Guardian.
		 * @param legCount The number of the legs the Guardian Has.
		 * @param isActive Whether the Guardian is activated or not.
		 * @param HP How much Health the Guardian has.
		 * @param isCharging Is the Guardian getting ready to fire?
		 */
	
	
	public Guardian(String name, int legCount, boolean isActive, double HP, boolean isCharging)
	{
		this.name = name;
		this.legCount = legCount;
		this.HP = HP;
		this.isActive = isActive;
		this.isCharging = isCharging;
		
	}
}
