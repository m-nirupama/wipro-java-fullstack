package myPack;
import java.util.Arrays;
public class Array5 {
	    public static void main(String[] args) {
	        int arr[] = { 661, 653, 10, 890, 500, 449, 652, 666, 1009, 995 };
	        Arrays.sort(arr);
	        System.out.println("2 minimums are: " + arr[0] + " & " + arr[1]);
	        System.out.println("2 maximums are: " + arr[arr.length - 1] + " & " + arr[arr.length - 2]);

	    }
	}
