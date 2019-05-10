package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzch.zza;

public class zzc
  extends zzch.zza
{
  private final Uri mUri;
  private final Drawable zzxU;
  private final double zzxV;
  
  public zzc(Drawable paramDrawable, Uri paramUri, double paramDouble)
  {
    this.zzxU = paramDrawable;
    this.mUri = paramUri;
    this.zzxV = paramDouble;
  }
  
  public double getScale()
  {
    return this.zzxV;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
  
  public zzd zzdJ()
  {
    return zze.zzC(this.zzxU);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */