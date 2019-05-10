package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.zzg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzu
  extends zzj
{
  private final String zzUW;
  final GoogleApiClient.ConnectionCallbacks zzalF;
  private final Bundle zzaqK;
  private final boolean zzaqL;
  private volatile DriveId zzaqM;
  private volatile DriveId zzaqN;
  private volatile boolean zzaqO = false;
  final Map zzaqP;
  final Map zzaqQ;
  final Map zzaqR;
  final Map zzaqS;
  
  public zzu(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, Bundle paramBundle)
  {
    super(paramContext, paramLooper, i, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzaqP = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzaqQ = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzaqR = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzaqS = ((Map)localObject1);
    localObject1 = paramzzf.zzqv();
    this.zzUW = ((String)localObject1);
    this.zzalF = paramConnectionCallbacks;
    this.zzaqK = paramBundle;
    localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("com.google.android.gms.drive.events.HANDLE_EVENT");
    localObject2 = paramContext.getPackageName();
    ((Intent)localObject1).setPackage((String)localObject2);
    localObject2 = paramContext.getPackageManager().queryIntentServices((Intent)localObject1, 0);
    int j = ((List)localObject2).size();
    switch (j)
    {
    default: 
      localObject2 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("AndroidManifest.xml can only define one service that handles the ");
      localObject1 = ((Intent)localObject1).getAction();
      localObject1 = (String)localObject1 + " action";
      ((IllegalStateException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    boolean bool2;
    for (this.zzaqL = false;; this.zzaqL = bool2)
    {
      return;
      localObject1 = ((ResolveInfo)((List)localObject2).get(0)).serviceInfo;
      boolean bool1 = ((ServiceInfo)localObject1).exported;
      if (!bool1)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Drive event service ");
        localObject1 = ((ServiceInfo)localObject1).name;
        localObject1 = (String)localObject1 + " must be exported in AndroidManifest.xml";
        ((IllegalStateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      bool2 = true;
    }
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, int paramInt, DriveId paramDriveId)
  {
    zzx.zzac(zzg.zza(paramInt, paramDriveId));
    zzx.zza(isConnected(), "Client must be connected");
    zzu.4 local4 = new com/google/android/gms/drive/internal/zzu$4;
    local4.<init>(this, paramGoogleApiClient, paramDriveId, paramInt);
    return paramGoogleApiClient.zzb(local4);
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, AddEventListenerRequest paramAddEventListenerRequest)
  {
    int i = paramAddEventListenerRequest.getEventType();
    Object localObject1 = paramAddEventListenerRequest.getDriveId();
    zzx.zzac(zzg.zza(i, (DriveId)localObject1));
    boolean bool = isConnected();
    localObject1 = "Client must be connected";
    zzx.zza(bool, localObject1);
    bool = this.zzaqL;
    if (!bool)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new com/google/android/gms/drive/internal/zzu$3;
    ((zzu.3)localObject2).<init>(this, paramGoogleApiClient, paramAddEventListenerRequest);
    return paramGoogleApiClient.zzb((zza.zza)localObject2);
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, AddEventListenerRequest paramAddEventListenerRequest, zzae paramzzae)
  {
    zzu.1 local1 = new com/google/android/gms/drive/internal/zzu$1;
    local1.<init>(this, paramGoogleApiClient, paramAddEventListenerRequest, paramzzae);
    return paramGoogleApiClient.zzb(local1);
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, RemoveEventListenerRequest paramRemoveEventListenerRequest, zzae paramzzae)
  {
    zzu.2 local2 = new com/google/android/gms/drive/internal/zzu$2;
    local2.<init>(this, paramGoogleApiClient, paramRemoveEventListenerRequest, paramzzae);
    return paramGoogleApiClient.zzb(local2);
  }
  
  PendingResult cancelPendingActions(GoogleApiClient paramGoogleApiClient, List paramList)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramList != null)
    {
      bool2 = bool1;
      zzx.zzac(bool2);
      bool2 = paramList.isEmpty();
      if (bool2) {
        break label69;
      }
    }
    for (;;)
    {
      zzx.zzac(bool1);
      zzx.zza(isConnected(), "Client must be connected");
      zzu.5 local5 = new com/google/android/gms/drive/internal/zzu$5;
      local5.<init>(this, paramGoogleApiClient, paramList);
      return paramGoogleApiClient.zzb(local5);
      bool2 = false;
      local5 = null;
      break;
      label69:
      bool1 = false;
    }
  }
  
  public void disconnect()
  {
    boolean bool = isConnected();
    if (bool) {}
    try
    {
      localObject1 = zzqJ();
      localObject1 = (zzam)localObject1;
      ??? = new com/google/android/gms/drive/internal/DisconnectRequest;
      ((DisconnectRequest)???).<init>();
      ((zzam)localObject1).zza((DisconnectRequest)???);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject1;
      for (;;) {}
    }
    super.disconnect();
    synchronized (this.zzaqP)
    {
      localObject1 = this.zzaqP;
      ((Map)localObject1).clear();
      synchronized (this.zzaqQ)
      {
        localObject1 = this.zzaqQ;
        ((Map)localObject1).clear();
        synchronized (this.zzaqR)
        {
          localObject1 = this.zzaqR;
          ((Map)localObject1).clear();
        }
      }
    }
    synchronized (this.zzaqS)
    {
      localObject1 = this.zzaqS;
      ((Map)localObject1).clear();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
      localObject3 = finally;
      throw ((Throwable)localObject3);
      localObject4 = finally;
      throw ((Throwable)localObject4);
    }
  }
  
  PendingResult zza(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId)
  {
    AddEventListenerRequest localAddEventListenerRequest = new com/google/android/gms/drive/internal/AddEventListenerRequest;
    localAddEventListenerRequest.<init>(1, paramDriveId);
    return zza(paramGoogleApiClient, localAddEventListenerRequest);
  }
  
  PendingResult zza(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId, ChangeListener paramChangeListener)
  {
    int i = 1;
    zzx.zzac(zzg.zza(i, paramDriveId));
    Object localObject1 = "listener";
    zzx.zzb(paramChangeListener, localObject1);
    boolean bool1 = isConnected();
    Object localObject3 = "Client must be connected";
    zzx.zza(bool1, localObject3);
    for (;;)
    {
      synchronized (this.zzaqP)
      {
        localObject1 = this.zzaqP;
        localObject1 = ((Map)localObject1).get(paramDriveId);
        localObject1 = (Map)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
          localObject3 = this.zzaqP;
          ((Map)localObject3).put(paramDriveId, localObject1);
          localObject3 = localObject1;
          localObject1 = ((Map)localObject3).get(paramChangeListener);
          localObject1 = (zzae)localObject1;
          if (localObject1 == null)
          {
            localObject1 = new com/google/android/gms/drive/internal/zzae;
            Looper localLooper = getLooper();
            Context localContext = getContext();
            ((zzae)localObject1).<init>(localLooper, localContext, i, paramChangeListener);
            ((Map)localObject3).put(paramChangeListener, localObject1);
            ((zzae)localObject1).zzdg(i);
            localObject3 = new com/google/android/gms/drive/internal/AddEventListenerRequest;
            ((AddEventListenerRequest)localObject3).<init>(i, paramDriveId);
            localObject1 = zza(paramGoogleApiClient, (AddEventListenerRequest)localObject3, (zzae)localObject1);
            return (PendingResult)localObject1;
          }
          boolean bool2 = ((zzae)localObject1).zzdh(i);
          if (!bool2) {
            continue;
          }
          localObject1 = new com/google/android/gms/drive/internal/zzs$zzj;
          localObject3 = Status.zzagC;
          ((zzs.zzj)localObject1).<init>(paramGoogleApiClient, (Status)localObject3);
        }
      }
      localObject3 = localObject2;
    }
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if (paramBundle != null)
    {
      Object localObject = getClass().getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject);
      localObject = (DriveId)paramBundle.getParcelable("com.google.android.gms.drive.root_id");
      this.zzaqM = ((DriveId)localObject);
      localObject = (DriveId)paramBundle.getParcelable("com.google.android.gms.drive.appdata_id");
      this.zzaqN = ((DriveId)localObject);
      boolean bool = true;
      this.zzaqO = bool;
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  protected zzam zzaZ(IBinder paramIBinder)
  {
    return zzam.zza.zzba(paramIBinder);
  }
  
  PendingResult zzb(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId)
  {
    return zza(paramGoogleApiClient, 1, paramDriveId);
  }
  
  PendingResult zzb(GoogleApiClient paramGoogleApiClient, DriveId paramDriveId, ChangeListener paramChangeListener)
  {
    int i = 1;
    zzx.zzac(zzg.zza(i, paramDriveId));
    boolean bool = isConnected();
    Object localObject1 = "Client must be connected";
    zzx.zza(bool, localObject1);
    Object localObject2 = "listener";
    zzx.zzb(paramChangeListener, localObject2);
    for (;;)
    {
      synchronized (this.zzaqP)
      {
        localObject2 = this.zzaqP;
        localObject2 = ((Map)localObject2).get(paramDriveId);
        localObject2 = (Map)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new com/google/android/gms/drive/internal/zzs$zzj;
          localObject1 = Status.zzagC;
          ((zzs.zzj)localObject2).<init>(paramGoogleApiClient, (Status)localObject1);
          return (PendingResult)localObject2;
        }
        localObject1 = ((Map)localObject2).remove(paramChangeListener);
        localObject1 = (zzae)localObject1;
        if (localObject1 == null)
        {
          localObject2 = new com/google/android/gms/drive/internal/zzs$zzj;
          localObject1 = Status.zzagC;
          ((zzs.zzj)localObject2).<init>(paramGoogleApiClient, (Status)localObject1);
        }
      }
      bool = ((Map)localObject3).isEmpty();
      if (bool)
      {
        localObject4 = this.zzaqP;
        ((Map)localObject4).remove(paramDriveId);
      }
      Object localObject4 = new com/google/android/gms/drive/internal/RemoveEventListenerRequest;
      ((RemoveEventListenerRequest)localObject4).<init>(paramDriveId, i);
      localObject4 = zza(paramGoogleApiClient, (RemoveEventListenerRequest)localObject4, (zzae)localObject1);
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.drive.ApiService.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.drive.internal.IDriveService";
  }
  
  public boolean zzmE()
  {
    String str1 = getContext().getPackageName();
    String str2 = this.zzUW;
    boolean bool = str1.equals(str2);
    if (bool)
    {
      bool = zztd();
      if (bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  protected Bundle zzml()
  {
    Object localObject1 = getContext().getPackageName();
    zzx.zzz(localObject1);
    Object localObject2 = zzqH().zzqt();
    boolean bool1 = ((Set)localObject2).isEmpty();
    if (!bool1) {
      bool1 = true;
    }
    for (;;)
    {
      zzx.zzab(bool1);
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      String str = this.zzUW;
      boolean bool2 = ((String)localObject1).equals(str);
      if (!bool2)
      {
        localObject1 = "proxy_package_name";
        str = this.zzUW;
        ((Bundle)localObject2).putString((String)localObject1, str);
      }
      localObject1 = this.zzaqK;
      ((Bundle)localObject2).putAll((Bundle)localObject1);
      return (Bundle)localObject2;
      bool1 = false;
      localObject2 = null;
    }
  }
  
  public boolean zzqK()
  {
    return true;
  }
  
  boolean zztd()
  {
    Context localContext = getContext();
    int i = Process.myUid();
    return GooglePlayServicesUtil.zzf(localContext, i);
  }
  
  public zzam zzte()
  {
    return (zzam)zzqJ();
  }
  
  public DriveId zztf()
  {
    return this.zzaqM;
  }
  
  public DriveId zztg()
  {
    return this.zzaqN;
  }
  
  public boolean zzth()
  {
    return this.zzaqO;
  }
  
  public boolean zzti()
  {
    return this.zzaqL;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */