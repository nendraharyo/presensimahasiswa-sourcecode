package com.google.android.gms.plus.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class zze
  extends zzj
{
  private Person zzbei;
  private final PlusSession zzbej;
  
  public zze(Context paramContext, Looper paramLooper, zzf paramzzf, PlusSession paramPlusSession, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 2, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzbej = paramPlusSession;
  }
  
  public static boolean zzd(Set paramSet)
  {
    int i = 1;
    boolean bool1 = false;
    if (paramSet != null)
    {
      boolean bool2 = paramSet.isEmpty();
      if (!bool2) {
        break label21;
      }
    }
    for (;;)
    {
      return bool1;
      label21:
      int j = paramSet.size();
      if (j == i)
      {
        Scope localScope = new com/google/android/gms/common/api/Scope;
        String str = "plus_one_placeholder_scope";
        localScope.<init>(str);
        boolean bool3 = paramSet.contains(localScope);
        if (bool3) {}
      }
      else
      {
        bool1 = i;
      }
    }
  }
  
  public String getAccountName()
  {
    zzqI();
    try
    {
      Object localObject = zzqJ();
      localObject = (zzd)localObject;
      return ((zzd)localObject).getAccountName();
    }
    catch (RemoteException localRemoteException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(localRemoteException);
      throw localIllegalStateException;
    }
  }
  
  public void zzEY()
  {
    zzqI();
    Object localObject = null;
    try
    {
      this.zzbei = null;
      localObject = zzqJ();
      localObject = (zzd)localObject;
      ((zzd)localObject).zzEY();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(localRemoteException);
      throw localIllegalStateException;
    }
  }
  
  public Person zzFa()
  {
    zzqI();
    return this.zzbei;
  }
  
  public zzq zza(zza.zzb paramzzb, int paramInt, String paramString)
  {
    zzqI();
    localzze = new com/google/android/gms/plus/internal/zze$zze;
    localzze.<init>(paramzzb);
    try
    {
      localObject = zzqJ();
      localObject = (zzd)localObject;
      int i = 1;
      int j = -1;
      localObject = ((zzd)localObject).zza(localzze, i, paramInt, j, paramString);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject;
        DataHolder localDataHolder = DataHolder.zzbI(8);
        localzze.zza(localDataHolder, null);
        localDataHolder = null;
      }
    }
    return (zzq)localObject;
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramBundle != null))
    {
      Object localObject = "loaded_person";
      boolean bool = paramBundle.containsKey((String)localObject);
      if (bool)
      {
        localObject = PersonEntity.zzv(paramBundle.getByteArray("loaded_person"));
        this.zzbei = ((Person)localObject);
      }
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    zzqI();
    if (paramzzb != null)
    {
      localzzd = new com/google/android/gms/plus/internal/zze$zzd;
      localzzd.<init>(paramzzb);
    }
    for (;;)
    {
      try
      {
        Object localObject = zzqJ();
        localObject = (zzd)localObject;
        ((zzd)localObject).zza(localzzd, paramInt, paramString1, paramUri, paramString2, paramString3);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        int i = 8;
        DataHolder localDataHolder = DataHolder.zzbI(i);
        localzzd.zza(localDataHolder, null, null);
        continue;
      }
      localzzd = null;
    }
  }
  
  public void zza(zza.zzb paramzzb, Moment paramMoment)
  {
    zzqI();
    Object localObject1;
    if (paramzzb != null)
    {
      localObject1 = new com/google/android/gms/plus/internal/zze$zzc;
      ((zze.zzc)localObject1).<init>(paramzzb);
    }
    for (localObject2 = localObject1;; localObject2 = null) {
      try
      {
        paramMoment = (MomentEntity)paramMoment;
        SafeParcelResponse localSafeParcelResponse = SafeParcelResponse.zza(paramMoment);
        localObject1 = zzqJ();
        localObject1 = (zzd)localObject1;
        ((zzd)localObject1).zza((zzb)localObject2, localSafeParcelResponse);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          if (localObject2 == null)
          {
            localObject2 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject2).<init>(localRemoteException);
            throw ((Throwable)localObject2);
          }
          Status localStatus = new com/google/android/gms/common/api/Status;
          int i = 8;
          localStatus.<init>(i, null, null);
          ((zze.zzc)localObject2).zzbe(localStatus);
        }
      }
    }
  }
  
  public void zza(zza.zzb paramzzb, Collection paramCollection)
  {
    zzqI();
    zze.zze localzze = new com/google/android/gms/plus/internal/zze$zze;
    localzze.<init>(paramzzb);
    try
    {
      Object localObject = zzqJ();
      localObject = (zzd)localObject;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramCollection);
      ((zzd)localObject).zza(localzze, localArrayList);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        int i = 8;
        DataHolder localDataHolder = DataHolder.zzbI(i);
        ArrayList localArrayList = null;
        localzze.zza(localDataHolder, null);
      }
    }
  }
  
  public void zzd(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    List localList = Arrays.asList(paramArrayOfString);
    zza(paramzzb, localList);
  }
  
  protected zzd zzdS(IBinder paramIBinder)
  {
    return zzd.zza.zzdR(paramIBinder);
  }
  
  public void zzfG(String paramString)
  {
    zzqI();
    try
    {
      Object localObject = zzqJ();
      localObject = (zzd)localObject;
      ((zzd)localObject).zzfG(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(localRemoteException);
      throw localIllegalStateException;
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.plus.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.plus.internal.IPlusService";
  }
  
  public boolean zzmE()
  {
    zzf localzzf = zzqH();
    Api localApi = Plus.API;
    return zzd(localzzf.zzb(localApi));
  }
  
  protected Bundle zzml()
  {
    Bundle localBundle = this.zzbej.zzFk();
    Object localObject = this.zzbej.zzFe();
    localBundle.putStringArray("request_visible_actions", (String[])localObject);
    localObject = this.zzbej.zzFg();
    localBundle.putString("auth_package", (String)localObject);
    return localBundle;
  }
  
  public void zzo(zza.zzb paramzzb)
  {
    zza(paramzzb, 20, null, null, null, "me");
  }
  
  public void zzp(zza.zzb paramzzb)
  {
    zzqI();
    zze.zze localzze = new com/google/android/gms/plus/internal/zze$zze;
    localzze.<init>(paramzzb);
    try
    {
      Object localObject = zzqJ();
      localObject = (zzd)localObject;
      int i = 2;
      int j = 1;
      int k = -1;
      ((zzd)localObject).zza(localzze, i, j, k, null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        int m = 8;
        DataHolder localDataHolder = DataHolder.zzbI(m);
        localzze.zza(localDataHolder, null);
      }
    }
  }
  
  public zzq zzq(zza.zzb paramzzb, String paramString)
  {
    return zza(paramzzb, 0, paramString);
  }
  
  public void zzq(zza.zzb paramzzb)
  {
    zzqI();
    zzEY();
    zze.zzf localzzf = new com/google/android/gms/plus/internal/zze$zzf;
    localzzf.<init>(paramzzb);
    try
    {
      Object localObject = zzqJ();
      localObject = (zzd)localObject;
      ((zzd)localObject).zzb(localzzf);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        int i = 8;
        localzzf.zzi(i, null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */