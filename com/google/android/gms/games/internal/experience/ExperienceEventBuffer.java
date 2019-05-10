package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class ExperienceEventBuffer
  extends AbstractDataBuffer
{
  public ExperienceEventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public ExperienceEvent zzgx(int paramInt)
  {
    ExperienceEventRef localExperienceEventRef = new com/google/android/gms/games/internal/experience/ExperienceEventRef;
    DataHolder localDataHolder = this.zzahi;
    localExperienceEventRef.<init>(localDataHolder, paramInt);
    return localExperienceEventRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\experience\ExperienceEventBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */