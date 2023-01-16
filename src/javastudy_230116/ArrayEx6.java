package javastudy_230116;
//다차원 배열 활용
public class ArrayEx6 {
    public static void main(String args[]) {
        int score[][] = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum = sum + score[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}
