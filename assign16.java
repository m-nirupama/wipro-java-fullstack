package myPack1;

public class assign16 {
	    public static void main(String[] args) {
	        if (args.length < 1) {
	            System.out.println("Please enter an integer number");
	        } else {
	            int num = Integer.parseInt(args[0]);
	            for (int i = 1; i <= num; i++) {
	                int j = i;
	                while (j > 0) {
	                    System.out.print("* ");
	                    j--;
	                }
	                System.out.println("\n");
	            }
	        }
	    }
	}

