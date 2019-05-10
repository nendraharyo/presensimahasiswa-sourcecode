package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmz;
import com.google.android.gms.internal.zzpr;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class zzam
{
  private static final char[] zzTu;
  
  static
  {
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = 48;
    arrayOfChar[1] = 49;
    arrayOfChar[2] = 50;
    arrayOfChar[3] = 51;
    arrayOfChar[4] = 52;
    arrayOfChar[5] = 53;
    arrayOfChar[6] = 54;
    arrayOfChar[7] = 55;
    arrayOfChar[8] = 56;
    arrayOfChar[9] = 57;
    arrayOfChar[10] = 65;
    arrayOfChar[11] = 66;
    arrayOfChar[12] = 67;
    arrayOfChar[13] = 68;
    arrayOfChar[14] = 69;
    arrayOfChar[15] = 70;
    zzTu = arrayOfChar;
  }
  
  public static String zzK(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "1";; str = "0") {
      return str;
    }
  }
  
  public static double zza(String paramString, double paramDouble)
  {
    if (paramString == null) {}
    for (;;)
    {
      return paramDouble;
      try
      {
        paramDouble = Double.parseDouble(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static zzpr zza(zzaf paramzzaf, String paramString)
  {
    Object localObject1 = null;
    zzx.zzz(paramzzaf);
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return (zzpr)localObject1;
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      try
      {
        localObject2 = new java/net/URI;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "?";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).append(paramString);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((URI)localObject2).<init>((String)localObject3);
        localObject3 = "UTF-8";
        localObject3 = zzmz.zza((URI)localObject2, (String)localObject3);
        localObject2 = new com/google/android/gms/internal/zzpr;
        ((zzpr)localObject2).<init>();
        localObject1 = (String)((Map)localObject3).get("utm_content");
        ((zzpr)localObject2).zzey((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("utm_medium");
        ((zzpr)localObject2).zzew((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("utm_campaign");
        ((zzpr)localObject2).setName((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("utm_source");
        ((zzpr)localObject2).zzev((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("utm_term");
        ((zzpr)localObject2).zzex((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("utm_id");
        ((zzpr)localObject2).zzez((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("anid");
        ((zzpr)localObject2).zzeA((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("gclid");
        ((zzpr)localObject2).zzeB((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("dclid");
        ((zzpr)localObject2).zzeC((String)localObject1);
        localObject1 = (String)((Map)localObject3).get("aclid");
        ((zzpr)localObject2).zzeD((String)localObject1);
        localObject1 = localObject2;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        Object localObject3 = "No valid campaign data found";
        paramzzaf.zzd((String)localObject3, localURISyntaxException);
      }
    }
  }
  
  public static String zza(Locale paramLocale)
  {
    Object localObject1 = null;
    if (paramLocale == null) {}
    for (;;)
    {
      return (String)localObject1;
      Object localObject2 = paramLocale.getLanguage();
      boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool1)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = ((String)localObject2).toLowerCase();
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = paramLocale.getCountry();
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool2)
        {
          localObject2 = ((StringBuilder)localObject1).append("-");
          String str = paramLocale.getCountry().toLowerCase();
          ((StringBuilder)localObject2).append(str);
        }
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
  }
  
  public static void zza(Map paramMap1, String paramString, Map paramMap2)
  {
    String str = (String)paramMap2.get(paramString);
    zzc(paramMap1, paramString, str);
  }
  
  public static boolean zza(double paramDouble, String paramString)
  {
    boolean bool1 = false;
    double d1 = 100.0D;
    double d2 = 0.0D;
    boolean bool2 = paramDouble < d2;
    if (bool2)
    {
      bool2 = paramDouble < d1;
      if (bool2) {
        break label34;
      }
    }
    for (;;)
    {
      return bool1;
      label34:
      d2 = zzbw(paramString) % 10000;
      d1 *= paramDouble;
      bool2 = d2 < d1;
      if (!bool2) {
        bool1 = true;
      }
    }
  }
  
  public static boolean zza(Context paramContext, Class paramClass)
  {
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramClass);
      int i = 4;
      localObject1 = ((PackageManager)localObject1).getServiceInfo(localComponentName, i);
      if (localObject1 == null) {
        break label48;
      }
      bool = ((ServiceInfo)localObject1).enabled;
      if (!bool) {
        break label48;
      }
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        label48:
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  public static boolean zza(Context paramContext, Class paramClass, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramClass);
      int i = 2;
      localObject1 = ((PackageManager)localObject1).getReceiverInfo(localComponentName, i);
      if (localObject1 == null) {
        break label66;
      }
      boolean bool1 = ((ActivityInfo)localObject1).enabled;
      if (!bool1) {
        break label66;
      }
      if (paramBoolean)
      {
        bool2 = ((ActivityInfo)localObject1).exported;
        if (!bool2) {
          break label66;
        }
      }
      bool2 = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        label66:
        boolean bool2 = false;
        Object localObject2 = null;
      }
    }
    return bool2;
  }
  
  public static void zzb(Map paramMap, String paramString, boolean paramBoolean)
  {
    boolean bool = paramMap.containsKey(paramString);
    if (!bool) {
      if (!paramBoolean) {
        break label31;
      }
    }
    label31:
    for (String str = "1";; str = "0")
    {
      paramMap.put(paramString, str);
      return;
    }
  }
  
  public static Map zzbs(String paramString)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str1 = "&";
    String[] arrayOfString1 = paramString.split(str1);
    int m = arrayOfString1.length;
    int n = 0;
    if (n < m)
    {
      str1 = arrayOfString1[n];
      String[] arrayOfString2 = str1.split("=", i);
      int i1 = arrayOfString2.length;
      if (i1 > k)
      {
        String str2 = arrayOfString2[0];
        str1 = arrayOfString2[k];
        boolean bool1 = TextUtils.isEmpty(str1);
        if (bool1)
        {
          bool1 = false;
          str1 = null;
          label101:
          localHashMap.put(str2, str1);
          int i2 = arrayOfString2.length;
          if (i2 == i)
          {
            str1 = arrayOfString2[k];
            boolean bool2 = TextUtils.isEmpty(str1);
            if (!bool2)
            {
              str1 = arrayOfString2[k];
              bool2 = localHashMap.containsKey(str1);
              if (!bool2)
              {
                str2 = arrayOfString2[k];
                str1 = arrayOfString2[j];
                bool2 = TextUtils.isEmpty(str1);
                if (!bool2) {
                  break label228;
                }
                bool2 = false;
                str1 = null;
                label194:
                localHashMap.put(str2, str1);
              }
            }
          }
        }
      }
      for (;;)
      {
        int i3 = n + 1;
        n = i3;
        break;
        str1 = arrayOfString2[k];
        break label101;
        label228:
        str1 = arrayOfString2[j];
        break label194;
        i3 = arrayOfString2.length;
        if (i3 == k)
        {
          str1 = arrayOfString2[0];
          i3 = str1.length();
          if (i3 != 0)
          {
            str1 = arrayOfString2[0];
            localHashMap.put(str1, null);
          }
        }
      }
    }
    return localHashMap;
  }
  
  public static long zzbt(String paramString)
  {
    long l = 0L;
    if (paramString == null) {}
    for (;;)
    {
      return l;
      try
      {
        l = Long.parseLong(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
  }
  
  public static String zzbu(String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    int k = 0;
    int m = 1;
    boolean bool2 = TextUtils.isEmpty(paramString);
    if (bool2)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      Object localObject2 = "?";
      bool2 = paramString.contains((CharSequence)localObject2);
      if (bool2)
      {
        localObject2 = paramString.split("[\\?]");
        int n = localObject2.length;
        if (n > m) {
          paramString = localObject2[m];
        }
      }
      localObject2 = "%3D";
      bool2 = paramString.contains((CharSequence)localObject2);
      if (bool2) {
        localObject2 = "UTF-8";
      }
      StringBuilder localStringBuilder1;
      do
      {
        try
        {
          paramString = URLDecoder.decode(paramString, (String)localObject2);
          localObject2 = zzbs(paramString);
          String[] arrayOfString = new String[11];
          arrayOfString[0] = "dclid";
          arrayOfString[m] = "utm_source";
          arrayOfString[2] = "gclid";
          arrayOfString[3] = "aclid";
          arrayOfString[4] = "utm_campaign";
          arrayOfString[5] = "utm_medium";
          arrayOfString[6] = "utm_term";
          arrayOfString[7] = "utm_content";
          arrayOfString[8] = "utm_id";
          arrayOfString[9] = "anid";
          arrayOfString[10] = "gmob_t";
          localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>();
          for (k = 0;; k = j)
          {
            i = arrayOfString.length;
            if (k >= i) {
              break;
            }
            localObject1 = arrayOfString[k];
            localObject1 = (CharSequence)((Map)localObject2).get(localObject1);
            boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
            if (!bool1)
            {
              j = localStringBuilder1.length();
              if (j > 0)
              {
                localObject1 = "&";
                localStringBuilder1.append((String)localObject1);
              }
              localObject1 = arrayOfString[k];
              StringBuilder localStringBuilder2 = localStringBuilder1.append((String)localObject1).append("=");
              localObject1 = arrayOfString[k];
              localObject1 = (String)((Map)localObject2).get(localObject1);
              localStringBuilder2.append((String)localObject1);
            }
            j = k + 1;
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          j = 0;
          str = null;
        }
        localObject2 = "=";
        bool2 = paramString.contains((CharSequence)localObject2);
      } while (bool2);
      int j = 0;
      String str = null;
      continue;
      str = localStringBuilder1.toString();
    }
  }
  
  public static MessageDigest zzbv(String paramString)
  {
    int i = 0;
    MessageDigest localMessageDigest = null;
    int j = 0;
    i = 2;
    if (j < i) {}
    for (;;)
    {
      try
      {
        localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i = j + 1;
        j = i;
      }
      break;
      i = 0;
      Object localObject = null;
    }
  }
  
  public static int zzbw(String paramString)
  {
    int i = 1;
    int j = TextUtils.isEmpty(paramString);
    if (j == 0)
    {
      int m = paramString.length() + -1;
      i = 0;
      j = m;
      while (j >= 0)
      {
        int n = paramString.charAt(j);
        i <<= 6;
        int i1 = -1 >>> 4;
        i = (i & i1) + n;
        n <<= 14;
        i += n;
        n = 0xFE00000 & i;
        if (n != 0)
        {
          n >>= 21;
          i ^= n;
        }
        int k;
        j += -1;
      }
    }
    return i;
  }
  
  public static boolean zzbx(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = TextUtils.isEmpty(paramString);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      String str = "http:";
      bool2 = paramString.startsWith(str);
      if (bool2) {
        bool1 = false;
      }
    }
  }
  
  public static void zzc(Map paramMap, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      boolean bool = paramMap.containsKey(paramString1);
      if (!bool) {
        paramMap.put(paramString1, paramString2);
      }
    }
  }
  
  public static void zzd(Map paramMap, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      CharSequence localCharSequence = (CharSequence)paramMap.get(paramString1);
      boolean bool = TextUtils.isEmpty(localCharSequence);
      if (bool) {
        paramMap.put(paramString1, paramString2);
      }
    }
  }
  
  public static boolean zzh(String paramString, boolean paramBoolean)
  {
    String str;
    boolean bool;
    if (paramString != null)
    {
      str = "true";
      bool = paramString.equalsIgnoreCase(str);
      if (!bool)
      {
        str = "yes";
        bool = paramString.equalsIgnoreCase(str);
        if (!bool)
        {
          str = "1";
          bool = paramString.equalsIgnoreCase(str);
          if (!bool) {
            break label49;
          }
        }
      }
      paramBoolean = true;
    }
    for (;;)
    {
      return paramBoolean;
      label49:
      str = "false";
      bool = paramString.equalsIgnoreCase(str);
      if (!bool)
      {
        str = "no";
        bool = paramString.equalsIgnoreCase(str);
        if (!bool)
        {
          str = "0";
          bool = paramString.equalsIgnoreCase(str);
          if (!bool) {
            continue;
          }
        }
      }
      paramBoolean = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */