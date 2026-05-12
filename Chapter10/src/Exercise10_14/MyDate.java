package Exercise10_14;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){
        LocalDate localDate = LocalDate.now();
        this.year = localDate.getYear();
        // LocalDate getMonth() starts from 1
        this.month = localDate.getMonthValue() - 1;
        this.day = localDate.getDayOfMonth();
    }

    public MyDate(Long elapsedTime){
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(Long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
