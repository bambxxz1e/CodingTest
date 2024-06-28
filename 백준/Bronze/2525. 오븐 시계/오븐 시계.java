import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int end = sc.nextInt();
        int total = (end + m);
        
        h += total / 60;
        if(h >= 24) h -= 24;
        
        if(total % 60 != 0){
            if(total > 60) m = total % 60;
            else m = total;
        }
        else m = 0;
        
        System.out.print(h + " " + m);
    }
}