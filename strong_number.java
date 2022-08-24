import java.util.*;
public class strong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while (n!=0) {
            int rem=n%10;
            rev=rev+fact(rem);
            n=n/10;
        }
        if(temp==rev){
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("It is not a Strong Number");
        }
    }

    private static int fact(int rem) {
        int f=1;
        for (int i = 1; i <= rem; i++) {
            f=f*i;
            }
        return f;
    }
}
