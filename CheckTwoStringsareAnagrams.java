import java.util.Arrays;

class CheckTwoStringareAnagrams{
    public static void main(String[]arr){
        String str1="listen";
        String str2="silent";

        if((str1.length())!=(str2.length())){
            System.out.println("string length are not same");
        }

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("string are angarm");
        }else{
            System.out.println("string are not anagram");
        }

       
    }
}