package week1.day1;

public class FibinoicSearies {
	
	// Fibinoic series will be 0,1,1,2,3,5,8 i.e. adding previous values gives 3rd value
	
	public void learnFS() {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.print(num1 +",");
		System.out.print(num2 +",");
		for(int i=1; i <=5; i++) {
			
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 +",");
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FibinoicSearies obj = new FibinoicSearies();
		obj.learnFS();
		

	}

}
