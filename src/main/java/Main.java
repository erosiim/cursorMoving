import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        //It takes the argument args[0] as the timeInMiliseconds for moving the cursor
        var timeInMiliSecondsForMoveCursor = Integer.parseInt(args[0]);
        CursorMoverFunctionality.moveCursor(timeInMiliSecondsForMoveCursor);
    }
}
