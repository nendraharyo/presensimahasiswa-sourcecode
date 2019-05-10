package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity
  implements SafeParcelable, GameRequest
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final int zzBc;
  private final String zzEY;
  private final GameEntity zzaJE;
  private final long zzaJF;
  private final PlayerEntity zzaKG;
  private final ArrayList zzaKH;
  private final long zzaKI;
  private final Bundle zzaKJ;
  private final byte[] zzaKm;
  private final int zzabB;
  
  static
  {
    GameRequestEntityCreator localGameRequestEntityCreator = new com/google/android/gms/games/request/GameRequestEntityCreator;
    localGameRequestEntityCreator.<init>();
    CREATOR = localGameRequestEntityCreator;
  }
  
  GameRequestEntity(int paramInt1, GameEntity paramGameEntity, PlayerEntity paramPlayerEntity, byte[] paramArrayOfByte, String paramString, ArrayList paramArrayList, int paramInt2, long paramLong1, long paramLong2, Bundle paramBundle, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    this.zzaJE = paramGameEntity;
    this.zzaKG = paramPlayerEntity;
    this.zzaKm = paramArrayOfByte;
    this.zzEY = paramString;
    this.zzaKH = paramArrayList;
    this.zzabB = paramInt2;
    this.zzaJF = paramLong1;
    this.zzaKI = paramLong2;
    this.zzaKJ = paramBundle;
    this.zzBc = paramInt3;
  }
  
  public GameRequestEntity(GameRequest paramGameRequest)
  {
    this.mVersionCode = 2;
    Object localObject2 = new com/google/android/gms/games/GameEntity;
    Object localObject3 = paramGameRequest.getGame();
    ((GameEntity)localObject2).<init>((Game)localObject3);
    this.zzaJE = ((GameEntity)localObject2);
    localObject2 = new com/google/android/gms/games/PlayerEntity;
    localObject3 = paramGameRequest.getSender();
    ((PlayerEntity)localObject2).<init>((Player)localObject3);
    this.zzaKG = ((PlayerEntity)localObject2);
    localObject2 = paramGameRequest.getRequestId();
    this.zzEY = ((String)localObject2);
    int j = paramGameRequest.getType();
    this.zzabB = j;
    long l = paramGameRequest.getCreationTimestamp();
    this.zzaJF = l;
    l = paramGameRequest.getExpirationTimestamp();
    this.zzaKI = l;
    j = paramGameRequest.getStatus();
    this.zzBc = j;
    localObject2 = paramGameRequest.getData();
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      this.zzaKm = null;
    }
    for (;;)
    {
      localObject3 = paramGameRequest.getRecipients();
      int k = ((List)localObject3).size();
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(k);
      this.zzaKH = ((ArrayList)localObject2);
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      this.zzaKJ = ((Bundle)localObject2);
      j = 0;
      localObject2 = null;
      while (j < k)
      {
        localObject1 = (Player)((Player)((List)localObject3).get(j)).freeze();
        String str = ((Player)localObject1).getPlayerId();
        ArrayList localArrayList = this.zzaKH;
        localObject1 = (PlayerEntity)localObject1;
        localArrayList.add(localObject1);
        localObject1 = this.zzaKJ;
        int m = paramGameRequest.getRecipientStatus(str);
        ((Bundle)localObject1).putInt(str, m);
        i = j + 1;
        j = i;
      }
      int n = localObject2.length;
      localObject3 = new byte[n];
      this.zzaKm = ((byte[])localObject3);
      localObject3 = this.zzaKm;
      k = localObject2.length;
      System.arraycopy(localObject2, 0, localObject3, 0, k);
    }
  }
  
  static int zza(GameRequest paramGameRequest)
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = paramGameRequest.getGame();
    arrayOfObject[0] = localObject;
    localObject = paramGameRequest.getRecipients();
    arrayOfObject[1] = localObject;
    localObject = paramGameRequest.getRequestId();
    arrayOfObject[2] = localObject;
    localObject = paramGameRequest.getSender();
    arrayOfObject[3] = localObject;
    localObject = zzb(paramGameRequest);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramGameRequest.getType());
    arrayOfObject[5] = localObject;
    localObject = Long.valueOf(paramGameRequest.getCreationTimestamp());
    arrayOfObject[6] = localObject;
    localObject = Long.valueOf(paramGameRequest.getExpirationTimestamp());
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  static boolean zza(GameRequest paramGameRequest, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof GameRequest;
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramGameRequest != paramObject)
      {
        paramObject = (GameRequest)paramObject;
        Object localObject1 = ((GameRequest)paramObject).getGame();
        Object localObject2 = paramGameRequest.getGame();
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = ((GameRequest)paramObject).getRecipients();
          localObject2 = paramGameRequest.getRecipients();
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = ((GameRequest)paramObject).getRequestId();
            localObject2 = paramGameRequest.getRequestId();
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = ((GameRequest)paramObject).getSender();
              localObject2 = paramGameRequest.getSender();
              bool2 = zzw.equal(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = zzb((GameRequest)paramObject);
                localObject2 = zzb(paramGameRequest);
                bool2 = Arrays.equals((int[])localObject1, (int[])localObject2);
                if (bool2)
                {
                  localObject1 = Integer.valueOf(((GameRequest)paramObject).getType());
                  int i = paramGameRequest.getType();
                  localObject2 = Integer.valueOf(i);
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    long l1 = ((GameRequest)paramObject).getCreationTimestamp();
                    localObject1 = Long.valueOf(l1);
                    long l2 = paramGameRequest.getCreationTimestamp();
                    localObject2 = Long.valueOf(l2);
                    bool2 = zzw.equal(localObject1, localObject2);
                    if (bool2)
                    {
                      l1 = ((GameRequest)paramObject).getExpirationTimestamp();
                      localObject1 = Long.valueOf(l1);
                      l2 = paramGameRequest.getExpirationTimestamp();
                      localObject2 = Long.valueOf(l2);
                      bool2 = zzw.equal(localObject1, localObject2);
                      if (bool2) {
                        continue;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  private static int[] zzb(GameRequest paramGameRequest)
  {
    List localList = paramGameRequest.getRecipients();
    int i = localList.size();
    int[] arrayOfInt = new int[i];
    int j = 0;
    String str = null;
    for (int k = 0; k < i; k = j)
    {
      str = ((Player)localList.get(k)).getPlayerId();
      j = paramGameRequest.getRecipientStatus(str);
      arrayOfInt[k] = j;
      j = k + 1;
    }
    return arrayOfInt;
  }
  
  static String zzc(GameRequest paramGameRequest)
  {
    zzw.zza localzza = zzw.zzy(paramGameRequest);
    Object localObject = paramGameRequest.getGame();
    localzza = localzza.zzg("Game", localObject);
    localObject = paramGameRequest.getSender();
    localzza = localzza.zzg("Sender", localObject);
    localObject = paramGameRequest.getRecipients();
    localzza = localzza.zzg("Recipients", localObject);
    localObject = paramGameRequest.getData();
    localzza = localzza.zzg("Data", localObject);
    localObject = paramGameRequest.getRequestId();
    localzza = localzza.zzg("RequestId", localObject);
    localObject = Integer.valueOf(paramGameRequest.getType());
    localzza = localzza.zzg("Type", localObject);
    localObject = Long.valueOf(paramGameRequest.getCreationTimestamp());
    localzza = localzza.zzg("CreationTimestamp", localObject);
    localObject = Long.valueOf(paramGameRequest.getExpirationTimestamp());
    return localzza.zzg("ExpirationTimestamp", localObject).toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public GameRequest freeze()
  {
    return this;
  }
  
  public long getCreationTimestamp()
  {
    return this.zzaJF;
  }
  
  public byte[] getData()
  {
    return this.zzaKm;
  }
  
  public long getExpirationTimestamp()
  {
    return this.zzaKI;
  }
  
  public Game getGame()
  {
    return this.zzaJE;
  }
  
  public int getRecipientStatus(String paramString)
  {
    return this.zzaKJ.getInt(paramString, 0);
  }
  
  public List getRecipients()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaKH;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public String getRequestId()
  {
    return this.zzEY;
  }
  
  public Player getSender()
  {
    return this.zzaKG;
  }
  
  public int getStatus()
  {
    return this.zzBc;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zza(this);
  }
  
  public boolean isConsumed(String paramString)
  {
    int i = 1;
    int j = getRecipientStatus(paramString);
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return zzc(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GameRequestEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzxT()
  {
    return this.zzaKJ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\GameRequestEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */