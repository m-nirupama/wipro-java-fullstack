package myPack1;

public class assign5 {
	public static void main(String[] args) {
        char check='$';
        if(check == '1' || check == '2' || check == '3' || check == '4' || check == '5' || check == '6' || check == '7' || check == '8' || check == '9' || check == '0' )
        {
            System.out.println("Digit");
        }else if(check == 'z' || check == 'y' || check == 'x' || check == 'w' || check == 'v' || check == 'u' || check == 't' || check == 's' || check == 'r' || check == 'q' || check == 'p' || check == 'o' || check == 'n' || check == 'm' || check == 'l' || check == 'k' || check == 'j' || check == 'i' || check == 'h' || check == 'g'  || check == 'f' || check == 'e' || check == 'd' || check == 'c' || check == 'b' || check == 'a'){
            System.out.println("Alphabet");
        }else{
            System.out.println("Special Character");
        }
    }


}
