package triangleSquare;

class TriangleSquare {

	double multValue1, multValue2, resulte;

	class Point {
		double x;
		double y;
	}

	double multyAngleSquare(int[] x, int[] y) {
		for(int i; i<=2; i++;) {
			System.out.println("i:" + i);
			if(i<2) {
				multValue1 = + ( x[i] * y[i+1] );
				multValue2 = + ( y[i] * x[i+1] );
			} else {
				multValue1 = + ( x[i] * y[1] );	
				multValue2 = + ( y[i] * x[1] );	
			}		
		}
		resulte = multValue1 - multValue2;	
		return resulte;

	}
	

	public static void main(String[] args) {
		
		System.out.println("Square of MultyAngle figure" +  
			"with coordinates of points, which you have inputed is: " +
			multyAngleSquare(int[] x, int[] y) );
	}
}