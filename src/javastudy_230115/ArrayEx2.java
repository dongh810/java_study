package javastudy_230115;

public class ArrayEx2 {
    public static void main(String args[]) {
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println("변경전");
        for(int i =0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
        int temp[] = new int[10];
        for(int i =0;i<arr.length;i++)
            temp[i] = arr[i];
        arr=temp;
        System.out.println("변경후");
        for(int i=0;i<temp.length;i++)
            System.out.printf("arr[%d]=%d%n",i,arr[i]);
    }
}
