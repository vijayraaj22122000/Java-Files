import java.util.*;
class TrafficFine 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle type (2 for 2-wheeler or 4 for 4-wheeler)");
		int a = sc.nextInt();
		switch(a){
			case 2:
				System.out.println("Enter the speed");
			    int b=sc.nextInt();
				
				System.out.println("Enter the speed Limit");
			    int c=sc.nextInt();
				
				int d=b-c;
				
				if(d>=1 && d<=10){
					System.out.println("Fine:500/-");
				}else if(d>=10 && d<=20){
					System.out.println("Fine:1000/-");
				}else if(d>=20){
					System.out.println("Fine:2000/-");
				}else{
					System.out.println("No Fine, drive safety");
				}
				break;
				
			case 4:
				System.out.println("Enter the speed");
			    int e=sc.nextInt();
				
				System.out.println("Enter the speed Limit");
			    int f=sc.nextInt();
				
				int g=e-f;
				
				if(g>=1 && g<=10){
					System.out.println("Fine:1000/-");
				}else if(g>=10 && g<=20){
					System.out.println("Fine:2000/-");
				}else if(g>=20){
					System.out.println("Fine:3000/-");
				}else{
					System.out.println("No Fine, drive safety");
				}
				break;
		}
		
		
	}
}
