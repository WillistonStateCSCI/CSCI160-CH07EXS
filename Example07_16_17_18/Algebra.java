/* Algebra class
   Anderson, Franceschi
*/
public class Algebra
{
  /**
   * gcd static method: computes and returns the gcd of a and b
   * @param a an int
   * @param b an int
   * @return an int, the gcd of a and b
   */
  public static int gcd( int a, int b )
  {
    // convert a and b to positive integers
    a = Math.max( a, -a );
    b = Math.max( b, -b );

    if( b == 0 )
      return a;
    else
    {
      int r = a % b;
      while( r != 0 )
      {
        a = b;
        b = r;
        r = a % b;
      }
      return b;
    }
  }
}
