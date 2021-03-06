package interfacesChapter10.music;

import java.io.PrintStream;

public class Percussion extends Instrument implements Playable {
    private final PrintStream printStream;

    public Percussion(PrintStream printStream) {
        super(printStream);
        this.printStream = printStream;
    }

    public void play(Note note) {
        printStream.println("Percussion.play() " + note);
    }

    public void adjust(){
        printStream.println("Adjusting Percussion");
    }

    public String what(){
        return "Percussion";
    }
}
