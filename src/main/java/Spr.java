import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class Spr {
    int x = 1;
    int y = 367;
    int hpX=177;
    int hpY=127;
    int combatx=1;
    int combaty=47;
    int[] turaX = new int[4];
    int[] turaY = new int[4];
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
    int[][] lit0 = new int[14][16];
    int[][] lit1 = new int[14][16];
    int[][] lit2 = new int[14][16];
    int[][] lit3 = new int[14][16];
    int[][] lit4 = new int[14][16];
    int[][] lit5 = new int[14][16];
    int[][] lit6 = new int[14][16];
    int[][] lit7 = new int[14][16];
    int[][] lit8 = new int[14][16];
    int[][] lit9 = new int[14][16];
    int[][] litNot1 = new int[14][16];
    int[][] litNot2 = new int[14][16];
    int[][] litNot3 = new int[14][16];
    int[][] litNot4 = new int[14][16];

    int[][] colory = new int[14][16];
    int[][] hpText = new int[14][16];
    int[][] combatText = new int[14][16];
    int[][] tura = new int[14][16];
    boolean crag = false;
    boolean ithilgore = false;
    boolean serena = false;
    boolean weez = false;
    String tekst = "";
    String hpString = "";
    String combatString = "";
    String[] litery = new String[26];
    String[] cyfery = new String[10];
    boolean combat = false;
    Color black = new Color(255, 255, 255);
    Color white = new Color(0, 0, 0);

    public void test() throws IOException {
        hpString="";
        tekst="";
        combatString = "";
        crag=false;
        ithilgore=false;
        serena=false;
        weez=false;
        turaX = new int[]{49,113,49,113};
        turaY = new int[]{79,79,95,95};
        File file = new File("C:\\NeuralNet\\src\\main\\java\\litery\\1.png");
        BufferedImage image = ImageIO.read(file);
        //System.out.println(image.getWidth());
        //System.out.println(image.getWidth() / 14f);
        //System.out.println(image.getWidth() / 16f);
        for (int k = 0; k < ((image.getWidth()-7) / 14)-(((image.getWidth()-7) / 14f)-((image.getWidth()-7) / 16f));k++) {
            //System.out.println(k);
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 15; j++) {
                    int korx = i + x;
                    int kory = j + y;
                    //System.out.println(i+" oraz "+korx);
                    int clr = image.getRGB(korx, kory);
                    if (clr == -16777216) {
                        colory[i][j] = 1;
                    } else {
                        colory[i][j] = 0;
                    }
                }
            }
            x += 16;
            comparingLetters(colory);
            comparingNumbers(colory);
        }

        //hp
        for(int k = 0; k< 1; k++) {
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 16; j++) {
                    int clrr = image.getRGB(i, j);
                    if (clrr == -16777216) {
                        hpText[i][j] = 1;
                    } else {
                        hpText[i][j] = 0;
                    }

                }
            }
            hpX +=16;
            comparingNumbers(hpText);
        }
        /*//combat
        for(int k = 0; k<5;k++) {
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 15; j++) {
                    int cbr = image.getRGB(i + combatx, j + combaty);
                    if (cbr == -16777216) {
                        combatText[i][j] = 1;
                    } else {
                        combatText[i][j] = 0;
                    }
                }
            }
            combatx+=16;
            comparingLetters2(combatText);
        }*/
        for(int i = 0; i<14; i++){
            for(int j = 0; j<16; j++){
                int cbr = image.getRGB(i, j);
                if (cbr == -16777216) {
                    tura[i][j] = 0;
                } else {
                    tura[i][j] = 1;
                }
            }
        }
        if(Arrays.deepEquals(tura,litNot1)){
            crag = true;
            ithilgore=false;
            serena=false;
            weez=false;
        }
        if(Arrays.deepEquals(tura,litNot2)){
            ithilgore = true;
            crag=false;
            serena=false;
            weez=false;
        }
        if(Arrays.deepEquals(tura,litNot3)){
            serena = true;
            crag=false;
            weez=false;
            ithilgore=false;
        }
        if(Arrays.deepEquals(tura,litNot4)){
            weez = true;
            crag=false;
            ithilgore=false;
            serena=false;
        }
        x=1;
        y=367;
        hpX = 177;
        hpY = 127;
        combatx = 1;
        combaty = 47;
        System.out.println(crag+" "+ithilgore+" "+serena+" "+weez+" ");
        System.out.println(tekst);
        System.out.println(hpString);
        System.out.println(combatString);
    }

    public void alfabet() throws IOException {
        litery = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        cyfery = new String[]{"0","1","2","3","4","5","6","7","8","9","not1","not2","not3","not4"};
        for(int k = 0; k<14;k++){
            File file = new File("C:\\NeuralNet\\src\\main\\java\\literytxt\\" + cyfery[k] + ".txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i = 0; i<14;i++) {
                for (int j = 0; j < 16; j++) {
                    switch (cyfery[k]) {
                        case "0":
                            lit0[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "1":
                            lit1[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "2":
                            lit2[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "3":
                            lit3[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "4":
                            lit4[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "5":
                            lit5[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "6":
                            lit6[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "7":
                            lit7[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "8":
                            lit8[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "9":
                            lit9[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "not1":
                            litNot1[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "not2":
                            litNot2[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "not3":
                            litNot3[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                        case "not4":
                            litNot4[i][j] = Integer.parseInt(bufferedReader.readLine());
                            break;
                    }
                }
            }
        }
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
    public String gethpString(){
        return hpString;
    }
    public void comparingLetters(int[][] a){
        if (Arrays.deepEquals(a, litA)) {
            tekst += "a";
        } else if (Arrays.deepEquals(a, litB)) {
            tekst += "b";
        } else if (Arrays.deepEquals(a, litC)) {
            tekst += "c";
        } else if (Arrays.deepEquals(a, litD)) {
            tekst += "d";
        } else if (Arrays.deepEquals(a, litE)) {
            tekst += "e";
        } else if (Arrays.deepEquals(a, litF)) {
            tekst += "f";
        } else if (Arrays.deepEquals(a, litG)) {
            tekst += "g";
        } else if (Arrays.deepEquals(a, litH)) {
            tekst += "h";
        } else if (Arrays.deepEquals(a, litI)) {
            tekst += "i";
        } else if (Arrays.deepEquals(a, litJ)) {
            tekst += "j";
        } else if (Arrays.deepEquals(a, litK)) {
            tekst += "k";
        } else if (Arrays.deepEquals(a, litL)) {
            tekst += "l";
        } else if (Arrays.deepEquals(a, litM)) {
            tekst += "m";
        } else if (Arrays.deepEquals(a, litN)) {
            tekst += "n";
        } else if (Arrays.deepEquals(a, litO)) {
            tekst += "o";
        } else if (Arrays.deepEquals(a, litP)) {
            tekst += "p";
        } else if (Arrays.deepEquals(a, litQ)) {
            tekst += "q";
        } else if (Arrays.deepEquals(a, litR)) {
            tekst += "r";
        } else if (Arrays.deepEquals(a, litS)) {
            tekst += "s";
        } else if (Arrays.deepEquals(a, litT)) {
            tekst += "t";
        } else if (Arrays.deepEquals(a, litU)) {
            tekst += "u";
        } else if (Arrays.deepEquals(a, litV)) {
            tekst += "v";
        } else if (Arrays.deepEquals(a, litW)) {
            tekst += "w";
        } else if (Arrays.deepEquals(a, litX)) {
            tekst += "x";
        } else if (Arrays.deepEquals(a, litY)) {
            tekst += "y";
        } else if (Arrays.deepEquals(a, litZ)) {
            tekst += "z";
        } else {
            tekst += " ";
            //System.out.println(" ");
        }
    }
    public void comparingLetters2(int[][] a){
        if (Arrays.deepEquals(a, litA)) {
            combatString += "a";
        } else if (Arrays.deepEquals(a, litB)) {
            combatString += "b";
        } else if (Arrays.deepEquals(a, litC)) {
            combatString += "c";
        } else if (Arrays.deepEquals(a, litD)) {
            combatString += "d";
        } else if (Arrays.deepEquals(a, litE)) {
            combatString += "e";
        } else if (Arrays.deepEquals(a, litF)) {
            combatString += "f";
        } else if (Arrays.deepEquals(a, litG)) {
            combatString += "g";
        } else if (Arrays.deepEquals(a, litH)) {
            combatString += "h";
        } else if (Arrays.deepEquals(a, litI)) {
            combatString += "i";
        } else if (Arrays.deepEquals(a, litJ)) {
            combatString += "j";
        } else if (Arrays.deepEquals(a, litK)) {
            combatString += "k";
        } else if (Arrays.deepEquals(a, litL)) {
            combatString += "l";
        } else if (Arrays.deepEquals(a, litM)) {
            combatString += "m";
        } else if (Arrays.deepEquals(a, litN)) {
            combatString += "n";
        } else if (Arrays.deepEquals(a, litO)) {
            combatString += "o";
        } else if (Arrays.deepEquals(a, litP)) {
            combatString += "p";
        } else if (Arrays.deepEquals(a, litQ)) {
            combatString += "q";
        } else if (Arrays.deepEquals(a, litR)) {
            combatString += "r";
        } else if (Arrays.deepEquals(a, litS)) {
            combatString += "s";
        } else if (Arrays.deepEquals(a, litT)) {
            combatString += "t";
        } else if (Arrays.deepEquals(a, litU)) {
            combatString += "u";
        } else if (Arrays.deepEquals(a, litV)) {
            combatString += "v";
        } else if (Arrays.deepEquals(a, litW)) {
            combatString += "w";
        } else if (Arrays.deepEquals(a, litX)) {
            combatString += "x";
        } else if (Arrays.deepEquals(a, litY)) {
            combatString += "y";
        } else if (Arrays.deepEquals(a, litZ)) {
            combatString += "z";
        } else {
            combatString += " ";
            //System.out.println(" ");
        }
    }
    public void comparingNumbers(int[][]a){
        if (Arrays.deepEquals(a, lit0)) {
            hpString += "0";
        } else if (Arrays.deepEquals(a, lit1)) {
            hpString += "1";
        } else if (Arrays.deepEquals(a, lit2)) {
            hpString += "2";
        } else if (Arrays.deepEquals(a, lit3)) {
            hpString += "3";
        } else if (Arrays.deepEquals(a, lit4)) {
            hpString += "4";
        } else if (Arrays.deepEquals(a, lit5)) {
            hpString += "5";
        } else if (Arrays.deepEquals(a, lit6)) {
            hpString += "6";
        } else if (Arrays.deepEquals(a, lit7)) {
            hpString += "7";
        } else if (Arrays.deepEquals(a, lit8)) {
            hpString += "8";
        } else if (Arrays.deepEquals(a, lit9)) {
            hpString += "9";
        }else {
            hpString += " ";
            //System.out.println(" ");
        }
    }
}
