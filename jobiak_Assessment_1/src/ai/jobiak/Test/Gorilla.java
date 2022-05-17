package ai.jobiak.Test;

public class Gorilla extends Mammal  {
	
	
	public double throwSomething() {
		
		return getEnergyLevel()-5;
		//  System.out.println(getEnergyLevel());
	
	}
	
	public double eatBanana() {
		return this.getEnergyLevel()+10;
	}
	public double climb() {
		System.out.println(getEnergyLevel());
		
		return this.getEnergyLevel()-10;
		
	}

}
