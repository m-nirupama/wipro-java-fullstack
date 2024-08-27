package myPack;

public class Array8 {
        public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 80, 90, 100, 7, 4, 5 };
        int sum = 0;
        int six = 0;
        int seven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                six = i;
            } else if (arr[i] == 7) {
                seven = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(seven>six){
                if(i<six || i>seven){
                    sum+=arr[i];
                }else{
                    continue;
                }
            }else{
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
