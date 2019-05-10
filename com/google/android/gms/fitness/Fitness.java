package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zznz.zzb;
import com.google.android.gms.internal.zzoa.zzb;
import com.google.android.gms.internal.zzob.zzb;
import com.google.android.gms.internal.zzoc.zza;
import com.google.android.gms.internal.zzod.zzb;
import com.google.android.gms.internal.zzoe.zzb;
import com.google.android.gms.internal.zzof.zzb;
import com.google.android.gms.internal.zzoy;
import com.google.android.gms.internal.zzpa;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpc;
import com.google.android.gms.internal.zzpd;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzpf;
import com.google.android.gms.internal.zzpg;
import com.google.android.gms.internal.zzpi;
import java.util.concurrent.TimeUnit;

public class Fitness
{
  public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
  public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
  public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
  public static final Void API;
  public static final Api BLE_API;
  public static final BleApi BleApi;
  public static final Api CONFIG_API;
  public static final ConfigApi ConfigApi;
  public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
  public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
  public static final Api HISTORY_API;
  public static final HistoryApi HistoryApi;
  public static final Api RECORDING_API;
  public static final RecordingApi RecordingApi;
  public static final Scope SCOPE_ACTIVITY_READ;
  public static final Scope SCOPE_ACTIVITY_READ_WRITE;
  public static final Scope SCOPE_BODY_READ;
  public static final Scope SCOPE_BODY_READ_WRITE;
  public static final Scope SCOPE_LOCATION_READ;
  public static final Scope SCOPE_LOCATION_READ_WRITE;
  public static final Scope SCOPE_NUTRITION_READ;
  public static final Scope SCOPE_NUTRITION_READ_WRITE;
  public static final Api SENSORS_API;
  public static final Api SESSIONS_API;
  public static final SensorsApi SensorsApi;
  public static final SessionsApi SessionsApi;
  public static final Api zzaoG;
  public static final Api.zzc zzavK;
  public static final Api.zzc zzavL;
  public static final Api.zzc zzavM;
  public static final Api.zzc zzavN;
  public static final Api.zzc zzavO;
  public static final Api.zzc zzavP;
  public static final Api.zzc zzavQ;
  public static final zzoy zzavR;
  
  static
  {
    Object localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavK = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavL = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavM = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavN = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavO = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavP = (Api.zzc)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject1).<init>();
    zzavQ = (Api.zzc)localObject1;
    API = null;
    localObject1 = new com/google/android/gms/common/api/Api;
    Object localObject2 = new com/google/android/gms/internal/zzoe$zzb;
    ((zzoe.zzb)localObject2).<init>();
    Api.zzc localzzc = zzavP;
    ((Api)localObject1).<init>("Fitness.SENSORS_API", (Api.zza)localObject2, localzzc);
    SENSORS_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/internal/zzpf;
    ((zzpf)localObject1).<init>();
    SensorsApi = (SensorsApi)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/internal/zzod$zzb;
    ((zzod.zzb)localObject2).<init>();
    localzzc = zzavO;
    ((Api)localObject1).<init>("Fitness.RECORDING_API", (Api.zza)localObject2, localzzc);
    RECORDING_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/internal/zzpe;
    ((zzpe)localObject1).<init>();
    RecordingApi = (RecordingApi)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/internal/zzof$zzb;
    ((zzof.zzb)localObject2).<init>();
    localzzc = zzavQ;
    ((Api)localObject1).<init>("Fitness.SESSIONS_API", (Api.zza)localObject2, localzzc);
    SESSIONS_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/internal/zzpg;
    ((zzpg)localObject1).<init>();
    SessionsApi = (SessionsApi)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/internal/zzob$zzb;
    ((zzob.zzb)localObject2).<init>();
    localzzc = zzavM;
    ((Api)localObject1).<init>("Fitness.HISTORY_API", (Api.zza)localObject2, localzzc);
    HISTORY_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/internal/zzpc;
    ((zzpc)localObject1).<init>();
    HistoryApi = (HistoryApi)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/internal/zzoa$zzb;
    ((zzoa.zzb)localObject2).<init>();
    localzzc = zzavL;
    ((Api)localObject1).<init>("Fitness.CONFIG_API", (Api.zza)localObject2, localzzc);
    CONFIG_API = (Api)localObject1;
    localObject1 = new com/google/android/gms/internal/zzpb;
    ((zzpb)localObject1).<init>();
    ConfigApi = (ConfigApi)localObject1;
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/internal/zznz$zzb;
    ((zznz.zzb)localObject2).<init>();
    localzzc = zzavK;
    ((Api)localObject1).<init>("Fitness.BLE_API", (Api.zza)localObject2, localzzc);
    BLE_API = (Api)localObject1;
    BleApi = zztZ();
    localObject1 = new com/google/android/gms/common/api/Api;
    localObject2 = new com/google/android/gms/internal/zzoc$zza;
    ((zzoc.zza)localObject2).<init>();
    localzzc = zzavN;
    ((Api)localObject1).<init>("Fitness.INTERNAL_API", (Api.zza)localObject2, localzzc);
    zzaoG = (Api)localObject1;
    localObject1 = new com/google/android/gms/internal/zzpd;
    ((zzpd)localObject1).<init>();
    zzavR = (zzoy)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.activity.read");
    SCOPE_ACTIVITY_READ = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.activity.write");
    SCOPE_ACTIVITY_READ_WRITE = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.location.read");
    SCOPE_LOCATION_READ = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.location.write");
    SCOPE_LOCATION_READ_WRITE = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.body.read");
    SCOPE_BODY_READ = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.body.write");
    SCOPE_BODY_READ_WRITE = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.nutrition.read");
    SCOPE_NUTRITION_READ = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/fitness.nutrition.write");
    SCOPE_NUTRITION_READ_WRITE = (Scope)localObject1;
  }
  
  public static long getEndTime(Intent paramIntent, TimeUnit paramTimeUnit)
  {
    long l1 = -1;
    String str = "vnd.google.fitness.end_time";
    long l2 = paramIntent.getLongExtra(str, l1);
    boolean bool = l2 < l1;
    if (!bool) {}
    for (;;)
    {
      return l1;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      l1 = paramTimeUnit.convert(l2, localTimeUnit);
    }
  }
  
  public static long getStartTime(Intent paramIntent, TimeUnit paramTimeUnit)
  {
    long l1 = -1;
    String str = "vnd.google.fitness.start_time";
    long l2 = paramIntent.getLongExtra(str, l1);
    boolean bool = l2 < l1;
    if (!bool) {}
    for (;;)
    {
      return l1;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      l1 = paramTimeUnit.convert(l2, localTimeUnit);
    }
  }
  
  private static BleApi zztZ()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    Object localObject;
    if (i >= j)
    {
      localObject = new com/google/android/gms/internal/zzpa;
      ((zzpa)localObject).<init>();
    }
    for (;;)
    {
      return (BleApi)localObject;
      localObject = new com/google/android/gms/internal/zzpi;
      ((zzpi)localObject).<init>();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\Fitness.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */