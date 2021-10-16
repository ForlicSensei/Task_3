public class Task_9 {
    public static void main(String[] args) {
        System.out.println(nextPrime(11));
    }

    public static int nextPrime(int n) {
        int NewN=n;
        while (true) {
            NewN++;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    n++;
                    break;
                }
            }
            if(NewN!=n)
                break;
        }
        return n;
    }
}
