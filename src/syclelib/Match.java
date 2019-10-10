package syclelib;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lun=34;
		int times=9;
		outter:for(int i=1;i<+lun;i++){
			System.out.println(i);
		inner:for(int j=1;j<=times;j++){
			System.out.println(i+"+"+j);
			break outter;
		}
			System.out.println("-"+i);
		}
	}

}
