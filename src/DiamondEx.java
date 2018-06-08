import java.util.Scanner;

public class DiamondEx {
    static void isosceles(int num){
        int k;
        for(int i=1;i<num;i++)
        {
            for(int j=1;j<=num-i;j++)
                System.out.print(" ");
            k=0;
            while(k!=2*i-1)
            {
                System.out.print("*");
                k++;
            }
            System.out.println("");
        }
    }

    static void center(int num){
        for(int i=1;i<2*num;i++)
            System.out.print("*");
        System.out.println("");
    }


    static void downtri(int num)
    {
        int k;
        for(int i=num-1;i>=1;i--)
        {
            for(int j=1;j<=num-i;j++)
                System.out.print(" ");
            k=0;
            while(k!=2*i-1)
            {
                System.out.print("*");
                k++;
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
        char c='y';
        int op,n;
        Scanner in=new Scanner(System.in);
        while(c=='y'||c=='Y')
        {
            System.out.println("Enter an option:");
            System.out.println("1.Isosceles Triangle ");
            System.out.println("2.Diamond");
            System.out.println("3.Diamond with Name");
            op=in.nextInt();
            System.out.println("Enter a number");
            n=in.nextInt();
            switch (op){
                case 1:isosceles(n);
                    center(n);
                    break;
                case 2:isosceles(n);
                    center(n);
                    downtri(n);
                    break;
                case 3:isosceles(n);
                    System.out.println("Gayathri");
                    downtri(n);
                  break;
                default:break;
            }
            n=0;
            System.out.println("Do you want to try again:");
            c=in.next().charAt(0);
        }
    }
}
