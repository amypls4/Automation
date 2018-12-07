import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import sun.util.calendar.JulianCalendar;

import java.util.Arrays;


public class testRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(gui_browseWebPage.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("Result was ==" +result.wasSuccessful());
    }
}
