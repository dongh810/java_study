package javastudy_230116;
//String배열 활용
public class ArrayEx4 {
    public static void main(String args[]){
        String name[] = {"Kim","Baek","Park"};
        for(int i=0;i< name.length;i++){
            System.out.println("names["+i+"]:"+name[i]);
        }
        String tmp = name[2];
        System.out.println("tmp:"+tmp);
        name[0]="Jo";
        for(int i=0;i< name.length;i++){
            System.out.println(name[i]);
        }
    }
}
