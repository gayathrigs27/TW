import java.util.Scanner;

public class TriangleEx {
    public static void main(String args[]){
        char c='y';
        int op,n;
        Scanner in=new Scanner(System.in);
        while(c=='y'||c=='Y')
        {

            System.out.println("Enter an option:");
            System.out.println("1.one asterisk ");
            System.out.println("2.horizontal line");
            System.out.println("3.vertical line");
            System.out.println("4.right triangle");
            op=in.nextInt();

            switch (op){
                case 1:System.out.println("*");
                break;
                case 2:System.out.println("Enter a number");
                    n=in.nextInt();
                    for(int i=1;i<=n;i++)
                    System.out.print("*");
                    System.out.println("");
                break;
                case 3:System.out.println("Enter a number");
                    n=in.nextInt();
                    for(int i=1;i<=n;i++)
                    System.out.println("*");
                break;
                case 4:System.out.println("Enter a number");
                    n=in.nextInt();
                    for(int i=1;i<=n;i++) {
                    for (int j = i; j > 0; j--)
                        System.out.print("*");
                    System.out.println("");
                }
                break;
                default:break;
            }
            n=0;
            System.out.println("Do you want to try again:");
            c=in.next().charAt(0);
        }
    }
}
