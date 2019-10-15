import java.util.*;

public class HelpLostRobot {
    public static void main(String[] args) throws java.lang.Exception{
        int T, x1, y1, x2, y2;

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        int[][] coordinates = new int[T][4];

        for(int i=0; i<T; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            coordinates[i][0] = x1;
            coordinates[i][1] = y1;
            coordinates[i][2] = x2;
            coordinates[i][3] = y2;
        }

        sc.close();

        for(int i=0; i<T; i++){
            //System.out.println(coordinates[i][0] + " " + coordinates[i][1] + " " + coordinates[i][2] + " " + coordinates[i][3]);
            if((coordinates[i][1] == coordinates[i][3]) && coordinates[i][0] < coordinates[i][2]){
                System.out.println("right");
            }else if((coordinates[i][1] == coordinates[i][3]) && coordinates[i][0] > coordinates[i][2]){
                System.out.println("left");
            }else if((coordinates[i][0] == coordinates[i][2]) && coordinates[i][1] < coordinates[i][3]){
                System.out.println("up");
            }else if((coordinates[i][0] == coordinates[i][2]) && coordinates[i][1] > coordinates[i][3]){
                System.out.println("down");
            }else{
                System.out.println("sad");
            }
        }
    }
}
