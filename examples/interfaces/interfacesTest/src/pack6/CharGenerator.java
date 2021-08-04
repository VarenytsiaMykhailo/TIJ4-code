package pack6;

import java.io.IOException;
import java.nio.CharBuffer;

public class CharGenerator implements Readable {


    char[] generateCharArray() {
        return new char[]{'a', 'b', 'c'};
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        char[] charArray = generateCharArray();
        for (char c : charArray) {
            cb.append(c);
        }
        return -1;
    }
}
