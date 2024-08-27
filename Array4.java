package myPack;

public class Array4 {
	    public static void main(String[] args) {
	        int[] ascii = new int[128 - 33];
	        for (int i = 33; i <= 126; i++) {
	            ascii[i - 33] = i;
	        }
	        for (int i = 0; i < ascii.length; i++) {
	            System.out.println(ascii[i] + " - " + (char) ascii[i]);
	        }
	    }
	}

