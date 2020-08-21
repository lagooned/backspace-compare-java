
package com.jaredengler;

public class StringWithBackspacesComparitor {

    public Boolean compare(String string, String string2) {
        return string.replaceAll(".\b", "").equals(string2.replaceAll(".\b", ""));
    }

}
