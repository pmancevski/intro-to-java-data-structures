package Exercise17_9;

import java.io.FileNotFoundException;

/*
    This program works only with ASCII characters, for additional characters there should be done some different checks
    and possible logic modification
 */
public class App {
    public static void main(String[] args) {
        try (MyRAF raf = new MyRAF()) {
            // Add records
            Address addr1 = new Address("John Smith", "100 Main St", "Savannah", "CA", "31412");
            Address addr2 = new Address("Jane Doe", "200 Oak Ave", "Atlanta", "GA", "30301");
            raf.addRecord(addr1);
            raf.addRecord(addr2);

            // Read first record
            Address first = raf.readFirstRecord();
            System.out.println("First: " + first.getName());
            System.out.println("POINTER " + raf.getPointerPosition());

            // Read next record
            Address next = raf.readNextRecord();
            System.out.println("Next: " + next.getName());

            // Read last record
            Address last = raf.readLastRecord();
            System.out.println("Last: " + last.getName());

            // Update current record (last)
            Address updated = new Address("Jane Updated", "200 Oak Ave", "Atlanta", "GA", "30301");
            raf.updateRecord(updated);

            // Verify update
            raf.setPointerPosition(raf.getPointerPosition() - MyRAF.RECORD_SIZE);
            Address verified = raf.readNextRecord();
            System.out.println("Updated: " + verified.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
