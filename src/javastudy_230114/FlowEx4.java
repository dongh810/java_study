package javastudy_230114;

import java.util.Scanner;

//입력받은 수의 각자리 합 구하기 while문 사용
public class FlowEx4 {
    public static void main(String args[]) {
        int num=0,sum=0;
        System.out.print("숫자를 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while(num !=0){
            sum = sum+num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
