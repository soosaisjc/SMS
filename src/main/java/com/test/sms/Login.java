package com.test.sms;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by soosai on 28/1/19.
 */
public class Login {

    static Logger log = Logger.getLogger(Login.class);

    static {
        System.setProperty("java.util.logging.config.file", "log4j.properties");
    }

    public static void main(String arg[]) {
        try {
            System.out.println("Enter username : ");
            Scanner input = new Scanner(System.in);
            String name = input.next();
            log.debug("name " + name);

            System.out.println("Enter password : ");
            input = new Scanner(System.in);
            String password = input.next();
            log.info("password " + password);

            if (isValidLogin(name, password)) {
                System.out.println("Success!!!");
                log.debug("Success !!!");
            } else {
                System.out.println("One step for Success !!!");
                log.error("One step for Success !!!");
            }
        } catch(Throwable th) {

        } finally {

        }
    }


    public static boolean isValidLogin(String userName, String password) {
        boolean isValid = false;
        if("name".equals(userName) && "pass".equals(password)) {
                isValid = true;
        }
        return isValid;
    }

   public static void initLogger() {
        log = Logger.getLogger(Login.class);
        Appender fh = null;
        try {
            fh = new FileAppender(new SimpleLayout(), "TestLog.log");
            log.addAppender(fh);
            fh.setLayout(new SimpleLayout());
            log.info("My first log");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("Hi How r u?");
    }
}
