package testCodes;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
        // my value
		int x=0;
		// my counter
		while (x<=100) {
			System.out.println(x);
			x=x+2; }
		
	    int a=100;
	    
	    while (a>=0) {
	    	System.out.println(a);
	    	a=a-3;
	    }
		// setting my range, counter
	    for (int i = 0; i<=100; i=i+2) {
	    	System.out.println(i);
	    }
	    for (int p = 0; p <= 100; p++) 
	    	if (p%3 == 0) {
	    	System.out.println("Hello");	
	    	}
	    	else if (p%5 == 0) {
	    	System.out.println("World");
	    	}
	    	else if ((p%3 & 5) == 0) {
	    	System.out.println("HelloWorld");
	    	}
	    	else {
	    	System.out.println(p);
	    		
	    		
	    	}
	    
	    
		}

}
