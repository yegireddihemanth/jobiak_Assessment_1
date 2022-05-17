package ai.jobiak.Test;

public class Mammal {
	
	public double energyLevel=100;

	public Mammal() {
		// TODO Auto-generated constructor stub
	}

	public Mammal(double energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

	public double getEnergyLevel() {
		
		return energyLevel;
		 
	} 

	public void setEnergyLevel(double energyLevel) {
		this.energyLevel = energyLevel;
	}

	@Override
	public String toString() {
		return "Mammal [energyLevel=" + energyLevel + "]";
	}
	
	
	
}
