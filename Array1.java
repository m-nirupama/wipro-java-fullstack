package myPack;

public class Array1 {
	    public static void main(String[] args) {
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	        int sum = 0;
	        float average = 0f;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        average = (float) sum / arr.length;
	        System.out.println("sum is " + sum + " & average is " + average);
	    }
	}
