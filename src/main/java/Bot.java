import sun.awt.HKSCS;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bot {
    boolean heal;

    public void ready() throws AWTException, IOException {
        BufferedImage bufferedImage = new Robot().createScreenCapture(new Rectangle(640, 480));
        ImageIO.write(bufferedImage, "png", new File("C:\\NeuralNet\\src\\main\\java\\screenshot.png"));
        //File file = new File("C:\\NeuralNet\\src\\main\\java\\screenshot.png");
        //BufferedImage bufferedImage1 = ImageIO.read(file);

    }

    public Bot() throws AWTException {

    }

    Robot robot = new Robot();


    public void test() throws AWTException, IOException {
        Tekst tekst = new Tekst();
        tekst.alfabet();
        while (true) {
            try {
                ready();
                tekst.test();
                //pathing
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                //checkForMonsters();
                Thread.sleep(5000);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                //checkForMonsters();
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                //checkForMonsters();
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                //checkForMonsters();
                Thread.sleep(5000);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                //checkForMonsters();
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                //checkForMonsters();
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);
                //checkForMonsters();
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                //checkForMonsters();
                Thread.sleep(200);
                robot.keyPress(KeyEvent.VK_Y);
                robot.keyRelease(KeyEvent.VK_Y);
                checkForMonsters();
                Thread.sleep(200);
                checkForMonsters();/*
                        robot.keyPress(KeyEvent.VK_A);
                        robot.keyRelease(KeyEvent.VK_A);
                        Thread.sleep(200);*/
                //pathing
                //check stats
                //fight();
                //check stats

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void checkForMonsters() throws Exception {
        Tekst tekst = new Tekst();
        tekst.alfabet();
        ready();
        tekst.test();
        if (tekst.tekst.equals("the monsters surprise you!")) {
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            fight();
        } else if (tekst.tekst.equals("options    a  attack   r  retreat       ")) {
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            fight();
        }else if(tekst.combatString.equals("delay")){
            fight();
        }

    }

    public void checkStats() throws IOException, AWTException, InterruptedException {
        Tekst tekst = new Tekst();
        tekst.alfabet();
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        Thread.sleep(2000);
        ready();
        tekst.test();
        int hp1 = Integer.parseInt(tekst.hpString);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1500);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(2000);
        ready();
        tekst.test();
        int hp2 = Integer.parseInt(tekst.hpString);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1500);
        robot.keyPress(KeyEvent.VK_3);
        robot.keyRelease(KeyEvent.VK_3);
        Thread.sleep(2000);
        ready();
        tekst.test();
        int hp3 = Integer.parseInt(tekst.hpString);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1500);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyRelease(KeyEvent.VK_4);
        Thread.sleep(2000);
        ready();
        tekst.test();
        int hp4 = Integer.parseInt(tekst.hpString);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
        Thread.sleep(1500);
        if (hp3 < 30) {
            healCast();
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
            Thread.sleep(1500);
            heal = true;
        } else if (hp1 < 20) {
            healCast();
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            Thread.sleep(1500);
            heal = true;
        } else if (hp4 < 20) {
            healCast();
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
            Thread.sleep(1500);
            heal = true;
        } else if (hp2 < 20) {
            healCast();
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
            Thread.sleep(1500);
            heal = true;
        } else {
            heal = false;
        }
    }

    public void healCast() throws InterruptedException {
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(600);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(600);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        Thread.sleep(600);
    }

    public void fight() throws InterruptedException, AWTException, IOException {
        //checkStats();
        Thread.sleep(1500);
        Tekst tekst = new Tekst();
        tekst.alfabet();
        ready();
        tekst.test();
        System.out.println(tekst.combatString);
        while (tekst.combatString.equals("delay")) {
            //zamien na if(tura serena)else!!!
            ready();
            tekst.test();
            if (tekst.serena) {
                checkStats();
                Thread.sleep(1000);
                ready();
                tekst.test();
                Thread.sleep(500);
                if (!heal) {
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    Thread.sleep(1000);
                    ready();
                    tekst.test();
                }
                Thread.sleep(500);
                ready();
                tekst.test();
            }
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            Thread.sleep(500);
            ready();
            tekst.test();
        }
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(1200);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(400);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_2);
        Thread.sleep(4000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
    }
}
