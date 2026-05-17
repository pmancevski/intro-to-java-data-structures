package Exercise17_7;

import utils.Loan;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File outputFile = new File("Chapter17\\src\\Exercise17_6\\output.dat");

        double totalAmount = 0;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFile))) {
            while (true) {
                Loan loan = (Loan) inputStream.readObject();
                totalAmount += loan.getLoanAmount();
                System.out.println(loan.toString());
            }
        }
        catch (EOFException eofException) {
            System.out.println("File was processed.\n\n");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total amount: " + totalAmount);
    }
}
