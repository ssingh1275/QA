package learning;

public class Toyota extends Car{
	public String toyotagps;
	public String toyotabak;
	public String toyotasafteypackage;
	
	public void about(){
		System.out.println("This is Toyota Car");
	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		
	}
	
	public Toyota(int num){
		carnumseats = num;
	}
	
	public Toyota(){
		carnumseats = 4;
	}
}