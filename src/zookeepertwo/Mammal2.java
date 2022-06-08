package zookeepertwo;

public class Mammal2 {
	private double energy=100;
	
	public Mammal2() {}
	
	public void displayEnergy() {
		System.out.println("Energy level is: " + this.energy);
	}
	
	public double getEnergy() {
		return this.energy;
	}
	
	public void setEnergy(double e) {
		this.energy=e;
	}
}
