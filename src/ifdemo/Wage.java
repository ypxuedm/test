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
		System.out.println("����˰ǰ����Ϊ"+income+"Ӧ��˰"+tax+"˰������Ϊ"+net);
	}

}
