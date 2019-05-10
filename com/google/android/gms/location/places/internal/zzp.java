package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.places.PlacePhotoMetadata;
import com.google.android.gms.location.places.Places;

public class zzp
  implements PlacePhotoMetadata
{
  private int mIndex;
  private final int zzDF;
  private final int zzDG;
  private final String zzaQR;
  private final CharSequence zzaQS;
  
  public zzp(String paramString, int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3)
  {
    this.zzaQR = paramString;
    this.zzDF = paramInt1;
    this.zzDG = paramInt2;
    this.zzaQS = paramCharSequence;
    this.mIndex = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zzp;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zzp)paramObject;
        int i = ((zzp)paramObject).zzDF;
        int j = this.zzDF;
        if (i == j)
        {
          i = ((zzp)paramObject).zzDG;
          j = this.zzDG;
          if (i == j)
          {
            Object localObject1 = ((zzp)paramObject).zzaQR;
            Object localObject2 = this.zzaQR;
            boolean bool3 = zzw.equal(localObject1, localObject2);
            if (bool3)
            {
              localObject1 = ((zzp)paramObject).zzaQS;
              localObject2 = this.zzaQS;
              bool3 = zzw.equal(localObject1, localObject2);
              if (bool3) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public CharSequence getAttributions()
  {
    return this.zzaQS;
  }
  
  public int getMaxHeight()
  {
    return this.zzDG;
  }
  
  public int getMaxWidth()
  {
    return this.zzDF;
  }
  
  public PendingResult getPhoto(GoogleApiClient paramGoogleApiClient)
  {
    int i = getMaxWidth();
    int j = getMaxHeight();
    return getScaledPhoto(paramGoogleApiClient, i, j);
  }
  
  public PendingResult getScaledPhoto(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    zzp.1 local1 = new com/google/android/gms/location/places/internal/zzp$1;
    Api.zzc localzzc = Places.zzaPN;
    local1.<init>(this, localzzc, paramGoogleApiClient, paramInt1, paramInt2);
    return paramGoogleApiClient.zza(local1);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Integer.valueOf(this.zzDF);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzDG);
    arrayOfObject[1] = localObject;
    localObject = this.zzaQR;
    arrayOfObject[2] = localObject;
    localObject = this.zzaQS;
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public PlacePhotoMetadata zzzz()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */