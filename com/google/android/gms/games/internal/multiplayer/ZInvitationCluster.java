package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

public final class ZInvitationCluster
  implements SafeParcelable, Invitation
{
  public static final InvitationClusterCreator CREATOR;
  private final int mVersionCode;
  private final ArrayList zzaIl;
  
  static
  {
    InvitationClusterCreator localInvitationClusterCreator = new com/google/android/gms/games/internal/multiplayer/InvitationClusterCreator;
    localInvitationClusterCreator.<init>();
    CREATOR = localInvitationClusterCreator;
  }
  
  ZInvitationCluster(int paramInt, ArrayList paramArrayList)
  {
    this.mVersionCode = paramInt;
    this.zzaIl = paramArrayList;
    zzxr();
  }
  
  private void zzxr()
  {
    int i = 1;
    int k = 0;
    ArrayList localArrayList = null;
    Object localObject1 = this.zzaIl;
    boolean bool = ((ArrayList)localObject1).isEmpty();
    if (!bool) {
      bool = i;
    }
    for (;;)
    {
      zzb.zzab(bool);
      localObject1 = (Invitation)this.zzaIl.get(0);
      localArrayList = this.zzaIl;
      int m = localArrayList.size();
      int j;
      for (k = i; k < m; k = j)
      {
        Object localObject2 = (Invitation)this.zzaIl.get(k);
        Object localObject3 = ((Invitation)localObject1).getInviter();
        localObject2 = ((Invitation)localObject2).getInviter();
        i = localObject3.equals(localObject2);
        localObject3 = "All the invitations must be from the same inviter";
        zzb.zza(i, localObject3);
        j = k + 1;
      }
      bool = false;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    int i = 1;
    boolean bool1 = paramObject instanceof ZInvitationCluster;
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
        paramObject = (ZInvitationCluster)paramObject;
        localObject1 = ((ZInvitationCluster)paramObject).zzaIl;
        int j = ((ArrayList)localObject1).size();
        Object localObject2 = this.zzaIl;
        int m = ((ArrayList)localObject2).size();
        if (j != m)
        {
          j = 0;
          localObject1 = null;
        }
        else
        {
          localObject1 = this.zzaIl;
          int n = ((ArrayList)localObject1).size();
          for (int i1 = 0;; i1 = k)
          {
            if (i1 >= n) {
              break label154;
            }
            localObject1 = (Invitation)this.zzaIl.get(i1);
            localObject2 = (Invitation)((ZInvitationCluster)paramObject).zzaIl.get(i1);
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
  
  public Invitation freeze()
  {
    return this;
  }
  
  public int getAvailableAutoMatchSlots()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public long getCreationTimestamp()
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
  
  public String getInvitationId()
  {
    return ((InvitationEntity)this.zzaIl.get(0)).getInvitationId();
  }
  
  public int getInvitationType()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public Participant getInviter()
  {
    return ((InvitationEntity)this.zzaIl.get(0)).getInviter();
  }
  
  public ArrayList getParticipants()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public int getVariant()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Method not supported on a cluster");
    throw localUnsupportedOperationException;
  }
  
  public int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(this.zzaIl.toArray());
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    InvitationClusterCreator.zza(this, paramParcel, paramInt);
  }
  
  public ArrayList zzxs()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.zzaIl;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\multiplayer\ZInvitationCluster.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */