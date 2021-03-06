package polymorphism.cycle;



import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UnicycleTest {

    @Test
    public void driveShouldCallPrintStreamWithUpcastedMessage() {

        PrintStream printStream = mock(PrintStream.class);

        Unicycle unicycle = new Unicycle(printStream);

        unicycle.drive(unicycle);

        verify(printStream).println("Upcasted");
    }

}
