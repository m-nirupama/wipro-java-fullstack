package myPack1;

public class assign13 {
	    public static void main(String[] args) {
	        boolean flag;
	        for (int i = 0; i <=99; i++) {
	            flag = false;
	            for(int j=2;j<i/2;j++){
	                if(i%j==0){
	                    flag= false;
	                    break;
	                }
	                flag=true;
	            }
	            if(flag==true){
	                System.out.println(i);
	            }
	        }
	    }
	}
