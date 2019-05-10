package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzlm
  implements GameManagerState
{
  private final String zzada;
  private final int zzadb;
  private final int zzadg;
  private final int zzadh;
  private final JSONObject zzadj;
  private final String zzadk;
  private final Map zzadm;
  
  public zzlm(int paramInt1, int paramInt2, String paramString1, JSONObject paramJSONObject, Collection paramCollection, String paramString2, int paramInt3)
  {
    this.zzadh = paramInt1;
    this.zzadg = paramInt2;
    this.zzadk = paramString1;
    this.zzadj = paramJSONObject;
    this.zzada = paramString2;
    this.zzadb = paramInt3;
    Object localObject = new java/util/HashMap;
    int i = paramCollection.size();
    ((HashMap)localObject).<init>(i);
    this.zzadm = ((Map)localObject);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (PlayerInfo)localIterator.next();
      Map localMap = this.zzadm;
      String str = ((PlayerInfo)localObject).getPlayerId();
      localMap.put(str, localObject);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof GameManagerState;
      if (bool2) {
        break label26;
      }
    }
    label26:
    Object localObject1;
    Object localObject2;
    label85:
    int i2;
    float f2;
    label134:
    do
    {
      int j;
      int m;
      do
      {
        return bool1;
        paramObject = (GameManagerState)paramObject;
        localObject1 = getPlayers();
        j = ((Collection)localObject1).size();
        localObject2 = ((GameManagerState)paramObject).getPlayers();
        m = ((Collection)localObject2).size();
      } while (j != m);
      localObject1 = getPlayers();
      Iterator localIterator1 = ((Collection)localObject1).iterator();
      boolean bool3 = localIterator1.hasNext();
      if (!bool3) {
        break label231;
      }
      localObject1 = (PlayerInfo)localIterator1.next();
      localObject2 = ((GameManagerState)paramObject).getPlayers();
      Iterator localIterator2 = ((Collection)localObject2).iterator();
      i2 = 0;
      f2 = 0.0F;
      n = localIterator2.hasNext();
      if (n == 0) {
        break;
      }
      localObject2 = (PlayerInfo)localIterator2.next();
      String str1 = ((PlayerInfo)localObject1).getPlayerId();
      String str2 = ((PlayerInfo)localObject2).getPlayerId();
      boolean bool5 = zzf.zza(str1, str2);
      if (!bool5) {
        break label391;
      }
      n = zzf.zza(localObject1, localObject2);
    } while (n == 0);
    int n = i;
    for (float f3 = f1;; f3 = f2)
    {
      i2 = n;
      f2 = f3;
      break label134;
      if (i2 != 0) {
        break label85;
      }
      break;
      label231:
      int k = this.zzadh;
      int i1 = ((GameManagerState)paramObject).getLobbyState();
      if (k == i1)
      {
        k = this.zzadg;
        i1 = ((GameManagerState)paramObject).getGameplayState();
        if (k == i1)
        {
          k = this.zzadb;
          i1 = ((GameManagerState)paramObject).getMaxPlayers();
          if (k == i1)
          {
            localObject1 = this.zzada;
            localObject2 = ((GameManagerState)paramObject).getApplicationName();
            boolean bool4 = zzf.zza(localObject1, localObject2);
            if (bool4)
            {
              localObject1 = this.zzadk;
              localObject2 = ((GameManagerState)paramObject).getGameStatusText();
              bool4 = zzf.zza(localObject1, localObject2);
              if (bool4)
              {
                localObject1 = this.zzadj;
                localObject2 = ((GameManagerState)paramObject).getGameData();
                bool4 = zznb.zze(localObject1, localObject2);
                if (!bool4) {}
              }
            }
          }
        }
      }
      for (;;)
      {
        bool1 = i;
        break;
        i = 0;
        f1 = 0.0F;
      }
      label391:
      i1 = i2;
    }
  }
  
  public CharSequence getApplicationName()
  {
    return this.zzada;
  }
  
  public List getConnectedControllablePlayers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = getPlayers();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (PlayerInfo)localIterator.next();
      boolean bool2 = ((PlayerInfo)localObject).isConnected();
      if (bool2)
      {
        bool2 = ((PlayerInfo)localObject).isControllable();
        if (bool2) {
          localArrayList.add(localObject);
        }
      }
    }
    return localArrayList;
  }
  
  public List getConnectedPlayers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = getPlayers();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (PlayerInfo)localIterator.next();
      boolean bool2 = ((PlayerInfo)localObject).isConnected();
      if (bool2) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public List getControllablePlayers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = getPlayers();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (PlayerInfo)localIterator.next();
      boolean bool2 = ((PlayerInfo)localObject).isControllable();
      if (bool2) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public JSONObject getGameData()
  {
    return this.zzadj;
  }
  
  public CharSequence getGameStatusText()
  {
    return this.zzadk;
  }
  
  public int getGameplayState()
  {
    return this.zzadg;
  }
  
  public Collection getListOfChangedPlayers(GameManagerState paramGameManagerState)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject1 = getPlayers();
    Iterator localIterator = ((Collection)localObject1).iterator();
    boolean bool1;
    Object localObject2;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (PlayerInfo)localIterator.next();
      localObject2 = ((PlayerInfo)localObject1).getPlayerId();
      localObject2 = paramGameManagerState.getPlayer((String)localObject2);
      if (localObject2 != null)
      {
        boolean bool2 = localObject1.equals(localObject2);
        if (bool2) {}
      }
      else
      {
        localObject1 = ((PlayerInfo)localObject1).getPlayerId();
        localHashSet.add(localObject1);
      }
    }
    localObject1 = paramGameManagerState.getPlayers();
    localIterator = ((Collection)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (PlayerInfo)localIterator.next();
      localObject2 = ((PlayerInfo)localObject1).getPlayerId();
      localObject2 = getPlayer((String)localObject2);
      if (localObject2 == null)
      {
        localObject1 = ((PlayerInfo)localObject1).getPlayerId();
        localHashSet.add(localObject1);
      }
    }
    return localHashSet;
  }
  
  public int getLobbyState()
  {
    return this.zzadh;
  }
  
  public int getMaxPlayers()
  {
    return this.zzadb;
  }
  
  public PlayerInfo getPlayer(String paramString)
  {
    if (paramString == null) {}
    for (PlayerInfo localPlayerInfo = null;; localPlayerInfo = (PlayerInfo)this.zzadm.get(paramString)) {
      return localPlayerInfo;
    }
  }
  
  public Collection getPlayers()
  {
    return Collections.unmodifiableCollection(this.zzadm.values());
  }
  
  public List getPlayersInState(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = getPlayers();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (PlayerInfo)localIterator.next();
      int i = ((PlayerInfo)localObject).getPlayerState();
      if (i == paramInt) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public boolean hasGameDataChanged(GameManagerState paramGameManagerState)
  {
    JSONObject localJSONObject1 = this.zzadj;
    JSONObject localJSONObject2 = paramGameManagerState.getGameData();
    boolean bool = zznb.zze(localJSONObject1, localJSONObject2);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localJSONObject1 = null;
    }
  }
  
  public boolean hasGameStatusTextChanged(GameManagerState paramGameManagerState)
  {
    String str = this.zzadk;
    CharSequence localCharSequence = paramGameManagerState.getGameStatusText();
    boolean bool = zzf.zza(str, localCharSequence);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public boolean hasGameplayStateChanged(GameManagerState paramGameManagerState)
  {
    int i = this.zzadg;
    int k = paramGameManagerState.getGameplayState();
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean hasLobbyStateChanged(GameManagerState paramGameManagerState)
  {
    int i = this.zzadh;
    int k = paramGameManagerState.getLobbyState();
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean hasPlayerChanged(String paramString, GameManagerState paramGameManagerState)
  {
    PlayerInfo localPlayerInfo1 = getPlayer(paramString);
    PlayerInfo localPlayerInfo2 = paramGameManagerState.getPlayer(paramString);
    boolean bool = zzf.zza(localPlayerInfo1, localPlayerInfo2);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localPlayerInfo1 = null;
    }
  }
  
  public boolean hasPlayerDataChanged(String paramString, GameManagerState paramGameManagerState)
  {
    boolean bool1 = true;
    Object localObject1 = getPlayer(paramString);
    Object localObject2 = paramGameManagerState.getPlayer(paramString);
    if ((localObject1 == null) && (localObject2 == null)) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if ((localObject1 != null) && (localObject2 != null))
      {
        localObject1 = ((PlayerInfo)localObject1).getPlayerData();
        localObject2 = ((PlayerInfo)localObject2).getPlayerData();
        boolean bool2 = zznb.zze(localObject1, localObject2);
        if (bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  public boolean hasPlayerStateChanged(String paramString, GameManagerState paramGameManagerState)
  {
    boolean bool = true;
    PlayerInfo localPlayerInfo1 = getPlayer(paramString);
    PlayerInfo localPlayerInfo2 = paramGameManagerState.getPlayer(paramString);
    if ((localPlayerInfo1 == null) && (localPlayerInfo2 == null)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if ((localPlayerInfo1 != null) && (localPlayerInfo2 != null))
      {
        int i = localPlayerInfo1.getPlayerState();
        int j = localPlayerInfo2.getPlayerState();
        if (i == j) {
          bool = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    Object localObject = Integer.valueOf(this.zzadh);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzadg);
    arrayOfObject[1] = localObject;
    localObject = this.zzadm;
    arrayOfObject[2] = localObject;
    localObject = this.zzadk;
    arrayOfObject[3] = localObject;
    localObject = this.zzadj;
    arrayOfObject[4] = localObject;
    localObject = this.zzada;
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.zzadb);
    arrayOfObject[6] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */