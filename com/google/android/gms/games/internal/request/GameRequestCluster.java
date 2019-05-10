package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public final class GameRequestCluster
  implements SafeParcelable, GameRequest
{
  public static final GameRequestClusterCreator CREATOR;
  private final int mVersionCode;
  private final ArrayList zzaIW;
  
  static
  {
    GameRequestClusterCreator localGameRequestClusterCreator = new com/google/android/gms/games/internal/request/GameRequestClusterCreator;
    localGameRequestClusterCreator.<init>();
    CREATOR = localGameRequestClusterCreator;
  }
  
  GameRequestCluster(int paramInt, ArrayList paramArrayList)
  {
    this.mVersionCode = paramInt;
    this.zzaIW = paramArrayList;
    zzxr();
  }
  
  private void zzxr()
  {
    int i = 1;
    Object localObject1 = this.zzaIW;
    boolean bool1 = ((ArrayList)localObject1).isEmpty();
    Object localObject2;
    int k;
    label50:
    int m;
    if (!bool1)
    {
      bool1 = i;
      zzb.zzab(bool1);
      localObject1 = (GameRequest)this.zzaIW.get(0);
      localObject2 = this.zzaIW;
      int j = ((ArrayList)localObject2).size();
      k = i;
      if (k >= j) {
        return;
      }
      localObject2 = (GameRequest)this.zzaIW.get(k);
      m = ((GameRequest)localObject1).getType();
      int i1 = ((GameRequest)localObject2).getType();
      if (m != i1) {
        break label166;
      }
      m = i;
    }
    for (;;)
    {
      String str = "All the requests must be of the same type";
      zzb.zza(m, str);
      Object localObject3 = ((GameRequest)localObject1).getSender();
      localObject2 = ((GameRequest)localObject2).getSender();
      boolean bool2 = localObject3.equals(localObject2);
      localObject3 = "All the requests must be from the same sender";
      zzb.zza(bool2, localObject3);
      int i2 = k + 1;
      k = i2;
      break label50;
      bool1 = false;
      localObject1 = null;
      break;
      label166:
      int n = 0;
      localObject3 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    boolean bool1 = paramObject instanceof GameRequestCluster;
    Object localObject1;
    if (!bool1)
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool1;
      if (this == paramObject)
      {
        bool1 = i;
      }
      else
      {
        paramObject = (GameRequestCluster)paramObject;
        localObject1 = ((GameRequestCluster)paramObject).zzaIW;
        int j = ((ArrayList)localObject1).size();
        Object localObject2 = this.zzaIW;
        int m = ((ArrayList)localObject2).size();
        if (j != m)
        {
          j = 0;
          localObject1 = null;
        }
        else
        {
          localObject1 = this.zzaIW;
          int n = ((ArrayList)localObject1).size();
          for (int i1 = 0;; i1 = k)
          {
            if (i1 >= n) {
              break label154;
            }
            localObject1 = (GameRequest)this.zzaIW.get(i1);
            localObject2 = (GameRequest)((GameRequestCluster)paramObject).zzaIW.get(i1);
            boolean bool2 = localObject1.equals(localObject2);
            if (!bool2)
            {
              bool2 = false;
              localObject1 = null;
              break;
            }
            k = i1 + 1;
          }
          label154:
          int k = i;
        }
      }
    }
  }
  
  public GameRequest freeze()
  {
    return this;
  }
  
  public long getCreationTimestamp()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public byte[] getData()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public long getExpirationTimestamp()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public Game getGame()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public int getRecipientStatus(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public String getRequestId()
  {
    return ((GameRequestEntity)this.zzaIW.get(0)).getRequestId();
  }
  
  public Player getSender()
  {
    return ((GameRequestEntity)this.zzaIW.get(0)).getSender();
  }
  
  public int getStatus()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public int getType()
  {
    return ((GameRequestEntity)this.zzaIW.get(0)).getType();
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(this.zzaIW.toArray());
  }
  
  public boolean isConsumed(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GameRequestClusterCreator.zza(this, paramParcel, paramInt);
  }
  
  public ArrayList zzxF()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaIW;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public ArrayList zzxG()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\request\GameRequestCluster.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */