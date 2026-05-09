package Exercise10_1;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time(){
        setTime(System.currentTimeMillis());
    }

    public Time(Long elapseTime){
        setTime(elapseTime);
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapseTime){
        long totalSeconds = elapseTime / 1000;
        this.second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

}
