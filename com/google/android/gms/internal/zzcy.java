package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

public class zzcy
  extends zzct.zza
{
  private final NativeCustomTemplateAd.OnCustomClickListener zzyU;
  
  public zzcy(NativeCustomTemplateAd.OnCustomClickListener paramOnCustomClickListener)
  {
    this.zzyU = paramOnCustomClickListener;
  }
  
  public void zza(zzcp paramzzcp, String paramString)
  {
    NativeCustomTemplateAd.OnCustomClickListener localOnCustomClickListener = this.zzyU;
    zzcq localzzcq = new com/google/android/gms/internal/zzcq;
    localzzcq.<init>(paramzzcp);
    localOnCustomClickListener.onCustomClick(localzzcq, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */