package polymorphism.music;

import java.io.PrintStream;

public class NewInstrument extends Instrument{

    private final PrintStream printStream;

    public NewInstrument(PrintStream printStream){
        super(printStream);
        this.printStream = printStream;
    }
    public void play(Note note) {
        printStream.println("NewInstrument.play() " + note);
    }

    public void adjust() {
        printStream.println("Adjusting NewInstrument");
    }

    public String toString() {
        return "NewInstrument";
    }
}
