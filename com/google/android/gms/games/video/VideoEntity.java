package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class VideoEntity
  implements SafeParcelable, Video
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final long zzCv;
  private final String zzTJ;
  private final String zzaLv;
  private final long zzaLw;
  private final int zzakd;
  
  static
  {
    VideoEntityCreator localVideoEntityCreator = new com/google/android/gms/games/video/VideoEntityCreator;
    localVideoEntityCreator.<init>();
    CREATOR = localVideoEntityCreator;
  }
  
  VideoEntity(int paramInt1, int paramInt2, String paramString1, long paramLong1, long paramLong2, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.zzakd = paramInt2;
    this.zzaLv = paramString1;
    this.zzaLw = paramLong1;
    this.zzCv = paramLong2;
    this.zzTJ = paramString2;
  }
  
  public VideoEntity(Video paramVideo)
  {
    this.mVersionCode = 1;
    int i = paramVideo.getDuration();
    this.zzakd = i;
    String str = paramVideo.zzxX();
    this.zzaLv = str;
    long l = paramVideo.getFileSize();
    this.zzaLw = l;
    l = paramVideo.getStartTime();
    this.zzCv = l;
    str = paramVideo.getPackageName();
    this.zzTJ = str;
    zzb.zzv(this.zzaLv);
    zzb.zzv(this.zzTJ);
  }
  
  static int zza(Video paramVideo)
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Integer.valueOf(paramVideo.getDuration());
    arrayOfObject[0] = localObject;
    localObject = paramVideo.zzxX();
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramVideo.getFileSize());
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(paramVideo.getStartTime());
    arrayOfObject[3] = localObject;
    localObject = paramVideo.getPackageName();
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(Video paramVideo, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof Video;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramVideo != paramObject)
      {
        paramObject = (Video)paramObject;
        Object localObject1 = Integer.valueOf(((Video)paramObject).getDuration());
        int i = paramVideo.getDuration();
        Object localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((Video)paramObject).zzxX();
          localObject2 = paramVideo.zzxX();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            long l1 = ((Video)paramObject).getFileSize();
            localObject1 = Long.valueOf(l1);
            long l2 = paramVideo.getFileSize();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              l1 = ((Video)paramObject).getStartTime();
              localObject1 = Long.valueOf(l1);
              l2 = paramVideo.getStartTime();
              localObject2 = Long.valueOf(l2);
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((Video)paramObject).getPackageName();
                localObject2 = paramVideo.getPackageName();
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
  
  static String zzb(Video paramVideo)
  {
    zzw.zza localzza = zzw.zzy(paramVideo);
    Object localObject = Integer.valueOf(paramVideo.getDuration());
    localzza = localzza.zzg("Duration", localObject);
    localObject = paramVideo.zzxX();
    localzza = localzza.zzg("File path", localObject);
    localObject = Long.valueOf(paramVideo.getFileSize());
    localzza = localzza.zzg("File size", localObject);
    localObject = Long.valueOf(paramVideo.getStartTime());
    localzza = localzza.zzg("Start time", localObject);
    localObject = paramVideo.getPackageName();
    return localzza.zzg("Package name", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public int getDuration()
  {
    return this.zzakd;
  }
  
  public long getFileSize()
  {
    return this.zzaLw;
  }
  
  public String getPackageName()
  {
    return this.zzTJ;
  }
  
  public long getStartTime()
  {
    return this.zzCv;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    VideoEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public String zzxX()
  {
    return this.zzaLv;
  }
  
  public Video zzyg()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\VideoEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */