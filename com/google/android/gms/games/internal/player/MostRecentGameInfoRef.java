package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class MostRecentGameInfoRef
  extends zzc
  implements MostRecentGameInfo
{
  private final PlayerColumnNames zzaDh;
  
  public MostRecentGameInfoRef(DataHolder paramDataHolder, int paramInt, PlayerColumnNames paramPlayerColumnNames)
  {
    super(paramDataHolder, paramInt);
    this.zzaDh = paramPlayerColumnNames;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return MostRecentGameInfoEntity.zza(this, paramObject);
  }
  
  public int hashCode()
  {
    return MostRecentGameInfoEntity.zza(this);
  }
  
  public String toString()
  {
    return MostRecentGameInfoEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((MostRecentGameInfoEntity)zzxE()).writeToParcel(paramParcel, paramInt);
  }
  
  public long zzxA()
  {
    String str = this.zzaDh.zzaIM;
    return getLong(str);
  }
  
  public Uri zzxB()
  {
    String str = this.zzaDh.zzaIN;
    return zzcA(str);
  }
  
  public Uri zzxC()
  {
    String str = this.zzaDh.zzaIO;
    return zzcA(str);
  }
  
  public Uri zzxD()
  {
    String str = this.zzaDh.zzaIP;
    return zzcA(str);
  }
  
  public MostRecentGameInfo zzxE()
  {
    MostRecentGameInfoEntity localMostRecentGameInfoEntity = new com/google/android/gms/games/internal/player/MostRecentGameInfoEntity;
    localMostRecentGameInfoEntity.<init>(this);
    return localMostRecentGameInfoEntity;
  }
  
  public String zzxy()
  {
    String str = this.zzaDh.zzaIK;
    return getString(str);
  }
  
  public String zzxz()
  {
    String str = this.zzaDh.zzaIL;
    return getString(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\player\MostRecentGameInfoRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */