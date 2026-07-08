
class FindMaximumOccurringCharacter{
    public static void main(String[]arg){

        String str="banana";
        int maxCount=0;
        char maxChar=' ';

        for(int i=0;i<str.length();i++){
            int count=0;
            boolean isVisit=false;
            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                   isVisit=true;
                   break;
                }
            }
            if(isVisit)
            continue;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
    
            if(count>maxCount){
                maxCount=count;
                maxChar=str.charAt(i);
            }

            System.out.println(maxCount);
           System.out.println(maxChar);


        }
    }
}