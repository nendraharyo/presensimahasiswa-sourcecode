package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

public final class zzew
  extends zzex.zza
{
  private Map zzCG;
  
  private zzey zzah(String paramString)
  {
    Object localObject1 = null;
    Object localObject3 = zzew.class;
    for (;;)
    {
      try
      {
        localObject3 = ((Class)localObject3).getClassLoader();
        localObject1 = Class.forName(paramString, false, (ClassLoader)localObject3);
        localObject3 = com.google.ads.mediation.MediationAdapter.class;
        bool = ((Class)localObject3).isAssignableFrom((Class)localObject1);
        if (!bool) {
          continue;
        }
        localObject1 = ((Class)localObject1).newInstance();
        localObject1 = (com.google.ads.mediation.MediationAdapter)localObject1;
        localObject3 = this.zzCG;
        Object localObject4 = ((com.google.ads.mediation.MediationAdapter)localObject1).getAdditionalParametersType();
        localObject3 = ((Map)localObject3).get(localObject4);
        localObject3 = (NetworkExtras)localObject3;
        localObject4 = new com/google/android/gms/internal/zzfj;
        ((zzfj)localObject4).<init>((com.google.ads.mediation.MediationAdapter)localObject1, (NetworkExtras)localObject3);
        localObject1 = localObject4;
      }
      finally
      {
        boolean bool;
        zzey localzzey = zzai(paramString);
        continue;
      }
      return (zzey)localObject1;
      localObject3 = com.google.android.gms.ads.mediation.MediationAdapter.class;
      bool = ((Class)localObject3).isAssignableFrom((Class)localObject1);
      if (!bool) {
        continue;
      }
      localObject1 = ((Class)localObject1).newInstance();
      localObject1 = (com.google.android.gms.ads.mediation.MediationAdapter)localObject1;
      localObject3 = new com/google/android/gms/internal/zzfe;
      ((zzfe)localObject3).<init>((com.google.android.gms.ads.mediation.MediationAdapter)localObject1);
      localObject1 = localObject3;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject3 = "Could not instantiate mediation adapter: ";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    localObject3 = " (not a valid adapter).";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
    localObject1 = ((StringBuilder)localObject1).toString();
    zzb.zzaK((String)localObject1);
    localObject1 = new android/os/RemoteException;
    ((RemoteException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  private zzey zzai(String paramString)
  {
    Object localObject1 = "Reflection failed, retrying using direct instantiation";
    for (;;)
    {
      Object localObject3;
      Object localObject4;
      Object localObject2;
      try
      {
        zzb.zzaI((String)localObject1);
        localObject1 = "com.google.ads.mediation.admob.AdMobAdapter";
        bool = ((String)localObject1).equals(paramString);
        if (bool)
        {
          localObject1 = new com/google/android/gms/internal/zzfe;
          localObject3 = new com/google/ads/mediation/admob/AdMobAdapter;
          ((AdMobAdapter)localObject3).<init>();
          ((zzfe)localObject1).<init>((com.google.android.gms.ads.mediation.MediationAdapter)localObject3);
          return (zzey)localObject1;
        }
        localObject1 = "com.google.ads.mediation.AdUrlAdapter";
        bool = ((String)localObject1).equals(paramString);
        if (bool)
        {
          localObject1 = new com/google/android/gms/internal/zzfe;
          localObject3 = new com/google/ads/mediation/AdUrlAdapter;
          ((AdUrlAdapter)localObject3).<init>();
          ((zzfe)localObject1).<init>((com.google.android.gms.ads.mediation.MediationAdapter)localObject3);
          continue;
        }
        localObject2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
      }
      finally
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Could not instantiate mediation adapter: ").append(paramString);
        localObject4 = ". ";
        localObject3 = (String)localObject4;
        zzb.zzd((String)localObject3, localThrowable);
        localObject2 = new android/os/RemoteException;
        ((RemoteException)localObject2).<init>();
      }
      boolean bool = ((String)localObject2).equals(paramString);
      if (bool)
      {
        localObject2 = new com/google/android/gms/internal/zzfe;
        localObject3 = new com/google/android/gms/ads/mediation/customevent/CustomEventAdapter;
        ((com.google.android.gms.ads.mediation.customevent.CustomEventAdapter)localObject3).<init>();
        ((zzfe)localObject2).<init>((com.google.android.gms.ads.mediation.MediationAdapter)localObject3);
      }
      else
      {
        localObject2 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        bool = ((String)localObject2).equals(paramString);
        if (bool)
        {
          localObject4 = new com/google/ads/mediation/customevent/CustomEventAdapter;
          ((com.google.ads.mediation.customevent.CustomEventAdapter)localObject4).<init>();
          localObject2 = this.zzCG;
          localObject3 = ((com.google.ads.mediation.customevent.CustomEventAdapter)localObject4).getAdditionalParametersType();
          localObject2 = ((Map)localObject2).get(localObject3);
          localObject2 = (CustomEventExtras)localObject2;
          localObject3 = new com/google/android/gms/internal/zzfj;
          ((zzfj)localObject3).<init>((com.google.ads.mediation.MediationAdapter)localObject4, (NetworkExtras)localObject2);
          localObject2 = localObject3;
        }
      }
    }
  }
  
  public zzey zzaf(String paramString)
  {
    return zzah(paramString);
  }
  
  public boolean zzag(String paramString)
  {
    boolean bool = false;
    Class localClass = null;
    localObject3 = zzew.class;
    try
    {
      localObject3 = ((Class)localObject3).getClassLoader();
      localClass = Class.forName(paramString, false, (ClassLoader)localObject3);
      localObject3 = CustomEvent.class;
      bool = ((Class)localObject3).isAssignableFrom(localClass);
    }
    finally
    {
      for (;;)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Could not load custom event implementation class: ").append(paramString);
        localObject3 = ", assuming old implementation.";
        localObject2 = (String)localObject3;
        zzb.zzaK((String)localObject2);
      }
    }
    return bool;
  }
  
  public void zzg(Map paramMap)
  {
    this.zzCG = paramMap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzew.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */