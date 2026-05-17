package Exercise17_17;

import java.io.File;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {

        File file = new File("Chapter17\\src\\Exercise17_17\\output.txt");

        try (BitOutputStream bitOutputStream = new BitOutputStream(file)) {
            bitOutputStream.writeBit("010000100100001001101");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
