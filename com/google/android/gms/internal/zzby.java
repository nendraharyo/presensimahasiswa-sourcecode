package com.google.android.gms.internal;

import java.util.Map;

public abstract class zzby
{
  public static final zzby zzxs;
  public static final zzby zzxt;
  public static final zzby zzxu;
  
  static
  {
    Object localObject = new com/google/android/gms/internal/zzby$1;
    ((zzby.1)localObject).<init>();
    zzxs = (zzby)localObject;
    localObject = new com/google/android/gms/internal/zzby$2;
    ((zzby.2)localObject).<init>();
    zzxt = (zzby)localObject;
    localObject = new com/google/android/gms/internal/zzby$3;
    ((zzby.3)localObject).<init>();
    zzxu = (zzby)localObject;
  }
  
  public final void zza(Map paramMap, String paramString1, String paramString2)
  {
    String str = (String)paramMap.get(paramString1);
    str = zzb(str, paramString2);
    paramMap.put(paramString1, str);
  }
  
  public abstract String zzb(String paramString1, String paramString2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzby.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */