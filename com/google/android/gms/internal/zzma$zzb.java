package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class zzma$zzb
  extends Drawable.ConstantState
{
  int zzakp;
  int zzakq;
  
  zzma$zzb(zzb paramzzb)
  {
    if (paramzzb != null)
    {
      int i = paramzzb.zzakp;
      this.zzakp = i;
      i = paramzzb.zzakq;
      this.zzakq = i;
    }
  }
  
  public int getChangingConfigurations()
  {
    return this.zzakp;
  }
  
  public Drawable newDrawable()
  {
    zzma localzzma = new com/google/android/gms/internal/zzma;
    localzzma.<init>(this);
    return localzzma;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzma$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */