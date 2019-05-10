package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcg
  extends zzak
{
  private static final String ID = zzad.zzbR.toString();
  private final Context mContext;
  
  public zzcg(Context paramContext)
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
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return zzdf.zzR(i + "x" + j);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */