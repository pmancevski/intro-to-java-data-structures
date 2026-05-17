package Exercise17_5;

import java.io.*;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        File outputFile = new File("Exercise17_05.dat");

        int[] array = {1, 2, 3, 4, 5};
        Date date = new Date();
        double value = 5.5;

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            objectOutputStream.writeObject(array);
            objectOutputStream.writeObject(date);
            objectOutputStream.writeDouble(value);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFile))) {
            while (true){
                int[] tempArray = (int[]) inputStream.readObject();
                Date dateTemp = (Date) inputStream.readObject();
                double tempValue = (double) inputStream.readDouble();

                for (int i : tempArray) {
                    System.out.print(i + " ");
                }
                System.out.println();
                System.out.println(dateTemp.toString());
                System.out.println(tempValue);
            }
        }
        catch (EOFException e) {
            System.out.println("End of file");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
