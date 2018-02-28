package Garage;

public class Motorcycle extends Vehicle{
	
	int decals;
	boolean hasNitrous;
	
	
	public Motorcycle(String make, String name, double engineSize, int wheels, String numPlate, boolean wheelDamage,
			boolean bodyDamage, int decals, boolean hasNitrous) {
		super(make, name, engineSize, wheels, numPlate, wheelDamage, bodyDamage);
		this.decals = decals;
		this.hasNitrous = hasNitrous;
	}
	
	
	
}
