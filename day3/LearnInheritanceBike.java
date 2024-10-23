package week2.day3;
////Multi-level inheritance --- A <--- B <--- C
//public class LearnInheritanceBike extends LearnInheritanceAuto{// why it is extends auot because already car extends from superclass(vehicle) and car and also in auto we extend car method so all the methods form all the class i can access

////	Create Method
//	public void noOfWheels() {
//		System.out.println("2 ---> Bike");
//	
//}
//	public static void main(String[] args) {
//		LearnInheritanceBike B =new LearnInheritanceBike();
//		B.applyBrake();
//		B.applyGear();
//		B.applyMeter();
//		B.noOfWheels();
//		B.soundHorn();
//		
//}
//}
//Hierachical inheritance --- A <--- B & C (all the sub-classes inherots superclass)
// here car , auto and bike is sub class and this will inherits form parent class only(vehicle)

//public class LearnInheritanceBike extends LearnInheritanceVehicle { // ONLY INHERTIS THE SUPERCLASS
//	public void noOfWheels() {
//		System.out.println("2 ---> Bike");
//	}
//	public static void main(String[] args) {
//		LearnInheritanceBike B =new LearnInheritanceBike();
//		B.applyBrake();
//		B.noOfWheels();
//		B.soundHorn();
//	}
//}
// Method Overriding
public class LearnInheritanceBike extends LearnInheritanceAuto{// here Bike is sub class and auto is superclass
//Create Method
public void noOfWheels() {
System.out.println("2 ---> Bike");
}
public void applyMeter() {
	System.out.println("amount paid");//same method name but different class and different implementation(value)
}
public static void main(String[] args) {
LearnInheritanceBike B =new LearnInheritanceBike();
B.applyMeter();
}
}
