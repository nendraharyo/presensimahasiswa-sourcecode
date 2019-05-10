package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.zzc;
import java.io.IOException;
import java.io.InputStream;

class zzgw$5
  implements zziw.zza
{
  zzgw$5(zzgw paramzzgw, boolean paramBoolean, double paramDouble, String paramString) {}
  
  public zzc zzg(InputStream paramInputStream)
  {
    i = 2;
    j = 0;
    localzzc = null;
    try
    {
      localObject1 = zzna.zzk(paramInputStream);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
        continue;
        boolean bool = false;
        BitmapDrawable localBitmapDrawable = null;
        int k = localObject2.length;
        localObject2 = BitmapFactory.decodeByteArray((byte[])localObject2, 0, k);
        if (localObject2 == null)
        {
          localObject2 = this.zzGP;
          bool = this.zzGZ;
          ((zzgw)localObject2).zza(i, bool);
        }
        else
        {
          double d1 = this.zzHa;
          double d2 = 160.0D * d1;
          j = (int)d2;
          ((Bitmap)localObject2).setDensity(j);
          localzzc = new com/google/android/gms/ads/internal/formats/zzc;
          localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
          Resources localResources = Resources.getSystem();
          localBitmapDrawable.<init>(localResources, (Bitmap)localObject2);
          localObject2 = Uri.parse(this.zzDr);
          d1 = this.zzHa;
          localzzc.<init>(localBitmapDrawable, (Uri)localObject2, d1);
        }
      }
    }
    if (localObject1 == null)
    {
      localObject1 = this.zzGP;
      bool = this.zzGZ;
      ((zzgw)localObject1).zza(i, bool);
      return localzzc;
    }
  }
  
  public zzc zzgo()
  {
    zzgw localzzgw = this.zzGP;
    boolean bool = this.zzGZ;
    localzzgw.zza(2, bool);
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgw$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */