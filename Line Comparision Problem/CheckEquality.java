package EmpWageUC1;

public class CheckEquality {
    public double Lenoftheline(int x1, int y1, int x2, int y2) {
    	double lenoftheline = (Math.pow(x2-x1, 2) + Math.pow(y2-y1,  2));
    	lenoftheline=Math.sqrt(lenoftheline);
    	return lenoftheline;
    
    }

    public static void main(String args[]) {
    	CheckEquality A = new CheckEquality();
    	double lineFirst = A.lenoftheline(4,5,4,5);
    	double lineSecond = A.lenoftheline(4,3,3,5);
    	lineFirst = Math.floor(lineFirst);
    	lineSecond = Math.floor(lineSecond);
    			
    	if(lineFirst == lineSecond )
    		System.out.println(lineFirst + "equal to " + lineFirst);
    	else
    		System.out.println(lineFirst + "equal to " + lineFirst);
    }
}