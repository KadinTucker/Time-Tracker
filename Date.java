

/**
 * The Date object, storing the date
 * Consists of a year, month, and day
 * TODO: account for leap years
 */
public class Date {

    ///The names of the months according to the indices of month stored in a Date object
    ///Note: January is the 0th month
    public static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    ///The number of days in each month (on a non-leap year)
    public static final int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

    private int month; ///The month of this date
    private int day; ///The day of the month of this date
    private int year; ///The year of this date

    /**
     * Constructs a Date object on the given day, month, and year
     */
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Given a year, returns whether or not it is a leap year in the Gregorian calendar
     */
    public static boolean isLeapYear(int year) {
        return !(year % 400 != 0 && year % 100 == 0) && year % 4 == 0;
    }

    /**
     * Setter method for month
     * TODO: account for when changing the month would result in an impossible date, e.g. 31 February
     */
    public void setMonth(int month) {
        this.month = month % 12;
    }

    /**
     * Setter method for the day
     * TODO: see todo for setMonth()
     */
    public void setDay(int day) {
        this.day = day % monthLengths[this.month];
    }

    /**
     * Setter method for the year
     */
    public void setYear(int year) {
        this.day = year;
    }

    /** 
     * Getter method for the month
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Getter method for the day
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Getter method for the year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Returns a string representation of the date, with the format:
     * <d> Month <y>
     */
    public String toString() {
        return day + " " + months[month] + " " + year;
    }
    
}