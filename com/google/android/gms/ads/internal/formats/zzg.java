package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import java.util.Map;
import org.json.JSONObject;

public class zzg
  extends zzi
{
  private Object zzpV;
  private zzfb zzyl;
  private zzfc zzym;
  private final zzp zzyn;
  private zzh zzyo;
  private boolean zzyp = false;
  
  private zzg(Context paramContext, zzp paramzzp, zzan paramzzan)
  {
    super(paramContext, paramzzp, null, paramzzan, null, null, null);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzyn = paramzzp;
  }
  
  public zzg(Context paramContext, zzp paramzzp, zzan paramzzan, zzfb paramzzfb)
  {
    this(paramContext, paramzzp, paramzzan);
    this.zzyl = paramzzfb;
  }
  
  public zzg(Context paramContext, zzp paramzzp, zzan paramzzan, zzfc paramzzfc)
  {
    this(paramContext, paramzzp, paramzzan);
    this.zzym = paramzzfc;
  }
  
  public void recordImpression()
  {
    Object localObject1 = "recordImpression must be called on the main UI thread.";
    zzx.zzcD((String)localObject1);
    Object localObject3 = this.zzpV;
    boolean bool = true;
    for (;;)
    {
      try
      {
        zzn(bool);
        localObject1 = this.zzyo;
        if (localObject1 != null)
        {
          localObject1 = this.zzyo;
          ((zzh)localObject1).recordImpression();
          localObject1 = this.zzyn;
          ((zzp)localObject1).recordImpression();
          return;
        }
        try
        {
          localObject1 = this.zzyl;
          if (localObject1 == null) {
            break label111;
          }
          localObject1 = this.zzyl;
          bool = ((zzfb)localObject1).getOverrideImpressionRecording();
          if (bool) {
            break label111;
          }
          localObject1 = this.zzyl;
          ((zzfb)localObject1).recordImpression();
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Failed to call recordImpression";
          zzin.zzd(str, localRemoteException);
        }
        continue;
        localzzfc = this.zzym;
      }
      finally {}
      label111:
      zzfc localzzfc;
      if (localzzfc != null)
      {
        localzzfc = this.zzym;
        bool = localzzfc.getOverrideImpressionRecording();
        if (!bool)
        {
          localzzfc = this.zzym;
          localzzfc.recordImpression();
        }
      }
    }
  }
  
  public zzb zza(View.OnClickListener paramOnClickListener)
  {
    return null;
  }
  
  public void zza(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    Object localObject1 = "performClick must be called on the main UI thread.";
    zzx.zzcD((String)localObject1);
    synchronized (this.zzpV)
    {
      localObject1 = this.zzyo;
      Object localObject4;
      if (localObject1 != null)
      {
        localObject1 = this.zzyo;
        localObject4 = paramView;
        ((zzh)localObject1).zza(paramView, paramMap, paramJSONObject1, paramJSONObject2, paramJSONObject3);
        localObject1 = this.zzyn;
        ((zzp)localObject1).onAdClicked();
      }
      for (;;)
      {
        return;
        try
        {
          localObject1 = this.zzyl;
          if (localObject1 != null)
          {
            localObject1 = this.zzyl;
            bool = ((zzfb)localObject1).getOverrideClickHandling();
            if (!bool)
            {
              localObject1 = this.zzyl;
              localObject4 = zze.zzC(paramView);
              ((zzfb)localObject1).zzc((zzd)localObject4);
              localObject1 = this.zzyn;
              ((zzp)localObject1).onAdClicked();
            }
          }
          localObject1 = this.zzym;
          if (localObject1 == null) {
            continue;
          }
          localObject1 = this.zzym;
          boolean bool = ((zzfc)localObject1).getOverrideClickHandling();
          if (bool) {
            continue;
          }
          localObject1 = this.zzym;
          localObject4 = zze.zzC(paramView);
          ((zzfc)localObject1).zzc((zzd)localObject4);
          localObject1 = this.zzyn;
          ((zzp)localObject1).onAdClicked();
        }
        catch (RemoteException localRemoteException)
        {
          localObject4 = "Failed to call performClick";
          zzin.zzd((String)localObject4, localRemoteException);
        }
      }
    }
  }
  
  public void zzc(zzh paramzzh)
  {
    synchronized (this.zzpV)
    {
      this.zzyo = paramzzh;
      return;
    }
  }
  
  public boolean zzdP()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzyp;
      return bool;
    }
  }
  
  public zzh zzdQ()
  {
    synchronized (this.zzpV)
    {
      zzh localzzh = this.zzyo;
      return localzzh;
    }
  }
  
  public zzjp zzdR()
  {
    return null;
  }
  
  public void zzg(View paramView)
  {
    localObject1 = this.zzpV;
    boolean bool = true;
    for (;;)
    {
      try
      {
        this.zzyp = bool;
        try
        {
          localObject2 = this.zzyl;
          if (localObject2 == null) {
            continue;
          }
          localObject2 = this.zzyl;
          localObject4 = zze.zzC(paramView);
          ((zzfb)localObject2).zzd((zzd)localObject4);
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject2;
          Object localObject4 = "Failed to call prepareAd";
          zzin.zzd((String)localObject4, localRemoteException);
          continue;
        }
        bool = false;
        localObject2 = null;
        this.zzyp = false;
        return;
      }
      finally {}
      localObject2 = this.zzym;
      if (localObject2 != null)
      {
        localObject2 = this.zzym;
        localObject4 = zze.zzC(paramView);
        ((zzfc)localObject2).zzd((zzd)localObject4);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */