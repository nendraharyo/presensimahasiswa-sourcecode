package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;

public abstract interface zzrc
  extends IInterface
{
  public abstract void zza(Status paramStatus, AttestationData paramAttestationData);
  
  public abstract void zza(Status paramStatus, SafeBrowsingData paramSafeBrowsingData);
  
  public abstract void zzfI(String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */