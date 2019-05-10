package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SnapshotMetadataRef
  extends zzc
  implements SnapshotMetadata
{
  private final Game zzaJc;
  private final Player zzaLc;
  
  public SnapshotMetadataRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    Object localObject = new com/google/android/gms/games/GameRef;
    ((GameRef)localObject).<init>(paramDataHolder, paramInt);
    this.zzaJc = ((Game)localObject);
    localObject = new com/google/android/gms/games/PlayerRef;
    ((PlayerRef)localObject).<init>(paramDataHolder, paramInt);
    this.zzaLc = ((Player)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return SnapshotMetadataEntity.zza(this, paramObject);
  }
  
  public SnapshotMetadata freeze()
  {
    SnapshotMetadataEntity localSnapshotMetadataEntity = new com/google/android/gms/games/snapshot/SnapshotMetadataEntity;
    localSnapshotMetadataEntity.<init>(this);
    return localSnapshotMetadataEntity;
  }
  
  public float getCoverImageAspectRatio()
  {
    float f1 = 0.0F;
    String str1 = "cover_icon_image_height";
    float f2 = getFloat(str1);
    String str2 = "cover_icon_image_width";
    float f3 = getFloat(str2);
    boolean bool = f2 < 0.0F;
    if (!bool) {}
    for (;;)
    {
      return f1;
      f1 = f3 / f2;
    }
  }
  
  public Uri getCoverImageUri()
  {
    return zzcA("cover_icon_image_uri");
  }
  
  public String getCoverImageUrl()
  {
    return getString("cover_icon_image_url");
  }
  
  public String getDescription()
  {
    return getString("description");
  }
  
  public void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public String getDeviceName()
  {
    return getString("device_name");
  }
  
  public Game getGame()
  {
    return this.zzaJc;
  }
  
  public long getLastModifiedTimestamp()
  {
    return getLong("last_modified_timestamp");
  }
  
  public Player getOwner()
  {
    return this.zzaLc;
  }
  
  public long getPlayedTime()
  {
    return getLong("duration");
  }
  
  public long getProgressValue()
  {
    return getLong("progress_value");
  }
  
  public String getSnapshotId()
  {
    return getString("external_snapshot_id");
  }
  
  public String getTitle()
  {
    return getString("title");
  }
  
  public String getUniqueName()
  {
    return getString("unique_name");
  }
  
  public boolean hasChangePending()
  {
    String str = "pending_change_count";
    int i = getInteger(str);
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public int hashCode()
  {
    return SnapshotMetadataEntity.zza(this);
  }
  
  public String toString()
  {
    return SnapshotMetadataEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((SnapshotMetadataEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */