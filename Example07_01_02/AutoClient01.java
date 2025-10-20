/* Auto Client, Version 1
   Anderson, Franceschi
*/

/*
Line 22 causes the default constructor to be called because no arguments
are passed to the constructor. Line 25 causes the overloaded constructor to
be called because it passes three arguments to the constructor. If the client
attempted to instantiate a new object with a number of parameters other
than 0 or 3, the compiler would generate an error because there is no
constructor that matches those arguments. In general, the arguments sent to
an overloaded method must match the formal parameters of some version of
that method.

*/

public class AutoClient01
{
   public static void main( String [] args )
   {
      System.out.println( "Instantiate sedan" );
      Auto01 sedan = new Auto01( );

      System.out.println( "\nInstantiate suv" );
      Auto01 suv = new Auto01( "Trailblazer", 7000, 437.5 );

      System.out.println( "\nInstantiate mini" );
      // attempt to set invalid value for gallons of gas
      Auto01 mini = new Auto01( "Mini Cooper", 200, -1.0 );
   }
}
