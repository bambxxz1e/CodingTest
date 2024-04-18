import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a;
        int b;
        
        if(x > 0) a=1;
        else a=0;
        
        if(y > 0) b=1;
        else b=0;
        
        if(a==1 & b==1) System.out.println("1");
        else if(a==1 & b==0)System.out.println("4");
        else if(a==0 & b==0)System.out.println("3");
        else if(a==0 & b==1)System.out.println("2");
    }
}