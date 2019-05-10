package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class zzlq$zzb$zza
  extends zzlq.zza
{
  private final zzlr zzaeJ;
  
  public zzlq$zzb$zza(zzlq.zzb paramzzb, zzlr paramzzlr)
  {
    super(localzzlq, null);
    this.zzaeJ = paramzzlr;
  }
  
  private int zzj(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {}
    for (;;)
    {
      return paramInt1 * 320 / 1080;
      paramInt1 = paramInt2;
    }
  }
  
  public void onError(int paramInt)
  {
    Object localObject1 = zzlq.zzoC();
    Object localObject2 = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    localObject2[0] = localInteger;
    ((zzl)localObject1).zzb("onError: %d", (Object[])localObject2);
    zzlq.zza(this.zzaeK.zzaeH);
    localObject1 = this.zzaeK;
    zzlq.zzc localzzc = new com/google/android/gms/internal/zzlq$zzc;
    localObject2 = Status.zzagE;
    localzzc.<init>((Status)localObject2);
    ((zzlq.zzb)localObject1).zza(localzzc);
  }
  
  public void zza(int paramInt1, int paramInt2, Surface paramSurface)
  {
    Object localObject1 = zzlq.zzoC();
    Object localObject3 = new Object[0];
    ((zzl)localObject1).zzb("onConnected", (Object[])localObject3);
    localObject1 = this.zzaeJ.getContext();
    Object localObject4 = "display";
    localObject1 = (DisplayManager)((Context)localObject1).getSystemService((String)localObject4);
    if (localObject1 == null)
    {
      localObject1 = zzlq.zzoC();
      localObject3 = new Object[0];
      ((zzl)localObject1).zzc("Unable to get the display manager", (Object[])localObject3);
      localObject1 = this.zzaeK;
      localObject4 = new com/google/android/gms/internal/zzlq$zzc;
      localObject3 = Status.zzagE;
      ((zzlq.zzc)localObject4).<init>((Status)localObject3);
      ((zzlq.zzb)localObject1).zza((Result)localObject4);
    }
    for (;;)
    {
      return;
      zzlq.zza(this.zzaeK.zzaeH);
      int i = zzj(paramInt1, paramInt2);
      zzlq localzzlq = this.zzaeK.zzaeH;
      localObject4 = "private_display";
      int j = 2;
      localObject1 = ((DisplayManager)localObject1).createVirtualDisplay((String)localObject4, paramInt1, paramInt2, i, paramSurface, j);
      zzlq.zza(localzzlq, (VirtualDisplay)localObject1);
      localObject1 = zzlq.zzd(this.zzaeK.zzaeH);
      if (localObject1 == null)
      {
        localObject1 = zzlq.zzoC();
        localObject3 = new Object[0];
        ((zzl)localObject1).zzc("Unable to create virtual display", (Object[])localObject3);
        localObject1 = this.zzaeK;
        localObject4 = new com/google/android/gms/internal/zzlq$zzc;
        localObject3 = Status.zzagE;
        ((zzlq.zzc)localObject4).<init>((Status)localObject3);
        ((zzlq.zzb)localObject1).zza((Result)localObject4);
        continue;
      }
      localObject1 = zzlq.zzd(this.zzaeK.zzaeH).getDisplay();
      if (localObject1 == null)
      {
        localObject1 = zzlq.zzoC();
        localObject3 = new Object[0];
        ((zzl)localObject1).zzc("Virtual display does not have a display", (Object[])localObject3);
        localObject1 = this.zzaeK;
        localObject4 = new com/google/android/gms/internal/zzlq$zzc;
        localObject3 = Status.zzagE;
        ((zzlq.zzc)localObject4).<init>((Status)localObject3);
        ((zzlq.zzb)localObject1).zza((Result)localObject4);
        continue;
      }
      try
      {
        localObject1 = this.zzaeJ;
        localObject4 = this.zzaeK;
        localObject4 = ((zzlq.zzb)localObject4).zzaeH;
        localObject4 = zzlq.zzd((zzlq)localObject4);
        localObject4 = ((VirtualDisplay)localObject4).getDisplay();
        int k = ((Display)localObject4).getDisplayId();
        ((zzlr)localObject1).zza(this, k);
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = zzlq.zzoC();
        localObject3 = new Object[0];
        ((zzl)localObject2).zzc("Unable to provision the route's new virtual Display", (Object[])localObject3);
        localObject2 = this.zzaeK;
        localObject4 = new com/google/android/gms/internal/zzlq$zzc;
        localObject3 = Status.zzagE;
        ((zzlq.zzc)localObject4).<init>((Status)localObject3);
        ((zzlq.zzb)localObject2).zza((Result)localObject4);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;) {}
      }
    }
  }
  
  public void zzoD()
  {
    Object localObject1 = zzlq.zzoC();
    Object localObject2 = "onConnectedWithDisplay";
    Object localObject3 = new Object[0];
    ((zzl)localObject1).zzb((String)localObject2, (Object[])localObject3);
    localObject1 = zzlq.zzd(this.zzaeK.zzaeH).getDisplay();
    if (localObject1 != null)
    {
      localObject2 = this.zzaeK;
      localObject3 = new com/google/android/gms/internal/zzlq$zzc;
      ((zzlq.zzc)localObject3).<init>((Display)localObject1);
      ((zzlq.zzb)localObject2).zza((Result)localObject3);
    }
    for (;;)
    {
      return;
      localObject1 = zzlq.zzoC();
      localObject3 = new Object[0];
      ((zzl)localObject1).zzc("Virtual display no longer has a display", (Object[])localObject3);
      localObject1 = this.zzaeK;
      localObject2 = new com/google/android/gms/internal/zzlq$zzc;
      localObject3 = Status.zzagE;
      ((zzlq.zzc)localObject2).<init>((Status)localObject3);
      ((zzlq.zzb)localObject1).zza((Result)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlq$zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */