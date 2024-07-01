package IDEALABS;

public class SwapoftwoNumbers {

	
	    public static void main(String[] args) {
	        int a = 5;
	        int b = 10;

	        System.out.println("befor swapping: "+a+","+b);

	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("afterswapping: "+a+","+b);
	    }
	}

