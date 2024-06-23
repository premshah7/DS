import java.util.*;

public class InsertElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int num = sc.nextInt();
        int pos = sc.nextInt();

        int[] newArray = new int[n+1];

        for(int i=0; i<pos; i++){
            newArray[i] = arr[i];
        }
        newArray[pos] = num;
        for(int i=pos; i<n; i++){
            newArray[i+1] = arr[i];
        }

        for(int i=0; i<n+1; i++){
            System.out.println(newArray[i]);
        }
        
    }
}