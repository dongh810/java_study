package javastudy_230121;
//멤버변수, 지역변수, 클래스변수, 인스턴스변수 개념
class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
public class CardTest {
    public static void main(String args[]) {
        System.out.println("Card.width="+Card.width);
        System.out.println("Card.height="+Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 3;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(c1.kind);
        System.out.println(c1.number);
        System.out.println(c2.kind);
        System.out.println(c2.number);
        Card.width = 50;
        Card.height=100;
        System.out.println(Card.width);
        System.out.println(Card.height);

    }
}
