package lab2;
/**
 * Basic model of an atom given protons, neutrons, and electrons
 */
public class Atom {
	/**
 	* declares atom variables
 	*/
	private int protons;
	private int neutrons;
	private int electrons;
	
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
    	{
    	/**
     	* gets variable values
     	*/
    	protons = givenProtons;
    	neutrons = givenNeutrons;
    	electrons  = givenElectrons;
    	}
       	
	public int getAtomicMass()
    	{
    	/**
     	* calculates the atoms atomic mass
     	*/
        	int atomicMass = protons + neutrons;
        	return atomicMass;
    	}
    	
	public int getAtomicCharge()
    	{
    	/**
     	* calculates the atoms atomic charge
     	*/
        	int atomicCharge = protons - electrons;
        	return atomicCharge;
    	}
	
	public void decay()
    	{
    	/**
     	* decreases the number of protons and neutrons by 2
     	*/
        	protons = protons - 2;
        	neutrons = neutrons - 2;
    	}
}