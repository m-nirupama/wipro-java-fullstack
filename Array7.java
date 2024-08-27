package myPack;
import java.util.Arrays;
public class Array7 {
	    public static void main(String[] args) {
	        int a[] = { 9, 10, 20, 10, 9, 66, 43, 59, 87, 76, 80, 100 };
	        int n = a.length;
	        int[] temp = new int[n];
	        int j = 0;
	        Arrays.sort(a);
	        for (int i = 0; i < n - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }

	        temp[j++] = a[n - 1];

	        // Changing the original array
	        for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }

	    }
	}

