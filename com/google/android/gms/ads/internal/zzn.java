package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzy.zza;
import com.google.android.gms.internal.zzin;

public class zzn
  extends zzy.zza
{
  private static final Object zzqy;
  private static zzn zzqz;
  private final Context mContext;
  private final Object zzpV;
  private boolean zzqA;
  private float zzqB;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  zzn(Context paramContext)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzqB = -1.0F;
    this.mContext = paramContext;
    this.zzqA = false;
  }
  
  public static zzn zzbs()
  {
    synchronized (zzqy)
    {
      zzn localzzn = zzqz;
      return localzzn;
    }
  }
  
  public static zzn zzr(Context paramContext)
  {
    synchronized (zzqy)
    {
      zzn localzzn = zzqz;
      if (localzzn == null)
      {
        localzzn = new com/google/android/gms/ads/internal/zzn;
        Context localContext = paramContext.getApplicationContext();
        localzzn.<init>(localContext);
        zzqz = localzzn;
      }
      localzzn = zzqz;
      return localzzn;
    }
  }
  
  public void setAppVolume(float paramFloat)
  {
    synchronized (this.zzpV)
    {
      this.zzqB = paramFloat;
      return;
    }
  }
  
  public void zza()
  {
    synchronized (zzqy)
    {
      boolean bool = this.zzqA;
      if (bool)
      {
        String str = "Mobile ads is initialized already.";
        zzin.zzaK(str);
        return;
      }
      bool = true;
      this.zzqA = bool;
    }
  }
  
  public float zzbt()
  {
    synchronized (this.zzpV)
    {
      float f = this.zzqB;
      return f;
    }
  }
  
  public boolean zzbu()
  {
    synchronized (this.zzpV)
    {
      float f = this.zzqB;
      boolean bool = f < 0.0F;
      if (!bool)
      {
        bool = true;
        f = Float.MIN_VALUE;
        return bool;
      }
      bool = false;
      f = 0.0F;
      Object localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */