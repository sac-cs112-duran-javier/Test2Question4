
public class AutoProgram{
	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int gears;
	private int cycles;
	private int currentGear;
	private int counter;
	private int totalDistance;
	private int currentCycle;
	
	public void CarYear(int Y){
		year = Y;
	}
	public void CarMake(String M){
		make = M;
	}
	public void CarModel(String MODEL){
		model = MODEL;
	}
	public void CarGears(int G){
		gears = G;
	}
	public void SetColor(String C)
	{
		color = C;
	}
	public void SetName(String N)
	{
		name = N;
	}
	public void CarCycles(int C){
		cycles = C;
	}
	public void CurrentGear(int x){
		currentGear=x;
	}
	public int speed(){
		return currentGear*10;
	}
	public int distance(){
		counter = cycles;
		while (counter !=0){
			currentCycle = (currentGear*10)/60;
			totalDistance = totalDistance + currentCycle;
			counter--;
		}
		return totalDistance;
	}
}