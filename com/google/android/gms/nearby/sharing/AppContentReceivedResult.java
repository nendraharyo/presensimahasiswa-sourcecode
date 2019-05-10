package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class AppContentReceivedResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private int statusCode;
  private final int versionCode;
  private Uri zzbde;
  
  static
  {
    zza localzza = new com/google/android/gms/nearby/sharing/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  private AppContentReceivedResult()
  {
    this.versionCode = 1;
  }
  
  AppContentReceivedResult(int paramInt1, Uri paramUri, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.zzbde = paramUri;
    this.statusCode = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof AppContentReceivedResult;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (AppContentReceivedResult)paramObject;
        Object localObject1 = this.zzbde;
        Object localObject2 = ((AppContentReceivedResult)paramObject).zzbde;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = Integer.valueOf(this.statusCode);
          int i = ((AppContentReceivedResult)paramObject).statusCode;
          localObject2 = Integer.valueOf(i);
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int getStatusCode()
  {
    return this.statusCode;
  }
  
  int getVersionCode()
  {
    return this.versionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzbde;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.statusCode);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Uri zzEJ()
  {
    return this.zzbde;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\AppContentReceivedResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */