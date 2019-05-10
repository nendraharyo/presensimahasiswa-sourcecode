package com.google.android.gms.measurement.internal;

abstract class zzz
  extends zzy
{
  private boolean zzQk;
  private boolean zzQl;
  private boolean zzaYC;
  
  zzz(zzw paramzzw)
  {
    super(paramzzw);
    this.zzaTV.zzb(this);
  }
  
  boolean isInitialized()
  {
    boolean bool = this.zzQk;
    if (bool)
    {
      bool = this.zzQl;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  boolean zzDi()
  {
    return this.zzaYC;
  }
  
  public final void zza()
  {
    boolean bool = this.zzQk;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Can't initialize twice");
      throw localIllegalStateException;
    }
    zziJ();
    this.zzaTV.zzDg();
    this.zzQk = true;
  }
  
  protected abstract void zziJ();
  
  protected void zzjv()
  {
    boolean bool = isInitialized();
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Not initialized");
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */