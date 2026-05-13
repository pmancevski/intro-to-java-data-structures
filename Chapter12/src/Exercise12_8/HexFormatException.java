package Exercise12_8;

public class HexFormatException extends Exception {
    private String message;

    public HexFormatException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
