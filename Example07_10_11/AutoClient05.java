/* Auto Client, Version 5
   Anderson, Franceschi
*/

public class AutoClient05
{
   public static void main( String [] args )
   {
      Auto05 car = new Auto05( );
      System.out.println( "car is " + car );        
      car.setGallonsOfGas( 3.4 ).setMilesDriven( 67 );

      int carMiles = car.getMilesDriven( );
      double carGallons = car.getGallonsOfGas( );

      System.out.println( "Miles driven is " + carMiles
                   + "\nGallons of gas is " + carGallons );
   }
}
