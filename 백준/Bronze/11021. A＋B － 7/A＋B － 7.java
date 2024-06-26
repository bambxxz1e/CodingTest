import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int num[][] = new int[length][2];

        for(int i = 0; i < length; i++){
            for(int j = 0; j < 2; j++){
                int a = sc.nextInt();
                num[i][j] = a;
            }
            System.out.printf("Case #%d: %d\n", i + 1, num[i][0] + num[i][1]);
        }
    }
}