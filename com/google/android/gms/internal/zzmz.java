package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class zzmz
{
  private static final Pattern zzaof = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
  private static final Pattern zzaog = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
  private static final Pattern zzaoh = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
  
  private static String decode(String paramString1, String paramString2)
  {
    if (paramString2 != null) {}
    for (;;)
    {
      try
      {
        return URLDecoder.decode(paramString1, paramString2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>(localUnsupportedEncodingException);
        throw localIllegalArgumentException;
      }
      paramString2 = "ISO-8859-1";
    }
  }
  
  public static Map zza(URI paramURI, String paramString)
  {
    int i = 2;
    Object localObject1 = Collections.emptyMap();
    Object localObject2 = paramURI.getRawQuery();
    if (localObject2 != null)
    {
      int j = ((String)localObject2).length();
      if (j > 0)
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        Scanner localScanner = new java/util/Scanner;
        localScanner.<init>((String)localObject2);
        localObject1 = "&";
        localScanner.useDelimiter((String)localObject1);
        for (;;)
        {
          boolean bool = localScanner.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = localScanner.next();
          localObject2 = ((String)localObject1).split("=");
          int k = localObject2.length;
          if (k != 0)
          {
            k = localObject2.length;
            if (k <= i) {}
          }
          else
          {
            localObject1 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject1).<init>("bad parameter");
            throw ((Throwable)localObject1);
          }
          String str = decode(localObject2[0], paramString);
          k = 0;
          localObject1 = null;
          int m = localObject2.length;
          if (m == i)
          {
            k = 1;
            localObject1 = decode(localObject2[k], paramString);
          }
          localHashMap.put(str, localObject1);
        }
        localObject1 = localHashMap;
      }
    }
    return (Map)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */