package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.location.places.internal.zzn;

public class PlaceLikelihoodBuffer
  extends AbstractDataBuffer
  implements Result
{
  private final Context mContext;
  private final Status zzUX;
  private final String zzaPy;
  private final int zzvr;
  
  public PlaceLikelihoodBuffer(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder);
    this.mContext = paramContext;
    Object localObject = PlacesStatusCodes.zzhU(paramDataHolder.getStatusCode());
    this.zzUX = ((Status)localObject);
    int i = PlaceLikelihoodBuffer.zza.zzhP(paramInt);
    this.zzvr = i;
    if (paramDataHolder != null)
    {
      localObject = paramDataHolder.zzpZ();
      if (localObject != null)
      {
        localObject = paramDataHolder.zzpZ();
        String str = "com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY";
        localObject = ((Bundle)localObject).getString(str);
      }
    }
    for (this.zzaPy = ((String)localObject);; this.zzaPy = null)
    {
      return;
      i = 0;
      localObject = null;
    }
  }
  
  public static int zzH(Bundle paramBundle)
  {
    return paramBundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
  }
  
  public PlaceLikelihood get(int paramInt)
  {
    zzn localzzn = new com/google/android/gms/location/places/internal/zzn;
    DataHolder localDataHolder = this.zzahi;
    Context localContext = this.mContext;
    localzzn.<init>(localDataHolder, paramInt, localContext);
    return localzzn;
  }
  
  public CharSequence getAttributions()
  {
    return this.zzaPy;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = getStatus();
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaPy;
    return localzza.zzg("attributions", localObject).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceLikelihoodBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */