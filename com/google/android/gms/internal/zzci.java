package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public class zzci
  extends NativeAd.Image
{
  private final Drawable mDrawable;
  private final Uri mUri;
  private final double zzxV;
  private final zzch zzyL;
  
  public zzci(zzch paramzzch)
  {
    this.zzyL = paramzzch;
    try
    {
      localObject1 = this.zzyL;
      localObject1 = ((zzch)localObject1).zzdJ();
      if (localObject1 == null) {
        break label97;
      }
      localObject1 = zze.zzp((zzd)localObject1);
      localObject1 = (Drawable)localObject1;
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        Object localObject1;
        localObject3 = "Failed to get drawable.";
        zzb.zzb((String)localObject3, localRemoteException1);
        localObject2 = null;
      }
    }
    this.mDrawable = ((Drawable)localObject1);
    try
    {
      localObject1 = this.zzyL;
      localUri = ((zzch)localObject1).getUri();
    }
    catch (RemoteException localRemoteException2)
    {
      for (;;)
      {
        double d;
        localObject3 = "Failed to get uri.";
        zzb.zzb((String)localObject3, localRemoteException2);
      }
    }
    this.mUri = localUri;
    d = 1.0D;
    try
    {
      localObject3 = this.zzyL;
      d = ((zzch)localObject3).getScale();
    }
    catch (RemoteException localRemoteException3)
    {
      for (;;)
      {
        Object localObject3;
        Object localObject2;
        String str = "Failed to get scale.";
        zzb.zzb(str, localRemoteException3);
      }
    }
    this.zzxV = d;
  }
  
  public Drawable getDrawable()
  {
    return this.mDrawable;
  }
  
  public double getScale()
  {
    return this.zzxV;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzci.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */