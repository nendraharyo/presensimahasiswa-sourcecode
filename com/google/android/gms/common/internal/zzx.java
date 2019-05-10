package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class zzx
{
  public static int zza(int paramInt, Object paramObject)
  {
    if (paramInt == 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.valueOf(paramObject);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    return paramInt;
  }
  
  public static long zza(long paramLong, Object paramObject)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.valueOf(paramObject);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    return paramLong;
  }
  
  public static void zza(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      String str = String.valueOf(paramObject);
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    }
  }
  
  public static void zza(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      String str = String.format(paramString, paramVarArgs);
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    }
  }
  
  public static void zzab(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>();
      throw localIllegalStateException;
    }
  }
  
  public static void zzac(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
  }
  
  public static Object zzb(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      String str = String.valueOf(paramObject2);
      localNullPointerException.<init>(str);
      throw localNullPointerException;
    }
    return paramObject1;
  }
  
  public static void zzb(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.valueOf(paramObject);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
  }
  
  public static void zzb(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.format(paramString, paramVarArgs);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
  }
  
  public static int zzbV(int paramInt)
  {
    if (paramInt == 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Given Integer is zero");
      throw localIllegalArgumentException;
    }
    return paramInt;
  }
  
  public static void zzcD(String paramString)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject != localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
  }
  
  public static void zzcE(String paramString)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject == localLooper)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
  }
  
  public static String zzcM(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Given String is empty or null");
      throw localIllegalArgumentException;
    }
    return paramString;
  }
  
  public static String zzh(String paramString, Object paramObject)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.valueOf(paramObject);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    return paramString;
  }
  
  public static Object zzz(Object paramObject)
  {
    if (paramObject == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>("null reference");
      throw localNullPointerException;
    }
    return paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */