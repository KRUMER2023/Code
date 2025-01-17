import java.util.Scanner;

class UserInput
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st no.  :");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd no.  :");
        int n2= sc.nextInt();
        sc.close();
    System.out.print("Multiplication : "+ (n1*n2));
    }
}