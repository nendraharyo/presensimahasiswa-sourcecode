package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzr;
import java.math.BigInteger;
import java.util.Locale;

public final class zzil
{
  private static String zzLL;
  private static final Object zzqy;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  public static String zza(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (zzqy)
    {
      String str = zzLL;
      if (str == null)
      {
        boolean bool = TextUtils.isEmpty(paramString1);
        if (!bool) {
          zzb(paramContext, paramString1, paramString2);
        }
      }
      str = zzLL;
      return str;
    }
  }
  
  private static void zzb(Context paramContext, String paramString1, String paramString2)
  {
    int i = 1;
    int j = 3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject3;
    try
    {
      Object localObject1 = paramContext.createPackageContext(paramString2, j);
      localObject4 = ((Context)localObject1).getClassLoader();
      localObject1 = "com.google.ads.mediation.MediationAdapter";
      localObject5 = null;
      localObject6 = Class.forName((String)localObject1, false, (ClassLoader)localObject4);
      localObject1 = new java/math/BigInteger;
      localObject5 = new byte[i];
      ((BigInteger)localObject1).<init>((byte[])localObject5);
      String[] arrayOfString = paramString1.split(",");
      localObject5 = localObject1;
      j = 0;
      localObject1 = null;
      for (;;)
      {
        int k = arrayOfString.length;
        if (j >= k) {
          break;
        }
        zzir localzzir = zzr.zzbC();
        String str = arrayOfString[j];
        boolean bool = localzzir.zza((ClassLoader)localObject4, (Class)localObject6, str);
        if (bool) {
          localObject5 = ((BigInteger)localObject5).setBit(j);
        }
        j += 1;
      }
      return;
    }
    finally
    {
      localObject3 = "err";
      zzLL = (String)localObject3;
    }
    for (;;)
    {
      localObject3 = Locale.US;
      localObject4 = "%X";
      localObject6 = new Object[i];
      localObject6[0] = localObject5;
      localObject3 = String.format((Locale)localObject3, (String)localObject4, (Object[])localObject6);
      zzLL = (String)localObject3;
    }
  }
  
  public static String zzhm()
  {
    synchronized (zzqy)
    {
      String str = zzLL;
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */