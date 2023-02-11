package javastudy_230211;
//인터페이스의 이해
public class InterfaceTest {
    public static void main(String args[]){
        A a= new A();
        a.methodA(new B());
    }
}
class A{
    public void methodA(B b){
        b.methodB();
    }
}
class B{
    public void methodB(){
        System.out.println("methodB()");
    }
}
