
package com.jaredengler;

public class StringWithBackspacesComparitor {

    private final String BACKSPACE = "\b";
    private final String ANY_CHAR_REGEXP = ".";

    public Boolean compare(String string, String string2) {
        return replaceAllBackspaceFollowingAnyChar(string)
            .equals(replaceAllBackspaceFollowingAnyChar(string2));
    }

    private String replaceAllBackspaceFollowingAnyChar(String string) {
        while (string.contains(BACKSPACE))
            string = string.replaceAll(ANY_CHAR_REGEXP + BACKSPACE, "");
        return string;
    }

}
