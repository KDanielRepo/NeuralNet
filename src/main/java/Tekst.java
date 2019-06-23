import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class Tekst {
    int x = 7;
    int y = 367;
    int combatx;
    int combaty;
    int[][] litA = new int[14][16];
    int[][] litB = new int[14][16];
    int[][] litC = new int[14][16];
    int[][] litD = new int[14][16];
    int[][] litE = new int[14][16];
    int[][] litF = new int[14][16];
    int[][] litG = new int[14][16];
    int[][] litH = new int[14][16];
    int[][] litI = new int[14][16];
    int[][] litJ = new int[14][16];
    int[][] litK = new int[14][16];
    int[][] litL = new int[14][16];
    int[][] litM = new int[14][16];
    int[][] litN = new int[14][16];
    int[][] litO = new int[14][16];
    int[][] litP = new int[14][16];
    int[][] litQ = new int[14][16];
    int[][] litR = new int[14][16];
    int[][] litS = new int[14][16];
    int[][] litT = new int[14][16];
    int[][] litU = new int[14][16];
    int[][] litV = new int[14][16];
    int[][] litW = new int[14][16];
    int[][] litX = new int[14][16];
    int[][] litY = new int[14][16];
    int[][] litZ = new int[14][16];
    int[][] colory = new int[14][16];
    int[][] combatText = new int[14][16];
    String tekst = "";
    String combatString = "";
    String[] litery = new String[26];
    boolean combat = false;
    Color black = new Color(255, 255, 255);
    Color white = new Color(0, 0, 0);
    File file = new File("C:\\NeuralNet\\src\\main\\java\\screenshot.png");

    public void test() throws IOException {
        BufferedImage image = ImageIO.read(file);
        System.out.println(image.getWidth());
        System.out.println(image.getWidth() / 14f);
        System.out.println(image.getWidth() / 16f);
        for (int k = 0; k < ((image.getWidth()-7) / 14)-(((image.getWidth()-7) / 14f)-((image.getWidth()-7) / 16f))-1;k++) {
            System.out.println(k);
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 15; j++) {
                    int korx = i + x;
                    int kory = j + y;
                    //System.out.println(i+" oraz "+korx);
                    int clr = image.getRGB(korx, kory);
                    int clrr = image.getRGB(i+combatx,j+combaty);
                    if (clr == -16777216) {
                        colory[i][j] = 1;
                    } else {
                        colory[i][j] = 0;
                    }
                    if (clrr == -16777216) {
                        combatText[i][j] = 1;
                    } else {
                        combatText[i][j] = 0;
                    }
                }
            }
            x += 16;
            combatx +=16;

            if (Arrays.deepEquals(colory, litA)) {
                tekst += "a";
            } else if (Arrays.deepEquals(colory, litB)) {
                tekst += "b";
            } else if (Arrays.deepEquals(colory, litC)) {
                tekst += "c";
            } else if (Arrays.deepEquals(colory, litD)) {
                tekst += "d";
            } else if (Arrays.deepEquals(colory, litE)) {
                tekst += "e";
            } else if (Arrays.deepEquals(colory, litF)) {
                tekst += "f";
            } else if (Arrays.deepEquals(colory, litG)) {
                tekst += "g";
            } else if (Arrays.deepEquals(colory, litH)) {
                tekst += "h";
            } else if (Arrays.deepEquals(colory, litI)) {
                tekst += "i";
            } else if (Arrays.deepEquals(colory, litJ)) {
                tekst += "j";
            } else if (Arrays.deepEquals(colory, litK)) {
                tekst += "k";
            } else if (Arrays.deepEquals(colory, litL)) {
                tekst += "l";
            } else if (Arrays.deepEquals(colory, litM)) {
                tekst += "m";
            } else if (Arrays.deepEquals(colory, litN)) {
                tekst += "n";
            } else if (Arrays.deepEquals(colory, litO)) {
                tekst += "o";
            } else if (Arrays.deepEquals(colory, litP)) {
                tekst += "p";
            } else if (Arrays.deepEquals(colory, litQ)) {
                tekst += "q";
            } else if (Arrays.deepEquals(colory, litR)) {
                tekst += "r";
            } else if (Arrays.deepEquals(colory, litS)) {
                tekst += "s";
            } else if (Arrays.deepEquals(colory, litT)) {
                tekst += "t";
            } else if (Arrays.deepEquals(colory, litU)) {
                tekst += "u";
            } else if (Arrays.deepEquals(colory, litV)) {
                tekst += "v";
            } else if (Arrays.deepEquals(colory, litW)) {
                tekst += "w";
            } else if (Arrays.deepEquals(colory, litX)) {
                tekst += "x";
            } else if (Arrays.deepEquals(colory, litY)) {
                tekst += "y";
            } else if (Arrays.deepEquals(colory, litZ)) {
                tekst += "z";
            } else {
                tekst += " ";
                //System.out.println(" ");
            }
            if (Arrays.deepEquals(combatText, litA)) {
                combatString += "a";
            } else if (Arrays.deepEquals(combatText, litB)) {
                combatString += "b";
            } else if (Arrays.deepEquals(combatText, litC)) {
                combatString += "c";
            } else if (Arrays.deepEquals(combatText, litD)) {
                combatString += "d";
            } else if (Arrays.deepEquals(combatText, litE)) {
                combatString += "e";
            } else if (Arrays.deepEquals(combatText, litF)) {
                combatString += "f";
            } else if (Arrays.deepEquals(combatText, litG)) {
                combatString += "g";
            } else if (Arrays.deepEquals(combatText, litH)) {
                combatString += "h";
            } else if (Arrays.deepEquals(combatText, litI)) {
                combatString += "i";
            } else if (Arrays.deepEquals(combatText, litJ)) {
                combatString += "j";
            } else if (Arrays.deepEquals(combatText, litK)) {
                combatString += "k";
            } else if (Arrays.deepEquals(combatText, litL)) {
                combatString += "l";
            } else if (Arrays.deepEquals(combatText, litM)) {
                combatString += "m";
            } else if (Arrays.deepEquals(combatText, litN)) {
                combatString += "n";
            } else if (Arrays.deepEquals(combatText, litO)) {
                combatString += "o";
            } else if (Arrays.deepEquals(combatText, litP)) {
                combatString += "p";
            } else if (Arrays.deepEquals(combatText, litQ)) {
                combatString += "q";
            } else if (Arrays.deepEquals(combatText, litR)) {
                combatString += "r";
            } else if (Arrays.deepEquals(combatText, litS)) {
                combatString += "s";
            } else if (Arrays.deepEquals(combatText, litT)) {
                combatString += "t";
            } else if (Arrays.deepEquals(combatText, litU)) {
                combatString += "u";
            } else if (Arrays.deepEquals(combatText, litV)) {
                combatString += "v";
            } else if (Arrays.deepEquals(combatText, litW)) {
                combatString += "w";
            } else if (Arrays.deepEquals(combatText, litX)) {
                combatString += "x";
            } else if (Arrays.deepEquals(combatText, litY)) {
                combatString += "y";
            } else if (Arrays.deepEquals(combatText, litZ)) {
                combatString += "z";
            } else {
                combatString += " ";
                //System.out.println(" ");
            }
        }
        x=7;
        y=367;
        combatx = 0;
        combaty = 0;
        System.out.println(tekst);
    }

    public void alfabet() throws IOException {
        litery = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int k = 0; k < 26; k++) {
            /*System.out.println(litery[k]);*/
            File file = new File("C:\\NeuralNet\\src\\main\\java\\literytxt\\" + litery[k] + ".txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 15; j++) {
                    switch (litery[k]) {
                        case "a":
                            //System.out.println(bufferedReader.readLine());
                            litA[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "b":
                            litB[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "c":
                            litC[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "d":
                            litD[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "e":
                            litE[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "f":
                            litF[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "g":
                            litG[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "h":
                            litH[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "i":
                            litI[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "j":
                            litJ[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "k":
                            litK[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "l":
                            litL[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "m":
                            litM[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "n":
                            litN[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "q":
                            litQ[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "o":
                            litO[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "p":
                            litP[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "r":
                            litR[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "s":
                            litS[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "t":
                            litT[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "u":
                            litU[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "v":
                            litV[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "w":
                            litW[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "x":
                            litX[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "y":
                            litY[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "z":
                            litZ[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                    }
                }
            }
            bufferedReader.close();
        }
    }
    public String getCombatString(){
        return combatString;
    }
}
