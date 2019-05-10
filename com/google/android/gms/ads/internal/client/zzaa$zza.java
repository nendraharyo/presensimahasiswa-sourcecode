package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class zzaa$zza
{
  private Date zzbf;
  private Location zzbj;
  private boolean zzpE;
  private int zztT;
  private int zztW;
  private String zztX;
  private String zztZ;
  private final Bundle zzuA;
  private final HashSet zzuF;
  private final HashMap zzuG;
  private final HashSet zzuH;
  private final HashSet zzuI;
  private final Bundle zzub;
  private String zzud;
  private boolean zzuf;
  
  public zzaa$zza()
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzuF = ((HashSet)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.zzuA = ((Bundle)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzuG = ((HashMap)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzuH = ((HashSet)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.zzub = ((Bundle)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzuI = ((HashSet)localObject);
    this.zztT = i;
    this.zzpE = false;
    this.zztW = i;
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    this.zzpE = paramBoolean;
  }
  
  public void zzA(String paramString)
  {
    this.zzuF.add(paramString);
  }
  
  public void zzB(String paramString)
  {
    this.zzuH.add(paramString);
  }
  
  public void zzC(String paramString)
  {
    this.zzuH.remove(paramString);
  }
  
  public void zzD(String paramString)
  {
    this.zztZ = paramString;
  }
  
  public void zzE(String paramString)
  {
    this.zztX = paramString;
  }
  
  public void zzF(String paramString)
  {
    this.zzud = paramString;
  }
  
  public void zzG(String paramString)
  {
    this.zzuI.add(paramString);
  }
  
  public void zza(NetworkExtras paramNetworkExtras)
  {
    boolean bool = paramNetworkExtras instanceof AdMobExtras;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = AdMobAdapter.class;
      paramNetworkExtras = (AdMobExtras)paramNetworkExtras;
      localObject2 = paramNetworkExtras.getExtras();
      zza((Class)localObject1, (Bundle)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzuG;
      localObject2 = paramNetworkExtras.getClass();
      ((HashMap)localObject1).put(localObject2, paramNetworkExtras);
    }
  }
  
  public void zza(Class paramClass, Bundle paramBundle)
  {
    Bundle localBundle = this.zzuA;
    String str = paramClass.getName();
    localBundle.putBundle(str, paramBundle);
  }
  
  public void zza(String paramString1, String paramString2)
  {
    this.zzub.putString(paramString1, paramString2);
  }
  
  public void zza(Date paramDate)
  {
    this.zzbf = paramDate;
  }
  
  public void zzb(Location paramLocation)
  {
    this.zzbj = paramLocation;
  }
  
  public void zzb(Class paramClass, Bundle paramBundle)
  {
    Bundle localBundle1 = this.zzuA;
    String str = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
    localBundle1 = localBundle1.getBundle(str);
    if (localBundle1 == null)
    {
      localBundle1 = this.zzuA;
      str = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
      Bundle localBundle2 = new android/os/Bundle;
      localBundle2.<init>();
      localBundle1.putBundle(str, localBundle2);
    }
    localBundle1 = this.zzuA.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    str = paramClass.getName();
    localBundle1.putBundle(str, paramBundle);
  }
  
  public void zzk(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.zztW = i;
      return;
    }
  }
  
  public void zzl(boolean paramBoolean)
  {
    this.zzuf = paramBoolean;
  }
  
  public void zzn(int paramInt)
  {
    this.zztT = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzaa$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */