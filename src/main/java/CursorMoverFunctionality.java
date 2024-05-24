import java.awt.*;
import java.util.Random;

public class CursorMoverFunctionality {
    private static final Integer MAX_SCREEN_X = 150;
    private static final Integer MAX_SCREEN_Y = 150;
    public static void moveCursor(Integer timeInMiliseconds) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();
        while (true){
            robot.mouseMove(random.nextInt(MAX_SCREEN_X), random.nextInt(MAX_SCREEN_Y));
            Thread.sleep(timeInMiliseconds);
        }
    }
}
