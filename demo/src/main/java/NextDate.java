public class NextDate {
    public static void main(String[] args) {
        // Test the nextDate function
        int day = 31;
        int month = 12;
        int year = 2023;

        System.out.println("Current date: " + day + "/" + month + "/" + year);
        int[] nextDate = nextDate(day, month, year);
        System.out.println("Next date: " + nextDate[0] + "/" + nextDate[1] + "/" + nextDate[2]);
    }

    public static int[] nextDate(int day, int month, int year) {
        // Check if the input date is valid
        if (!isValidDate(day, month, year)) {
            System.out.println("Invalid date input.");
            return null;
        }

        // Array to store the next date
        int[] nextDate = new int[3];

        // Increment the day
        if (day < daysInMonth(month, year)) {
            nextDate[0] = day + 1;
            nextDate[1] = month;
            nextDate[2] = year;
        } else { // Next day is in the next month
            nextDate[0] = 1;
            if (month < 12) { // Next month is within the same year
                nextDate[1] = month + 1;
                nextDate[2] = year;
            } else { // Next month is January of the next year
                nextDate[1] = 1;
                nextDate[2] = year + 1;
            }
        }

        return nextDate;
    }

    public static boolean isValidDate(int day, int month, int year) {
        // Check if the year, month, and day are within valid ranges
        if (year < 1812 || year > 2023 || month < 1 || month > 12 || day < 1 || day > daysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    public static int daysInMonth(int month, int year) {
        // Return the number of days in a given month and year
        switch (month) {
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11: // April, June, September, November
                return 30;
            default: // January, March, May, July, August, October, December
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        // Check if the year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
