package myPack;

public class Array9 {
	    public static void main(String[] args) {
	        if (args.length < 4) {
	            System.out.println("Please enter 4 integer numbers");
	        } else {
	            int arr[][] = new int[2][2];
	            arr[0][0] = Integer.parseInt(args[0]);
	            arr[0][1] = Integer.parseInt(args[1]);
	            arr[1][0] = Integer.parseInt(args[2]);
	            arr[1][1] = Integer.parseInt(args[3]);
	            System.out.println("The given array is :");
	            for (int i = 0; i < arr.length; i++) {
	                for (int j = 0; j < arr[0].length; j++) {
	                    System.out.print(arr[i][j] + " ");
	                }
	                System.out.print("\n");
	            }
	            System.out.println("The reverse of array is :");
	            for (int i = arr.length - 1; i >= 0; i--) {
	                for (int j = arr[0].length - 1; j >= 0; j--) {
	                    System.out.print(arr[i][j] + " ");
	                }
	                System.out.print("\n");
	            }
	        }
	    }
	}


