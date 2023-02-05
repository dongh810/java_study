package javastudy_230205;
//instanceof연산자
public class InstanceofTest {
    public static void main(String args[]){
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }
        if(fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }
        if(fe instanceof Object) {
            System.out.println("This is a Object instance");
        }
        System.out.println(fe.getClass().getName());
    }
}
class Car {}
class FireEngine extends Car {}
//instanceof연산에도 true결과를 받는다는것은 검사한 타입으로 형변환을 해도 아무런 문제가 없다는것.
