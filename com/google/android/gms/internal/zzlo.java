package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import org.json.JSONObject;

public final class zzlo
{
  private final int zzabo;
  private final String zzacX;
  private final JSONObject zzadn;
  
  public zzlo(String paramString, int paramInt, JSONObject paramJSONObject)
  {
    this.zzacX = paramString;
    this.zzabo = paramInt;
    this.zzadn = paramJSONObject;
  }
  
  public zzlo(JSONObject paramJSONObject)
  {
    this(str, i, localJSONObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof zzlo;
      if (bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      paramObject = (zzlo)paramObject;
      int i = this.zzabo;
      int j = ((zzlo)paramObject).getPlayerState();
      if (i == j)
      {
        Object localObject1 = this.zzacX;
        Object localObject2 = ((zzlo)paramObject).getPlayerId();
        boolean bool3 = zzf.zza(localObject1, localObject2);
        if (bool3)
        {
          localObject1 = this.zzadn;
          localObject2 = ((zzlo)paramObject).getPlayerData();
          bool3 = zznb.zze(localObject1, localObject2);
          if (bool3) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  public JSONObject getPlayerData()
  {
    return this.zzadn;
  }
  
  public String getPlayerId()
  {
    return this.zzacX;
  }
  
  public int getPlayerState()
  {
    return this.zzabo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */