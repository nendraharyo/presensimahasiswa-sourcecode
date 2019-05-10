package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class VideoCapabilities
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final boolean zzaLm;
  private final boolean zzaLn;
  private final boolean zzaLo;
  private final boolean[] zzaLp;
  private final boolean[] zzaLq;
  
  static
  {
    VideoCapabilitiesCreator localVideoCapabilitiesCreator = new com/google/android/gms/games/video/VideoCapabilitiesCreator;
    localVideoCapabilitiesCreator.<init>();
    CREATOR = localVideoCapabilitiesCreator;
  }
  
  public VideoCapabilities(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    this.mVersionCode = paramInt;
    this.zzaLm = paramBoolean1;
    this.zzaLn = paramBoolean2;
    this.zzaLo = paramBoolean3;
    this.zzaLp = paramArrayOfBoolean1;
    this.zzaLq = paramArrayOfBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof VideoCapabilities;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (this != paramObject)
      {
        paramObject = (VideoCapabilities)paramObject;
        Object localObject1 = ((VideoCapabilities)paramObject).zzyb();
        Object localObject2 = zzyb();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((VideoCapabilities)paramObject).zzyc();
          localObject2 = zzyc();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = Boolean.valueOf(((VideoCapabilities)paramObject).zzxZ());
            boolean bool3 = zzxZ();
            localObject2 = Boolean.valueOf(bool3);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = Boolean.valueOf(((VideoCapabilities)paramObject).zzxY());
              bool3 = zzxY();
              localObject2 = Boolean.valueOf(bool3);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = Boolean.valueOf(((VideoCapabilities)paramObject).zzya());
                bool3 = zzya();
                localObject2 = Boolean.valueOf(bool3);
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2) {
                  continue;
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = zzyb();
    arrayOfObject[0] = localObject;
    localObject = zzyc();
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(zzxZ());
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(zzxY());
    arrayOfObject[3] = localObject;
    localObject = Boolean.valueOf(zzya());
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = zzyb();
    localzza = localzza.zzg("SupportedCaptureModes", localObject);
    localObject = zzyc();
    localzza = localzza.zzg("SupportedQualityLevels", localObject);
    localObject = Boolean.valueOf(zzxZ());
    localzza = localzza.zzg("CameraSupported", localObject);
    localObject = Boolean.valueOf(zzxY());
    localzza = localzza.zzg("MicSupported", localObject);
    localObject = Boolean.valueOf(zzya());
    return localzza.zzg("StorageWriteSupported", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    VideoCapabilitiesCreator.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzxY()
  {
    return this.zzaLn;
  }
  
  public boolean zzxZ()
  {
    return this.zzaLm;
  }
  
  public boolean zzya()
  {
    return this.zzaLo;
  }
  
  public boolean[] zzyb()
  {
    return this.zzaLp;
  }
  
  public boolean[] zzyc()
  {
    return this.zzaLq;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\VideoCapabilities.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */