package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzqt;

public final class zzo
{
  public static final int zzaml;
  private static final String zzamm = null;
  private final String zzamn;
  private final String zzamo;
  
  static
  {
    int i = " PII_LOG".length();
    zzaml = 23 - i;
  }
  
  public zzo(String paramString)
  {
    this(paramString, str);
  }
  
  public zzo(String paramString1, String paramString2)
  {
    String str1 = "log tag cannot be null";
    zzx.zzb(paramString1, str1);
    int k = paramString1.length();
    int m;
    if (k <= i)
    {
      k = j;
      String str2 = "tag \"%s\" is longer than the %d character maximum";
      int n = 2;
      Object[] arrayOfObject = new Object[n];
      arrayOfObject[0] = paramString1;
      localInteger = Integer.valueOf(i);
      arrayOfObject[j] = localInteger;
      zzx.zzb(k, str2, arrayOfObject);
      this.zzamn = paramString1;
      if (paramString2 != null)
      {
        m = paramString2.length();
        if (m > 0) {
          break label122;
        }
      }
      str1 = zzamm;
    }
    label122:
    for (this.zzamo = str1;; this.zzamo = paramString2)
    {
      return;
      m = 0;
      str1 = null;
      break;
    }
  }
  
  private String zzcK(String paramString)
  {
    String str = this.zzamo;
    if (str == null) {}
    for (;;)
    {
      return paramString;
      str = this.zzamo;
      paramString = str.concat(paramString);
    }
  }
  
  public void zzA(String paramString1, String paramString2)
  {
    boolean bool = zzbU(6);
    if (bool)
    {
      String str = zzcK(paramString2);
      Log.e(paramString1, str);
    }
  }
  
  public void zza(Context paramContext, String paramString1, String paramString2, Throwable paramThrowable)
  {
    int i = 2;
    int j = 0;
    Object localObject1 = paramThrowable.getStackTrace();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    int k = 0;
    Object localObject3 = null;
    for (;;)
    {
      m = localObject1.length;
      if ((k >= m) || (k >= i)) {
        break;
      }
      str1 = localObject1[k].toString();
      ((StringBuilder)localObject2).append(str1);
      str1 = "\n";
      ((StringBuilder)localObject2).append(str1);
      k += 1;
    }
    localObject3 = new com/google/android/gms/internal/zzqt;
    int n = 10;
    ((zzqt)localObject3).<init>(paramContext, n);
    localObject1 = "GMS_WTF";
    int m = 0;
    String str1 = null;
    String[] arrayOfString = new String[i];
    String str2 = "GMS_WTF";
    arrayOfString[0] = str2;
    j = 1;
    localObject2 = ((StringBuilder)localObject2).toString();
    arrayOfString[j] = localObject2;
    ((zzqt)localObject3).zza((String)localObject1, null, arrayOfString);
    ((zzqt)localObject3).send();
    boolean bool = zzbU(7);
    if (bool)
    {
      localObject3 = zzcK(paramString2);
      Log.e(paramString1, (String)localObject3, paramThrowable);
      localObject3 = zzcK(paramString2);
      Log.wtf(paramString1, (String)localObject3, paramThrowable);
    }
  }
  
  public void zza(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = zzbU(4);
    if (bool)
    {
      String str = zzcK(paramString2);
      Log.i(paramString1, str, paramThrowable);
    }
  }
  
  public void zzb(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = zzbU(5);
    if (bool)
    {
      String str = zzcK(paramString2);
      Log.w(paramString1, str, paramThrowable);
    }
  }
  
  public boolean zzbU(int paramInt)
  {
    return Log.isLoggable(this.zzamn, paramInt);
  }
  
  public void zzc(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = zzbU(6);
    if (bool)
    {
      String str = zzcK(paramString2);
      Log.e(paramString1, str, paramThrowable);
    }
  }
  
  public void zzy(String paramString1, String paramString2)
  {
    boolean bool = zzbU(3);
    if (bool)
    {
      String str = zzcK(paramString2);
      Log.d(paramString1, str);
    }
  }
  
  public void zzz(String paramString1, String paramString2)
  {
    boolean bool = zzbU(5);
    if (bool)
    {
      String str = zzcK(paramString2);
      Log.w(paramString1, str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */