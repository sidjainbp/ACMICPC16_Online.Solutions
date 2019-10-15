import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int T;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        int n;
        for(int i=0; i<T; i++){
            n = sc.nextInt();
            int[] a = new int[n];
            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }

            if (check_beauty(a)) {System.out.println("no");} else {
                System.out.println("yes");
            }
        }
    }

    private static boolean check_beauty(int[] a) {
        int flag = 0;
        boolean value = false;

        for(int i=0; i<a.length; i++){
            if(a[i] != 0 && a[i] != 1 && a[i] != -1){                   //checking if there are more than 2 numbers
                flag++;                                                 //not equal to 0, 1, -1 (returning true if found)
                if(flag > 1){
                    value = true;
                }
            }
        }

        int clock = 0;

        if(flag == 0){
            for(int i=0; i<a.length; i++){
                if(a[i] == -1){
                    for(int j=i+1; j<a.length; j++){
                        if(a[j] == -1){
                            for(int k = 0; k<a.length; k++) {
                                if(a[k] == 1){
                                    value = false;
                                    clock = 2;
                                    break;
                                }else{value = true;}
                            }
                        }
                        if(clock == 2){break;}
                    }
                }
            }
        }

        if(flag == 1){
            for(int i=0; i<a.length; i++){
                if(a[i] == -1){
                    value = true;
                    break;
                }
            }
        }

        return value;
    }
}
