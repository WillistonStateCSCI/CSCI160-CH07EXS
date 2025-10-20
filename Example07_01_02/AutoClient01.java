/* Auto Client, Version 1
   Anderson, Franceschi
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
