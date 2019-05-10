package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.internal.constants.MatchResult;

public final class ParticipantResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int MATCH_RESULT_DISAGREED = 5;
  public static final int MATCH_RESULT_DISCONNECT = 4;
  public static final int MATCH_RESULT_LOSS = 1;
  public static final int MATCH_RESULT_NONE = 3;
  public static final int MATCH_RESULT_TIE = 2;
  public static final int MATCH_RESULT_UNINITIALIZED = 255;
  public static final int MATCH_RESULT_WIN = 0;
  public static final int PLACING_UNINITIALIZED = 255;
  private final int mVersionCode;
  private final String zzaFa;
  private final int zzaJP;
  private final int zzaJQ;
  
  static
  {
    ParticipantResultCreator localParticipantResultCreator = new com/google/android/gms/games/multiplayer/ParticipantResultCreator;
    localParticipantResultCreator.<init>();
    CREATOR = localParticipantResultCreator;
  }
  
  public ParticipantResult(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    String str = (String)zzx.zzz(paramString);
    this.zzaFa = str;
    zzx.zzab(MatchResult.isValid(paramInt2));
    this.zzaJP = paramInt2;
    this.zzaJQ = paramInt3;
  }
  
  public ParticipantResult(String paramString, int paramInt1, int paramInt2)
  {
    this(1, paramString, paramInt1, paramInt2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getParticipantId()
  {
    return this.zzaFa;
  }
  
  public int getPlacing()
  {
    return this.zzaJQ;
  }
  
  public int getResult()
  {
    return this.zzaJP;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ParticipantResultCreator.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\ParticipantResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */