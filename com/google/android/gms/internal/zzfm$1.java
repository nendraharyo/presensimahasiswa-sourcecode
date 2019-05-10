package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzr;

class zzfm$1
  implements DialogInterface.OnClickListener
{
  zzfm$1(zzfm paramzzfm) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = this.zzCZ.createIntent();
    zzir localzzir = zzr.zzbC();
    Context localContext = zzfm.zza(this.zzCZ);
    localzzir.zzb(localContext, localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfm$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */