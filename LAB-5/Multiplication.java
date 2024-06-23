
import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][2];
        int[][] arr2 = new int[2][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] mul = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<2; k++){
                    mul[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
