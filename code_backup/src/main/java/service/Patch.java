package service;

import java.io.File;
import utils.Log;

public class Patch {
    public static void modifySuffix(String path, String from, String to) {
        reName(path, from, to);
        if(existSuffix(path, from)) Log.error(from + " suffix file exists");
    }

    public static void reName(String path, String from, String to) {
        File f = new File(path);
        File[] fs = f.listFiles();
        for (File subFile : fs) {
            if (subFile.isDirectory()) {
                reName(subFile.getPath(), from, to);
            } else {
                String name = subFile.getName();
                if (name.endsWith(from)) {

                    subFile.renameTo(new File(subFile.getParent() + "/" + name.substring(0, name.indexOf(from)) + to));

                }
            }
        }
    }

    public static boolean existSuffix(String path, String from) {
        File f = new File(path);
        File[] fs = f.listFiles();
        boolean res = false;
        for (File subFile : fs) {
            if (subFile.isDirectory()) {
                res = existSuffix(subFile.getPath(), from);
            } else {
                String name = subFile.getName();
                if (name.endsWith(from)) return true;
            }
        }
        return res;
    }
}
