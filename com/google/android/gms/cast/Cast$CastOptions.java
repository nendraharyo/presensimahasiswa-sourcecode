package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;

public final class Cast$CastOptions
  implements Api.ApiOptions.HasOptions
{
  final CastDevice zzZL;
  final Cast.Listener zzZM;
  private final int zzZN;
  
  private Cast$CastOptions(Cast.CastOptions.Builder paramBuilder)
  {
    Object localObject = paramBuilder.zzZO;
    this.zzZL = ((CastDevice)localObject);
    localObject = paramBuilder.zzZP;
    this.zzZM = ((Cast.Listener)localObject);
    int i = Cast.CastOptions.Builder.zza(paramBuilder);
    this.zzZN = i;
  }
  
  public static Cast.CastOptions.Builder builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    Cast.CastOptions.Builder localBuilder = new com/google/android/gms/cast/Cast$CastOptions$Builder;
    localBuilder.<init>(paramCastDevice, paramListener);
    return localBuilder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */