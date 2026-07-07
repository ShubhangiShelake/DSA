
class CountFrequencyofEachCharacter{

    public static void main(String[]arr){
        String str="programming";

        for(int i=0;i<str.length();i++){
            int count=0;

             boolean Visits=false;

            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                     Visits=true;
                     break;
                }
            }

            if(Visits)
            continue;

            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            System.out.println(str.charAt(i)+"="+count);
        }
    }
}