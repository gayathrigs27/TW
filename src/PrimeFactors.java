import java.util.Scanner;

public class PrimeFactors {
    static void generate(int n){
        int i=2;
        while(n>1){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            i++;
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=in.nextInt();
        generate(num);
    }
}
