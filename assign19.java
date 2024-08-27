package myPack1;

public class assign19 {
	    public static void main(String[] args) {
	        int count = 0;
	        int num = 2;
	        while (count != 5) {
	            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
	                count++;
	                System.out.println(num);
	            }
	            num++;
	        }
	    }
	}

