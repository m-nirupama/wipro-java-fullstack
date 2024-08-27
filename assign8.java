package myPack1;
import java.util.*;
public class assign8 {
	 public static void main(String[] args) {
	        System.out.println("Enter the color code: ");
	        Scanner sc= new Scanner(System.in);
	        String str= sc.next();
	        char code = str.charAt(0);
	        switch (code) {
	            case 'y':System.out.println("Yellow");
	                break;
	            case 'g':System.out.println("Green");
	                break;
	            case 'b':System.out.println("Blue");
	                break;
	            case 'r':System.out.println("Red");
	                break;
	            case 'o':System.out.println("Orange");
	                break;
	            case 'w':System.out.println("White");
	                break;
	            default:System.out.println("Invalid code");
	                break;
	        }
	    }
	


}
