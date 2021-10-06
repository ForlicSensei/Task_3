package TaskS;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));
    }
    public static boolean isValidHexCode(String s){
        return  s.startsWith("#") && s.matches("[\\d#ABCDF]+?");
    }
}
