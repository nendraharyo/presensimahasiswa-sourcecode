package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
  private static final String[] zzaIX;
  private final HashMap zzaIY;
  private final int zzade;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "requestId";
    arrayOfString[1] = "outcome";
    zzaIX = arrayOfString;
  }
  
  private RequestUpdateOutcomes(int paramInt, HashMap paramHashMap)
  {
    this.zzade = paramInt;
    this.zzaIY = paramHashMap;
  }
  
  public static RequestUpdateOutcomes zzab(DataHolder paramDataHolder)
  {
    RequestUpdateOutcomes.Builder localBuilder = new com/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;
    localBuilder.<init>();
    int i = paramDataHolder.getStatusCode();
    localBuilder.zzgG(i);
    int j = paramDataHolder.getCount();
    i = 0;
    while (i < j)
    {
      int k = paramDataHolder.zzbH(i);
      String str1 = paramDataHolder.zzd("requestId", i, k);
      String str2 = "outcome";
      k = paramDataHolder.zzc(str2, i, k);
      localBuilder.zzx(str1, k);
      i += 1;
    }
    return localBuilder.zzxH();
  }
  
  public Set getRequestIds()
  {
    return this.zzaIY.keySet();
  }
  
  public int getRequestOutcome(String paramString)
  {
    boolean bool = this.zzaIY.containsKey(paramString);
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Request " + paramString + " was not part of the update operation!";
    zzx.zzb(bool, localObject);
    return ((Integer)this.zzaIY.get(paramString)).intValue();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\request\RequestUpdateOutcomes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */