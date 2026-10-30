import java.util.*; // Checkstyle/PMD: Avoid wildcard imports
import java.io.File;
import java.io.FileInputStream;

/**
 * This class is a test subject for various Java static analysis tools.
 * It intentionally contains multiple violations.
 */
public class analyzerTestSubject { // Checkstyle: Class names should begin with an uppercase letter

    private int UnusedField = 10; // PMD: Unused private field. Checkstyle: Variable name should start with lowercase.
    
    public static final String constant_var = "test"; // Checkstyle: Constants should be ALL_CAPS.

    // Checkstyle/Javadoc: Missing Javadoc comment for a public method.
    public int CalculateSomething(int a, int b) { // Checkstyle: Method names should start with a lowercase letter.
        
        if(a==b) { // Checkstyle: Missing whitespace around '==' and 'if'.
            
            String s = new String("unnecessary"); // PMD: Unnecessary wrapper object creation.
            
            if (s == "unnecessary") { // Error Prone: String equality should use .equals(), not ==.
                return a+b; // Checkstyle: Missing whitespace around '+'.
            }
        }
        
        try {
            FileInputStream fis = new FileInputStream(new File("nonexistent.txt"));
            // PMD/Error Prone: Unclosed resource (FileInputStream is never closed).
        } catch (Exception e) {
            // PMD: Empty catch block. Exceptions should never be swallowed silently.
        }

        int unusedLocal = 42; // PMD: Unused local variable.

        // JaCoCo: Complex branching. Unless tests explicitly cover all permutations of a > 10 and b < 5, 
        // JaCoCo will report partial or missed branch coverage here.
        if (a > 10) {
            if (b < 5) {
                return a - b;
            } else {
                return b - a;
            }
        }

        return a * b;
    }
    
    /**
     * Malformed Javadoc to test Javadoc validation.
     * 
     * @param x  // Javadoc: Missing description for parameter 'x'. The parameter doesn't even exist in the signature.
     * @return   // Javadoc: Method returns void, so @return should not be here.
     */
    public void doNothing() {
        // PMD: Empty method body.
    }
}
