/* RationalClient class
   Anderson, Franceschi
*/
public class RationalClient
{
  public static void main( String [] args )
  {
    Rational r1 = new Rational( 5, 3 );
    System.out.println( "r1 = " + r1 );
    Rational r2 = new Rational( 7 );
    System.out.println( "r2 = " + r2 );
    Rational r3 = new Rational( );
    System.out.println( "r3 = " + r3 );
    Rational r4 = new Rational( 5, -7 );
    System.out.println( "r4 = " + r4 );

    int g = Algebra.gcd( 1635, 75 );
    System.out.println( "gcd( 1635, 75 ) = " + g );
    g = Algebra.gcd( 7 * 11 * 13, 3 * 7 * 11 );
    System.out.println( "gcd( 7 * 11 * 13, 3 * 7 * 11 ) = " + g );

    Rational r5 = new Rational( 25, 10 );
    System.out.println( "r5 = " + r5 );
    r5.simplify( );
    System.out.println( "In lowest terms, r5 = " + r5 );

    Rational r6 = new Rational( 3 * 7 * 11 * 10, -7 * 11 * 23 );
    System.out.println( "r6 = " + r6 );
    r6.simplify( );
    System.out.println( "In lowest terms, r6 = " + r6 );

    Rational r7 = new Rational( 5, 3 );
    Rational r8 = new Rational( 6, 4 );
    Rational r9 = r7.add( r8 );
    r9.simplify( );
    System.out.println( r7 + " + " + r8 + " = " + r9 );

    Rational r10 = r7.multiply( r8 );
    r10.simplify( );
    System.out.println( r7 + " * " + r8 + " = " + r10 );
  }
}
