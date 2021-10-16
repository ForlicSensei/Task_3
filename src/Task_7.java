public class Task_7 {
    public static void main(String[] args) {
        System.out.println(isKaprekar(297));
    }
    public static boolean isKaprekar(int number){
        if(number==1 || number==0)
            return true;
        StringBuilder sl = new StringBuilder();
        StringBuilder sr = new StringBuilder();
        String s1=String.valueOf(number*number);
        for(int a=number*number,count = 0 ; a>0; a/=10) {
            if((s1.length() % 2 == 0 && count < s1.length()/2) || (s1.length() % 2 !=0 && count <= s1.length()/2)){
                sr.insert(0,a%10);
                count++;
            }else{
                sl.insert(0,a%10);
                count++;
            }
        }
        return Integer.valueOf(sl.toString())+Integer.valueOf(sr.toString())==number;
    }
}
