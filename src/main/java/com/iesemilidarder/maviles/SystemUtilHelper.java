package com.iesemilidarder.maviles;

public class SystemUtilHelper {

    private SystemUtilHelper() {
    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }


    public static void logError(Exception e) {
        consolePrint("ERROR:" + e);
    }


}
