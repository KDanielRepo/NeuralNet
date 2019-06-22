import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class Tekst  {
    int x = 0;
    int y = 0;
    int[][] litS = new int[14][16];
    int[][] colory = new int[14][16];
    String[] litery = new String[26];
    Color black = new Color(255,255,255);
    Color white = new Color(0,0,0);
    File file = new File("C:\\NeuralNet\\src\\main\\java\\screen.png");
    public void test() throws IOException {
        BufferedImage image = ImageIO.read(file);
        System.out.println(image.getWidth());
        for(int k = 0; k< image.getWidth()/14;){
        for (int i = x; i < x+14; i++) {
            for (int j = y; j < y + 15; j++) {
                int clr = image.getRGB(i, j);
                if (clr == -16777216) {
                    colory[i][j] = 1;
                } else {
                    colory[i][j] = 0;
                }
            }
            x+=16;
        }
        }
        if(Arrays.deepEquals(colory,litS)){
            System.out.println("to litera S");
        }else{
            System.out.println("nie");
        }
    }
   /* public void alfabet()throws IOException{
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        litery = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int k = 0; k<26;k++) {
            File file = new File("C:\\NeuralNet\\src\\main\\java\\+"+litery[k]+".txt");
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 15; j++) {
                    litS[i][j] = Integer.parseInt(bufferedReader.readLine());
                    System.out.println(litS[i][j]);
                }
            }
        }
        bufferedReader.close();
    }*/
}
