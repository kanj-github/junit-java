import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

/**
 * Created by naraykan on 20/07/17.
 */

@RunWith(MockitoJUnitRunner.class)
public class LogicTest {
    @Mock View mockView;

    @Before
    public void setUpMock() {
        doAnswer((invocationOnMock) -> {
            System.out.println(System.currentTimeMillis() + " mock display");
            return null;
        }).when(mockView).display();
    }

    @Test
    public void testLogic() {
        new Logic().startShit(mockView);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {}
        verify(mockView, times(1)).display();
    }
}
