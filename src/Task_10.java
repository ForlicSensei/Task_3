public class Task_10 {
    public static void main(String[] args) {
        System.out.println(rightTriangle(70, 130, 110));
    }
    public static boolean rightTriangle(double x,double y, double z){
        return pifagor(x,y,z) || pifagor(y,z,x) || pifagor(z,x,y);
    }
    public static boolean pifagor(double a, double b, double c){
        return Math.pow(c,2) == Math.pow(a,2)+ Math.pow(b,2);
    }
}
