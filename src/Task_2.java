public class Task_2 {
    public static void main(String[] args) {
        System.out.println(zip("all zip files are zipped"));
    }

    public static int zip(String s) {
        s = s.toLowerCase();
        int i = s.indexOf("zip");
        int count = 0;
        while (i >= 0) {
            count++;
            i = s.indexOf("zip", i + 1);
            if(count==2)
                return s.indexOf("zip",2);
        }
        return -1;
    }
}
