public class Task_8 {
    public static void main(String[] args) {
        System.out.println(longestZero("101"));
    }
    public static String longestZero(String s){
        StringBuffer s1=new StringBuffer();
        for(int i=0,countN=0,countM=-1;i<s.length();i++){
            if (s.charAt(i)=='0'){
                countN++;
                if(countM<countN) {
                    countM = countN;
                    s1.insert(0, "0");
                }
            }else countN=0;
        }
        return s1.toString();
    }
}
