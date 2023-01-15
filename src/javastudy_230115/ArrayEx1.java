package javastudy_230115;
//배열의 생성과 선언, 출력
public class ArrayEx1 {
    public static void main(String args[]) {
        int [] score = new int[] {10,20,30,40,50};
        int k = 1;

//        score[0]=50;
//        score[1]=60;
//        score[2]=70;
         int tmp = score[k+2] + score[4];

         for(int i=0;i<5;i++){
             System.out.printf("score[%d] = %d",i,score[i]);
         }
         System.out.printf("tmp=%d",tmp);

    }
}
