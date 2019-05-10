package com.google.android.gms.internal;

import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONObject;

public final class zzln
  implements PlayerInfo
{
  private final int zzabo;
  private final String zzacX;
  private final JSONObject zzadn;
  private final boolean zzado;
  
  public zzln(String paramString, int paramInt, JSONObject paramJSONObject, boolean paramBoolean)
  {
    this.zzacX = paramString;
    this.zzabo = paramInt;
    this.zzadn = paramJSONObject;
    this.zzado = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject != null)
    {
      bool2 = paramObject instanceof PlayerInfo;
      if (bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      paramObject = (PlayerInfo)paramObject;
      bool2 = this.zzado;
      boolean bool4 = ((PlayerInfo)paramObject).isControllable();
      if (bool2 == bool4)
      {
        int i = this.zzabo;
        int j = ((PlayerInfo)paramObject).getPlayerState();
        if (i == j)
        {
          Object localObject1 = this.zzacX;
          Object localObject2 = ((PlayerInfo)paramObject).getPlayerId();
          boolean bool3 = zzf.zza(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = this.zzadn;
            localObject2 = ((PlayerInfo)paramObject).getPlayerData();
            bool3 = zznb.zze(localObject1, localObject2);
            if (bool3) {
              bool1 = true;
            }
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
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzacX;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzabo);
    arrayOfObject[1] = localObject;
    localObject = this.zzadn;
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.zzado);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isConnected()
  {
    int i = this.zzabo;
    switch (i)
    {
    }
    int j;
    for (i = 0;; j = 1) {
      return i;
    }
  }
  
  public boolean isControllable()
  {
    return this.zzado;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzln.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */