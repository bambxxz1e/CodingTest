import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        
        int num[][] = new int[time][2];
        
        for(int i = 0; i < time; i++){
            for(int j = 0; j < 2; j++){
                int a = sc.nextInt();
                num[i][j] = a;
            }
            System.out.println(num[i][0] + num[i][1]);
        }
    }
}