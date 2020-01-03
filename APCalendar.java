public class APCalendar {

    public static void main(String args[]) {
        System.out.println(isLeapYear(2020));
    }
   /*
    * @return true if year is a leap year and false otherwise
    */
   private static boolean isLeapYear(int year) {
      // implementation not shown
      if(year % 4 != 0) {
          return false;
      } else if(year % 100 != 0) {
          return true;
      } else if(year % 400 != 0) {
          return false;
      } else {
          return true;
      }
   }

   /**
    * @return the number of leap years between year1 and year2, inclusive
    *
    * Precondition: 0 <= year1 <= year2
    */
   public static int numberOfLeapYears(int year1, int year2) {
      // to be implemented by you in part A
      int numberOfLeapYears = 0;
      for(int i = year1; i <= year2; i ++) {
          if(isLeapYear(i)) {
              numberOfLeapYears ++;
          }
      }
      return numberOfLeapYears;
   }

   /*
    * @return the value representing the day of the week for the first day of the year
    *         where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday
    */
   private static int firstDayOfYear(int year) {
      // implementation not shown
      int leapYears = numberOfLeapYears(1, year);
      int firstDay = 1;
      firstDay = year + leapYears;
      return firstDay;
   }

   /*
    * @return n, where month, day, and year specify the nth day of the year
    *         (returns 1 for January 1 -- month = 1, day = 1 -- of any year)
    *
    * Precondition: the data represented by month, day, and year is a valid date
    */
   private static int dayOfYear(int month, int day, int year) {
      // implementation not shown
      if(isLeapYear(year)) {
          int days ? (month == 1) : 0 ? (month == 2) : 31 ? (month == 3) : 61 ? (month == 4) : 92 ? (month == 5) : 122 ?
          (month == 6) : 153 ? (month == 7) : 183 ? (month == 8) : 214 ? (month == 9) : 245 ? (month == 10) : 275 ?
          (month == 11) : 306 ? (month == 12) : 336;

      } else {
          int days ? (month == 1) : 0 ? (month == 2) : 31 ? (month == 3) : 61 ? (month == 4) : 92 ? (month == 5) : 122 ?
          (month == 6) : 153 ? (month == 7) : 183 ? (month == 8) : 214 ? (month == 9) : 245 ? (month == 10) : 275 ?
          (month == 11) : 306 ? (month == 12) : 336;
          if (month > 3) {
              days --;
          }
      }
      days += day;
      return days;
   }

   /**
    * @return the value representing the day of the week for a given date
    *         (month, day, yes ear), where 0 denotes Sunday, 1 denotes Monday, ...,
    *         and 6 denotes Saturday
    *
    * Precondition: the date represented by month, day, year is a valid date
    */
   public static int dayOfWeek(int month, int day, int year) {
      // to be implemented by you in part B
      int dayOfWeek = dayOfYear + firstDayOfYear;
      dayOfWeek %= 6;
      return dayOfWeek;
   }

   // there may be instance variables, constructors, and other methods not shown
}
