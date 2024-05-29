public class Month {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    private int month;
    private Year year;

    public Month(int month, Year year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public Year getYear() {
        return year;
    }

    public int numberOfDays(){
        int numberOfDays = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numberOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numberOfDays = 30;
                break;
            case 2:
                if(year.isLeapYear()){
                    numberOfDays = 29;
                }else{
                    numberOfDays = 28;
                }
                break;
        }
        return numberOfDays;
    }

    public Month getNexMonth(){
        if(month<12){
            return new Month(month+1, year);
        }else{
            return new Month(1, year.getNextYear());
        }
    }
    
}
