import java.util.Scanner;

public class TestQuestion4 {
	
	public static void main (String[] args){
		
	int choice;
	String choice2;
	Scanner input = new Scanner(System.in);
	AutoProgram car = new AutoProgram();
	
	System.out.print("What is the year of your car? : ");
	choice = input.nextInt();
	car.CarYear(choice);
	
	System.out.print("What is you car's make? : ");
	choice2 = input.next();
	car.CarMake(choice2);
	
	System.out.print("What model is your car? : ");
	choice2 = input.next();
	car.CarModel(choice2);
	
	System.out.print("What is the color of your car? : ");
	choice2 = input.next();
	car.SetColor(choice2);
	
	System.out.print("What is the name of your car? : ");
	choice2 = input.next();
	car.SetName(choice2);
	
	System.out.print("How many gears does your car have? : ");
	choice = input.nextInt();
	car.CarGears(choice);
	
	System.out.print("What is your operating cycle? : ");
	choice = input.nextInt();
	car.CarCycles(choice);
	
	System.out.print("What gear are you currently on? : ");
	choice = input.nextInt();
	car.CurrentGear(choice);
	
	System.out.println("Your current rate of speed is " + car.speed());
	System.out.println("The distance you traveled was " + car.distance());
	}
}