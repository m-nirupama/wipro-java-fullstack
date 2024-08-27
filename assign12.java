package myPack1;

public class assign12 {
	public static void main(String[] args) {
        int num=11;
        boolean flag=false;
        if(num==2){
            System.out.println("Prime number");
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=false;
                System.out.println("Not a prime number");
                break;
            }
            flag=true;
        }
        if(flag==true){
            System.out.println("Prime number");
        }
    }


}
