import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTest {

    @Test
    void passingTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void failingTestForReviewBot() {
        assertEquals(99, 1 + 1, "Intentional failing test to trigger JUNIT analyzer");
    }

    @Test
    @Disabled("Intentional skipped test to trigger JUNIT analyzer")
    void skippedTestForReviewBot() {
        assertEquals(1, 1);
    }
}
