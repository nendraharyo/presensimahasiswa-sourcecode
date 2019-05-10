package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class SnapshotMetadataEntity
  implements SafeParcelable, SnapshotMetadata
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzaEp;
  private final GameEntity zzaJE;
  private final Uri zzaKQ;
  private final PlayerEntity zzaKT;
  private final String zzaKU;
  private final long zzaKV;
  private final long zzaKW;
  private final float zzaKX;
  private final String zzaKY;
  private final boolean zzaKZ;
  private final long zzaLa;
  private final String zzaLb;
  private final String zzapg;
  private final String zzaxl;
  
  static
  {
    SnapshotMetadataEntityCreator localSnapshotMetadataEntityCreator = new com/google/android/gms/games/snapshot/SnapshotMetadataEntityCreator;
    localSnapshotMetadataEntityCreator.<init>();
    CREATOR = localSnapshotMetadataEntityCreator;
  }
  
  SnapshotMetadataEntity(int paramInt, GameEntity paramGameEntity, PlayerEntity paramPlayerEntity, String paramString1, Uri paramUri, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, float paramFloat, String paramString5, boolean paramBoolean, long paramLong3, String paramString6)
  {
    this.mVersionCode = paramInt;
    this.zzaJE = paramGameEntity;
    this.zzaKT = paramPlayerEntity;
    this.zzaEp = paramString1;
    this.zzaKQ = paramUri;
    this.zzaKU = paramString2;
    this.zzaKX = paramFloat;
    this.zzapg = paramString3;
    this.zzaxl = paramString4;
    this.zzaKV = paramLong1;
    this.zzaKW = paramLong2;
    this.zzaKY = paramString5;
    this.zzaKZ = paramBoolean;
    this.zzaLa = paramLong3;
    this.zzaLb = paramString6;
  }
  
  public SnapshotMetadataEntity(SnapshotMetadata paramSnapshotMetadata)
  {
    this.mVersionCode = 6;
    Object localObject1 = new com/google/android/gms/games/GameEntity;
    Object localObject2 = paramSnapshotMetadata.getGame();
    ((GameEntity)localObject1).<init>((Game)localObject2);
    this.zzaJE = ((GameEntity)localObject1);
    localObject1 = new com/google/android/gms/games/PlayerEntity;
    localObject2 = paramSnapshotMetadata.getOwner();
    ((PlayerEntity)localObject1).<init>((Player)localObject2);
    this.zzaKT = ((PlayerEntity)localObject1);
    localObject1 = paramSnapshotMetadata.getSnapshotId();
    this.zzaEp = ((String)localObject1);
    localObject1 = paramSnapshotMetadata.getCoverImageUri();
    this.zzaKQ = ((Uri)localObject1);
    localObject1 = paramSnapshotMetadata.getCoverImageUrl();
    this.zzaKU = ((String)localObject1);
    float f = paramSnapshotMetadata.getCoverImageAspectRatio();
    this.zzaKX = f;
    localObject1 = paramSnapshotMetadata.getTitle();
    this.zzapg = ((String)localObject1);
    localObject1 = paramSnapshotMetadata.getDescription();
    this.zzaxl = ((String)localObject1);
    long l = paramSnapshotMetadata.getLastModifiedTimestamp();
    this.zzaKV = l;
    l = paramSnapshotMetadata.getPlayedTime();
    this.zzaKW = l;
    localObject1 = paramSnapshotMetadata.getUniqueName();
    this.zzaKY = ((String)localObject1);
    boolean bool = paramSnapshotMetadata.hasChangePending();
    this.zzaKZ = bool;
    l = paramSnapshotMetadata.getProgressValue();
    this.zzaLa = l;
    localObject1 = paramSnapshotMetadata.getDeviceName();
    this.zzaLb = ((String)localObject1);
  }
  
  static int zza(SnapshotMetadata paramSnapshotMetadata)
  {
    Object[] arrayOfObject = new Object[13];
    Object localObject = paramSnapshotMetadata.getGame();
    arrayOfObject[0] = localObject;
    localObject = paramSnapshotMetadata.getOwner();
    arrayOfObject[1] = localObject;
    localObject = paramSnapshotMetadata.getSnapshotId();
    arrayOfObject[2] = localObject;
    localObject = paramSnapshotMetadata.getCoverImageUri();
    arrayOfObject[3] = localObject;
    localObject = Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio());
    arrayOfObject[4] = localObject;
    localObject = paramSnapshotMetadata.getTitle();
    arrayOfObject[5] = localObject;
    localObject = paramSnapshotMetadata.getDescription();
    arrayOfObject[6] = localObject;
    localObject = Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp());
    arrayOfObject[7] = localObject;
    localObject = Long.valueOf(paramSnapshotMetadata.getPlayedTime());
    arrayOfObject[8] = localObject;
    localObject = paramSnapshotMetadata.getUniqueName();
    arrayOfObject[9] = localObject;
    localObject = Boolean.valueOf(paramSnapshotMetadata.hasChangePending());
    arrayOfObject[10] = localObject;
    localObject = Long.valueOf(paramSnapshotMetadata.getProgressValue());
    arrayOfObject[11] = localObject;
    localObject = paramSnapshotMetadata.getDeviceName();
    arrayOfObject[12] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(SnapshotMetadata paramSnapshotMetadata, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof SnapshotMetadata;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramSnapshotMetadata != paramObject)
      {
        paramObject = (SnapshotMetadata)paramObject;
        Object localObject1 = ((SnapshotMetadata)paramObject).getGame();
        Object localObject2 = paramSnapshotMetadata.getGame();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((SnapshotMetadata)paramObject).getOwner();
          localObject2 = paramSnapshotMetadata.getOwner();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((SnapshotMetadata)paramObject).getSnapshotId();
            localObject2 = paramSnapshotMetadata.getSnapshotId();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((SnapshotMetadata)paramObject).getCoverImageUri();
              localObject2 = paramSnapshotMetadata.getCoverImageUri();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                float f1 = ((SnapshotMetadata)paramObject).getCoverImageAspectRatio();
                localObject1 = Float.valueOf(f1);
                float f2 = paramSnapshotMetadata.getCoverImageAspectRatio();
                localObject2 = Float.valueOf(f2);
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = ((SnapshotMetadata)paramObject).getTitle();
                  localObject2 = paramSnapshotMetadata.getTitle();
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = ((SnapshotMetadata)paramObject).getDescription();
                    localObject2 = paramSnapshotMetadata.getDescription();
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      long l1 = ((SnapshotMetadata)paramObject).getLastModifiedTimestamp();
                      localObject1 = Long.valueOf(l1);
                      long l2 = paramSnapshotMetadata.getLastModifiedTimestamp();
                      localObject2 = Long.valueOf(l2);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2)
                      {
                        l1 = ((SnapshotMetadata)paramObject).getPlayedTime();
                        localObject1 = Long.valueOf(l1);
                        l2 = paramSnapshotMetadata.getPlayedTime();
                        localObject2 = Long.valueOf(l2);
                        bool2 = zzw.equal(localObject1, localObject2);
                        if (bool2)
                        {
                          localObject1 = ((SnapshotMetadata)paramObject).getUniqueName();
                          localObject2 = paramSnapshotMetadata.getUniqueName();
                          bool2 = zzw.equal(localObject1, localObject2);
                          if (bool2)
                          {
                            localObject1 = Boolean.valueOf(((SnapshotMetadata)paramObject).hasChangePending());
                            boolean bool3 = paramSnapshotMetadata.hasChangePending();
                            localObject2 = Boolean.valueOf(bool3);
                            bool2 = zzw.equal(localObject1, localObject2);
                            if (bool2)
                            {
                              l1 = ((SnapshotMetadata)paramObject).getProgressValue();
                              localObject1 = Long.valueOf(l1);
                              l2 = paramSnapshotMetadata.getProgressValue();
                              localObject2 = Long.valueOf(l2);
                              bool2 = zzw.equal(localObject1, localObject2);
                              if (bool2)
                              {
                                localObject1 = ((SnapshotMetadata)paramObject).getDeviceName();
                                localObject2 = paramSnapshotMetadata.getDeviceName();
                                bool2 = zzw.equal(localObject1, localObject2);
                                if (bool2) {
                                  continue;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
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
  
  static String zzb(SnapshotMetadata paramSnapshotMetadata)
  {
    zzw.zza localzza = zzw.zzy(paramSnapshotMetadata);
    Object localObject = paramSnapshotMetadata.getGame();
    localzza = localzza.zzg("Game", localObject);
    localObject = paramSnapshotMetadata.getOwner();
    localzza = localzza.zzg("Owner", localObject);
    localObject = paramSnapshotMetadata.getSnapshotId();
    localzza = localzza.zzg("SnapshotId", localObject);
    localObject = paramSnapshotMetadata.getCoverImageUri();
    localzza = localzza.zzg("CoverImageUri", localObject);
    localObject = paramSnapshotMetadata.getCoverImageUrl();
    localzza = localzza.zzg("CoverImageUrl", localObject);
    localObject = Float.valueOf(paramSnapshotMetadata.getCoverImageAspectRatio());
    localzza = localzza.zzg("CoverImageAspectRatio", localObject);
    localObject = paramSnapshotMetadata.getDescription();
    localzza = localzza.zzg("Description", localObject);
    localObject = Long.valueOf(paramSnapshotMetadata.getLastModifiedTimestamp());
    localzza = localzza.zzg("LastModifiedTimestamp", localObject);
    localObject = Long.valueOf(paramSnapshotMetadata.getPlayedTime());
    localzza = localzza.zzg("PlayedTime", localObject);
    localObject = paramSnapshotMetadata.getUniqueName();
    localzza = localzza.zzg("UniqueName", localObject);
    localObject = Boolean.valueOf(paramSnapshotMetadata.hasChangePending());
    localzza = localzza.zzg("ChangePending", localObject);
    localObject = Long.valueOf(paramSnapshotMetadata.getProgressValue());
    localzza = localzza.zzg("ProgressValue", localObject);
    localObject = paramSnapshotMetadata.getDeviceName();
    return localzza.zzg("DeviceName", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public SnapshotMetadata freeze()
  {
    return this;
  }
  
  public float getCoverImageAspectRatio()
  {
    return this.zzaKX;
  }
  
  public Uri getCoverImageUri()
  {
    return this.zzaKQ;
  }
  
  public String getCoverImageUrl()
  {
    return this.zzaKU;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(this.zzaxl, paramCharArrayBuffer);
  }
  
  public String getDeviceName()
  {
    return this.zzaLb;
  }
  
  public Game getGame()
  {
    return this.zzaJE;
  }
  
  public long getLastModifiedTimestamp()
  {
    return this.zzaKV;
  }
  
  public Player getOwner()
  {
    return this.zzaKT;
  }
  
  public long getPlayedTime()
  {
    return this.zzaKW;
  }
  
  public long getProgressValue()
  {
    return this.zzaLa;
  }
  
  public String getSnapshotId()
  {
    return this.zzaEp;
  }
  
  public String getTitle()
  {
    return this.zzapg;
  }
  
  public String getUniqueName()
  {
    return this.zzaKY;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public boolean hasChangePending()
  {
    return this.zzaKZ;
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
    SnapshotMetadataEntityCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */