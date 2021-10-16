

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(solutions(1,0,1));
    }
    public static int solutions(double a,double b,double c){
        double v = Math.pow(b, 2) - 4 * a * c;
        if (v ==0)
            return 1;
        if (v <0)
            return 0;
        if (v >0)
            return 2;
        return 0;
    }
}
