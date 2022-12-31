import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers:");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int swa;
        swa=num_1;
        num_1=num_2;
        num_2=swa;
        System.out.println(num_1+","+num_2);
    }
}
