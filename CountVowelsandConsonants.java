
class CountVowelsandConsonants{
    public static void main(String[]arr){
          String str="Hello";
          int coutVowel=0;
          int coutCon=0;

          for(int i=0;i<str.length();i++){
            //vowels 
            if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')){
                coutVowel++;
            }
            //consonants
            else{
                coutCon++;
            }
          }

          System.out.println("vowels: "+coutVowel);
          System.out.println("consonants: "+coutCon);
    }
}