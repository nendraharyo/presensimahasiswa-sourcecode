package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaa;
import com.google.android.gms.ads.internal.client.zzaa.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{
  public static final String DEVICE_ID_EMULATOR = zzaa.DEVICE_ID_EMULATOR;
  public static final int ERROR_CODE_INTERNAL_ERROR = 0;
  public static final int ERROR_CODE_INVALID_REQUEST = 1;
  public static final int ERROR_CODE_NETWORK_ERROR = 2;
  public static final int ERROR_CODE_NO_FILL = 3;
  public static final int GENDER_FEMALE = 2;
  public static final int GENDER_MALE = 1;
  public static final int GENDER_UNKNOWN = 0;
  public static final int MAX_CONTENT_URL_LENGTH = 512;
  private final zzaa zzoE;
  
  private AdRequest(AdRequest.Builder paramBuilder)
  {
    zzaa localzzaa = new com/google/android/gms/ads/internal/client/zzaa;
    zzaa.zza localzza = AdRequest.Builder.zza(paramBuilder);
    localzzaa.<init>(localzza);
    this.zzoE = localzzaa;
  }
  
  public Date getBirthday()
  {
    return this.zzoE.getBirthday();
  }
  
  public String getContentUrl()
  {
    return this.zzoE.getContentUrl();
  }
  
  public Bundle getCustomEventExtrasBundle(Class paramClass)
  {
    return this.zzoE.getCustomEventExtrasBundle(paramClass);
  }
  
  public int getGender()
  {
    return this.zzoE.getGender();
  }
  
  public Set getKeywords()
  {
    return this.zzoE.getKeywords();
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
  
  public boolean isTestDevice(Context paramContext)
  {
    return this.zzoE.isTestDevice(paramContext);
  }
  
  public zzaa zzaE()
  {
    return this.zzoE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\AdRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */