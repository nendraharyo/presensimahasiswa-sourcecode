package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class AdRequestInfoParcel
  implements SafeParcelable
{
  public static final zzf CREATOR;
  public final ApplicationInfo applicationInfo;
  public final int versionCode;
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
  public final long zzHL;
  public final CapabilityParcel zzHM;
  public final String zzHN;
  public final float zzHO;
  public final int zzHP;
  public final int zzHQ;
  public final Bundle zzHs;
  public final AdRequestParcel zzHt;
  public final PackageInfo zzHu;
  public final String zzHv;
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
  
  static
  {
    zzf localzzf = new com/google/android/gms/ads/internal/request/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  AdRequestInfoParcel(int paramInt1, Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt2, List paramList1, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList2, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList3, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, int paramInt5, int paramInt6)
  {
    this.versionCode = paramInt1;
    this.zzHs = paramBundle1;
    this.zzHt = paramAdRequestParcel;
    this.zzrp = paramAdSizeParcel;
    this.zzrj = paramString1;
    this.applicationInfo = paramApplicationInfo;
    this.zzHu = paramPackageInfo;
    this.zzHv = paramString2;
    this.zzHw = paramString3;
    this.zzHx = paramString4;
    this.zzrl = paramVersionInfoParcel;
    this.zzHy = paramBundle2;
    this.zzHz = paramInt2;
    this.zzrH = paramList1;
    if (paramList3 == null)
    {
      localList = Collections.emptyList();
      this.zzHK = localList;
      this.zzHA = paramBundle3;
      this.zzHB = paramBoolean;
      this.zzHC = paramMessenger;
      this.zzHD = paramInt3;
      this.zzHE = paramInt4;
      this.zzHF = paramFloat1;
      this.zzHG = paramString5;
      this.zzHH = paramLong1;
      this.zzHI = paramString6;
      if (paramList2 != null) {
        break label230;
      }
    }
    label230:
    for (List localList = Collections.emptyList();; localList = Collections.unmodifiableList(paramList2))
    {
      this.zzHJ = localList;
      this.zzri = paramString7;
      this.zzrD = paramNativeAdOptionsParcel;
      this.zzHL = paramLong2;
      this.zzHM = paramCapabilityParcel;
      this.zzHN = paramString8;
      this.zzHO = paramFloat2;
      this.zzHP = paramInt5;
      this.zzHQ = paramInt6;
      return;
      localList = Collections.unmodifiableList(paramList3);
      break;
    }
  }
  
  public AdRequestInfoParcel(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt1, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt2, int paramInt3, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList3, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, int paramInt4, int paramInt5)
  {
    this(15, paramBundle1, paramAdRequestParcel, paramAdSizeParcel, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramVersionInfoParcel, paramBundle2, paramInt1, paramList1, paramBundle3, paramBoolean, paramMessenger, paramInt2, paramInt3, paramFloat1, paramString5, paramLong1, paramString6, paramList3, paramString7, paramNativeAdOptionsParcel, paramList2, paramLong2, paramCapabilityParcel, paramString8, paramFloat2, paramInt4, paramInt5);
  }
  
  public AdRequestInfoParcel(AdRequestInfoParcel.zza paramzza, String paramString, long paramLong)
  {
    this(localBundle1, localAdRequestParcel, localAdSizeParcel, str1, localApplicationInfo, localPackageInfo, paramString, str2, str3, localVersionInfoParcel, localBundle2, i, localList1, localList2, localBundle3, bool, localMessenger, j, k, f1, str4, l, str5, localList3, str6, localNativeAdOptionsParcel, paramLong, localCapabilityParcel, str7, f2, m, n);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\AdRequestInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */