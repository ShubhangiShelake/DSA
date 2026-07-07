
class CheckPalindrome{
    public static void main(String[]arr){
        //String str="Hello";
        String str="madam";
        String result="";

        for(int i=str.length()-1;i>=0;i--){
            result=result+str.charAt(i);
        }

        if(result.equals(str)){
            System.out.println("It is palindrome string");
        }else{
            System.out.println("It is not palindrome string");
        }
    }
}