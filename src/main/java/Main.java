import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException {
        var timeInMiliSecondsForMoveCursor = Integer.parseInt(args[0]);
        CursorMoverFunctionality.moveCursor(timeInMiliSecondsForMoveCursor);
    }
}
