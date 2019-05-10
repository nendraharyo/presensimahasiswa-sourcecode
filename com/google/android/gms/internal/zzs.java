package com.google.android.gms.internal;

import android.util.Log;
import java.util.Locale;

public class zzs
{
  public static boolean DEBUG = Log.isLoggable(TAG, 2);
  public static String TAG = "Volley";
  
  public static void zza(String paramString, Object... paramVarArgs)
  {
    boolean bool = DEBUG;
    if (bool)
    {
      String str1 = TAG;
      String str2 = zzd(paramString, paramVarArgs);
      Log.v(str1, str2);
    }
  }
  
  public static void zza(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    String str1 = TAG;
    String str2 = zzd(paramString, paramVarArgs);
    Log.e(str1, str2, paramThrowable);
  }
  
  public static void zzb(String paramString, Object... paramVarArgs)
  {
    String str1 = TAG;
    String str2 = zzd(paramString, paramVarArgs);
    Log.d(str1, str2);
  }
  
  public static void zzc(String paramString, Object... paramVarArgs)
  {
    String str1 = TAG;
    String str2 = zzd(paramString, paramVarArgs);
    Log.e(str1, str2);
  }
  
  private static String zzd(String paramString, Object... paramVarArgs)
  {
    int i = 2;
    Object localObject2;
    int j;
    label32:
    Object localObject3;
    if (paramVarArgs == null)
    {
      localObject1 = new java/lang/Throwable;
      ((Throwable)localObject1).<init>();
      localObject1 = ((Throwable)localObject1).fillInStackTrace();
      StackTraceElement[] arrayOfStackTraceElement = ((Throwable)localObject1).getStackTrace();
      localObject2 = "<unknown>";
      j = i;
      int k = arrayOfStackTraceElement.length;
      if (j >= k) {
        break label244;
      }
      localObject3 = arrayOfStackTraceElement[j].getClass();
      Class localClass = zzs.class;
      boolean bool = localObject3.equals(localClass);
      if (bool) {
        break label235;
      }
      localObject2 = arrayOfStackTraceElement[j].getClassName();
      int m = ((String)localObject2).lastIndexOf('.') + 1;
      localObject2 = ((String)localObject2).substring(m);
      m = ((String)localObject2).lastIndexOf('$') + 1;
      localObject2 = ((String)localObject2).substring(m);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
      localObject3 = ".";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject1 = arrayOfStackTraceElement[j].getMethodName();
    }
    label235:
    label244:
    for (Object localObject1 = (String)localObject1;; localObject1 = localObject2)
    {
      localObject2 = Locale.US;
      localObject3 = new Object[3];
      Long localLong = Long.valueOf(Thread.currentThread().getId());
      localObject3[0] = localLong;
      localObject3[1] = localObject1;
      localObject3[i] = paramString;
      return String.format((Locale)localObject2, "[%d] %s: %s", (Object[])localObject3);
      localObject1 = Locale.US;
      paramString = String.format((Locale)localObject1, paramString, paramVarArgs);
      break;
      j += 1;
      break label32;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */