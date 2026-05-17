package Exercise17_17;

import java.io.*;

public class BitOutputStream implements AutoCloseable {
    public static final int BIT_MAX_SIZE = 8;
    private int bufferBit;
    private int count;

    private BufferedOutputStream outputStream;

    public BitOutputStream(File file) throws FileNotFoundException {
        this.bufferBit = 0;
        this.count = 0;

        this.outputStream = new BufferedOutputStream(new FileOutputStream(file));
    }

    public void writeBit(char bit) throws IOException {
        int value = (bit == '1') ? 1 : 0;
        bufferBit = (bufferBit << 1) | value;
        count++;

        if (count == BIT_MAX_SIZE) {
            outputStream.write(bufferBit);
            bufferBit = 0;
            count = 0;
        }
    }

    public void writeBit(String bit) throws IOException {
        for (int count = 0; count < bit.length(); count++){
            writeBit(bit.charAt(count));
        }
    }

    // AutoClosable interface is implemented because it give us option to use this in try-catch with resources.
    @Override
    public void close() throws Exception {
        if (count > 0) {
            bufferBit = bufferBit << (8 - count);
            outputStream.write(bufferBit);
        }

        outputStream.close();
    }
}
