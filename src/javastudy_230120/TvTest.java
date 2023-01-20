package javastudy_230120;
class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power =!power;}
    void channelUp() { ++channel;}
    void channelDown() { --channel;}

}
public class TvTest {
    public static void main(String args[]) {
        Tv t;
        t = new Tv();
        t.channel=7;
        t.channelDown();
        t.color = "black";
        System.out.println(t.channel);
        System.out.println(t.color);
    }
}
