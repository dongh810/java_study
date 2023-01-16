package javastudy_230116;
//커맨드 라인을 톻해 입력받기
public class ArrayEx5 {
    public static void main(String args[]){
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"] = \""+args[i]+"\"");
        }
    }
}
