package b.a.a.a.b.f;

import b.a.a.a.o.a;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class b
{
  public static final TimeZone a;
  private static final String[] b;
  private static final Date c;
  
  static
  {
    int i = 1;
    Object localObject = new String[3];
    localObject[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    localObject[i] = "EEE, dd-MMM-yy HH:mm:ss zzz";
    localObject[2] = "EEE MMM d HH:mm:ss yyyy";
    b = (String[])localObject;
    a = TimeZone.getTimeZone("GMT");
    localObject = Calendar.getInstance();
    TimeZone localTimeZone = a;
    ((Calendar)localObject).setTimeZone(localTimeZone);
    ((Calendar)localObject).set(2000, 0, i, 0, 0, 0);
    ((Calendar)localObject).set(14, 0);
    c = ((Calendar)localObject).getTime();
  }
  
  public static Date a(String paramString, String[] paramArrayOfString)
  {
    return a(paramString, paramArrayOfString, null);
  }
  
  public static Date a(String paramString, String[] paramArrayOfString, Date paramDate)
  {
    int i = 1;
    Object localObject = "Date value";
    a.a(paramString, (String)localObject);
    label21:
    int k;
    if (paramArrayOfString != null)
    {
      if (paramDate == null) {
        break label152;
      }
      int j = paramString.length();
      if (j > i)
      {
        localObject = "'";
        boolean bool = paramString.startsWith((String)localObject);
        if (bool)
        {
          localObject = "'";
          bool = paramString.endsWith((String)localObject);
          if (bool)
          {
            k = paramString.length() + -1;
            paramString = paramString.substring(i, k);
          }
        }
      }
      int m = paramArrayOfString.length;
      i = 0;
      label89:
      if (i >= m) {
        break label170;
      }
      localObject = b.a.a(paramArrayOfString[i]);
      ((SimpleDateFormat)localObject).set2DigitYearStart(paramDate);
      ParsePosition localParsePosition = new java/text/ParsePosition;
      localParsePosition.<init>(0);
      localObject = ((SimpleDateFormat)localObject).parse(paramString, localParsePosition);
      int n = localParsePosition.getIndex();
      if (n == 0) {
        break label159;
      }
    }
    for (;;)
    {
      return (Date)localObject;
      paramArrayOfString = b;
      break;
      label152:
      paramDate = c;
      break label21;
      label159:
      k = i + 1;
      i = k;
      break label89;
      label170:
      k = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\f\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */