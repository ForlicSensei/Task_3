package TaskS;

public class Main {

    public static void main(String[] args) {
        int x=28,a;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                a = i;
                System.out.print(a + " ");
            }
        }
    }
}
