package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzaa.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest
{
  public static final int BORDER_TYPE_DASHED = 1;
  public static final int BORDER_TYPE_DOTTED = 2;
  public static final int BORDER_TYPE_NONE = 0;
  public static final int BORDER_TYPE_SOLID = 3;
  public static final int CALL_BUTTON_COLOR_DARK = 2;
  public static final int CALL_BUTTON_COLOR_LIGHT = 0;
  public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
  public static final String DEVICE_ID_EMULATOR = zzaa.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  private final int zzOA;
  private final int zzOB;
  private final int zzOC;
  private final int zzOD;
  private final String zzOE;
  private final int zzOF;
  private final String zzOG;
  private final int zzOH;
  private final int zzOI;
  private final String zzOJ;
  private final int zzOx;
  private final int zzOy;
  private final int zzOz;
  private final zzaa zzoE;
  private final int zzxO;
  
  private SearchAdRequest(SearchAdRequest.Builder paramBuilder)
  {
    int i = SearchAdRequest.Builder.zza(paramBuilder);
    this.zzOx = i;
    i = SearchAdRequest.Builder.zzb(paramBuilder);
    this.zzxO = i;
    i = SearchAdRequest.Builder.zzc(paramBuilder);
    this.zzOy = i;
    i = SearchAdRequest.Builder.zzd(paramBuilder);
    this.zzOz = i;
    i = SearchAdRequest.Builder.zze(paramBuilder);
    this.zzOA = i;
    i = SearchAdRequest.Builder.zzf(paramBuilder);
    this.zzOB = i;
    i = SearchAdRequest.Builder.zzg(paramBuilder);
    this.zzOC = i;
    i = SearchAdRequest.Builder.zzh(paramBuilder);
    this.zzOD = i;
    Object localObject = SearchAdRequest.Builder.zzi(paramBuilder);
    this.zzOE = ((String)localObject);
    i = SearchAdRequest.Builder.zzj(paramBuilder);
    this.zzOF = i;
    localObject = SearchAdRequest.Builder.zzk(paramBuilder);
    this.zzOG = ((String)localObject);
    i = SearchAdRequest.Builder.zzl(paramBuilder);
    this.zzOH = i;
    i = SearchAdRequest.Builder.zzm(paramBuilder);
    this.zzOI = i;
    localObject = SearchAdRequest.Builder.zzn(paramBuilder);
    this.zzOJ = ((String)localObject);
    localObject = new com/google/android/gms/ads/internal/client/zzaa;
    zzaa.zza localzza = SearchAdRequest.Builder.zzo(paramBuilder);
    ((zzaa)localObject).<init>(localzza, this);
    this.zzoE = ((zzaa)localObject);
  }
  
  public int getAnchorTextColor()
  {
    return this.zzOx;
  }
  
  public int getBackgroundColor()
  {
    return this.zzxO;
  }
  
  public int getBackgroundGradientBottom()
  {
    return this.zzOy;
  }
  
  public int getBackgroundGradientTop()
  {
    return this.zzOz;
  }
  
  public int getBorderColor()
  {
    return this.zzOA;
  }
  
  public int getBorderThickness()
  {
    return this.zzOB;
  }
  
  public int getBorderType()
  {
    return this.zzOC;
  }
  
  public int getCallButtonColor()
  {
    return this.zzOD;
  }
  
  public String getCustomChannels()
  {
    return this.zzOE;
  }
  
  public Bundle getCustomEventExtrasBundle(Class paramClass)
  {
    return this.zzoE.getCustomEventExtrasBundle(paramClass);
  }
  
  public int getDescriptionTextColor()
  {
    return this.zzOF;
  }
  
  public String getFontFace()
  {
    return this.zzOG;
  }
  
  public int getHeaderTextColor()
  {
    return this.zzOH;
  }
  
  public int getHeaderTextSize()
  {
    return this.zzOI;
  }
  
  public Location getLocation()
  {
    return this.zzoE.getLocation();
  }
  
  public NetworkExtras getNetworkExtras(Class paramClass)
  {
    return this.zzoE.getNetworkExtras(paramClass);
  }
  
  public Bundle getNetworkExtrasBundle(Class paramClass)
  {
    return this.zzoE.getNetworkExtrasBundle(paramClass);
  }
  
  public String getQuery()
  {
    return this.zzOJ;
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    return this.zzoE.isTestDevice(paramContext);
  }
  
  zzaa zzaE()
  {
    return this.zzoE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\search\SearchAdRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */