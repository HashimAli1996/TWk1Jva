package Garage;

public class Vans extends Vehicle{
	
	boolean isLimited;
	int maxKg;
	
	
	public Vans(String make, String name, double engineSize, int wheels, String numPlate, boolean wheelDamage,
			boolean bodyDamage, boolean isLimited, int maxKg) {
		super(make, name, engineSize, wheels, numPlate, wheelDamage, bodyDamage);
		this.isLimited = isLimited;
		this.maxKg = maxKg;
	}
}
