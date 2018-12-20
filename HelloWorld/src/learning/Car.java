package learning;

abstract public  class Car {

	public int carnumwheels;
	public String carcolor;
	public int carnumseats;
	public String carentertaintmentsystem;
	
	public void printMessage(int num){
		System.out.println("Driver is called");
	}
	
	public void printSeats(){
		System.out.println("Seats Num: "+carnumseats);
	}
	public void about(){
		System.out.println("This is Car");
	}
	
	public abstract void model();
}