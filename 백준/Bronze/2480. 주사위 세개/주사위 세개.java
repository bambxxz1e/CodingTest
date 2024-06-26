import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dice[] = new int[3];
        
        for(int i = 0; i < dice.length; i++){
            int a = sc.nextInt();
            dice[i] = a;
        }
        
        Arrays.sort(dice);
        
        int same = 1;
        int samedice = 0;
        for(int i = 0; i < dice.length - 1; i++){
            for(int j = i+1; j < dice.length; j++){
                if(dice[i] == dice[j]){
                    same++;
                    samedice = dice[i];
                }
            }
        }
        
        int money = 0;
        
        if(same == 1) System.out.print(dice[2]*100);
        else if(same == 2){
            money = samedice * 100;
            System.out.print(money + 1000);
        }
        else{
            money = samedice * 1000;
            System.out.print(money + 10000);
        }
    }
}