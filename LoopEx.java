package day7;

public class LoopEx {

	public static void main(String[] args) {
		// Task1
		int sum=0;
		int num=20;
		
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
		
		
	}
}


