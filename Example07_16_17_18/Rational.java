/* Rational class
   Anderson, Franceschi
*/
public class Rational
{
  private int num;
  private int denom;

  /**
   * Default constructor; num is set to 0, denom is set to 1
   */
  public Rational( )
  {
    denom = 1;
  }

  /**
   * Overloaded constructor, denom is set to 1
   * @param num an int, the initial value for num
   */
  public Rational( int num )
  {
    denom = 1;
    setNum( num );
  }

  /**
   * Overloaded constructor
   * @param num an int, the initial value for num
   * @param denom an int, the initial value for denom
   */
  public Rational( int num, int denom )
  {
    this.denom = 1;
    setNum( num );
    setDenom( denom );
  }

  /**
   * Accessor for num
   * @return an int, the value of  num
   */
  public int getNum( )
  {
    return num;
  }

  /**
   * Accessor for denom
   * @return an int, the value of denom
   */
  public int getDenom( )
  {
    return denom;
  }

  /**
   * Mutator for num
   * @param num an int, the new value for num
   */
  public void setNum( int num )
  {
    this.num = num;
  }

  /**
   * Mutator for denom
   * @param denom an int, the new value for denom
   */
  public void setDenom( int denom )
  {
    if( denom != 0 )
    {
      this.denom = denom;
      if ( this.denom < 0 )
      {
        this.denom = -this.denom;
        this.num = -this.num;
      }
    }
  }

  /**
   * add method
   * @param r a Rational
   * @return a Rational, the sum of this Rational and r
   */
  public Rational add( Rational r )
  {
    Rational result = new Rational( );
    result.num = num * r.denom + denom * r.num;
    result.denom = denom * r.denom;
    return result;
  }

  /**
   * multiply method
   * @param r a Rational
   * @return a Rational, the product of this Rational and r
   */
  public Rational multiply( Rational r )
  {
    Rational result = new Rational( );
    result.num = num * r.num;
    result.denom = denom * r.denom;
    return result;
  }

  /**
   * simplify method; reduces this Rational to simplest terms
   */
  public void simplify( )
  {
    int g = Algebra.gcd( num, denom );
    num = num / g;
    denom = denom / g;
   }
   
  /**
   * toString method
   * @return a String, the fraction for this Rational
   */
  public String toString( )
  {
    String result = "" + num;
    if( num != 0 && denom != 1 )
      result += " / " + denom;
    return result;   
  }

  /**
   * equals method
   * @param o an Object
   * @return a boolean, true if this Rational is equal to o, 
   *                    false otherwise
   */
  public boolean equals( Object o )
  {
    if( o instanceof Rational objRational )
      return num * objRational.denom == objRational.num * denom;
    else
      return false;
  }
}
