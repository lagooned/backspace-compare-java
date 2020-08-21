
package com.jaredengler;

public class StringWithBackspacesComparitor {

    public Boolean compare(String string, String string2) {
        return replaceAllBackspaceRecursively(string)
            .equals(replaceAllBackspaceRecursively(string2));
    }

    private String replaceAllBackspaceRecursively(String string) {
        if (!string.contains("\b"))
            return string;
        else
            return replaceAllBackspaceRecursively(string.replaceAll(".\b", ""));
    }

}
