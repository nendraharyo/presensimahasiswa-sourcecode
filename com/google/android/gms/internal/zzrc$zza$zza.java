package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

class zzrc$zza$zza
  implements zzrc
{
  private IBinder zzoz;
  
  zzrc$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(Status paramStatus, AttestationData paramAttestationData)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks";
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken((String)localObject1);
        if (paramStatus != null)
        {
          i = 1;
          localParcel.writeInt(i);
          i = 0;
          localObject1 = null;
          paramStatus.writeToParcel(localParcel, 0);
          if (paramAttestationData != null)
          {
            i = 1;
            localParcel.writeInt(i);
            i = 0;
            localObject1 = null;
            paramAttestationData.writeToParcel(localParcel, 0);
            localObject1 = this.zzoz;
            int j = 1;
            int k = 1;
            ((IBinder)localObject1).transact(j, localParcel, null, k);
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel.recycle();
      }
      Object localObject3 = null;
      localParcel.writeInt(0);
    }
  }
  
  public void zza(Status paramStatus, SafeBrowsingData paramSafeBrowsingData)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks";
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken((String)localObject1);
        if (paramStatus != null)
        {
          i = 1;
          localParcel.writeInt(i);
          i = 0;
          localObject1 = null;
          paramStatus.writeToParcel(localParcel, 0);
          if (paramSafeBrowsingData != null)
          {
            i = 1;
            localParcel.writeInt(i);
            i = 0;
            localObject1 = null;
            paramSafeBrowsingData.writeToParcel(localParcel, 0);
            localObject1 = this.zzoz;
            int j = 3;
            int k = 1;
            ((IBinder)localObject1).transact(j, localParcel, null, k);
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel.recycle();
      }
      Object localObject3 = null;
      localParcel.writeInt(0);
    }
  }
  
  public void zzfI(String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeString(paramString);
      localObject1 = this.zzoz;
      int i = 2;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrc$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */