public class Palindrome {


    public static boolean isPalindrome(String s){

        String[] sletter = s.split("");
        int start = 0;
        int end = s.length()-1;

        while(start<=end){
            if( sletter[start].equals(sletter[end]) ){
                start++;
                end--;
            }else if( !sletter[start].equals(sletter[end]) ){
                return  false;
            }
        }
        return true;
    }


}
