package myPack1;

public class assign17 {
	    public static void main(String[] args) {
	        if(args.length<1){
	            System.out.println("Please enter a number");
	        }else{
	            String num=args[0];
	            for(int i= num.length()-1;i>=0;i--){
	                System.out.print(num.charAt(i));
	            }
	        }
	    }
	}
