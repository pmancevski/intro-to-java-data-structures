package Exercise12_9;

public class BinaryFormatException extends Exception {
    private String message;

    public BinaryFormatException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
