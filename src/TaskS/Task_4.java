package TaskS;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println(flipEndChars("Cat, dog, and mouse."));
    }
    public static String flipEndChars(String s){
        if(s.length()<2) {
            System.out.println("Incompatible");
            return null;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            System.out.println("Two's a pair.");
            return null;
        }
        char[] chars=s.toCharArray();
        char RepCHAR=s.charAt(0);
        char end=s.charAt(s.length()-1);
        chars[0]=end;
        chars[s.length()-1]=RepCHAR;
        s = new String(chars);
        return s;
    }
}
