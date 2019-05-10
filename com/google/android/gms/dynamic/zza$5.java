package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.GooglePlayServicesUtil;

final class zza$5
  implements View.OnClickListener
{
  zza$5(Context paramContext, int paramInt) {}
  
  public void onClick(View paramView)
  {
    Context localContext = this.zzxh;
    Intent localIntent = GooglePlayServicesUtil.zzbv(this.zzAe);
    localContext.startActivity(localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zza$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */