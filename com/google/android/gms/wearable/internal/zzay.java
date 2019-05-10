package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzay
{
  private final Map zzaxd;
  
  zzay()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaxd = localHashMap;
  }
  
  public void zza(zzbp paramzzbp, zza.zzb paramzzb, Object paramObject)
  {
    synchronized (this.zzaxd)
    {
      Object localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).remove(paramObject);
      localObject1 = (zzbq)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/common/api/Status;
        int i = 4002;
        ((Status)localObject1).<init>(i);
        paramzzb.zzs(localObject1);
        return;
      }
      ((zzbq)localObject1).clear();
      Object localObject3 = paramzzbp.zzqJ();
      localObject3 = (zzax)localObject3;
      zzay.zzb localzzb = new com/google/android/gms/wearable/internal/zzay$zzb;
      Object localObject4 = this.zzaxd;
      localzzb.<init>((Map)localObject4, paramObject, paramzzb);
      localObject4 = new com/google/android/gms/wearable/internal/RemoveListenerRequest;
      ((RemoveListenerRequest)localObject4).<init>((zzaw)localObject1);
      ((zzax)localObject3).zza(localzzb, (RemoveListenerRequest)localObject4);
    }
  }
  
  public void zza(zzbp paramzzbp, zza.zzb paramzzb, Object paramObject, zzbq paramzzbq)
  {
    Object localObject1;
    Object localObject4;
    synchronized (this.zzaxd)
    {
      localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).get(paramObject);
      if (localObject1 != null)
      {
        localObject1 = new com/google/android/gms/common/api/Status;
        int i = 4001;
        ((Status)localObject1).<init>(i);
        paramzzb.zzs(localObject1);
        return;
      }
      localObject1 = this.zzaxd;
      ((Map)localObject1).put(paramObject, paramzzbq);
    }
  }
  
  public void zzev(IBinder paramIBinder)
  {
    synchronized (this.zzaxd)
    {
      zzax localzzax = zzax.zza.zzeu(paramIBinder);
      zzbo.zzo localzzo = new com/google/android/gms/wearable/internal/zzbo$zzo;
      localzzo.<init>();
      Object localObject1 = this.zzaxd;
      localObject1 = ((Map)localObject1).entrySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (Map.Entry)localObject1;
          Object localObject3 = ((Map.Entry)localObject1).getValue();
          localObject3 = (zzbq)localObject3;
          try
          {
            Object localObject4 = new com/google/android/gms/wearable/internal/AddListenerRequest;
            ((AddListenerRequest)localObject4).<init>((zzbq)localObject3);
            localzzax.zza(localzzo, (AddListenerRequest)localObject4);
            localObject4 = "WearableClient";
            int i = 2;
            boolean bool2 = Log.isLoggable((String)localObject4, i);
            if (bool2)
            {
              localObject4 = "WearableClient";
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              localObject6 = "onPostInitHandler: added: ";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject6 = ((Map.Entry)localObject1).getKey();
              localObject5 = ((StringBuilder)localObject5).append(localObject6);
              localObject6 = "/";
              localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
              localObject5 = ((StringBuilder)localObject5).append(localObject3);
              localObject5 = ((StringBuilder)localObject5).toString();
              Log.d((String)localObject4, (String)localObject5);
            }
          }
          catch (RemoteException localRemoteException)
          {
            String str = "WearableClient";
            Object localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            Object localObject6 = "onPostInitHandler: Didn't add: ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
            localObject1 = ((Map.Entry)localObject1).getKey();
            localObject1 = ((StringBuilder)localObject5).append(localObject1);
            localObject5 = "/";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
            localObject1 = ((StringBuilder)localObject1).append(localObject3);
            localObject1 = ((StringBuilder)localObject1).toString();
            Log.d(str, (String)localObject1);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzay.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */