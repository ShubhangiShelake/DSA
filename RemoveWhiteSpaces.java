import java.util.Arrays;

class RemoveWhiteSpaces{
    public static void main(String[]arg){
        String str=" Hello World ";
        String result="";

        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
               result=result+ch[i];
            }
        }

        System.out.print(result);

    }
}