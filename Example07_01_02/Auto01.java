/* Auto class, version 1
   Anderson, Franceschi
*/

/*
Our default constructor does not set values for the
milesDriven and gallonsOfGas instance variables. Because ints and doubles
are autoinitialized to 0 and 0.0, respectively, we just accept those default
values.

However, it is necessary for our constructor to set the model instance
variable to a valid String value. Because Strings are object references, they
are autoinitialized to null. Any attempt to call a method using the model
instance variable with a null value would generate a NullPointerException.

As mentioned earlier, you can provide multiple constructors for a class. We
provide a second constructor that lets the client set initial
values for all the instance variables. 

When we provide multiple constructors, we are overloading a method. To
overload a method, we provide a method with the same name but with a
different number of parameters, or with the same number of parameters but
with at least one parameter having a different data type. The name of the
method, along with the number, data types, and order of its parameters, is
called the method’s signature. 

Thus, to overload a method, the new method
must have a different signature. Notice that the return type is not part of the
signature.

When a client calls a method that is overloaded, Java determines which
version of the method to execute by looking at the number, data types, and
order of the arguments in the method call. 
*/

public class Auto01
{
    // instance variables
    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    // Default constructor:
    //  initializes model to "unknown";
    //  milesDriven is auto-initialized to 0
    //        and gallonsOfGas to 0.0
    public Auto01( )
    {
       model = "unknown";
    }    

    // Overloaded constructor:
    // allows client to set beginning values for
    //   model, milesDriven, and gallonsOfGas.
    public Auto01( String startModel,
                 int startMilesDriven,
                 double startGallonsOfGas )
    {
       model = startModel;

       // validate startMiles parameter
       if ( startMilesDriven >= 0 )
           milesDriven = startMilesDriven;
       
       // validate startGallonsOfGas parameter
       if ( startGallonsOfGas >= 0.0 )
           gallonsOfGas = startGallonsOfGas;
    }
}
