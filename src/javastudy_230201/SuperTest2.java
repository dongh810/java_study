package javastudy_230201;
//super개념
class Parent1 {
    int x=10;
}
class Child1 extends Parent1 {
    int x=20;
    void method() {
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}
public class SuperTest2 {
    public static void main(String args[]){
        Child1 c =new Child1();
        c.method();
    }
}

//x=20
//this.x=20
//super.x=10 super는 상속받은 멤버를 참조하는데 사용되므로 Parent1의 값인 10 출력