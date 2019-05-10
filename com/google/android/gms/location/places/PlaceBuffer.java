package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzr;

public class PlaceBuffer
  extends AbstractDataBuffer
  implements Result
{
  private final Context mContext;
  private final Status zzUX;
  private final String zzaPy;
  
  public PlaceBuffer(DataHolder paramDataHolder, Context paramContext)
  {
    super(paramDataHolder);
    this.mContext = paramContext;
    int i = paramDataHolder.getStatusCode();
    Object localObject = PlacesStatusCodes.zzhU(i);
    this.zzUX = ((Status)localObject);
    if (paramDataHolder != null)
    {
      localObject = paramDataHolder.zzpZ();
      if (localObject != null)
      {
        localObject = paramDataHolder.zzpZ();
        String str = "com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY";
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
  
  public Place get(int paramInt)
  {
    zzr localzzr = new com/google/android/gms/location/places/internal/zzr;
    DataHolder localDataHolder = this.zzahi;
    Context localContext = this.mContext;
    localzzr.<init>(localDataHolder, paramInt, localContext);
    return localzzr;
  }
  
  public CharSequence getAttributions()
  {
    return this.zzaPy;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\PlaceBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */