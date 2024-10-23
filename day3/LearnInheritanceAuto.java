package week2.day3;
// Multi-level inheritance --- A <--- B <--- C
public class LearnInheritanceAuto extends LearnInheritanceCar { // why it is extends car because already car extends from superclass(vehicle) and also car method
//	Create Method
	public void applyMeter() {
		System.out.println("pay the amount ---> Auto");
	
}
	public static void main(String[] args) {

//	LearnInheritanceCar c = new LearnInheritanceCar();
//	c.applyGear();
//	In inheritance using extends keyword single object is enough to access all the methods(super class+sub class)
//		LearnInheritanceCar c = new LearnInheritanceCar();
//		c.applyGear();
//		c.applyBrake();
//		c.soundHorn();
		LearnInheritanceAuto A = new LearnInheritanceAuto();
		A.applyMeter(); // Usual method
		A.applyBrake();
		A.applyGear();
		A.soundHorn();
		
	} 
}
