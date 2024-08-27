package myPack1;

public class assign7 {
	public static void main(String[] args) {
        char check= 'z';
        int res;
        if(check>=65 && check<=90){
            res = check + 32;
            System.out.println((char)res);
        }else if(check>=97 && check<=122){
            res = check - 32;
            System.out.println((char)res);
        }
    }


}
