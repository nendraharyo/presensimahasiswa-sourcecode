package org.apache.http.client.utils;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

final class DateUtils$DateFormatHolder
{
  private static final ThreadLocal THREADLOCAL_FORMATS;
  
  static
  {
    DateUtils.DateFormatHolder.1 local1 = new org/apache/http/client/utils/DateUtils$DateFormatHolder$1;
    local1.<init>();
    THREADLOCAL_FORMATS = local1;
  }
  
  public static void clearThreadLocal()
  {
    THREADLOCAL_FORMATS.remove();
  }
  
  public static SimpleDateFormat formatFor(String paramString)
  {
    Object localObject1 = (Map)((SoftReference)THREADLOCAL_FORMATS.get()).get();
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      localObject2 = THREADLOCAL_FORMATS;
      localObject3 = new java/lang/ref/SoftReference;
      ((SoftReference)localObject3).<init>(localObject1);
      ((ThreadLocal)localObject2).set(localObject3);
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      localObject1 = (SimpleDateFormat)((Map)localObject2).get(paramString);
      if (localObject1 == null)
      {
        localObject1 = new java/text/SimpleDateFormat;
        localObject3 = Locale.US;
        ((SimpleDateFormat)localObject1).<init>(paramString, (Locale)localObject3);
        localObject3 = TimeZone.getTimeZone("GMT");
        ((SimpleDateFormat)localObject1).setTimeZone((TimeZone)localObject3);
        ((Map)localObject2).put(paramString, localObject1);
      }
      return (SimpleDateFormat)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\DateUtils$DateFormatHolder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */