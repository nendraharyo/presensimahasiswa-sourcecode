package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

public abstract interface zzb
  extends IInterface
{
  public abstract void zza(int paramInt, Bundle paramBundle1, Bundle paramBundle2);
  
  public abstract void zza(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor);
  
  public abstract void zza(int paramInt, Bundle paramBundle, SafeParcelResponse paramSafeParcelResponse);
  
  public abstract void zza(int paramInt, PersonEntity paramPersonEntity);
  
  public abstract void zza(DataHolder paramDataHolder, String paramString);
  
  public abstract void zza(DataHolder paramDataHolder, String paramString1, String paramString2);
  
  public abstract void zzbe(Status paramStatus);
  
  public abstract void zzfE(String paramString);
  
  public abstract void zzfF(String paramString);
  
  public abstract void zzi(int paramInt, Bundle paramBundle);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */