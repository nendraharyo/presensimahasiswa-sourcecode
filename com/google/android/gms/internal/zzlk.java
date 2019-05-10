package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzlk
{
  private static final zzl zzaaf;
  protected final zzlj zzacE;
  protected final String zzacX;
  protected final long zzacY;
  protected final JSONObject zzacZ;
  protected final int zzadd;
  protected final int zzade;
  protected final String zzadf;
  protected final int zzadg;
  protected final int zzadh;
  protected final List zzadi;
  protected final JSONObject zzadj;
  protected final String zzadk;
  protected final String zzadl;
  
  static
  {
    zzl localzzl = new com/google/android/gms/cast/internal/zzl;
    localzzl.<init>("GameManagerMessage");
    zzaaf = localzzl;
  }
  
  public zzlk(int paramInt1, int paramInt2, String paramString1, JSONObject paramJSONObject1, int paramInt3, int paramInt4, List paramList, JSONObject paramJSONObject2, String paramString2, String paramString3, long paramLong, String paramString4, zzlj paramzzlj)
  {
    this.zzadd = paramInt1;
    this.zzade = paramInt2;
    this.zzadf = paramString1;
    this.zzacZ = paramJSONObject1;
    this.zzadg = paramInt3;
    this.zzadh = paramInt4;
    this.zzadi = paramList;
    this.zzadj = paramJSONObject2;
    this.zzadk = paramString2;
    this.zzacX = paramString3;
    this.zzacY = paramLong;
    this.zzadl = paramString4;
    this.zzacE = paramzzlj;
  }
  
  private static List zzb(JSONArray paramJSONArray)
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    if (paramJSONArray == null) {}
    int i;
    int j;
    Object localObject1;
    label130:
    for (ArrayList localArrayList2 = localArrayList1;; localArrayList2 = localArrayList1)
    {
      return localArrayList2;
      i = 0;
      localArrayList2 = null;
      for (;;)
      {
        j = paramJSONArray.length();
        if (i >= j) {
          break label130;
        }
        localObject1 = paramJSONArray.optJSONObject(i);
        if (localObject1 != null) {}
        try
        {
          localzzlo = new com/google/android/gms/internal/zzlo;
          localzzlo.<init>((JSONObject)localObject1);
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            zzlo localzzlo;
            localObject1 = zzaaf;
            String str = "Exception when attempting to parse PlayerInfoMessageComponent at index %d";
            int k = 1;
            Object[] arrayOfObject = new Object[k];
            Integer localInteger = Integer.valueOf(i);
            arrayOfObject[0] = localInteger;
            ((zzl)localObject1).zzc(localJSONException, str, arrayOfObject);
            j = 0;
            Object localObject2 = null;
          }
        }
        if (localzzlo != null) {
          localArrayList1.add(localzzlo);
        }
        i += 1;
      }
    }
  }
  
  protected static zzlk zzi(JSONObject paramJSONObject)
  {
    Object localObject1 = "type";
    int i = -1;
    j = paramJSONObject.optInt((String)localObject1, i);
    switch (j)
    {
    }
    try
    {
      localObject1 = zzaaf;
      localObject3 = "Unrecognized Game Message type %d";
      k = 1;
      arrayOfObject = new Object[k];
      str1 = null;
      localObject4 = Integer.valueOf(j);
      arrayOfObject[0] = localObject4;
      ((zzl)localObject1).zzf((String)localObject3, arrayOfObject);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject3 = zzaaf;
        Object localObject4 = "Exception while parsing GameManagerMessage from json";
        int k = 0;
        Object[] arrayOfObject = new Object[0];
        ((zzl)localObject3).zzc(localJSONException, (String)localObject4, arrayOfObject);
        continue;
        zzlj localzzlj = null;
        Object localObject2 = "gameManagerConfig";
        localObject2 = paramJSONObject.optJSONObject((String)localObject2);
        if (localObject2 != null)
        {
          localzzlj = new com/google/android/gms/internal/zzlj;
          localzzlj.<init>((JSONObject)localObject2);
        }
        localObject3 = new com/google/android/gms/internal/zzlk;
        localObject2 = "statusCode";
        k = paramJSONObject.optInt((String)localObject2);
        localObject2 = "errorDescription";
        String str1 = paramJSONObject.optString((String)localObject2);
        localObject2 = "extraMessageData";
        JSONObject localJSONObject1 = paramJSONObject.optJSONObject((String)localObject2);
        localObject2 = "gameplayState";
        int m = paramJSONObject.optInt((String)localObject2);
        localObject2 = "lobbyState";
        int n = paramJSONObject.optInt((String)localObject2);
        localObject2 = "players";
        localObject2 = paramJSONObject.optJSONArray((String)localObject2);
        List localList = zzb((JSONArray)localObject2);
        localObject2 = "gameData";
        JSONObject localJSONObject2 = paramJSONObject.optJSONObject((String)localObject2);
        localObject2 = "gameStatusText";
        String str2 = paramJSONObject.optString((String)localObject2);
        localObject2 = "playerId";
        String str3 = paramJSONObject.optString((String)localObject2);
        localObject2 = "requestId";
        long l = paramJSONObject.optLong((String)localObject2);
        localObject2 = "playerToken";
        String str4 = paramJSONObject.optString((String)localObject2);
        ((zzlk)localObject3).<init>(j, k, str1, localJSONObject1, m, n, localList, localJSONObject2, str2, str3, l, str4, localzzlj);
      }
    }
    i = 0;
    localObject3 = null;
    for (;;)
    {
      return (zzlk)localObject3;
      localObject3 = new com/google/android/gms/internal/zzlk;
      localObject1 = "statusCode";
      k = paramJSONObject.optInt((String)localObject1);
      localObject1 = "errorDescription";
      str1 = paramJSONObject.optString((String)localObject1);
      localObject1 = "extraMessageData";
      localJSONObject1 = paramJSONObject.optJSONObject((String)localObject1);
      localObject1 = "gameplayState";
      m = paramJSONObject.optInt((String)localObject1);
      localObject1 = "lobbyState";
      n = paramJSONObject.optInt((String)localObject1);
      localObject1 = "players";
      localObject1 = paramJSONObject.optJSONArray((String)localObject1);
      localList = zzb((JSONArray)localObject1);
      localObject1 = "gameData";
      localJSONObject2 = paramJSONObject.optJSONObject((String)localObject1);
      localObject1 = "gameStatusText";
      str2 = paramJSONObject.optString((String)localObject1);
      localObject1 = "playerId";
      str3 = paramJSONObject.optString((String)localObject1);
      l = -1;
      str4 = null;
      localzzlj = null;
      ((zzlk)localObject3).<init>(j, k, str1, localJSONObject1, m, n, localList, localJSONObject2, str2, str3, l, null, null);
    }
  }
  
  public final JSONObject getExtraMessageData()
  {
    return this.zzacZ;
  }
  
  public final JSONObject getGameData()
  {
    return this.zzadj;
  }
  
  public final int getGameplayState()
  {
    return this.zzadg;
  }
  
  public final int getLobbyState()
  {
    return this.zzadh;
  }
  
  public final String getPlayerId()
  {
    return this.zzacX;
  }
  
  public final long getRequestId()
  {
    return this.zzacY;
  }
  
  public final int getStatusCode()
  {
    return this.zzade;
  }
  
  public final int zznY()
  {
    return this.zzadd;
  }
  
  public final String zznZ()
  {
    return this.zzadf;
  }
  
  public final List zzoa()
  {
    return this.zzadi;
  }
  
  public final String zzob()
  {
    return this.zzadk;
  }
  
  public final String zzoc()
  {
    return this.zzadl;
  }
  
  public final zzlj zzod()
  {
    return this.zzacE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */