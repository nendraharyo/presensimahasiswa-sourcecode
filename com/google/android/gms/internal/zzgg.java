package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IInterface;

public abstract interface zzgg
  extends IInterface
{
  public abstract void finishPurchase();
  
  public abstract String getProductId();
  
  public abstract Intent getPurchaseData();
  
  public abstract int getResultCode();
  
  public abstract boolean isVerified();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */