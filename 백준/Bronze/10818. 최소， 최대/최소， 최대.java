import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        
        Arrays.sort(arr);
        
        System.out.print(arr[0] + " " + arr[length-1]);
    }
}