/* Auto Client, version 2
   Anderson, Franceschi
*/

public class AutoClient02
{
    public static void main( String [] args )
    {
        Auto02 sedan = new Auto02( );
        String sedanModel = sedan.getModel( );
        int sedanMiles = sedan.getMilesDriven( );
        double sedanGallons = sedan.getGallonsOfGas( );
        System.out.println( "sedan: model is " + sedanModel
                   + "\n miles driven is " + sedanMiles
                   + "\n gallons of gas is " + sedanGallons );

        Auto02 suv = new Auto02( "Trailblazer", 7000, 437.5 );
        String suvModel = suv.getModel( );
        int suvMiles = suv.getMilesDriven( );
        double suvGallons = suv.getGallonsOfGas( );
        System.out.println( "suv: model is " + suvModel
                   + "\n miles driven is " + suvMiles
                   + "\n gallons of gas is " + suvGallons );
    }
}
