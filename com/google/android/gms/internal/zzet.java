package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzet
{
  public List zza(JSONObject paramJSONObject, String paramString)
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    ArrayList localArrayList;
    int i;
    if (localJSONArray != null)
    {
      localArrayList = new java/util/ArrayList;
      i = localJSONArray.length();
      localArrayList.<init>(i);
      i = 0;
      localList = null;
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
    for (List localList = Collections.unmodifiableList(localArrayList);; localList = null)
    {
      return localList;
      i = 0;
    }
  }
  
  public void zza(Context paramContext, String paramString1, zzif paramzzif, String paramString2, boolean paramBoolean, List paramList)
  {
    boolean bool;
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool) {}
    }
    else
    {
      return;
    }
    String str1;
    if (paramBoolean) {
      str1 = "1";
    }
    for (String str2 = str1;; str2 = str1)
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        str1 = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str2);
        String str3 = paramzzif.zzKV.zzBT;
        str1 = str1.replaceAll("@gw_qdata@", str3).replaceAll("@gw_sdkver@", paramString1);
        str3 = zzr.zzbF().getSessionId();
        str1 = str1.replaceAll("@gw_sessid@", str3);
        str3 = paramzzif.zzHw;
        str1 = str1.replaceAll("@gw_seqnum@", str3);
        Object localObject = paramzzif.zzCp;
        if (localObject != null)
        {
          str3 = paramzzif.zzCp.zzBA;
          str1 = str1.replaceAll("@gw_adnetid@", str3);
          localObject = "@gw_allocid@";
          str3 = paramzzif.zzCp.zzBC;
          str1 = str1.replaceAll((String)localObject, str3);
        }
        localObject = new com/google/android/gms/internal/zziy;
        ((zziy)localObject).<init>(paramContext, paramString1, str1);
        ((zziy)localObject).zzhn();
      }
      str1 = "0";
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */