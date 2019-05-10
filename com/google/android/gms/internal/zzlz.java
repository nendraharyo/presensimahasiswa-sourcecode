package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzlz
{
  private static zzlz.zza zzaiV = null;
  private static int zzaiW = 0;
  private static String zzaiX = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  private static final Object zzqy;
  private Object zzSC = null;
  protected final String zzvs;
  protected final Object zzvt;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  protected zzlz(String paramString, Object paramObject)
  {
    this.zzvs = paramString;
    this.zzvt = paramObject;
  }
  
  public static boolean isInitialized()
  {
    zzlz.zza localzza = zzaiV;
    boolean bool;
    if (localzza != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzza = null;
    }
  }
  
  public static zzlz zza(String paramString, Float paramFloat)
  {
    zzlz.4 local4 = new com/google/android/gms/internal/zzlz$4;
    local4.<init>(paramString, paramFloat);
    return local4;
  }
  
  public static zzlz zza(String paramString, Integer paramInteger)
  {
    zzlz.3 local3 = new com/google/android/gms/internal/zzlz$3;
    local3.<init>(paramString, paramInteger);
    return local3;
  }
  
  public static zzlz zza(String paramString, Long paramLong)
  {
    zzlz.2 local2 = new com/google/android/gms/internal/zzlz$2;
    local2.<init>(paramString, paramLong);
    return local2;
  }
  
  public static zzlz zzk(String paramString, boolean paramBoolean)
  {
    zzlz.1 local1 = new com/google/android/gms/internal/zzlz$1;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    local1.<init>(paramString, localBoolean);
    return local1;
  }
  
  public static int zzpW()
  {
    return zzaiW;
  }
  
  public static zzlz zzv(String paramString1, String paramString2)
  {
    zzlz.5 local5 = new com/google/android/gms/internal/zzlz$5;
    local5.<init>(paramString1, paramString2);
    return local5;
  }
  
  public final Object get()
  {
    Object localObject = this.zzSC;
    if (localObject != null) {}
    for (localObject = this.zzSC;; localObject = zzct((String)localObject))
    {
      return localObject;
      localObject = this.zzvs;
    }
  }
  
  protected abstract Object zzct(String paramString);
  
  public final Object zzpX()
  {
    long l = Binder.clearCallingIdentity();
    try
    {
      Object localObject1 = get();
      return localObject1;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */