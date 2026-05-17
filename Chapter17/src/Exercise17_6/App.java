package Exercise17_6;

import utils.Loan;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File outputFile = new File("Chapter17\\src\\Exercise17_6\\output.dat");

        Loan loan1 = new Loan(5.5, 1, 10000);
        Loan loan2 = new Loan(4.0, 2, 15000);
        Loan loan3 = new Loan(6.0, 3, 20000);
        Loan loan4 = new Loan(3.5, 5, 50000);
        Loan loan5 = new Loan(7.0, 4, 25000);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            outputStream.writeObject(loan1);
            outputStream.writeObject(loan2);
            outputStream.writeObject(loan3);
            outputStream.writeObject(loan4);
            outputStream.writeObject(loan5);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
