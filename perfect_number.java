import java.util.*;
class perfect_num{
    public void number(int n){
        int sum=0;
for (int i = 1; i < n; i++) {
    if(n%i==0){
sum=sum+i;
    }
}
if(sum==n){
System.out.println("It is a Perfect Number");
}
else{
    System.out.println("It is not a Perfect Number");
}
    }
}
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
    int n=sc.nextInt();
    perfect_num p=new perfect_num();
    p.number(n);
    }
}
