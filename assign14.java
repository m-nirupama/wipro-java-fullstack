package myPack1;

public class assign14 {
	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please enter an integer");
	        } else {
	            int num = Integer.parseInt(args[0]);
	            if (num <= 1) {
	                System.out.println(num + " is neither prime nor composite");
	            } else {
	                boolean flag = false;
	                for (int i = 2; i <= num / 2; i++) {
	                    if (num % i == 0) {
	                        flag = false;
	                        System.out.println(num + " is not a prime number");
	                        break;
	                    }
	                    flag = true;
	                }
	                if (flag == true) {
	                    System.out.println(num + " is a prime number");
	                }
	            }
	        }

	    }
	}
