package javastudy_230116;
//배열을 사용하여 총점과 평균구하기
public class ArrayEx3 {
    public static void main(String args[]) {
        int sum=0;
        float avg = 0;

        int score[] = {100,100,88,100,90};

        for(int i=0;i<score.length;i++){
            sum = sum+score[i];
        }
        avg=sum/(float)score.length; //float로 계산결과를 얻기위해 형변환 해줘야함
        System.out.println("총점:"+sum);
        System.out.println("평균:"+avg);

    }
}
