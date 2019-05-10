package com.google.android.gms.analytics.internal;

public abstract class zzd
  extends zzc
{
  private boolean zzQk;
  private boolean zzQl;
  
  protected zzd(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public boolean isInitialized()
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
  
  public void zza()
  {
    zziJ();
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */