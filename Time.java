
/**
 * A class representing time of day
 * Abstracts the hours and minutes to act as numbers modulo 24 and 60, respectively
 * Also includes the activity performed, beginning at this time, as an integer identifier
 */
public class Time {
    
    private int hour; ///The hour value of this time
    private int minute; ///The minute value of this time
    public int type; ///The activity performed starting at this time

    /**
     * Constructs a Time object of the given type,
     * with the given hour and minute
     */
    public Time(int hour, int minute, int type) {
        this.hour = hour % 24;
        this.minute = minute % 60;
    }

    /**
     * Setter method for hour
     */
    public void setHour(int hour) {
        this.hour = hour % 24;
    }

    /**
     * Getter method for hour
     */
    public int getHour() {
        return this.hour;
    }

    /**
     * Setter method for minute
     */
    public void setMinute(int minute) {
        this.minute = minute % 24;
    }

    /**
     * Getter method for minute
     */
    public int getMinute() {
        return this.minute;
    }

    /**
     * Returns how many minutes have elapsed from this time to the time given
     * If the time parameter is before this one, then it will return a negative value
     * Does not discriminate between dates, and acts as if both times are on the same date
     */
    public int getElapsed(Time next) {
        return 60 * (next.getHour() - this.hour) + next.getMinute() - this.minute;
    }

    /**
     * Returns a string representation of the time, according to the 24-hour clock
     * Does not include the activity occurring at this time
     */
    public String toString() {
        if (this.hour < 10) {
            return "0" + this.hour + ":" + this.minute;
        }
        return this.hour + ":" + this.minute;
    }

}