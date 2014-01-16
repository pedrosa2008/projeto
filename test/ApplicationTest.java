import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class ApplicationTest {
	
    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
    }
}
