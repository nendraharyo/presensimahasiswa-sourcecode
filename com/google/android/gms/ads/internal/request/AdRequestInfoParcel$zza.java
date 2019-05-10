package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

public final class AdRequestInfoParcel$zza
{
  public final ApplicationInfo applicationInfo;
  public final Bundle zzHA;
  public final boolean zzHB;
  public final Messenger zzHC;
  public final int zzHD;
  public final int zzHE;
  public final float zzHF;
  public final String zzHG;
  public final long zzHH;
  public final String zzHI;
  public final List zzHJ;
  public final List zzHK;
  public final CapabilityParcel zzHM;
  public final String zzHN;
  public final float zzHO;
  public final int zzHP;
  public final int zzHQ;
  public final Bundle zzHs;
  public final AdRequestParcel zzHt;
  public final PackageInfo zzHu;
  public final String zzHw;
  public final String zzHx;
  public final Bundle zzHy;
  public final int zzHz;
  public final NativeAdOptionsParcel zzrD;
  public final List zzrH;
  public final String zzri;
  public final String zzrj;
  public final VersionInfoParcel zzrl;
  public final AdSizeParcel zzrp;
  
  public AdRequestInfoParcel$zza(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt1, int paramInt2, float paramFloat1, String paramString4, long paramLong, String paramString5, List paramList3, String paramString6, NativeAdOptionsParcel paramNativeAdOptionsParcel, CapabilityParcel paramCapabilityParcel, String paramString7, float paramFloat2, int paramInt3, int paramInt4)
  {
    this.zzHs = paramBundle1;
    this.zzHt = paramAdRequestParcel;
    this.zzrp = paramAdSizeParcel;
    this.zzrj = paramString1;
    this.applicationInfo = paramApplicationInfo;
    this.zzHu = paramPackageInfo;
    this.zzHw = paramString2;
    this.zzHx = paramString3;
    this.zzrl = paramVersionInfoParcel;
    this.zzHy = paramBundle2;
    this.zzHB = paramBoolean;
    this.zzHC = paramMessenger;
    this.zzHD = paramInt1;
    this.zzHE = paramInt2;
    this.zzHF = paramFloat1;
    if (paramList1 != null)
    {
      int i = paramList1.size();
      if (i > 0)
      {
        i = 3;
        this.zzHz = i;
        this.zzrH = paramList1;
        this.zzHK = paramList2;
        this.zzHA = paramBundle3;
        this.zzHG = paramString4;
        this.zzHH = paramLong;
        this.zzHI = paramString5;
        this.zzHJ = paramList3;
        this.zzri = paramString6;
        this.zzrD = paramNativeAdOptionsParcel;
        this.zzHM = paramCapabilityParcel;
        this.zzHN = paramString7;
        this.zzHO = paramFloat2;
        this.zzHP = paramInt3;
        this.zzHQ = paramInt4;
        return;
      }
    }
    boolean bool = paramAdSizeParcel.zzum;
    int j;
    if (bool) {
      j = 4;
    }
    for (this.zzHz = j;; this.zzHz = 0)
    {
      this.zzrH = null;
      j = 0;
      this.zzHK = null;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\AdRequestInfoParcel$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */