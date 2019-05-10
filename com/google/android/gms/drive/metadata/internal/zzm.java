package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzm
  extends zzj
  implements SearchableCollectionMetadataField
{
  public static final zze.zza zzasT;
  
  static
  {
    zzm.1 local1 = new com/google/android/gms/drive/metadata/internal/zzm$1;
    local1.<init>();
    zzasT = local1;
  }
  
  public zzm(int paramInt)
  {
    super("parents", localSet, (Collection)localObject, paramInt);
  }
  
  private void zzc(DataHolder paramDataHolder)
  {
    int i = 0;
    Object localObject1 = null;
    try
    {
      localObject3 = paramDataHolder.zzpZ();
      localObject5 = "parentsExtraHolder";
      localObject3 = ((Bundle)localObject3).getParcelable((String)localObject5);
      localObject3 = (DataHolder)localObject3;
      if (localObject3 == null) {
        return;
      }
    }
    finally
    {
      try
      {
        for (;;)
        {
          int j = paramDataHolder.getCount();
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(j);
          HashMap localHashMap = new java/util/HashMap;
          localHashMap.<init>(j);
          int k = 0;
          localObject5 = null;
          while (k < j)
          {
            int m = paramDataHolder.zzbH(k);
            localObject6 = new com/google/android/gms/drive/metadata/internal/ParentDriveIdSet;
            ((ParentDriveIdSet)localObject6).<init>();
            localArrayList.add(localObject6);
            String str1 = "sqlId";
            long l1 = paramDataHolder.zzb(str1, k, m);
            localObject7 = Long.valueOf(l1);
            localHashMap.put(localObject7, localObject6);
            k += 1;
          }
          localObject5 = ((DataHolder)localObject3).zzpZ();
          String str2 = "childSqlIdColumn";
          str2 = ((Bundle)localObject5).getString(str2);
          Object localObject7 = "parentSqlIdColumn";
          localObject7 = ((Bundle)localObject5).getString((String)localObject7);
          Object localObject6 = "parentResIdColumn";
          localObject6 = ((Bundle)localObject5).getString((String)localObject6);
          int n = ((DataHolder)localObject3).getCount();
          k = 0;
          localObject5 = null;
          while (k < n)
          {
            int i1 = ((DataHolder)localObject3).zzbH(k);
            long l2 = ((DataHolder)localObject3).zzb(str2, k, i1);
            localObject1 = Long.valueOf(l2);
            localObject1 = localHashMap.get(localObject1);
            localObject1 = (ParentDriveIdSet)localObject1;
            PartialDriveId localPartialDriveId = new com/google/android/gms/drive/metadata/internal/PartialDriveId;
            String str3 = ((DataHolder)localObject3).zzd((String)localObject6, k, i1);
            long l3 = ((DataHolder)localObject3).zzb((String)localObject7, k, i1);
            i1 = 1;
            localPartialDriveId.<init>(str3, l3, i1);
            ((ParentDriveIdSet)localObject1).zza(localPartialDriveId);
            i = k + 1;
            k = i;
          }
          localObject1 = paramDataHolder.zzpZ();
          localObject5 = "parentsExtra";
          ((Bundle)localObject1).putParcelableArrayList((String)localObject5, localArrayList);
          ((DataHolder)localObject3).close();
          Object localObject3 = paramDataHolder.zzpZ();
          localObject1 = "parentsExtraHolder";
          ((Bundle)localObject3).remove((String)localObject1);
        }
      }
      finally
      {
        ((DataHolder)localObject4).close();
        Bundle localBundle = paramDataHolder.zzpZ();
        Object localObject5 = "parentsExtraHolder";
        localBundle.remove((String)localObject5);
      }
      localObject4 = finally;
    }
  }
  
  private static void zzd(DataHolder paramDataHolder)
  {
    Bundle localBundle = paramDataHolder.zzpZ();
    if (localBundle == null) {}
    for (;;)
    {
      return;
      Object localObject1 = "parentsExtraHolder";
      try
      {
        localObject1 = localBundle.getParcelable((String)localObject1);
        localObject1 = (DataHolder)localObject1;
        if (localObject1 != null)
        {
          ((DataHolder)localObject1).close();
          localObject1 = "parentsExtraHolder";
          localBundle.remove((String)localObject1);
        }
      }
      finally {}
    }
  }
  
  protected Collection zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Bundle localBundle = paramDataHolder.zzpZ();
    Object localObject1 = localBundle.getParcelableArrayList("parentsExtra");
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = localBundle.getParcelable("parentsExtraHolder");
      if (localObject2 != null)
      {
        zzc(paramDataHolder);
        localObject1 = localBundle.getParcelableArrayList("parentsExtra");
      }
      if (localObject1 != null) {}
    }
    long l;
    for (localObject1 = null;; localObject1 = ((ParentDriveIdSet)((List)localObject1).get(paramInt1)).zzD(l))
    {
      return (Collection)localObject1;
      localObject2 = "dbInstanceId";
      l = localBundle.getLong((String)localObject2);
    }
  }
  
  protected Collection zzs(Bundle paramBundle)
  {
    Collection localCollection = super.zzs(paramBundle);
    Object localObject;
    if (localCollection == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Collection)localObject;
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>(localCollection);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */