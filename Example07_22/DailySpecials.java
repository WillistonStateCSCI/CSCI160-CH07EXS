/** Specials of the Day
    Anderson Franceschi
*/

import java.util.Scanner;

public class DailySpecials
{
  public enum Days { SUN, MON, TUE, WED, THUR, FRI, SAT };

  public static void main( String [] args )
  {
    Scanner scan = new Scanner( System.in );

    System.out.print( "Enter a day\n"
                      + "(Sun, Mon, Tue, Wed, Thur, Fri, Sat) > " );
    String inputDay = scan.next( ).toUpperCase( );
    Days day = Days.valueOf( inputDay );

    switch ( day )
    {
       case MON,WED -> System.out.println( "The special for "
                                 + day + " is barbeque chicken" );
       case TUE,THUR -> System.out.println( "The special for "
                                 + day + " is tacos" );
       case FRI -> System.out.println( "The special for "
                                 + day + " is fish fillet" );
       case SUN,SAT -> System.out.println( "Sorry, we're closed on "
                                 + day );
    }
    scan.close();
  }
}
