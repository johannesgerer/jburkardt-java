import java.util.Date;

//
//  Licensing:
//
//    This code is distributed under the GNU LGPL license.
//
//  Modified:
//
//    27 June 2008
//
//  Author:
//
//    John Burkardt
//
public class math_intrinsics
{
  public static void main ( String[] args )
  {
    Date date;

    date = new Date ( );
    System.out.println ( " " );
    System.out.println ( "  " + date );

    System.out.println ( " " );
    System.out.println ( "MATH_INTRINSICS" );
    System.out.println ( "  Demonstrate math library intrinsic functions." );

    test01 ( );
    test02 ( );
    test03 ( );
    test04 ( );
    test05 ( );
    test06 ( );
    test07 ( );
    test08 ( );
    test09 ( );
    test10 ( );
    test11 ( );
    test12 ( );
    test13 ( );
    test14 ( );
    test15 ( );
    test16 ( );
    test17 ( );
    test18 ( );
    test19 ( );
    test20 ( );
    test21 ( );
    test22 ( );
    test23 ( );

    System.out.println ( " " );
    System.out.println ( "MATH_INTRINSICS" );
    System.out.println ( "  Normal end of execution." );

    date = new Date ( );
    System.out.println ( " " );
    System.out.println ( "  " + date );
  }
  public static void test01 ( )
  {
    double e_double  = 2.718281828459045;
    double pi_double = 3.141592653589793;

    System.out.println ( " " );
    System.out.println ( "TEST01" );
    System.out.println ( "  Demonstrate the constants E and PI." );
    System.out.println ( " " );
    System.out.println ( "     E = 2.718281828459045..." );
    System.out.println ( " " );
    System.out.println ( "     Stored as a double precision value:" );
    System.out.println ( " " );
    System.out.println ( "     E = " + e_double );
    System.out.println ( " " );
    System.out.println ( "     From Math.E:" );
    System.out.println ( " " );
    System.out.println ( "     E = " + Math.E );
    System.out.println ( " " );
    System.out.println ( " " );
    System.out.println ( "     Pi = 3.141592653589793..." );
    System.out.println ( " " );
    System.out.println ( "     Stored as a double precision value:" );
    System.out.println ( " " );
    System.out.println ( "     Pi = " + pi_double );
    System.out.println ( " " );
    System.out.println ( "     From Math.PI:" );
    System.out.println ( " " );
    System.out.println ( "     Pi = " + Math.PI );
    System.out.println ( " " );

  }
  public static void test02 ( )
  {
    double x;
    double y;

    System.out.println ( " " );
    System.out.println ( "TEST02" );
    System.out.println ( "  Demonstrate the use of Math.abs()." );
    System.out.println ( " " );
    System.out.println ( "     X     Math.abs ( X )" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x = 200 * Math.random ( ) - 100;
      y = Math.abs ( x );
      System.out.println ( "  " + x + "  " + y );
    }
  }
  public static void test03 ( )
  {
    double a;
    double c1;
    double c2;

    System.out.println ( " " );
    System.out.println ( "TEST03" );
    System.out.println ( "  Demonstrate the use of Math.acos()." );
    System.out.println ( " " );
    System.out.println ( "     C     Math.acos ( C )    C-cos(acos(C))" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      c1 = 2.0 * Math.random ( ) - 1.0;
      a = Math.acos ( c1 );
      c2 = Math.cos ( a );
      System.out.println ( "  " + c1 + "  " + a + "  " + ( c1 - c2 ) );
    }
  }
  public static void test04 ( )
  {
    double a;
    double s1;
    double s2;

    System.out.println ( " " );
    System.out.println ( "TEST04" );
    System.out.println ( "  Demonstrate the use of Math.asin()." );
    System.out.println ( " " );
    System.out.println ( "     S     Math.asin ( S )    S-sin(asin(S))" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      s1 = 2.0 * Math.random ( ) - 1.0;
      a = Math.asin ( s1 );
      s2 = Math.sin ( a );
      System.out.println ( "  " + s1 + "  " + a + "  " + ( s1 - s2 ) );
    }
  }
  public static void test05 ( )
  {
    double a;
    double t1;
    double t2;

    System.out.println ( " " );
    System.out.println ( "TEST05" );
    System.out.println ( "  Demonstrate the use of Math.atan()." );
    System.out.println ( " " );
    System.out.println ( "     T     Math.atan ( T )    T-tan(atan(T))" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      t1 = 2.0 * Math.random ( ) - 1.0;
      a = Math.atan ( t1 );
      t2 = Math.tan ( a );
      System.out.println ( "  " + t1 + "  " + a + "  " + ( t1 - t2 ) );
    }
  }
  public static void test06 ( )
  {
    double a;
    double t2;
    double x;
    double y;

    System.out.println ( " " );
    System.out.println ( "TEST06" );
    System.out.println ( "  Demonstrate the use of Math.atan2()." );
    System.out.println ( " " );
    System.out.println ( "     Y, X     Math.atan2 ( Y,X )    Y-X*tan(atan2(Y,X))" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      y = 10.0 * Math.random ( ) - 5.0;
      x = 10.0 * Math.random ( ) - 5.0;
      a = Math.atan2 ( y, x );
      t2 = Math.tan ( a );
      System.out.println ( "  " + y + "  " + x + "  " + a + "  " + ( y - x * t2 ) );
    }
  }
  public static void test07 ( )
  {
    double x1;
    double x2;
    double x3;

    System.out.println ( " " );
    System.out.println ( "TEST07" );
    System.out.println ( "  Demonstrate the use of Math.ceil" );
    System.out.println ( "     X     Math.ceil ( X )  Math.ceil(X)-X" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x1 = 100.0 * Math.random ( ) - 50.0;
      x2 = Math.ceil ( x1 );
      x3 = x2 - x1;
      System.out.println ( "  " + x1 + "  " + x2 + "  " + x3 );
    }
  }
  public static void test08 ( )
  {
    double a;
    double c;

    System.out.println ( " " );
    System.out.println ( "TEST08" );
    System.out.println ( "  Demonstrate the use of Math.cos" );
    System.out.println ( "     A     Math.cos ( A )" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      a = i * 2.0 * Math.PI / 12;
      c = Math.cos ( a );
      System.out.println ( "  " + a + "  " + c );
    }
  }
  public static void test09 ( )
  {
    double x1;
    double x2;
    double x3;

    System.out.println ( " " );
    System.out.println ( "TEST09" );
    System.out.println ( "  Demonstrate the use of Math.exp" );
    System.out.println ( "     X     Math.exp ( X )   X-log(exp(X))" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      x1 = 100.0 * Math.random ( ) - 50.0;
      x2 = Math.exp ( x1 );
      x3 = x1 - Math.log ( x2 );
      System.out.println ( "  " + x1 + "  " + x2 + "  " + x3 );
    }
  }
  public static void test10 ( )
  {
    double x1;
    double x2;
    double x3;

    System.out.println ( " " );
    System.out.println ( "TEST10" );
    System.out.println ( "  Demonstrate the use of Math.floor" );
    System.out.println ( "     X     Math.floor ( X )  X-Math.floor(X)" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x1 = 100.0 * Math.random ( ) - 50.0;
      x2 = Math.floor ( x1 );
      x3 = x1 - x2;
      System.out.println ( "  " + x1 + "  " + x2 + "  " + x3 );
    }
  }
  public static void test11 ( )
  {
    double x;
    double y;
    double z;

    System.out.println ( " " );
    System.out.println ( "TEST11" );
    System.out.println ( "  Demonstrate the use of Math.IEEEremainder()." );
    System.out.println ( " " );
    System.out.println ( "     X        Y        IEEEremainder ( X, Y )" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x = 10.0 * Math.random ( ) - 5.0;
      y = 10.0 * Math.random ( ) - 5.0;
      z = Math.IEEEremainder ( x, y );
      System.out.println ( "  " + x + "  " + y + "  " + z );
    }
  }
  public static void test12 ( )
  {
    double x1;
    double x2;
    double x3;

    System.out.println ( " " );
    System.out.println ( "TEST12" );
    System.out.println ( "  Demonstrate the use of Math.log" );
    System.out.println ( "     X     Math.log ( X )   X-exp(log(X))" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      x1 = 100.0 * Math.random ( );
      x2 = Math.log ( x1 );
      x3 = x1 - Math.exp ( x2 );
      System.out.println ( "  " + x1 + "  " + x2 + "  " + x3 );
    }
  }
  public static void test13 ( )
  {
    double x;
    double y;
    double z;

    System.out.println ( " " );
    System.out.println ( "TEST13" );
    System.out.println ( "  Demonstrate the use of Math.max()." );
    System.out.println ( " " );
    System.out.println ( "     X        Y        Math.max(X,Y)" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x = 10.0 * Math.random ( ) - 5.0;
      y = 10.0 * Math.random ( ) - 5.0;
      z = Math.max ( x, y );
      System.out.println ( "  " + x + "  " + y + "  " + z );
    }
  }
  public static void test14 ( )
  {
    double x;
    double y;
    double z;

    System.out.println ( " " );
    System.out.println ( "TEST14" );
    System.out.println ( "  Demonstrate the use of Math.min()." );
    System.out.println ( " " );
    System.out.println ( "     X        Y        Math.min(X,Y)" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x = 10.0 * Math.random ( ) - 5.0;
      y = 10.0 * Math.random ( ) - 5.0;
      z = Math.min ( x, y );
      System.out.println ( "  " + x + "  " + y + "  " + z );
    }
  }
  public static void test15 ( )
  {
    double x;
    double y;
    double z;

    System.out.println ( " " );
    System.out.println ( "TEST15" );
    System.out.println ( "  Demonstrate the use of Math.pow()." );
    System.out.println ( " " );
    System.out.println ( "     X        Y        Math.pow(X,Y)" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x = 10.0 * Math.random ( );
      y = 10.0 * Math.random ( ) - 5.0;
      z = Math.pow ( x, y );
      System.out.println ( "  " + x + "  " + y + "  " + z );
    }
  }
  public static void test16 ( )
  {
    double x;

    System.out.println ( " " );
    System.out.println ( "TEST16" );
    System.out.println ( "  Demonstrate the use of Math.random()." );
    System.out.println ( " " );
    System.out.println ( "     Math.random()" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x = Math.random ( );
      System.out.println ( "  " + x );
    }
  }
  public static void test17 ( )
  {
    double x1;
    double x2;

    System.out.println ( " " );
    System.out.println ( "TEST17" );
    System.out.println ( "  Demonstrate the use of Math.rint" );
    System.out.println ( "     X     Math.rint ( X )" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x1 = 100.0 * Math.random ( ) - 50.0;
      x2 = Math.rint ( x1 );
      System.out.println ( "  " + x1 + "  " + x2 );
    }
  }
  public static void test18 ( )
  {
    double x1;
    long x2;

    System.out.println ( " " );
    System.out.println ( "TEST18" );
    System.out.println ( "  Demonstrate the use of Math.round" );
    System.out.println ( "     X     Math.round ( X )" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x1 = 100.0 * Math.random ( ) - 50.0;
      x2 = Math.round ( x1 );
      System.out.println ( "  " + x1 + "  " + x2 );
    }
  }
  public static void test19 ( )
  {
    double a;
    double s;

    System.out.println ( " " );
    System.out.println ( "TEST19" );
    System.out.println ( "  Demonstrate the use of Math.sin" );
    System.out.println ( "     A     Math.sin ( A )" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      a = i * 2.0 * Math.PI / 12;
      s = Math.sin ( a );
      System.out.println ( "  " + a + "  " + s );
    }
  }
  public static void test20 ( )
  {
    double x1;
    double x2;
    double x3;

    System.out.println ( " " );
    System.out.println ( "TEST20" );
    System.out.println ( "  Demonstrate the use of Math.sqrt" );
    System.out.println ( "     X     Math.sqrt ( X )   X-sqrt(X)*sqrt(X)" );
    System.out.println ( " " );

    for ( int i = 1; i <= 10; i++ )
    {
      x1 = 100.0 * Math.random ( );
      x2 = Math.sqrt ( x1 );
      x3 = x1 - x2 * x2;
      System.out.println ( "  " + x1 + "  " + x2 + "  " + x3 );
    }
  }
  public static void test21 ( )
  {
    double a;
    double t;

    System.out.println ( " " );
    System.out.println ( "TEST21" );
    System.out.println ( "  Demonstrate the use of Math.tan" );
    System.out.println ( "     A     Math.tan ( A )" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      a = i * 2.0 * Math.PI / 12;
      t = Math.tan ( a );
      System.out.println ( "  " + a + "  " + t );
    }
  }
  public static void test22 ( )
  {
    double a1;
    double a2;
    double a3;

    System.out.println ( " " );
    System.out.println ( "TEST22" );
    System.out.println ( "  Demonstrate the use of Math.toDegrees" );
    System.out.println ( "     A     Math.toDegrees ( A )  A - toRadians(toDegrees(A))" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      a1 = i * 2.0 * Math.PI / 12;
      a2 = Math.toDegrees ( a1 );
      a3 = a1 - Math.toRadians ( a2 );
      System.out.println ( "  " + a1 + "  " + a2 + "  " + a3 );
    }
  }
  public static void test23 ( )
  {
    double a1;
    double a2;
    double a3;

    System.out.println ( " " );
    System.out.println ( "TEST23" );
    System.out.println ( "  Demonstrate the use of Math.toRadians" );
    System.out.println ( "     A     Math.toRadians ( A )  A - toDegrees(toRadians(A))" );
    System.out.println ( " " );

    for ( int i = 0; i <= 12; i++ )
    {
      a1 = i * 360.0 / 12;
      a2 = Math.toRadians ( a1 );
      a3 = a1 - Math.toDegrees ( a2 );
      System.out.println ( "  " + a1 + "  " + a2 + "  " + a3 );
    }
  }
}
