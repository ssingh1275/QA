package learning;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World...");
		Car car;
		//car.about();
		
		Toyota toy1= new Toyota(5);
		toy1.carcolor = "Green";
		//toy1.about();
		
		Toyota toy2= new Toyota();
		toy2.carcolor = "Red";
	//	toy2.about();
		
		toy1.about();
		car = toy1;
		//toy1 = car;
		
		Honda hon= new Honda();
		car = hon;
	
		
	}

	public void printMessage(){
		System.out.println("Driver is called");
	}
	public void printMessage(int num){
		System.out.println("Driver is called");
	}

	public void printMessage(String cartype){
		System.out.println("Toyota Driver is called");
	}
	
}
