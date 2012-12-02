public class collatz_count
{
  public static void main ( String[] args )
  {
    int n = Integer.parseInt ( args[0] );

    int count = 0;
    System.out.print ( n + "  " );

    while ( 1 < n )
    {
      if ( n % 2 == 0 )
      {
        n = n / 2;
      }
      else
      {
        n = 3 * n + 1;
      }
      count = count + 1;
    }
    System.out.println ( count );
  }
}
