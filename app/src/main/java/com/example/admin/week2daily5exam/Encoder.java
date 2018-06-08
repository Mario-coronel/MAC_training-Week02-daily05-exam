package com.example.admin.week2daily5exam;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

public class Encoder {



    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        System.out.println(f("sloz hlb nzirl"));
        System.out.println(f("Errors in strategy cannot be correct through tactical maneuvers"));
        g("hahahajojoilsadf");

    }

    public static String f(String message) {

        char[] toEncode, encoded;
        char c;

        toEncode = message.toLowerCase().toCharArray();
        encoded = new char[toEncode.length];


        for (int i = 0; i < toEncode.length; i++) {
            c = toEncode[i];
            switch (c) {
                case 'a':
                    encoded[i] = 'z';
                    break;
                case 'b':
                    encoded[i] = 'y';
                    break;
                case 'c':
                    encoded[i] = 'x';
                    break;
                case 'd':
                    encoded[i] = 'w';
                    break;
                case 'e':
                    encoded[i] = 'v';
                    break;
                case 'f':
                    encoded[i] = 'u';
                    break;
                case 'g':
                    encoded[i] = 't';
                    break;
                case 'h':
                    encoded[i] = 's';
                    break;
                case 'i':
                    encoded[i] = 'r';
                    break;
                case 'j':
                    encoded[i] = 'q';
                    break;
                case 'k':
                    encoded[i] = 'p';
                    break;
                case 'l':
                    encoded[i] = 'o';
                    break;
                case 'm':
                    encoded[i] = 'n';
                    break;
                case 'n':
                    encoded[i] = 'm';
                    break;
                case 'o':
                    encoded[i] = 'l';
                    break;
               case 'p':
                    encoded[i] = 'k';
                    break;
               case 'q':
                    encoded[i] = 'j';
                    break;
               case 'r':
                    encoded[i] = 'i';
                    break;
               case 's':
                    encoded[i] = 'h';
                    break;
               case 't':
                    encoded[i] = 'g';
                    break;
               case 'u':
                    encoded[i] = 'f';
                    break;
               case 'v':
                    encoded[i] = 'e';
                    break;
               case 'w':
                    encoded[i] = 'd';
                    break;
               case 'x':
                    encoded[i] = 'c';
                    break;
               case 'y':
                    encoded[i] = 'b';
                    break;
               case 'z':
                    encoded[i] = 'a';
                    break;
                    default:
                        encoded[i] = toEncode[i];

            }
        }
        return String.valueOf(encoded);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void g(String message){

        char[] toCount = message.toLowerCase().toCharArray();
        Map<String, Integer> msg = new HashMap<String, Integer>();
        int val;
        for (char c: toCount) {

            if(msg.containsKey(String.valueOf(c))){
                val = msg.get(String.valueOf(c))+1;
                msg.replace(String.valueOf(c), val);
            }else{
                msg.put(String.valueOf(c), 1);
            }

        }

        System.out.println(msg);


    }

}
