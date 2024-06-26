import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int totalprice = sc.nextInt();
        int total = sc.nextInt();
        int product[][] = new int[total][2];
        int productprice = 0;
        
        for(int i = 0; i < total; i++){
            for(int j = 0; j < 2; j++){
                int a = sc.nextInt();
                product[i][j] = a;
            }
            productprice += product[i][0]*product[i][1];
        }
        
        if(totalprice == productprice) System.out.print("Yes");
        else System.out.print("No");
    }
}