package ifdemo;

public class Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income=3000;
		double tax;
		if(income>=3000){
			
			tax=income*0.05;
			
		}
		else {
			
			tax=income*0.01;
			
		}
		
		double net =income-tax;
		System.out.println("您的税前收入为"+income+"应上税"+tax+"税后收入为"+net);
	}

}
