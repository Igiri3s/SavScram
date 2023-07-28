package org.example.classes;

import java.util.Date;

public class ColumnParser {
    public static String parsererer(String cos){
        if (cos.length() < 30) {
            StringBuilder sb = new StringBuilder(cos);
            while(sb.length() < 30){
                sb.append(" ");
            }
            return sb.toString();
        }
        return cos;
    }

    public static String parsererer(int cos){
        if (String.valueOf(cos).length() < 3) {
            StringBuilder sb = new StringBuilder(String.valueOf(cos));
            while(sb.length() < 3){
                sb.append(" ");
            }
            return sb.toString();
        }
        return String.valueOf(cos);
    }

    public static String parsererer(double cos){
        if (String.valueOf(cos).length() < 8) {
            StringBuilder sb = new StringBuilder(String.valueOf(cos));
            while(sb.length() < 8){
                sb.append(" ");
            }
            return sb.toString();
        }
        return String.valueOf(cos);
    }

    public static String parsererer(Date cos){
        if (String.valueOf(cos).length() < 30) {
            StringBuilder sb = new StringBuilder(String.valueOf(cos));
            while(sb.length() < 30){
                sb.append(" ");
            }
            return sb.toString();
        }
        return String.valueOf(cos);
    }
}
