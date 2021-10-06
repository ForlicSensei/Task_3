package TaskS;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
    }

    public static int findZip(String s) {
        int first = s.toLowerCase().indexOf("zip");
        if (s.toLowerCase().indexOf("zip",first+1) !=0){
            return s.toLowerCase().indexOf("zip",first+1);
        }else return-1;
    }
}
