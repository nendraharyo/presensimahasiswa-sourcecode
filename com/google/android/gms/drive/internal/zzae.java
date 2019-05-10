package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.zzf;
import java.util.ArrayList;
import java.util.List;

public class zzae
  extends zzao.zza
{
  private final int zzanf;
  private final zzf zzarC;
  private final zzae.zza zzarD;
  private final List zzarE;
  
  public zzae(Looper paramLooper, Context paramContext, int paramInt, zzf paramzzf)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzarE = ((List)localObject);
    this.zzanf = paramInt;
    this.zzarC = paramzzf;
    localObject = new com/google/android/gms/drive/internal/zzae$zza;
    ((zzae.zza)localObject).<init>(paramLooper, paramContext, null);
    this.zzarD = ((zzae.zza)localObject);
  }
  
  public void zzc(OnEventResponse paramOnEventResponse)
  {
    DriveEvent localDriveEvent = paramOnEventResponse.zzts();
    int i = this.zzanf;
    int k = localDriveEvent.getType();
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      zzx.zzab(i);
      Object localObject1 = this.zzarE;
      Object localObject2 = Integer.valueOf(localDriveEvent.getType());
      zzx.zzab(((List)localObject1).contains(localObject2));
      localObject1 = this.zzarD;
      localObject2 = this.zzarC;
      ((zzae.zza)localObject1).zza((zzf)localObject2, localDriveEvent);
      return;
      int j = 0;
      localObject1 = null;
    }
  }
  
  public void zzdg(int paramInt)
  {
    List localList = this.zzarE;
    Integer localInteger = Integer.valueOf(paramInt);
    localList.add(localInteger);
  }
  
  public boolean zzdh(int paramInt)
  {
    List localList = this.zzarE;
    Integer localInteger = Integer.valueOf(paramInt);
    return localList.contains(localInteger);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */