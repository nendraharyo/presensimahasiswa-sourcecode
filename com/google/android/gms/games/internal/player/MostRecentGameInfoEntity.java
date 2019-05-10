package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class MostRecentGameInfoEntity
  implements SafeParcelable, MostRecentGameInfo
{
  public static final MostRecentGameInfoEntityCreator CREATOR;
  private final int mVersionCode;
  private final String zzaIm;
  private final String zzaIn;
  private final long zzaIo;
  private final Uri zzaIp;
  private final Uri zzaIq;
  private final Uri zzaIr;
  
  static
  {
    MostRecentGameInfoEntityCreator localMostRecentGameInfoEntityCreator = new com/google/android/gms/games/internal/player/MostRecentGameInfoEntityCreator;
    localMostRecentGameInfoEntityCreator.<init>();
    CREATOR = localMostRecentGameInfoEntityCreator;
  }
  
  MostRecentGameInfoEntity(int paramInt, String paramString1, String paramString2, long paramLong, Uri paramUri1, Uri paramUri2, Uri paramUri3)
  {
    this.mVersionCode = paramInt;
    this.zzaIm = paramString1;
    this.zzaIn = paramString2;
    this.zzaIo = paramLong;
    this.zzaIp = paramUri1;
    this.zzaIq = paramUri2;
    this.zzaIr = paramUri3;
  }
  
  public MostRecentGameInfoEntity(MostRecentGameInfo paramMostRecentGameInfo)
  {
    this.mVersionCode = 2;
    Object localObject = paramMostRecentGameInfo.zzxy();
    this.zzaIm = ((String)localObject);
    localObject = paramMostRecentGameInfo.zzxz();
    this.zzaIn = ((String)localObject);
    long l = paramMostRecentGameInfo.zzxA();
    this.zzaIo = l;
    localObject = paramMostRecentGameInfo.zzxB();
    this.zzaIp = ((Uri)localObject);
    localObject = paramMostRecentGameInfo.zzxC();
    this.zzaIq = ((Uri)localObject);
    localObject = paramMostRecentGameInfo.zzxD();
    this.zzaIr = ((Uri)localObject);
  }
  
  static int zza(MostRecentGameInfo paramMostRecentGameInfo)
  {
    Object[] arrayOfObject = new Object[6];
    Object localObject = paramMostRecentGameInfo.zzxy();
    arrayOfObject[0] = localObject;
    localObject = paramMostRecentGameInfo.zzxz();
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(paramMostRecentGameInfo.zzxA());
    arrayOfObject[2] = localObject;
    localObject = paramMostRecentGameInfo.zzxB();
    arrayOfObject[3] = localObject;
    localObject = paramMostRecentGameInfo.zzxC();
    arrayOfObject[4] = localObject;
    localObject = paramMostRecentGameInfo.zzxD();
    arrayOfObject[5] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(MostRecentGameInfo paramMostRecentGameInfo, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof MostRecentGameInfo;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramMostRecentGameInfo != paramObject)
      {
        paramObject = (MostRecentGameInfo)paramObject;
        Object localObject1 = ((MostRecentGameInfo)paramObject).zzxy();
        Object localObject2 = paramMostRecentGameInfo.zzxy();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((MostRecentGameInfo)paramObject).zzxz();
          localObject2 = paramMostRecentGameInfo.zzxz();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            long l1 = ((MostRecentGameInfo)paramObject).zzxA();
            localObject1 = Long.valueOf(l1);
            long l2 = paramMostRecentGameInfo.zzxA();
            localObject2 = Long.valueOf(l2);
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((MostRecentGameInfo)paramObject).zzxB();
              localObject2 = paramMostRecentGameInfo.zzxB();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = ((MostRecentGameInfo)paramObject).zzxC();
                localObject2 = paramMostRecentGameInfo.zzxC();
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((MostRecentGameInfo)paramObject).zzxD();
                  localObject2 = paramMostRecentGameInfo.zzxD();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2) {
                    continue;
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  static String zzb(MostRecentGameInfo paramMostRecentGameInfo)
  {
    zzw.zza localzza = zzw.zzy(paramMostRecentGameInfo);
    Object localObject = paramMostRecentGameInfo.zzxy();
    localzza = localzza.zzg("GameId", localObject);
    localObject = paramMostRecentGameInfo.zzxz();
    localzza = localzza.zzg("GameName", localObject);
    localObject = Long.valueOf(paramMostRecentGameInfo.zzxA());
    localzza = localzza.zzg("ActivityTimestampMillis", localObject);
    localObject = paramMostRecentGameInfo.zzxB();
    localzza = localzza.zzg("GameIconUri", localObject);
    localObject = paramMostRecentGameInfo.zzxC();
    localzza = localzza.zzg("GameHiResUri", localObject);
    localObject = paramMostRecentGameInfo.zzxD();
    return localzza.zzg("GameFeaturedUri", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
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
    MostRecentGameInfoEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public long zzxA()
  {
    return this.zzaIo;
  }
  
  public Uri zzxB()
  {
    return this.zzaIp;
  }
  
  public Uri zzxC()
  {
    return this.zzaIq;
  }
  
  public Uri zzxD()
  {
    return this.zzaIr;
  }
  
  public MostRecentGameInfo zzxE()
  {
    return this;
  }
  
  public String zzxy()
  {
    return this.zzaIm;
  }
  
  public String zzxz()
  {
    return this.zzaIn;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\player\MostRecentGameInfoEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */