
import java.util.*;

public class InsertElementSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        int[] newArray = new int[n+1];
        int pos;
        int j=0;
        while(j<n && arr[j]<num){
            newArray[j] = arr[j];
            j++;
        }
        // for(int i=0;i<n; i++){
        //     System.out.print(newArray[i]+" ");
        // }
        pos=j;
        // System.out.println(pos);
        // for(int i= 0; i<pos; i++){
        //     a
        // }
        newArray[pos] = num;

        for(int i = pos+1; i<n+1; i++){
            newArray[i] = arr[i-1];
        }

        for(int i=0; i<n+1; i++){
            System.out.print(newArray[i]+" ");
        }
    }

}
