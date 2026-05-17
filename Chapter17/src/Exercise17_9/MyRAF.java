package Exercise17_9;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRAF implements AutoCloseable{
    public static final long RECORD_SIZE = 91;

    private long pointerPosition = 0;
    private RandomAccessFile randomAccessFile;

    public MyRAF() throws FileNotFoundException {
        randomAccessFile = new RandomAccessFile("Chapter17\\src\\Exercise17_9\\raf.dat", "rw");
    }

    public void addRecord(Address address) throws IOException {

        randomAccessFile.seek(randomAccessFile.length());

        randomAccessFile.writeBytes(address.getFixedName());
        randomAccessFile.writeBytes(address.getFixedStreet());
        randomAccessFile.writeBytes(address.getFixedCity());
        randomAccessFile.writeBytes(address.getFixedState());
        randomAccessFile.writeBytes(address.getFixedZip());

        pointerPosition = randomAccessFile.length();
    }

    public Address readFirstRecord() throws IOException{
        Address address;

        randomAccessFile.seek(0);
        pointerPosition = 0;

        try {
            byte[] nameBytes = new byte[32];
            randomAccessFile.readFully(nameBytes);
            String fixedName = new String(nameBytes);

            //read fixedStreet
            byte[] streetBytes = new byte[32];
            randomAccessFile.readFully(streetBytes);
            String fixedStreet = new String (streetBytes);

            //read fixedCity
            byte[] cityBytes = new byte[20];
            randomAccessFile.readFully(cityBytes);
            String fixedCity = new String (cityBytes);

            //read fixedState
            byte[] stateBytes = new byte[2];
            randomAccessFile.readFully(stateBytes);
            String fixedState = new String (stateBytes);

            //read fixedZip
            byte[] zipBytes = new byte[5];
            randomAccessFile.readFully(zipBytes);
            String fixedZip = new String (zipBytes);
            
            pointerPosition += RECORD_SIZE;

            address = new Address(fixedName, fixedStreet, fixedCity, fixedState, fixedZip);
        }
        catch (EOFException e){
            return null;
        }

        return address;
    }
    
    public Address readNextRecord() throws IOException{
        Address address;
        
        randomAccessFile.seek(pointerPosition);

        try {
            byte[] nameBytes = new byte[32];
            randomAccessFile.readFully(nameBytes);
            String fixedName = new String(nameBytes);

            //read fixedStreet
            byte[] streetBytes = new byte[32];
            randomAccessFile.readFully(streetBytes);
            String fixedStreet = new String (streetBytes);

            //read fixedCity
            byte[] cityBytes = new byte[20];
            randomAccessFile.readFully(cityBytes);
            String fixedCity = new String (cityBytes);

            //read fixedState
            byte[] stateBytes = new byte[2];
            randomAccessFile.readFully(stateBytes);
            String fixedState = new String (stateBytes);

            //read fixedZip
            byte[] zipBytes = new byte[5];
            randomAccessFile.readFully(zipBytes);
            String fixedZip = new String (zipBytes);

            pointerPosition += RECORD_SIZE;

            address = new Address(fixedName, fixedStreet, fixedCity, fixedState, fixedZip);
        }
        catch (EOFException e){
            return null;
        }

        return address;
    }

    public Address readPreviousRecord() throws IOException{
        Address address;

        randomAccessFile.seek(pointerPosition - RECORD_SIZE);

        try {
            byte[] nameBytes = new byte[32];
            randomAccessFile.readFully(nameBytes);
            String fixedName = new String(nameBytes);

            //read fixedStreet
            byte[] streetBytes = new byte[32];
            randomAccessFile.readFully(streetBytes);
            String fixedStreet = new String (streetBytes);

            //read fixedCity
            byte[] cityBytes = new byte[20];
            randomAccessFile.readFully(cityBytes);
            String fixedCity = new String (cityBytes);

            //read fixedState
            byte[] stateBytes = new byte[2];
            randomAccessFile.readFully(stateBytes);
            String fixedState = new String (stateBytes);

            //read fixedZip
            byte[] zipBytes = new byte[5];
            randomAccessFile.readFully(zipBytes);
            String fixedZip = new String (zipBytes);

            pointerPosition += RECORD_SIZE;

            address = new Address(fixedName, fixedStreet, fixedCity, fixedState, fixedZip);
        }
        catch (EOFException e){
            return null;
        }

        return address;
    }

    public Address readLastRecord() throws IOException{
        Address address;

        randomAccessFile.seek(randomAccessFile.length() - RECORD_SIZE);

        try {
            byte[] nameBytes = new byte[32];
            randomAccessFile.readFully(nameBytes);
            String fixedName = new String(nameBytes);

            //read fixedStreet
            byte[] streetBytes = new byte[32];
            randomAccessFile.readFully(streetBytes);
            String fixedStreet = new String (streetBytes);

            //read fixedCity
            byte[] cityBytes = new byte[20];
            randomAccessFile.readFully(cityBytes);
            String fixedCity = new String (cityBytes);

            //read fixedState
            byte[] stateBytes = new byte[2];
            randomAccessFile.readFully(stateBytes);
            String fixedState = new String (stateBytes);

            //read fixedZip
            byte[] zipBytes = new byte[5];
            randomAccessFile.readFully(zipBytes);
            String fixedZip = new String (zipBytes);

            pointerPosition += RECORD_SIZE;

            address = new Address(fixedName, fixedStreet, fixedCity, fixedState, fixedZip);
        }
        catch (EOFException e){
            return null;
        }

        return address;
    }

    public void updateRecord(Address address) throws IOException{
        randomAccessFile.seek(pointerPosition - RECORD_SIZE);

        randomAccessFile.writeBytes(address.getFixedName());
        randomAccessFile.writeBytes(address.getFixedStreet());
        randomAccessFile.writeBytes(address.getFixedCity());
        randomAccessFile.writeBytes(address.getFixedState());
        randomAccessFile.writeBytes(address.getFixedZip());
    }

    public long getPointerPosition() {
        return pointerPosition;
    }

    public void setPointerPosition(long pointerPosition) {
        this.pointerPosition = pointerPosition;
    }

    public RandomAccessFile getRandomAccessFile() {
        return randomAccessFile;
    }

    @Override
    public void close() throws Exception {
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }
}
