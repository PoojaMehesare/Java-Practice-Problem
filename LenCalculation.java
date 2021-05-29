package EmpWageUC1;

public class LenCalculation {
        public static void main(String args[]) {
        	int x1=4,y1=5,x2=5,y2=4;
        	double lengthoftheline = (Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2));
        	lengthoftheline=Math.sqrt(lengthoftheline);
        	System.out.println("length of the line:" +lengthoftheline);
	 
}
}
 