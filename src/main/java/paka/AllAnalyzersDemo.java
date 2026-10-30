package paka;

import java.util.*;

/**
 * Class designed to trigger all 7 ReviewBot analyzers on distinct lines.
 */
public class AllAnalyzersDemo {

    // 1. CHECKSTYLE (STYLE) & SPOTBUGS (URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD)
    public int Bad_Field_Name = 42;

    // 2. PMD (CODE_QUALITY - Best Practices: UnusedPrivateField)
    private int unusedPrivateField = 100;

    /**
     * 3. JAVADOC (DOC): malformed Javadoc tags.
     *
     * @param unknownParam this parameter does not exist
     * @return void method should not have a return tag
     */
    public void triggerJavadoc() {
        System.out.println("Javadoc test");
    }

    /**
     * 4. ERROR_PRONE (BUG via javac -Xlint:divzero & rawtypes).
     *
     * @return computed value
     */
    public int triggerErrorProne() {
        List rawList = new ArrayList();
        rawList.add("item");
        // Spacer line 1
        // Spacer line 2
        // Spacer line 3
        return 1 / 0;
    }

    /**
     * 5. PMD (BUG / CODE_QUALITY: CollapsibleIfStatements & EmptyCatchBlock).
     *
     * @param a first input
     * @param b second input
     * @return computed value
     */
    public int triggerPmd(int a, int b) {
        try {
            if (a > 0) {
                if (b > 0) {
                    return a + b;
                }
            }
        } catch (Exception e) {
        }
        return 0;
    }

    /**
     * 6. SPOTBUGS (CODE_QUALITY: DM_STRING_CTOR & BUG: ESync_EMPTY_SYNC).
     *
     * @param input string to check
     * @return created string
     */
    public String triggerSpotBugs(String input) {
        synchronized (this) {
        }
        // Spacer line 1
        // Spacer line 2
        String created = new String("literal");
        return created + input;
    }
}
