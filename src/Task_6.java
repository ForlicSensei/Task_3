public class Task_6 {
    public static void main(String[] args) {
        int[] num={1,3,2,1};
        int[] num2={1,3,2,1};
        System.out.println(same(num,num2));
    }
    public static boolean same(int[] number1,int[] number2){
        int sum=0,sum1=0;
        int ul=0,ul1=0;
        for (int i=0;i<number1.length;i++){
            ul++;
            System.out.println(ul);
            System.out.println("Ul = "+ ul);
            for (int j=i+1;j<number1.length;j++){
                if (number1[i]==number1[j]){
                    sum++;
                    System.out.println("Sum = "+sum);
                    break;
                }
            }
        }
        for (int i=0;i<number2.length;i++){
            ul1++;
            System.out.println(ul1);
            System.out.println("Ul = "+ ul1);
            for (int j=i+1;j<number2.length;j++){
                if (number2[i]==number2[j]){
                    sum1++;
                    System.out.println("Sum = "+sum1);
                    break;
                }
            }
        }

        return (ul-sum)==(ul1-sum1);
    }
}
