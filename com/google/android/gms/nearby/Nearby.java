package com.google.android.gms.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.internal.zzqd;
import com.google.android.gms.internal.zzql;
import com.google.android.gms.nearby.bootstrap.zza;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.internal.zzn;
import com.google.android.gms.nearby.messages.internal.zzo;
import com.google.android.gms.nearby.messages.zzc;
import com.google.android.gms.nearby.sharing.internal.zzh;
import com.google.android.gms.nearby.sharing.internal.zzi;
import com.google.android.gms.nearby.sharing.zzd;
import com.google.android.gms.nearby.sharing.zze;

public final class Nearby
{
  public static final Api CONNECTIONS_API;
  public static final Connections Connections;
  public static final Api MESSAGES_API;
  public static final Messages Messages;
  public static final zzc zzbaK;
  public static final Api zzbaL;
  public static final zzd zzbaM;
  public static final zze zzbaN;
  public static final Api zzbaO;
  public static final zza zzbaP;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzql.zzUJ;
    Api.zzc localzzc = zzql.zzUI;
    ((Api)localObject).<init>("Nearby.CONNECTIONS_API", localzza, localzzc);
    CONNECTIONS_API = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzql;
    ((zzql)localObject).<init>();
    Connections = (Connections)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzn.zzUJ;
    localzzc = zzn.zzUI;
    ((Api)localObject).<init>("Nearby.MESSAGES_API", localzza, localzzc);
    MESSAGES_API = (Api)localObject;
    localObject = new com/google/android/gms/nearby/messages/internal/zzn;
    ((zzn)localObject).<init>();
    Messages = (Messages)localObject;
    localObject = new com/google/android/gms/nearby/messages/internal/zzo;
    ((zzo)localObject).<init>();
    zzbaK = (zzc)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzh.zzUJ;
    localzzc = zzh.zzUI;
    ((Api)localObject).<init>("Nearby.SHARING_API", localzza, localzzc);
    zzbaL = (Api)localObject;
    localObject = new com/google/android/gms/nearby/sharing/internal/zzh;
    ((zzh)localObject).<init>();
    zzbaM = (zzd)localObject;
    localObject = new com/google/android/gms/nearby/sharing/internal/zzi;
    ((zzi)localObject).<init>();
    zzbaN = (zze)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzqd.zzUJ;
    localzzc = zzqd.zzUI;
    ((Api)localObject).<init>("Nearby.BOOTSTRAP_API", localzza, localzzc);
    zzbaO = (Api)localObject;
    localObject = new com/google/android/gms/internal/zzqd;
    ((zzqd)localObject).<init>();
    zzbaP = (zza)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\Nearby.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */