/**
 * Created by PValentinS on 01.09.2015.
 */
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;

public class Log4jLogger {

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(Log4jLogger.class.getName());

    public static void main(String[] args)throws IOException,SQLException{
        //BasicConfigurator.configure();
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}
