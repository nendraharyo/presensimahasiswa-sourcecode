package io.fabric.sdk.android.services.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

public final class UrlUtils
{
  public static final String UTF8 = "UTF8";
  
  public static TreeMap getQueryParams(String paramString, boolean paramBoolean)
  {
    int i = 1;
    TreeMap localTreeMap = new java/util/TreeMap;
    localTreeMap.<init>();
    if (paramString == null) {
      return localTreeMap;
    }
    String[] arrayOfString = paramString.split("&");
    int j = arrayOfString.length;
    int k = 0;
    label32:
    Object localObject;
    String str;
    if (k < j)
    {
      localObject = arrayOfString[k];
      str = "=";
      localObject = ((String)localObject).split(str);
      int m = localObject.length;
      int n = 2;
      if (m != n) {
        break label138;
      }
      if (!paramBoolean) {
        break label114;
      }
      str = urlDecode(localObject[0]);
      localObject = urlDecode(localObject[i]);
      localTreeMap.put(str, localObject);
    }
    for (;;)
    {
      k += 1;
      break label32;
      break;
      label114:
      str = localObject[0];
      localObject = localObject[i];
      localTreeMap.put(str, localObject);
      continue;
      label138:
      str = localObject[0];
      boolean bool = TextUtils.isEmpty(str);
      if (!bool) {
        if (paramBoolean)
        {
          localObject = urlDecode(localObject[0]);
          str = "";
          localTreeMap.put(localObject, str);
        }
        else
        {
          localObject = localObject[0];
          str = "";
          localTreeMap.put(localObject, str);
        }
      }
    }
  }
  
  public static TreeMap getQueryParams(URI paramURI, boolean paramBoolean)
  {
    return getQueryParams(paramURI.getRawQuery(), paramBoolean);
  }
  
  public static String percentEncode(String paramString)
  {
    if (paramString == null) {}
    StringBuilder localStringBuilder;
    for (String str1 = "";; str1 = localStringBuilder.toString())
    {
      return str1;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = urlEncode(paramString);
      int i = str2.length();
      int j = 0;
      str1 = null;
      if (j < i)
      {
        char c1 = str2.charAt(j);
        char c2 = '*';
        String str3;
        if (c1 == c2)
        {
          str3 = "%2A";
          localStringBuilder.append(str3);
        }
        for (;;)
        {
          j += 1;
          break;
          c2 = '+';
          if (c1 == c2)
          {
            str3 = "%20";
            localStringBuilder.append(str3);
          }
          else
          {
            c2 = '%';
            if (c1 == c2)
            {
              int k = j + 2;
              if (k < i)
              {
                k = j + 1;
                k = str2.charAt(k);
                int m = 55;
                if (k == m)
                {
                  k = j + 2;
                  k = str2.charAt(k);
                  m = 69;
                  if (k == m)
                  {
                    c1 = '~';
                    localStringBuilder.append(c1);
                    j += 2;
                    continue;
                  }
                }
              }
            }
            localStringBuilder.append(c1);
          }
        }
      }
    }
  }
  
  public static String urlDecode(String paramString)
  {
    String str1;
    if (paramString == null) {
      str1 = "";
    }
    for (;;)
    {
      return str1;
      str1 = "UTF8";
      try
      {
        str1 = URLDecoder.decode(paramString, str1);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        String str2 = localUnsupportedEncodingException.getMessage();
        localRuntimeException.<init>(str2, localUnsupportedEncodingException);
        throw localRuntimeException;
      }
    }
  }
  
  public static String urlEncode(String paramString)
  {
    String str1;
    if (paramString == null) {
      str1 = "";
    }
    for (;;)
    {
      return str1;
      str1 = "UTF8";
      try
      {
        str1 = URLEncoder.encode(paramString, str1);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        String str2 = localUnsupportedEncodingException.getMessage();
        localRuntimeException.<init>(str2, localUnsupportedEncodingException);
        throw localRuntimeException;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\UrlUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */