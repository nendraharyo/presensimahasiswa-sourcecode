package com.google.android.gms.plus;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.zze;
import java.util.Set;

final class Plus$1
  extends Api.zza
{
  public int getPriority()
  {
    return 2;
  }
  
  public zze zza(Context paramContext, Looper paramLooper, zzf paramzzf, Plus.PlusOptions paramPlusOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramPlusOptions == null)
    {
      paramPlusOptions = new com/google/android/gms/plus/Plus$PlusOptions;
      localPlusSession = null;
      paramPlusOptions.<init>(null);
    }
    zze localzze = new com/google/android/gms/plus/internal/zze;
    PlusSession localPlusSession = new com/google/android/gms/plus/internal/PlusSession;
    Object localObject1 = paramzzf.zzqq().name;
    Object localObject2 = zznh.zzc(paramzzf.zzqt());
    Object localObject3 = paramPlusOptions.zzbdZ;
    Object localObject4 = new String[0];
    localObject3 = (String[])((Set)localObject3).toArray((Object[])localObject4);
    localObject4 = new String[0];
    Object localObject5 = paramContext.getPackageName();
    Object localObject6 = paramContext.getPackageName();
    PlusCommonExtras localPlusCommonExtras = new com/google/android/gms/plus/internal/PlusCommonExtras;
    localPlusCommonExtras.<init>();
    localPlusSession.<init>((String)localObject1, (String[])localObject2, (String[])localObject3, (String[])localObject4, (String)localObject5, (String)localObject6, null, localPlusCommonExtras);
    localObject1 = localzze;
    localObject2 = paramContext;
    localObject3 = paramLooper;
    localObject4 = paramzzf;
    localObject5 = localPlusSession;
    localObject6 = paramConnectionCallbacks;
    localzze.<init>(paramContext, paramLooper, paramzzf, localPlusSession, paramConnectionCallbacks, paramOnConnectionFailedListener);
    return localzze;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\Plus$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */