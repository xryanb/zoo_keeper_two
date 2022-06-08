package zookeepertwo;

public class Bat extends Mammal2 {
	public Bat() {
		this.setEnergy(300);
	}
	
	public void fly() {
		System.out.println("This is me flying away");
		this.setEnergy(this.getEnergy() - 50);
	}
	
	public void eatHumans(int num) {
		System.out.println("Issa me Dracula");
		this.setEnergy(this.getEnergy() + (25 * num));
	}
	public void attackTown() {
		System.out.println("I thought I was Dracula..I'm actually a Dragon- time to burn this town!");
		this.setEnergy(this.getEnergy() - 100);
	}
}
