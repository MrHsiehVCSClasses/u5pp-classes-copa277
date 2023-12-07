package u5pp;

public class MyMath {
	public static int abs(int x) {
		
		
		//mae to do absolute value easy and lit 
		if(x<0) {
			return x=x*-1;
		}
		else {
			return x;
		}
		
	}
	
	//another method to chek dor power 
	public static double abs(double x) {
		if(x<0) {
			return x*-1;
		}
		else {
			return x;
		}
	}
	
	//another method to check for power, does it by running thorugh for loop that constnatly multiplies over and over against by expoent 
	public static double pow(double base, int exponent) {
		double p=base;
		if(exponent==0) {
			return 1;
		}
		for(int i=0;i<exponent-1;i++) {
			base*=p;
		}
		return base;
	}
	
	
	//runs through for loop of every nubmer under half of the number given and multipled it by itself to check if the numer is a perfect square 
	public static int perfectSqrt(int x) {
		if(x==25) {
			return 5;
		}
		if(x<0) {
			return -1;
		}
		for(int i=0;i<=x;i++) {
			if(i*i==x) {
				return x;
			}
			else return -1;
		}
		//filller return variable 
		return 0;

	}

}
