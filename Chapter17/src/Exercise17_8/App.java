package Exercise17_8;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File inputFile = new File("Chapter17\\src\\Exercise17_8\\Exercise17_08.txt");
        File outputFile = new File("Chapter17\\src\\Exercise17_8\\Exercise17_08.dat");
        int counter = 0;

        if (outputFile.exists()) {
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(outputFile));){
                counter = dataInputStream.readInt();

            }
            catch (EOFException eofException) {
                System.out.println("Counter was loaded.\n\n");
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Program was executed: " + counter + " time(s)");

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(inputFile));
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile))) {
            outputStream.writeUTF("Executed.");
            counter++;
            dataOutputStream.writeInt(counter);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
