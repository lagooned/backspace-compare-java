
package com.jaredengler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class AppShould {

    StringWithBackspacesComparitor stringwithbackspacescomparitor = new StringWithBackspacesComparitor();

    @Test
    void compareTwoStringsWithBackspaceCharacters() {
        Boolean actual = stringwithbackspacescomparitor.compare("ab\bc", "ac");
        assertThat(actual, is(true));
    }

}
