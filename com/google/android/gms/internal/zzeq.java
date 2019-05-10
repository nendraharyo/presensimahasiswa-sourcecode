package com.google.android.gms.internal;

public final class zzeq
  extends zzez.zza
{
  private zzes.zza zzCb;
  private zzep zzCc;
  private final Object zzpV;
  
  public zzeq()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
  }
  
  public void onAdClicked()
  {
    synchronized (this.zzpV)
    {
      zzep localzzep = this.zzCc;
      if (localzzep != null)
      {
        localzzep = this.zzCc;
        localzzep.zzaY();
      }
      return;
    }
  }
  
  public void onAdClosed()
  {
    synchronized (this.zzpV)
    {
      zzep localzzep = this.zzCc;
      if (localzzep != null)
      {
        localzzep = this.zzCc;
        localzzep.zzaZ();
      }
      return;
    }
  }
  
  public void onAdFailedToLoad(int paramInt)
  {
    synchronized (this.zzpV)
    {
      zzes.zza localzza1 = this.zzCb;
      if (localzza1 != null)
      {
        i = 3;
        if (paramInt == i)
        {
          i = 1;
          zzes.zza localzza2 = this.zzCb;
          localzza2.zzr(i);
          i = 0;
          localzza1 = null;
          this.zzCb = null;
        }
      }
      else
      {
        return;
      }
      int i = 2;
    }
  }
  
  public void onAdLeftApplication()
  {
    synchronized (this.zzpV)
    {
      zzep localzzep = this.zzCc;
      if (localzzep != null)
      {
        localzzep = this.zzCc;
        localzzep.zzba();
      }
      return;
    }
  }
  
  public void onAdLoaded()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzCb;
      if (localObject2 != null)
      {
        localObject2 = this.zzCb;
        ((zzes.zza)localObject2).zzr(0);
        localObject2 = null;
        this.zzCb = null;
        return;
      }
      localObject2 = this.zzCc;
      if (localObject2 != null)
      {
        localObject2 = this.zzCc;
        ((zzep)localObject2).zzbc();
      }
    }
  }
  
  public void onAdOpened()
  {
    synchronized (this.zzpV)
    {
      zzep localzzep = this.zzCc;
      if (localzzep != null)
      {
        localzzep = this.zzCc;
        localzzep.zzbb();
      }
      return;
    }
  }
  
  public void zza(zzep paramzzep)
  {
    synchronized (this.zzpV)
    {
      this.zzCc = paramzzep;
      return;
    }
  }
  
  public void zza(zzes.zza paramzza)
  {
    synchronized (this.zzpV)
    {
      this.zzCb = paramzza;
      return;
    }
  }
  
  public void zza(zzfa paramzzfa)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzCb;
      if (localObject2 != null)
      {
        localObject2 = this.zzCb;
        ((zzes.zza)localObject2).zza(0, paramzzfa);
        localObject2 = null;
        this.zzCb = null;
        return;
      }
      localObject2 = this.zzCc;
      if (localObject2 != null)
      {
        localObject2 = this.zzCc;
        ((zzep)localObject2).zzbc();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */