package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

public final class RequestUpdateOutcomes$Builder
{
  private HashMap zzaIY;
  private int zzade;
  
  public RequestUpdateOutcomes$Builder()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzaIY = localHashMap;
    this.zzade = 0;
  }
  
  public Builder zzgG(int paramInt)
  {
    this.zzade = paramInt;
    return this;
  }
  
  public Builder zzx(String paramString, int paramInt)
  {
    boolean bool = RequestUpdateResultOutcome.isValid(paramInt);
    if (bool)
    {
      HashMap localHashMap = this.zzaIY;
      Integer localInteger = Integer.valueOf(paramInt);
      localHashMap.put(paramString, localInteger);
    }
    return this;
  }
  
  public RequestUpdateOutcomes zzxH()
  {
    RequestUpdateOutcomes localRequestUpdateOutcomes = new com/google/android/gms/games/internal/request/RequestUpdateOutcomes;
    int i = this.zzade;
    HashMap localHashMap = this.zzaIY;
    localRequestUpdateOutcomes.<init>(i, localHashMap, null);
    return localRequestUpdateOutcomes;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\request\RequestUpdateOutcomes$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */