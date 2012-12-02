import java.text.DateFormat;
import java.util.Date;

public class timestamp
{
  public static void main ( String[] args )
  {
    Date now = new Date ( );

    System.out.println ( 
      DateFormat.getDateTimeInstance ( DateFormat.LONG, DateFormat.LONG ).format(now) );
  }
}
