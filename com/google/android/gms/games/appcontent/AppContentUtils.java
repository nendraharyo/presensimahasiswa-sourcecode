package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzmn;
import java.util.ArrayList;

public final class AppContentUtils
{
  public static ArrayList zza(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    AppContentUtils.1 local1 = new com/google/android/gms/games/appcontent/AppContentUtils$1;
    local1.<init>(localArrayList);
    zza(paramDataHolder, 1, paramString, "action_id", paramInt, local1, paramArrayList);
    return localArrayList;
  }
  
  private static void zza(DataHolder paramDataHolder, int paramInt1, String paramString1, String paramString2, int paramInt2, AppContentUtils.AppContentRunner paramAppContentRunner, ArrayList paramArrayList)
  {
    DataHolder localDataHolder = (DataHolder)paramArrayList.get(paramInt1);
    int i = paramDataHolder.zzbH(paramInt2);
    String str1 = paramDataHolder.zzd(paramString1, paramInt2, i);
    boolean bool1 = TextUtils.isEmpty(str1);
    if (!bool1)
    {
      int j = localDataHolder.getCount();
      String[] arrayOfString = str1.split(",");
      i = 0;
      str1 = null;
      while (i < j)
      {
        int k = localDataHolder.zzbH(i);
        String str2 = localDataHolder.zzd(paramString2, i, k);
        boolean bool3 = TextUtils.isEmpty(str2);
        if (!bool3)
        {
          boolean bool2 = zzmn.zzb(arrayOfString, str2);
          if (bool2) {
            paramAppContentRunner.zzb(paramArrayList, i);
          }
        }
        i += 1;
      }
    }
  }
  
  public static ArrayList zzb(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    AppContentUtils.2 local2 = new com/google/android/gms/games/appcontent/AppContentUtils$2;
    local2.<init>(localArrayList);
    zza(paramDataHolder, 2, paramString, "annotation_id", paramInt, local2, paramArrayList);
    return localArrayList;
  }
  
  public static ArrayList zzc(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    AppContentUtils.3 local3 = new com/google/android/gms/games/appcontent/AppContentUtils$3;
    local3.<init>(localArrayList);
    zza(paramDataHolder, 4, paramString, "condition_id", paramInt, local3, paramArrayList);
    return localArrayList;
  }
  
  public static Bundle zzd(DataHolder paramDataHolder, ArrayList paramArrayList, String paramString, int paramInt)
  {
    int i = 3;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    DataHolder localDataHolder = (DataHolder)paramArrayList.get(i);
    AppContentUtils.4 local4 = new com/google/android/gms/games/appcontent/AppContentUtils$4;
    local4.<init>(localDataHolder, localBundle);
    localDataHolder = paramDataHolder;
    zza(paramDataHolder, i, paramString, "tuple_id", paramInt, local4, paramArrayList);
    return localBundle;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */