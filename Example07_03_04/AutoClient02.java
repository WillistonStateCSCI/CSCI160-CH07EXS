/* Auto Client, version 2
   Anderson, Franceschi
*/

/*
Because the sedan object was instantiated by calling the default constructor,
its model is unknown and the miles driven and gallons of gas are set to
default values. On the other hand, the suv object data reflects the values sent
to the overloaded constructor when the suv object was instantiated.
Thus, Version 2 of our Auto class lets our clients instantiate objects and get
the values of the instance variables
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
