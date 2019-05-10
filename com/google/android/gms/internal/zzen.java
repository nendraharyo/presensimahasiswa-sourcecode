package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzen
{
  public final String zzBA;
  public final List zzBB;
  public final String zzBC;
  public final String zzBD;
  public final List zzBE;
  public final List zzBF;
  public final String zzBG;
  public final List zzBH;
  public final List zzBI;
  public final String zzBJ;
  public final String zzBK;
  public final String zzBL;
  public final List zzBM;
  public final String zzBN;
  public final String zzBz;
  
  public zzen(String paramString1, String paramString2, List paramList1, String paramString3, String paramString4, List paramList2, List paramList3, String paramString5, String paramString6, List paramList4, List paramList5, String paramString7, String paramString8, String paramString9, List paramList6, String paramString10)
  {
    this.zzBz = paramString1;
    this.zzBA = paramString2;
    this.zzBB = paramList1;
    this.zzBC = paramString3;
    this.zzBD = paramString4;
    this.zzBE = paramList2;
    this.zzBF = paramList3;
    this.zzBG = paramString5;
    this.zzBH = paramList4;
    this.zzBI = paramList5;
    this.zzBJ = paramString7;
    this.zzBK = paramString8;
    this.zzBL = paramString9;
    this.zzBM = paramList6;
    this.zzBN = paramString10;
  }
  
  public zzen(JSONObject paramJSONObject)
  {
    Object localObject1 = paramJSONObject.getString("id");
    this.zzBA = ((String)localObject1);
    Object localObject2 = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new java/util/ArrayList;
    int i = ((JSONArray)localObject2).length();
    localArrayList.<init>(i);
    i = 0;
    localObject1 = null;
    for (;;)
    {
      int j = ((JSONArray)localObject2).length();
      if (i >= j) {
        break;
      }
      String str2 = ((JSONArray)localObject2).getString(i);
      localArrayList.add(str2);
      i += 1;
    }
    localObject1 = Collections.unmodifiableList(localArrayList);
    this.zzBB = ((List)localObject1);
    localObject1 = paramJSONObject.optString("allocation_id", null);
    this.zzBC = ((String)localObject1);
    localObject1 = zzr.zzbP().zza(paramJSONObject, "clickurl");
    this.zzBE = ((List)localObject1);
    localObject1 = zzr.zzbP().zza(paramJSONObject, "imp_urls");
    this.zzBF = ((List)localObject1);
    localObject1 = zzr.zzbP().zza(paramJSONObject, "video_start_urls");
    this.zzBH = ((List)localObject1);
    localObject1 = zzr.zzbP();
    localObject2 = "video_complete_urls";
    localObject1 = ((zzet)localObject1).zza(paramJSONObject, (String)localObject2);
    this.zzBI = ((List)localObject1);
    localObject1 = paramJSONObject.optJSONObject("ad");
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).toString();
      this.zzBz = ((String)localObject1);
      localObject1 = "data";
      localObject2 = paramJSONObject.optJSONObject((String)localObject1);
      if (localObject2 == null) {
        break label345;
      }
      localObject1 = ((JSONObject)localObject2).toString();
      label224:
      this.zzBG = ((String)localObject1);
      if (localObject2 == null) {
        break label353;
      }
      localObject1 = ((JSONObject)localObject2).optString("class_name");
      label242:
      this.zzBD = ((String)localObject1);
      localObject1 = paramJSONObject.optString("html_template", null);
      this.zzBJ = ((String)localObject1);
      localObject1 = paramJSONObject.optString("ad_base_url", null);
      this.zzBK = ((String)localObject1);
      localObject1 = paramJSONObject.optJSONObject("assets");
      if (localObject1 == null) {
        break label361;
      }
    }
    for (localObject1 = ((JSONObject)localObject1).toString();; localObject1 = null)
    {
      this.zzBL = ((String)localObject1);
      localObject1 = zzr.zzbP();
      localObject2 = "template_ids";
      localObject1 = ((zzet)localObject1).zza(paramJSONObject, (String)localObject2);
      this.zzBM = ((List)localObject1);
      localObject1 = paramJSONObject.optJSONObject("ad_loader_options");
      if (localObject1 != null) {
        str1 = ((JSONObject)localObject1).toString();
      }
      this.zzBN = str1;
      return;
      i = 0;
      localObject1 = null;
      break;
      label345:
      i = 0;
      localObject1 = null;
      break label224;
      label353:
      i = 0;
      localObject1 = null;
      break label242;
      label361:
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzen.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */