package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzx;

public final class Cast$CastOptions$Builder
{
  CastDevice zzZO;
  Cast.Listener zzZP;
  private int zzZQ;
  
  public Cast$CastOptions$Builder(CastDevice paramCastDevice, Cast.Listener paramListener)
  {
    zzx.zzb(paramCastDevice, "CastDevice parameter cannot be null");
    zzx.zzb(paramListener, "CastListener parameter cannot be null");
    this.zzZO = paramCastDevice;
    this.zzZP = paramListener;
    this.zzZQ = 0;
  }
  
  public Cast.CastOptions build()
  {
    Cast.CastOptions localCastOptions = new com/google/android/gms/cast/Cast$CastOptions;
    localCastOptions.<init>(this, null);
    return localCastOptions;
  }
  
  public Builder setVerboseLoggingEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = this.zzZQ | 0x1;
    }
    for (this.zzZQ = i;; this.zzZQ = i)
    {
      return this;
      i = this.zzZQ & 0xFFFFFFFE;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */