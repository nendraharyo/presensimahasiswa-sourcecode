package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class SupportLifecycleFragmentImpl
  extends zzw
{
  protected void zzb(int paramInt, ConnectionResult paramConnectionResult)
  {
    int i = paramConnectionResult.getErrorCode();
    i locali = getActivity();
    GooglePlayServicesUtil.showErrorDialogFragment(i, locali, this, 2, this);
  }
  
  protected void zzc(int paramInt, ConnectionResult paramConnectionResult)
  {
    Object localObject1 = zzpS();
    Object localObject2 = getActivity();
    localObject1 = ((GoogleApiAvailability)localObject1).zza((Activity)localObject2, this);
    localObject2 = getActivity().getApplicationContext();
    SupportLifecycleFragmentImpl.1 local1 = new com/google/android/gms/common/api/internal/SupportLifecycleFragmentImpl$1;
    local1.<init>(this, (Dialog)localObject1);
    localObject1 = zzn.zza((Context)localObject2, local1);
    this.zzaiD = ((zzn)localObject1);
  }
  
  protected GoogleApiAvailability zzpS()
  {
    return GoogleApiAvailability.getInstance();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\SupportLifecycleFragmentImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */