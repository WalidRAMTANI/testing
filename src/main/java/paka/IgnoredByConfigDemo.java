package paka;

import java.util.*;

/**
 * This file is listed under 'ignore:' in .reviewbot.yml.
 * Even though it contains violations for every analyzer, ReviewBot must filter it out.
 */
public class IgnoredByConfigDemo {

    public int Ignored_Bad_Field = 123;

    private int ignoredUnusedPrivateField = 456;

    /**
     * Malformed Javadoc that should be ignored.
     *
     * @param nonExistent does not exist
     * @return void method
     */
    public void ignoredMethod() {
        List raw = new ArrayList();
        raw.add("ignored");
        int divZero = 1 / 0;
        String badString = new String("ignored" + divZero);
        System.out.println(badString);
    }
}

