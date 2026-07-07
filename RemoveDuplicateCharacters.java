
class RemoveDuplicateCharacters{
    public static void main(String[]arr){
        String str="programming";
        String result="";

        for(int i=0;i<str.length();i++){
            boolean isDuplicate=false;

            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
}