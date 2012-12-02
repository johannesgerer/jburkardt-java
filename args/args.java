import java.util.Date;

//
//  Licensing:
//
//    This code is distributed under the GNU LGPL license.
//
//  Modified:
//
//    30 June 2008
//
//  Author:
//
//    John Burkardt
//

public class args
{
  public static void main ( String[] args )
  {
    Date date;

    date = new Date ( );
    System.out.println ( " " );
    System.out.println ( "  " + date );

    System.out.println ( " " );
    System.out.println ( "ARGS:" );
    System.out.println ( "  Demonstrate command line argument retrieval." );

    System.out.println ( " " );
    System.out.println ( "  Number of command line arguments is " + args.length );

    System.out.println ( " " );
    for ( String s: args ) 
    {
      System.out.println ( s );
    }
    System.out.println ( " " );
    System.out.println ( "ARGS:" );
    System.out.println ( "  Normal end of execution." );

    date = new Date ( );
    System.out.println ( " " );
    System.out.println ( "  " + date );

  }
}
