package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.h.f;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.metadata.internal.zze.zza;
import com.google.android.gms.drive.metadata.internal.zzk;
import java.util.Collection;

public class zznn
  extends zzk
{
  public static final zze.zza zzatL;
  
  static
  {
    zznn.1 local1 = new com/google/android/gms/internal/zznn$1;
    local1.<init>();
    zzatL = local1;
  }
  
  public zznn(int paramInt)
  {
    super("customProperties", (Collection)localObject1, (Collection)localObject2, paramInt);
  }
  
  private static void zzc(DataHolder paramDataHolder)
  {
    try
    {
      localObject1 = paramDataHolder.zzpZ();
      localObject3 = "customPropertiesExtraHolder";
      localObject1 = ((Bundle)localObject1).getParcelable((String)localObject3);
      localObject1 = (DataHolder)localObject1;
      if (localObject1 == null) {
        return;
      }
    }
    finally
    {
      try
      {
        for (;;)
        {
          f localf = zzf((DataHolder)localObject1);
          SparseArray localSparseArray = new android/util/SparseArray;
          localSparseArray.<init>();
          int i = 0;
          Object localObject3 = null;
          int j = 0;
          str = null;
          for (;;)
          {
            i = paramDataHolder.getCount();
            if (j >= i) {
              break;
            }
            localObject3 = "sqlId";
            int k = paramDataHolder.zzbH(j);
            long l = paramDataHolder.zzb((String)localObject3, j, k);
            localObject3 = localf.a(l);
            localObject3 = (AppVisibleCustomProperties.zza)localObject3;
            if (localObject3 != null)
            {
              localObject3 = ((AppVisibleCustomProperties.zza)localObject3).zztA();
              localSparseArray.append(j, localObject3);
            }
            i = j + 1;
            j = i;
          }
          localObject3 = paramDataHolder.zzpZ();
          str = "customPropertiesExtra";
          ((Bundle)localObject3).putSparseParcelableArray(str, localSparseArray);
          ((DataHolder)localObject1).close();
          Object localObject1 = paramDataHolder.zzpZ();
          localObject3 = "customPropertiesExtraHolder";
          ((Bundle)localObject1).remove((String)localObject3);
        }
      }
      finally
      {
        ((DataHolder)localObject2).close();
        Bundle localBundle = paramDataHolder.zzpZ();
        String str = "customPropertiesExtraHolder";
        localBundle.remove(str);
      }
      localObject2 = finally;
    }
  }
  
  private static void zzd(DataHolder paramDataHolder)
  {
    Bundle localBundle = paramDataHolder.zzpZ();
    if (localBundle == null) {}
    for (;;)
    {
      return;
      Object localObject1 = "customPropertiesExtraHolder";
      try
      {
        localObject1 = localBundle.getParcelable((String)localObject1);
        localObject1 = (DataHolder)localObject1;
        if (localObject1 != null)
        {
          ((DataHolder)localObject1).close();
          localObject1 = "customPropertiesExtraHolder";
          localBundle.remove((String)localObject1);
        }
      }
      finally {}
    }
  }
  
  private static f zzf(DataHolder paramDataHolder)
  {
    Object localObject = paramDataHolder.zzpZ();
    String str1 = ((Bundle)localObject).getString("entryIdColumn");
    String str2 = ((Bundle)localObject).getString("keyColumn");
    String str3 = ((Bundle)localObject).getString("visibilityColumn");
    String str4 = ((Bundle)localObject).getString("valueColumn");
    f localf = new android/support/v4/h/f;
    localf.<init>();
    int i = 0;
    localObject = null;
    for (int j = 0;; j = i)
    {
      i = paramDataHolder.getCount();
      if (j >= i) {
        break;
      }
      i = paramDataHolder.zzbH(j);
      long l = paramDataHolder.zzb(str1, j, i);
      String str5 = paramDataHolder.zzd(str2, j, i);
      int k = paramDataHolder.zzc(str3, j, i);
      localObject = paramDataHolder.zzd(str4, j, i);
      CustomProperty localCustomProperty = new com/google/android/gms/drive/metadata/internal/CustomProperty;
      CustomPropertyKey localCustomPropertyKey = new com/google/android/gms/drive/metadata/CustomPropertyKey;
      localCustomPropertyKey.<init>(str5, k);
      localCustomProperty.<init>(localCustomPropertyKey, (String)localObject);
      localObject = (AppVisibleCustomProperties.zza)localf.a(l);
      if (localObject == null)
      {
        localObject = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$zza;
        ((AppVisibleCustomProperties.zza)localObject).<init>();
        localf.b(l, localObject);
      }
      ((AppVisibleCustomProperties.zza)localObject).zza(localCustomProperty);
      i = j + 1;
    }
    return localf;
  }
  
  protected AppVisibleCustomProperties zzl(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Object localObject1 = paramDataHolder.zzpZ();
    Object localObject2 = ((Bundle)localObject1).getSparseParcelableArray("customPropertiesExtra");
    if (localObject2 == null)
    {
      Parcelable localParcelable = ((Bundle)localObject1).getParcelable("customPropertiesExtraHolder");
      if (localParcelable != null)
      {
        zzc(paramDataHolder);
        localObject2 = ((Bundle)localObject1).getSparseParcelableArray("customPropertiesExtra");
      }
      if (localObject2 != null) {}
    }
    for (localObject2 = AppVisibleCustomProperties.zzasK;; localObject2 = (AppVisibleCustomProperties)((SparseArray)localObject2).get(paramInt1, localObject1))
    {
      return (AppVisibleCustomProperties)localObject2;
      localObject1 = AppVisibleCustomProperties.zzasK;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */