import java.util.Scanner;

public class HCF_rec {
    public static int hcf(int num1,int num2) {
        if(num1==num2){
            return num1;
        }
        
        if(num1>num2){
        return (hcf(num1-num2, num2));
        }
        else{
            return (hcf(num1, num2-num1));
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(hcf(num1,num2)); 
    }
    
}
