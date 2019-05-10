package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.LoadExperimentsResult;
import java.util.HashSet;
import java.util.Set;

final class GamesClientImpl$LoadExperimentsResultImpl
  implements Games.LoadExperimentsResult
{
  private final Status zzUX;
  private final Set zzaEB;
  
  GamesClientImpl$LoadExperimentsResultImpl(int paramInt, long[] paramArrayOfLong)
  {
    Object localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(paramInt);
    this.zzUX = ((Status)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzaEB = ((Set)localObject);
    int i = 0;
    localObject = null;
    for (;;)
    {
      int j = paramArrayOfLong.length;
      if (i >= j) {
        break;
      }
      Set localSet = this.zzaEB;
      long l = paramArrayOfLong[i];
      Long localLong = Long.valueOf(l);
      localSet.add(localLong);
      i += 1;
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadExperimentsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */