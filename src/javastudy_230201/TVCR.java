package javastudy_230201;
//단일상속 개념
class Tv{
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() { ++channel;}
    void channelDown() { --channel;}
}
class VCR{
    boolean power;
    int counter = 0;
    void power() { power =! power;}
    void play() {}
    void stop() {}
}
public class TVCR extends Tv {
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
}
