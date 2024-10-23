package week2.day3;
// Single inheritance --- A <--- B
public class LearnInheritanceCar extends LearnInheritanceVehicle { //Subclass
	

//	Create Method
	public void applyGear() {
		System.out.println("gear applied ---> car");
	
}
	public static void main(String[] args) {
//		LearnInheritanceVehicle v =new LearnInheritanceVehicle();
//		v.applyBrake();
//		v.soundHorn();
//	LearnInheritanceCar c = new LearnInheritanceCar();
//	c.applyGear();
//		In inheritance using extends keyword single object is enough to access all the methods(super class+sub class)
		LearnInheritanceCar c = new LearnInheritanceCar();
		c.applyGear();
		c.applyBrake();
		c.soundHorn();
		
	} 
}
