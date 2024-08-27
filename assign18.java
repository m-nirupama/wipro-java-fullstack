package myPack1;

public class assign18 {
        public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Please enter a number");
        }else{
            int num=Integer.parseInt(args[0]);
            int temp=num;
            int rem=0;
            int res=0;
            while(temp>0){
                rem=temp%10;
                res= res*10+rem;
                temp/=10;
            }

            if(res==num){
                System.out.println(num+" is a palindrome");
            }else{
                System.out.println(num+" is not a palindrome");
            }
        }
    }
}


