package org.apache.http.protocol;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class HttpDateGenerator
{
  public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
  public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
  private long dateAsLong = 0L;
  private String dateAsText = null;
  private final DateFormat dateformat;
  
  public HttpDateGenerator()
  {
    Object localObject = new java/text/SimpleDateFormat;
    Locale localLocale = Locale.US;
    ((SimpleDateFormat)localObject).<init>("EEE, dd MMM yyyy HH:mm:ss zzz", localLocale);
    this.dateformat = ((DateFormat)localObject);
    localObject = this.dateformat;
    TimeZone localTimeZone = GMT;
    ((DateFormat)localObject).setTimeZone(localTimeZone);
  }
  
  public String getCurrentDate()
  {
    try
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.dateAsLong;
      l2 = l1 - l2;
      long l3 = 1000L;
      boolean bool = l2 < l3;
      if (bool)
      {
        Object localObject1 = this.dateformat;
        Date localDate = new java/util/Date;
        localDate.<init>(l1);
        localObject1 = ((DateFormat)localObject1).format(localDate);
        this.dateAsText = ((String)localObject1);
        this.dateAsLong = l1;
      }
      String str = this.dateAsText;
      return str;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpDateGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */