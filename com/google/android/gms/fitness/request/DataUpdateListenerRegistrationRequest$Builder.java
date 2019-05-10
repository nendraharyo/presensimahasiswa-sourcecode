package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class DataUpdateListenerRegistrationRequest$Builder
{
  private PendingIntent mPendingIntent;
  private DataType zzavT;
  private DataSource zzavU;
  
  public DataUpdateListenerRegistrationRequest build()
  {
    Object localObject = this.zzavU;
    boolean bool;
    if (localObject == null)
    {
      localObject = this.zzavT;
      if (localObject == null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Set either dataSource or dataTYpe");
      zzx.zzb(this.mPendingIntent, "pendingIntent must be set");
      localObject = new com/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;
      ((DataUpdateListenerRegistrationRequest)localObject).<init>(this, null);
      return (DataUpdateListenerRegistrationRequest)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public Builder setDataSource(DataSource paramDataSource)
  {
    zzx.zzz(paramDataSource);
    this.zzavU = paramDataSource;
    return this;
  }
  
  public Builder setDataType(DataType paramDataType)
  {
    zzx.zzz(paramDataType);
    this.zzavT = paramDataType;
    return this;
  }
  
  public Builder setPendingIntent(PendingIntent paramPendingIntent)
  {
    zzx.zzz(paramPendingIntent);
    this.mPendingIntent = paramPendingIntent;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataUpdateListenerRegistrationRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */