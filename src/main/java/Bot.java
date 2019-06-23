import sun.awt.HKSCS;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bot {
    public void ready() throws AWTException, IOException {
        BufferedImage bufferedImage = new Robot().createScreenCapture(new Rectangle(640, 480));
        ImageIO.write(bufferedImage, "png", new File("C:\\NeuralNet\\src\\main\\java\\screenshot.png"));
        File file = new File("C:\\NeuralNet\\src\\main\\java\\screenshot.png");
        BufferedImage bufferedImage1 = ImageIO.read(file);

    }
    public Bot()throws AWTException{

    }
    Robot robot = new Robot();
    Tekst tekst = new Tekst();

    public void test() throws AWTException, IOException {
        tekst.alfabet();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //while (true) {
                    try {
                        ready();
                        tekst.test();
                        //pathing
                        robot.keyPress(KeyEvent.VK_UP);
                        robot.keyRelease(KeyEvent.VK_UP);
                        Thread.sleep(2500);
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        robot.keyRelease(KeyEvent.VK_RIGHT);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        robot.keyRelease(KeyEvent.VK_RIGHT);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_UP);
                        robot.keyRelease(KeyEvent.VK_UP);
                        Thread.sleep(2500);
                        robot.keyPress(KeyEvent.VK_UP);
                        robot.keyRelease(KeyEvent.VK_UP);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        robot.keyRelease(KeyEvent.VK_RIGHT);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_RIGHT);
                        robot.keyRelease(KeyEvent.VK_RIGHT);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_UP);
                        robot.keyRelease(KeyEvent.VK_UP);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_Y);
                        robot.keyRelease(KeyEvent.VK_Y);
                        Thread.sleep(1000);
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_A);
                        Thread.sleep(1000);
                        //pathing
                        //check stats
                        fight();
                        //check stats
                    } catch (InterruptedException | AWTException | IOException e) {
                        e.printStackTrace();
                    }
                }
            //}
        });
        thread.start();
    }
    public void checkStats()throws InterruptedException{
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_3);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(500);
    }
    public void fight()throws InterruptedException{
        while (tekst.getCombatString().equals("ROUND")){
            checkStats();
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            Thread.sleep(1000);
        }
    }
}
