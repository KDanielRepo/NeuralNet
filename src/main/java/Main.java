import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AWTException,IOException {
        Tekst tekst = new Tekst();
        tekst.alfabet();
        tekst.test();
        Bot bot = new Bot();
        bot.ready();
    }

}
