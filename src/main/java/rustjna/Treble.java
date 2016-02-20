package rustjna;

import com.sun.jna.Library;
import com.sun.jna.Native;


public class Treble {
    public interface CTreble extends Library {
        CTreble INSTANCE = (CTreble) Native.loadLibrary("treble",CTreble.class);

        int treble(int value);
    }

    public static void main(String[] args) {
        System.out.println("trebling: 10 " + CTreble.INSTANCE.treble(10));
    }
}
