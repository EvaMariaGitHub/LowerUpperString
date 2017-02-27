package com.simplon;

/**
 * Created by alonso on 27/02/17.
 */
public class LowerUpperString {
    public static final int START_MAJ = 65;
    public static final int START_MIN = 97;
    public static final int END = 25;
    public static final int TRANSLATION = 32;

    public String toAlternativeString(String s) {
        String newString = "";
        if (s!=null) {
            for (Character c : s.toCharArray()) {
                int mut = c;
                if (c >= START_MIN && c <= START_MIN + END) {
                    mut -= TRANSLATION;
                }
                if (c >= START_MAJ && c <= START_MAJ + END) {
                    mut += TRANSLATION;
                }
                newString += (char) (mut);
            }
        }
        return newString;
    }
}

