import java.util.Scanner;

public class ControlStatementEX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int j = 0;
        System.out.println("숫자 10개 입력");
        for(int i = 0; i < num.length; i++){

            num[i] = sc.nextInt();
            if(j <= num[i]){
                j = num[i];
            }
        }
        System.out.println("입력된 수 중에 가장 큰 수는 " + j );
        sc.close();
    }
}
