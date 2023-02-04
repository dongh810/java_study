package javastudy_230203;
//참조변수의 형변환
class Car{
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }
    void stop() {
        System.out.println("stop!!!!~~");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("water!!!!~~~~");
    }
}
public class CastingTest {
    public static void main(String args[]){
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe;에서 형변환이 생략된 형태이다.
        //car.water(); // Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine)car; // 자손타입 <- 조상타입
        fe2.water();
    }
}
