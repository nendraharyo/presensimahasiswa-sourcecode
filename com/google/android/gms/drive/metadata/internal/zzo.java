package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public class zzo
  extends zzb
{
  public zzo(String paramString, int paramInt)
  {
    super(paramString, localSet1, localSet2, paramInt);
  }
  
  public static Collection zzde(String paramString)
  {
    int i;
    if (paramString == null) {
      i = 0;
    }
    ArrayList localArrayList;
    for (Collection localCollection = null;; localCollection = Collections.unmodifiableCollection(localArrayList))
    {
      return localCollection;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramString);
      i = 0;
      localCollection = null;
      for (;;)
      {
        int j = localJSONArray.length();
        if (i >= j) {
          break;
        }
        String str = localJSONArray.getString(i);
        localArrayList.add(str);
        i += 1;
      }
    }
  }
  
  protected void zza(Bundle paramBundle, Collection paramCollection)
  {
    String str = getName();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramCollection);
    paramBundle.putStringArrayList(str, localArrayList);
  }
  
  protected Collection zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    try
    {
      String str = getName();
      str = paramDataHolder.zzd(str, paramInt1, paramInt2);
      return zzde(str);
    }
    catch (JSONException localJSONException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("DataHolder supplied invalid JSON", localJSONException);
      throw localIllegalStateException;
    }
  }
  
  protected Collection zzs(Bundle paramBundle)
  {
    String str = getName();
    return paramBundle.getStringArrayList(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */