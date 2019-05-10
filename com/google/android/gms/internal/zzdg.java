package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzdg
  implements zzdf
{
  private final Context mContext;
  private final VersionInfoParcel zzpT;
  
  public zzdg(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    this.mContext = paramContext;
    this.zzpT = paramVersionInfoParcel;
  }
  
  public JSONObject zzQ(String paramString)
  {
    for (;;)
    {
      Object localObject3;
      String str2;
      boolean bool;
      JSONObject localJSONObject2;
      JSONObject localJSONObject3;
      String str3;
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString);
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localObject3 = "";
        str2 = "http_request_id";
      }
      catch (JSONException localJSONException2)
      {
        JSONObject localJSONObject1;
        Object localObject2 = "The request is not a valid JSON.";
        zzin.e((String)localObject2);
        try
        {
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
          localObject1 = "success";
          localObject3 = null;
          localObject2 = ((JSONObject)localObject2).put((String)localObject1, false);
        }
        catch (JSONException localJSONException3)
        {
          localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
        }
        continue;
        str2 = "response";
        localJSONObject3 = new org/json/JSONObject;
        localJSONObject3.<init>();
        str3 = "http_request_id";
        localJSONObject3 = localJSONObject3.put(str3, localObject3);
        localJSONObject2.put(str2, localJSONObject3);
        str2 = "success";
        localJSONObject3 = null;
        localJSONObject2.put(str2, false);
        str2 = "reason";
        Object localObject1 = ((zzdg.zzc)localObject1).getReason();
        localJSONObject2.put(str2, localObject1);
        continue;
      }
      try
      {
        localObject3 = ((JSONObject)localObject1).optString(str2);
        localObject1 = zzc((JSONObject)localObject1);
        localObject1 = zza((zzdg.zzb)localObject1);
        bool = ((zzdg.zzc)localObject1).isSuccess();
        if (!bool) {
          continue;
        }
        localObject1 = ((zzdg.zzc)localObject1).zzdY();
        localObject1 = zza((zzdg.zzd)localObject1);
        str2 = "response";
        localJSONObject1.put(str2, localObject1);
        localObject1 = "success";
        bool = true;
        localJSONObject1.put((String)localObject1, bool);
      }
      catch (Exception localException)
      {
        str2 = "response";
        try
        {
          localJSONObject3 = new org/json/JSONObject;
          localJSONObject3.<init>();
          str3 = "http_request_id";
          localObject3 = localJSONObject3.put(str3, localObject3);
          localJSONObject2.put(str2, localObject3);
          localObject3 = "success";
          bool = false;
          str2 = null;
          localJSONObject2.put((String)localObject3, false);
          localObject3 = "reason";
          String str1 = localException.toString();
          localJSONObject2.put((String)localObject3, str1);
        }
        catch (JSONException localJSONException1) {}
      }
    }
    return localJSONObject1;
  }
  
  protected zzdg.zzc zza(zzdg.zzb paramzzb)
  {
    Object localObject1;
    Object localObject4;
    Object localObject5;
    ArrayList localArrayList;
    boolean bool1;
    Object localObject3;
    try
    {
      localObject1 = paramzzb.zzdV();
      localObject1 = ((URL)localObject1).openConnection();
      localObject1 = (HttpURLConnection)localObject1;
      Object localObject2 = zzr.zzbC();
      localObject4 = this.mContext;
      localObject5 = this.zzpT;
      localObject5 = ((VersionInfoParcel)localObject5).afmaVersion;
      localArrayList = null;
      ((zzir)localObject2).zza((Context)localObject4, (String)localObject5, false, (HttpURLConnection)localObject1);
      localObject2 = paramzzb.zzdW();
      localObject4 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (zzdg.zza)localObject2;
        localObject5 = ((zzdg.zza)localObject2).getKey();
        localObject2 = ((zzdg.zza)localObject2).getValue();
        ((HttpURLConnection)localObject1).addRequestProperty((String)localObject5, (String)localObject2);
      }
      return (zzdg.zzc)localObject1;
    }
    catch (Exception localException)
    {
      localObject1 = new com/google/android/gms/internal/zzdg$zzc;
      localObject3 = localException.toString();
      ((zzdg.zzc)localObject1).<init>(this, false, null, (String)localObject3);
    }
    for (;;)
    {
      localObject3 = paramzzb.zzdX();
      bool1 = TextUtils.isEmpty((CharSequence)localObject3);
      if (!bool1)
      {
        bool1 = true;
        ((HttpURLConnection)localObject1).setDoOutput(bool1);
        localObject3 = paramzzb.zzdX();
        localObject3 = ((String)localObject3).getBytes();
        int i = localObject3.length;
        ((HttpURLConnection)localObject1).setFixedLengthStreamingMode(i);
        localObject4 = new java/io/BufferedOutputStream;
        localObject5 = ((HttpURLConnection)localObject1).getOutputStream();
        ((BufferedOutputStream)localObject4).<init>((OutputStream)localObject5);
        ((BufferedOutputStream)localObject4).write((byte[])localObject3);
        ((BufferedOutputStream)localObject4).close();
      }
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject3 = ((HttpURLConnection)localObject1).getHeaderFields();
      if (localObject3 != null)
      {
        localObject3 = ((HttpURLConnection)localObject1).getHeaderFields();
        localObject3 = ((Map)localObject3).entrySet();
        localObject6 = ((Set)localObject3).iterator();
        bool1 = ((Iterator)localObject6).hasNext();
        if (bool1)
        {
          localObject3 = ((Iterator)localObject6).next();
          localObject3 = (Map.Entry)localObject3;
          localObject4 = ((Map.Entry)localObject3).getValue();
          localObject4 = (List)localObject4;
          localObject7 = ((List)localObject4).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject7).hasNext();
            if (!bool2) {
              break;
            }
            localObject4 = ((Iterator)localObject7).next();
            localObject4 = (String)localObject4;
            zzdg.zza localzza = new com/google/android/gms/internal/zzdg$zza;
            localObject5 = ((Map.Entry)localObject3).getKey();
            localObject5 = (String)localObject5;
            localzza.<init>((String)localObject5, (String)localObject4);
            localArrayList.add(localzza);
          }
        }
      }
      localObject3 = new com/google/android/gms/internal/zzdg$zzd;
      localObject4 = paramzzb.zzdU();
      int j = ((HttpURLConnection)localObject1).getResponseCode();
      Object localObject6 = zzr.zzbC();
      Object localObject7 = new java/io/InputStreamReader;
      localObject1 = ((HttpURLConnection)localObject1).getInputStream();
      ((InputStreamReader)localObject7).<init>((InputStream)localObject1);
      localObject1 = ((zzir)localObject6).zza((InputStreamReader)localObject7);
      ((zzdg.zzd)localObject3).<init>((String)localObject4, j, localArrayList, (String)localObject1);
      localObject1 = new com/google/android/gms/internal/zzdg$zzc;
      boolean bool2 = true;
      j = 0;
      localObject5 = null;
      ((zzdg.zzc)localObject1).<init>(this, bool2, (zzdg.zzd)localObject3, null);
    }
  }
  
  protected JSONObject zza(zzdg.zzd paramzzd)
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    Object localObject1 = "http_request_id";
    Object localObject2;
    try
    {
      localObject2 = paramzzd.zzdU();
      localJSONObject1.put((String)localObject1, localObject2);
      localObject1 = paramzzd.getBody();
      if (localObject1 != null)
      {
        localObject1 = "body";
        localObject2 = paramzzd.getBody();
        localJSONObject1.put((String)localObject1, localObject2);
      }
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      localObject1 = paramzzd.zzdZ();
      Iterator localIterator = ((Iterable)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (zzdg.zza)localObject1;
        JSONObject localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        String str2 = "key";
        String str3 = ((zzdg.zza)localObject1).getKey();
        localJSONObject2 = localJSONObject2.put(str2, str3);
        str2 = "value";
        localObject1 = ((zzdg.zza)localObject1).getValue();
        localObject1 = localJSONObject2.put(str2, localObject1);
        ((JSONArray)localObject2).put(localObject1);
      }
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      localObject2 = "Error constructing JSON for http response.";
      zzin.zzb((String)localObject2, localJSONException);
    }
    for (;;)
    {
      String str1 = "headers";
      localJSONObject1.put(str1, localObject2);
      str1 = "response_code";
      int i = paramzzd.getResponseCode();
      localJSONObject1.put(str1, i);
    }
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzdg.1 local1 = new com/google/android/gms/internal/zzdg$1;
    local1.<init>(this, paramMap, paramzzjp);
    zziq.zza(local1);
  }
  
  protected zzdg.zzb zzc(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    String str1 = paramJSONObject.optString("http_request_id");
    String str2 = paramJSONObject.optString("url");
    Object localObject2 = "post_body";
    String str3 = paramJSONObject.optString((String)localObject2, null);
    try
    {
      localObject2 = new java/net/URL;
      ((URL)localObject2).<init>(str2);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      ArrayList localArrayList;
      URL localURL;
      for (;;)
      {
        int i;
        str2 = "Error constructing http request.";
        zzin.zzb(str2, localMalformedURLException);
        localURL = null;
        continue;
        String str4 = ((JSONObject)localObject3).optString("key");
        Object localObject3 = ((JSONObject)localObject3).optString("value");
        zzdg.zza localzza = new com/google/android/gms/internal/zzdg$zza;
        localzza.<init>(str4, (String)localObject3);
        localArrayList.add(localzza);
      }
      localObject1 = new com/google/android/gms/internal/zzdg$zzb;
      ((zzdg.zzb)localObject1).<init>(str1, localURL, localArrayList, str3);
    }
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = paramJSONObject.optJSONArray("headers");
    if (localObject1 == null)
    {
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
    }
    i = 0;
    str2 = null;
    for (;;)
    {
      int j = ((JSONArray)localObject1).length();
      if (i >= j) {
        break label180;
      }
      localObject3 = ((JSONArray)localObject1).optJSONObject(i);
      if (localObject3 != null) {
        break;
      }
      i += 1;
    }
    label180:
    return (zzdg.zzb)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */