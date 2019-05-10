package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzr;

class zziu$1
  implements DialogInterface.OnClickListener
{
  zziu$1(zziu paramzziu, String paramString) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    zzir localzzir = zzr.zzbC();
    Context localContext = zziu.zza(this.zzMm);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.SEND");
    localIntent = localIntent.setType("text/plain");
    String str = this.zzMl;
    localIntent = Intent.createChooser(localIntent.putExtra("android.intent.extra.TEXT", str), "Share via");
    localzzir.zzb(localContext, localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zziu$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */