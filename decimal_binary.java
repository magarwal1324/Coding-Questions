import java.util.*;
public class decimal_binary {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Decimal Number: "); 
       int n=sc.nextInt();
       int bin[]=new int[20];
       int i=0;
       while (n>0) {
        int rem=n%2;
        bin[i++]=rem;
        n=n/2;
       }
       System.out.print("Binary Number: ");
       for (int j = i-1;j>=0; j--) {
        System.out.print(bin[j]);
       }
       
    }
}
