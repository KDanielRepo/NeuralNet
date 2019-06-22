import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bot {
    public void ready() throws AWTException, IOException {
        BufferedImage bufferedImage = new Robot().createScreenCapture(new Rectangle(640, 480));
        ImageIO.write(bufferedImage, "png",new File("C:\\NeuralNet\\src\\main\\java\\screenshot.png"));
    }
}
