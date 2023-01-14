package javastudy_230114;
//삼각형 모양의 별 만들기
public class FlowEx3 {
    public static void main(String args[]){
        for(int i=0;i<6;i++){
            for (int j = 1; j < 6-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
