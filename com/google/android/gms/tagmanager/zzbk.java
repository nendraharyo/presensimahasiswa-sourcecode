package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzbk
  extends zzak
{
  private static final String ID = zzad.zzce.toString();
  private final Context mContext;
  
  public zzbk(Context paramContext)
  {
    super(str, arrayOfString);
    this.mContext = paramContext;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = this.mContext;
    localObject = zzaY((Context)localObject);
    if (localObject == null) {}
    for (localObject = zzdf.zzHF();; localObject = zzdf.zzR(localObject)) {
      return (zzag.zza)localObject;
    }
  }
  
  protected String zzaY(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzbk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */