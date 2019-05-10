package org.apache.http.client.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.apache.http.util.Args;

public final class DateUtils
{
  private static final String[] DEFAULT_PATTERNS;
  private static final Date DEFAULT_TWO_DIGIT_YEAR_START;
  public static final TimeZone GMT;
  public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
  public static final String PATTERN_RFC1036 = "EEE, dd-MMM-yy HH:mm:ss zzz";
  public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
  
  static
  {
    int i = 1;
    Object localObject = new String[3];
    localObject[0] = "EEE, dd MMM yyyy HH:mm:ss zzz";
    localObject[i] = "EEE, dd-MMM-yy HH:mm:ss zzz";
    localObject[2] = "EEE MMM d HH:mm:ss yyyy";
    DEFAULT_PATTERNS = (String[])localObject;
    GMT = TimeZone.getTimeZone("GMT");
    localObject = Calendar.getInstance();
    TimeZone localTimeZone = GMT;
    ((Calendar)localObject).setTimeZone(localTimeZone);
    ((Calendar)localObject).set(2000, 0, i, 0, 0, 0);
    ((Calendar)localObject).set(14, 0);
    DEFAULT_TWO_DIGIT_YEAR_START = ((Calendar)localObject).getTime();
  }
  
  public static void clearThreadLocal() {}
  
  public static String formatDate(Date paramDate)
  {
    return formatDate(paramDate, "EEE, dd MMM yyyy HH:mm:ss zzz");
  }
  
  public static String formatDate(Date paramDate, String paramString)
  {
    Args.notNull(paramDate, "Date");
    Args.notNull(paramString, "Pattern");
    return DateUtils.DateFormatHolder.formatFor(paramString).format(paramDate);
  }
  
  public static Date parseDate(String paramString)
  {
    return parseDate(paramString, null, null);
  }
  
  public static Date parseDate(String paramString, String[] paramArrayOfString)
  {
    return parseDate(paramString, paramArrayOfString, null);
  }
  
  public static Date parseDate(String paramString, String[] paramArrayOfString, Date paramDate)
  {
    int i = 1;
    Object localObject = "Date value";
    Args.notNull(paramString, (String)localObject);
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
      localObject = DateUtils.DateFormatHolder.formatFor(paramArrayOfString[i]);
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
      paramArrayOfString = DEFAULT_PATTERNS;
      break;
      label152:
      paramDate = DEFAULT_TWO_DIGIT_YEAR_START;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\DateUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */