package EmpWageUC1;

public class CompareLine {
	public int EndPoint(int x1,int y1, int x2, int y2) {
		   return(x2+y2);
	}
	public void CompareLine(int endPointOne, int endPointTwo) {
		   if(endPointOne == endPointTwo)
			   System.out.println(" endPointOne is equal to endPointTwo");
		   else if(endPointTwo < endPointTwo)
			   System.out.println("endPointOne is less than endPointTwo");
		   else
			   System.out.println("endPointOne is greater than endPointTwo");
			           
	}
	public static void main(String args[]) {
		int LineOne=0;
		int LineTwo=0;
		CompareLine A = new CompareLine();
	    LineOne = A .EndPoint(4,5, 4, 5);
	    LineTwo = A .EndPoint(4,3, 3, 5);
	    
	    A.CompareLine(LineOne,LineTwo);
	}
	
}
