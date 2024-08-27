package myPack;

public class Array3 {
	    public static void main(String[] args) {
	        int[] array = { 11, 9, 26, 55, 43, 34, 88, 42, 77, 30 };
	        int search = 55;
	        int status = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == search) {
	                status=0;
	                System.out.println(i);
	                break;
	            }
	            status = -1;
	        }
	        if(status==-1){
	            System.out.println(status);
	        }
	    }
	}
