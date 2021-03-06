package interfacesChapter10.music;

import java.io.PrintStream;

public class Stringed extends Instrument implements Playable {
    private final PrintStream printStream;

    public Stringed(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void play(Note note) {
        printStream.println("Stringed.play() " + note);
    }

    public void adjust() {
        printStream.println("Adjusting Stringed");
    }

    public String what() {
        return "Stringed";
    }
}
