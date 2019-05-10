package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzng;
import com.google.android.gms.location.places.internal.zzi.zza;
import com.google.android.gms.location.places.personalized.zzd;

public class zzl
  extends zzi.zza
{
  private static final String TAG = zzl.class.getSimpleName();
  private final Context mContext;
  private final zzl.zzd zzaPP;
  private final zzl.zza zzaPQ;
  private final zzl.zze zzaPR;
  private final zzl.zzf zzaPS;
  private final zzl.zzc zzaPT;
  
  public zzl(zzl.zza paramzza)
  {
    this.zzaPP = null;
    this.zzaPQ = paramzza;
    this.zzaPR = null;
    this.zzaPS = null;
    this.zzaPT = null;
    this.mContext = null;
  }
  
  public zzl(zzl.zzc paramzzc, Context paramContext)
  {
    this.zzaPP = null;
    this.zzaPQ = null;
    this.zzaPR = null;
    this.zzaPS = null;
    this.zzaPT = paramzzc;
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
  }
  
  public zzl(zzl.zzd paramzzd, Context paramContext)
  {
    this.zzaPP = paramzzd;
    this.zzaPQ = null;
    this.zzaPR = null;
    this.zzaPS = null;
    this.zzaPT = null;
    Context localContext = paramContext.getApplicationContext();
    this.mContext = localContext;
  }
  
  public zzl(zzl.zzf paramzzf)
  {
    this.zzaPP = null;
    this.zzaPQ = null;
    this.zzaPR = null;
    this.zzaPS = paramzzf;
    this.zzaPT = null;
    this.mContext = null;
  }
  
  public void zzaU(Status paramStatus)
  {
    this.zzaPS.zza(paramStatus);
  }
  
  public void zzac(DataHolder paramDataHolder)
  {
    Object localObject1 = this.zzaPP;
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      localObject2 = "placeEstimator cannot be null";
      zzx.zza(bool, localObject2);
      if (paramDataHolder != null) {
        break;
      }
      localObject1 = TAG;
      int j = 6;
      bool = Log.isLoggable((String)localObject1, j);
      if (bool)
      {
        localObject1 = TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("onPlaceEstimated received null DataHolder: ");
        localObject3 = zzng.zzso();
        localObject2 = (String)localObject3;
        Log.e((String)localObject1, (String)localObject2);
      }
      localObject1 = this.zzaPP;
      localObject2 = Status.zzagE;
      ((zzl.zzd)localObject1).zzw((Status)localObject2);
      return;
      bool = false;
      localObject1 = null;
    }
    localObject1 = paramDataHolder.zzpZ();
    if (localObject1 == null) {}
    for (int i = 100;; i = PlaceLikelihoodBuffer.zzH((Bundle)localObject1))
    {
      localObject2 = new com/google/android/gms/location/places/PlaceLikelihoodBuffer;
      localObject3 = this.mContext;
      ((PlaceLikelihoodBuffer)localObject2).<init>(paramDataHolder, i, (Context)localObject3);
      localObject1 = this.zzaPP;
      ((zzl.zzd)localObject1).zza((Result)localObject2);
      break;
    }
  }
  
  public void zzad(DataHolder paramDataHolder)
  {
    Object localObject1;
    Object localObject2;
    if (paramDataHolder == null)
    {
      localObject1 = TAG;
      int i = 6;
      boolean bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("onAutocompletePrediction received null DataHolder: ");
        String str = zzng.zzso();
        localObject2 = str;
        Log.e((String)localObject1, (String)localObject2);
      }
      localObject1 = this.zzaPQ;
      localObject2 = Status.zzagE;
      ((zzl.zza)localObject1).zzw((Status)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaPQ;
      localObject2 = new com/google/android/gms/location/places/AutocompletePredictionBuffer;
      ((AutocompletePredictionBuffer)localObject2).<init>(paramDataHolder);
      ((zzl.zza)localObject1).zza((Result)localObject2);
    }
  }
  
  public void zzae(DataHolder paramDataHolder)
  {
    Object localObject1;
    Object localObject2;
    if (paramDataHolder == null)
    {
      localObject1 = TAG;
      int i = 6;
      boolean bool = Log.isLoggable((String)localObject1, i);
      if (bool)
      {
        localObject1 = TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("onPlaceUserDataFetched received null DataHolder: ");
        String str = zzng.zzso();
        localObject2 = str;
        Log.e((String)localObject1, (String)localObject2);
      }
      localObject1 = this.zzaPR;
      localObject2 = Status.zzagE;
      ((zzl.zze)localObject1).zzw((Status)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzaPR;
      localObject2 = new com/google/android/gms/location/places/personalized/zzd;
      ((zzd)localObject2).<init>(paramDataHolder);
      ((zzl.zze)localObject1).zza((Result)localObject2);
    }
  }
  
  public void zzaf(DataHolder paramDataHolder)
  {
    PlaceBuffer localPlaceBuffer = new com/google/android/gms/location/places/PlaceBuffer;
    Context localContext = this.mContext;
    localPlaceBuffer.<init>(paramDataHolder, localContext);
    this.zzaPT.zza(localPlaceBuffer);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */