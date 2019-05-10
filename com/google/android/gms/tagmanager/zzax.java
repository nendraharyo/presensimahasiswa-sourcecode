package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class zzax
{
  private static String zzbjg;
  static Map zzbjh;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    zzbjh = localHashMap;
  }
  
  public static String zzU(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      int i = paramString1.length();
      if (i <= 0) {}
    }
    for (;;)
    {
      return paramString1;
      paramString1 = null;
      continue;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "http://hostname/?";
      localObject = Uri.parse(str + paramString1);
      paramString1 = ((Uri)localObject).getQueryParameter(paramString2);
    }
  }
  
  public static String zzf(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject1 = (String)zzbjh.get(paramString1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = null;
      localObject1 = paramContext.getSharedPreferences("gtm_click_referrers", 0);
      if (localObject1 == null) {
        break label67;
      }
      localObject2 = "";
    }
    label67:
    for (localObject1 = ((SharedPreferences)localObject1).getString(paramString1, (String)localObject2);; localObject1 = "")
    {
      localObject2 = zzbjh;
      ((Map)localObject2).put(paramString1, localObject1);
      return zzU((String)localObject1, paramString2);
    }
  }
  
  public static void zzgh(String paramString)
  {
    synchronized (zzax.class)
    {
      zzbjg = paramString;
      return;
    }
  }
  
  public static String zzm(Context paramContext, String paramString)
  {
    Object localObject1 = zzbjg;
    if (localObject1 == null) {}
    synchronized (zzax.class)
    {
      localObject1 = zzbjg;
      if (localObject1 == null)
      {
        localObject1 = "gtm_install_referrer";
        String str1 = null;
        localObject1 = paramContext.getSharedPreferences((String)localObject1, 0);
        if (localObject1 != null)
        {
          str1 = "referrer";
          String str2 = "";
          localObject1 = ((SharedPreferences)localObject1).getString(str1, str2);
          zzbjg = (String)localObject1;
        }
      }
      else
      {
        return zzU(zzbjg, paramString);
      }
      localObject1 = "";
      zzbjg = (String)localObject1;
    }
  }
  
  public static void zzn(Context paramContext, String paramString)
  {
    String str1 = zzU(paramString, "conv");
    if (str1 != null)
    {
      int i = str1.length();
      if (i > 0)
      {
        zzbjh.put(str1, paramString);
        String str2 = "gtm_click_referrers";
        zzcv.zzb(paramContext, str2, str1, paramString);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */