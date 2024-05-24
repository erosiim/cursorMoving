import java.awt.*;
import java.util.Random;

public class CursorMoverFunctionality {
    //Max position of mouse on screen for X axis
    private static final Integer MAX_SCREEN_X = 150;
    //Max position of mouse on screen for Y axis
    private static final Integer MAX_SCREEN_Y = 150;
    public static void moveCursor(Integer timeInMiliseconds) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();
        while (true){
            robot.mouseMove(random.nextInt(MAX_SCREEN_X), random.nextInt(MAX_SCREEN_Y));
            //This indicates the delay for move the mouse on the screen
            Thread.sleep(timeInMiliseconds);
        }
    }
}
