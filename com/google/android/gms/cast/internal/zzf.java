package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzf
{
  private static final Pattern zzaeb = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
  
  public static double zzA(long paramLong)
  {
    return paramLong / 1000.0D;
  }
  
  public static boolean zza(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 != null) || (paramObject2 != null))
    {
      if ((paramObject1 == null) || (paramObject2 == null)) {
        break label30;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label30;
      }
    }
    label30:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static String zzb(Locale paramLocale)
  {
    char c = '-';
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    int i = 20;
    localStringBuilder1.<init>(i);
    String str = paramLocale.getLanguage();
    localStringBuilder1.append(str);
    str = paramLocale.getCountry();
    boolean bool = TextUtils.isEmpty(str);
    StringBuilder localStringBuilder2;
    if (!bool)
    {
      localStringBuilder2 = localStringBuilder1.append(c);
      localStringBuilder2.append(str);
    }
    str = paramLocale.getVariant();
    bool = TextUtils.isEmpty(str);
    if (!bool)
    {
      localStringBuilder2 = localStringBuilder1.append(c);
      localStringBuilder2.append(str);
    }
    return localStringBuilder1.toString();
  }
  
  private static boolean zzb(char paramChar)
  {
    char c = 'A';
    if (paramChar >= c)
    {
      c = 'Z';
      if (paramChar <= c) {}
    }
    else
    {
      c = 'a';
      if (paramChar >= c)
      {
        c = 'z';
        if (paramChar <= c) {}
      }
      else
      {
        c = '0';
        if (paramChar >= c)
        {
          c = '9';
          if (paramChar <= c) {}
        }
        else
        {
          c = '_';
          if (paramChar != c)
          {
            c = '-';
            if (paramChar != c) {
              break label68;
            }
          }
        }
      }
    }
    label68:
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
  
  public static void zzch(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Namespace cannot be null or empty");
      throw ((Throwable)localObject);
    }
    int i = paramString.length();
    int k = 128;
    if (i > k)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Invalid namespace length");
      throw ((Throwable)localObject);
    }
    Object localObject = "urn:x-cast:";
    boolean bool2 = paramString.startsWith((String)localObject);
    if (!bool2)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Namespace must begin with the prefix \"urn:x-cast:\"");
      throw ((Throwable)localObject);
    }
    int j = paramString.length();
    String str = "urn:x-cast:";
    k = str.length();
    if (j == k)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
      throw ((Throwable)localObject);
    }
  }
  
  public static String zzci(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "urn:x-cast:" + paramString;
  }
  
  public static String zzcj(String paramString)
  {
    Matcher localMatcher = zzaeb.matcher(paramString);
    boolean bool1 = localMatcher.matches();
    if (bool1) {}
    for (;;)
    {
      return paramString;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      int i = paramString.length();
      localStringBuilder.<init>(i);
      i = 0;
      localMatcher = null;
      int j = paramString.length();
      if (i < j)
      {
        j = paramString.charAt(i);
        boolean bool2 = zzb(j);
        if (!bool2)
        {
          int k = 46;
          if (j != k)
          {
            int m = 58;
            if (j != m) {
              break label104;
            }
          }
        }
        localStringBuilder.append(j);
        for (;;)
        {
          i += 1;
          break;
          label104:
          String str = "%%%04x";
          int n = 1;
          Object[] arrayOfObject = new Object[n];
          int i1 = (char)-1;
          j &= i1;
          Object localObject = Integer.valueOf(j);
          arrayOfObject[0] = localObject;
          localObject = String.format(str, arrayOfObject);
          localStringBuilder.append((String)localObject);
        }
      }
      paramString = localStringBuilder.toString();
    }
  }
  
  public static long zzg(double paramDouble)
  {
    return (1000.0D * paramDouble);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */