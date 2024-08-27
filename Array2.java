package myPack;

public class Array2{
	    public static void main(String[] args) {
	        int[] arr={1,3,5,2,4,12,16,100, 0, 9};
	        int min= Integer.MAX_VALUE;
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<arr.length;i++) {
	            if(arr[i]>max){
	                max=arr[i];
	            }
	            if(arr[i]<min){
	                min=arr[i];
	            }
	        }
	        System.out.println("Maximum is "+max+" & Minimum is "+min);
	    }
	}

