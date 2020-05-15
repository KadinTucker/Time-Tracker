import java.io.*;

/**
 * The main runner class for the project;
 * Handles file io and wrapping between class data and stored data in the form of strings
 */
class TimeReader {

    /**
     * Main method
     * Currently runs some testing operations
     */
    public static void main(final String[] args) throws IOException {
        System.out.println(readTimeString("w01:30"));
        Date today = new Date(4, 14, 2020);
        System.out.println(today);
    }

    /**
     * Creates a time object
     * Format: xhh:mm;
     * x is some letter which maps to an identifier
     * TODO: create some map from the character to a type identifier
     * TODO: make this an alternative ctor for Time?
     * TODO: throw error when time string format is invalid
     */
    public static Time readTimeString(String timeString) {
        String[] time = timeString.substring(1).split(":");
        char typeChar = timeString.charAt(0);
        int type = 0;
        if (typeChar == 'w')
            type = 1;
        else if (typeChar == 'c')
            type = 2;
        else if (typeChar == 'e')
            type = 3;
        else if (typeChar == 'l')
            type = 4;
        return new Time(Integer.parseInt(time[0]), Integer.parseInt(time[1]), type);
    }

}