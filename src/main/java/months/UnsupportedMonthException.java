package months;

public class UnsupportedMonthException extends RuntimeException {

    int invalidMonth;

    public int getInvalidMonthNumber() {
        return invalidMonth;
    }

    public UnsupportedMonthException(int number) {
        super("Error occurred while parsing " + number + " to Month");
    }



}
