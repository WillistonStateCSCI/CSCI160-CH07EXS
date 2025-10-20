/* Auto Client, version 6
   Anderson, Franceschi
*/

public class AutoClient06
{
   public static void main( String [] args )
   {
      Auto06 sporty = new Auto06( "Spyder", 0, 0.0 );
      System.out.println( sporty.toString( ) );

      Auto06 compact = new Auto06( "Accent", 0, 0.0 );
      System.out.println( );
      System.out.println( compact );

      if ( compact.equals( sporty ) )
        System.out.println( "\nsporty and compact are equal" );
      else
        System.out.println( "\nsporty and compact are not equal" );
   }
}
