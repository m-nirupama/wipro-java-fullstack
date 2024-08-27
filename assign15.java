package myPack1;

public class assign15 {
	 public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please enter a number");
	        } else {
	            String str = args[0];
	            int sum = 0;
	            for (int i = 0; i < str.length(); i++) {
	                sum += Integer.parseInt( String.valueOf(str.charAt(i)));
	            }
	            System.out.println(sum);
	        }
	    }

}
