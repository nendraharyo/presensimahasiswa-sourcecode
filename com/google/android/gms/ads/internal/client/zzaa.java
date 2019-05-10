package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public final class zzaa
{
  public static final String DEVICE_ID_EMULATOR = zzn.zzcS().zzaH("emulator");
  private final Date zzbf;
  private final Set zzbh;
  private final Location zzbj;
  private final boolean zzpE;
  private final int zztT;
  private final int zztW;
  private final String zztX;
  private final String zztZ;
  private final Bundle zzuA;
  private final Map zzuB;
  private final SearchAdRequest zzuC;
  private final Set zzuD;
  private final Set zzuE;
  private final Bundle zzub;
  private final String zzud;
  private final boolean zzuf;
  
  public zzaa(zzaa.zza paramzza)
  {
    this(paramzza, null);
  }
  
  public zzaa(zzaa.zza paramzza, SearchAdRequest paramSearchAdRequest)
  {
    Object localObject = zzaa.zza.zza(paramzza);
    this.zzbf = ((Date)localObject);
    localObject = zzaa.zza.zzb(paramzza);
    this.zztZ = ((String)localObject);
    int i = zzaa.zza.zzc(paramzza);
    this.zztT = i;
    localObject = Collections.unmodifiableSet(zzaa.zza.zzd(paramzza));
    this.zzbh = ((Set)localObject);
    localObject = zzaa.zza.zze(paramzza);
    this.zzbj = ((Location)localObject);
    boolean bool1 = zzaa.zza.zzf(paramzza);
    this.zzpE = bool1;
    localObject = zzaa.zza.zzg(paramzza);
    this.zzuA = ((Bundle)localObject);
    localObject = Collections.unmodifiableMap(zzaa.zza.zzh(paramzza));
    this.zzuB = ((Map)localObject);
    localObject = zzaa.zza.zzi(paramzza);
    this.zztX = ((String)localObject);
    localObject = zzaa.zza.zzj(paramzza);
    this.zzud = ((String)localObject);
    this.zzuC = paramSearchAdRequest;
    int j = zzaa.zza.zzk(paramzza);
    this.zztW = j;
    localObject = Collections.unmodifiableSet(zzaa.zza.zzl(paramzza));
    this.zzuD = ((Set)localObject);
    localObject = zzaa.zza.zzm(paramzza);
    this.zzub = ((Bundle)localObject);
    localObject = Collections.unmodifiableSet(zzaa.zza.zzn(paramzza));
    this.zzuE = ((Set)localObject);
    boolean bool2 = zzaa.zza.zzo(paramzza);
    this.zzuf = bool2;
  }
  
  public Date getBirthday()
  {
    return this.zzbf;
  }
  
  public String getContentUrl()
  {
    return this.zztZ;
  }
  
  public Bundle getCustomEventExtrasBundle(Class paramClass)
  {
    Bundle localBundle = this.zzuA;
    String str = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
    localBundle = localBundle.getBundle(str);
    if (localBundle != null) {
      str = paramClass.getClass().getName();
    }
    for (localBundle = localBundle.getBundle(str);; localBundle = null) {
      return localBundle;
    }
  }
  
  public Bundle getCustomTargeting()
  {
    return this.zzub;
  }
  
  public int getGender()
  {
    return this.zztT;
  }
  
  public Set getKeywords()
  {
    return this.zzbh;
  }
  
  public Location getLocation()
  {
    return this.zzbj;
  }
  
  public boolean getManualImpressionsEnabled()
  {
    return this.zzpE;
  }
  
  public NetworkExtras getNetworkExtras(Class paramClass)
  {
    return (NetworkExtras)this.zzuB.get(paramClass);
  }
  
  public Bundle getNetworkExtrasBundle(Class paramClass)
  {
    Bundle localBundle = this.zzuA;
    String str = paramClass.getName();
    return localBundle.getBundle(str);
  }
  
  public String getPublisherProvidedId()
  {
    return this.zztX;
  }
  
  public boolean isDesignedForFamilies()
  {
    return this.zzuf;
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    Set localSet = this.zzuD;
    String str = zzn.zzcS().zzT(paramContext);
    return localSet.contains(str);
  }
  
  public String zzcZ()
  {
    return this.zzud;
  }
  
  public SearchAdRequest zzda()
  {
    return this.zzuC;
  }
  
  public Map zzdb()
  {
    return this.zzuB;
  }
  
  public Bundle zzdc()
  {
    return this.zzuA;
  }
  
  public int zzdd()
  {
    return this.zztW;
  }
  
  public Set zzde()
  {
    return this.zzuE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzaa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */