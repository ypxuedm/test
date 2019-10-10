package ifdemo;

public class Comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sales;
		double bonus;
		sales= 6000;
		if(sales<=3000){
			
			bonus=sales*0;
				
		}
		
		else if(sales<=4000){
			
			bonus=0.01*sales; 
			
		}
		else if(sales<=5000){
			
			bonus=0.02*sales;
			
		}
		else{
			
			bonus=sales*0.04;
			
		}
		
			System.out.println("您的销售额为"+sales+"您的提成为"+bonus);
		
	}

}
