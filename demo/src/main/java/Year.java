public class Year {
    private int year;

    public int getYear() {
        return year;
    }

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear(){
        boolean isLeapYear = true;

        if(year%4 != 0){
            isLeapYear = false;
        }else if(year%100 != 0){
            isLeapYear = true;
        }else if(year%400 != 0){
            isLeapYear = false;
        }
        return isLeapYear;
    }

    public Year getNextYear(){
        return new Year(year+1);
    }
}
