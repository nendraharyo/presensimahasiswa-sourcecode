package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzhe
{
  private static final SimpleDateFormat zzJg;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    Locale localLocale = Locale.US;
    localSimpleDateFormat.<init>("yyyyMMdd", localLocale);
    zzJg = localSimpleDateFormat;
  }
  
  private static String zzL(int paramInt)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(0xFFFFFF & paramInt);
    arrayOfObject[0] = localInteger;
    return String.format(localLocale, "#%06x", arrayOfObject);
  }
  
  public static AdResponseParcel zza(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    for (;;)
    {
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localObject1 = "ad_base_url";
        i = 0;
        localObject3 = null;
        str1 = localJSONObject.optString((String)localObject1, null);
        localObject1 = "ad_url";
        i = 0;
        localObject3 = null;
        localObject4 = localJSONObject.optString((String)localObject1, null);
        localObject1 = "ad_size";
        i = 0;
        localObject3 = null;
        str2 = localJSONObject.optString((String)localObject1, null);
        if (paramAdRequestInfoParcel == null) {
          continue;
        }
        int j = paramAdRequestInfoParcel.zzHz;
        if (j == 0) {
          continue;
        }
        bool3 = true;
        if (!bool3) {
          continue;
        }
        localObject1 = "ad_json";
        i = 0;
        localObject3 = null;
        localObject3 = localJSONObject.optString((String)localObject1, null);
        l1 = -1;
        localObject1 = "debug_dialog";
        bool4 = false;
        localObject5 = null;
        str3 = localJSONObject.optString((String)localObject1, null);
        localObject1 = "interstitial_timeout";
        bool2 = localJSONObject.has((String)localObject1);
        if (!bool2) {
          continue;
        }
        localObject1 = "interstitial_timeout";
        double d1 = localJSONObject.getDouble((String)localObject1);
        l2 = 4652007308841189376L;
        double d2 = 1000.0D;
        d1 *= d2;
        l3 = d1;
        l4 = l3;
        localObject1 = "orientation";
        bool4 = false;
        localObject5 = null;
        localObject1 = localJSONObject.optString((String)localObject1, null);
        k = -1;
        localObject5 = "portrait";
        bool4 = ((String)localObject5).equals(localObject1);
        if (!bool4) {
          continue;
        }
        localObject1 = zzr.zzbE();
        k = ((zzis)localObject1).zzhw();
        bool2 = false;
        localObject1 = null;
        bool4 = TextUtils.isEmpty((CharSequence)localObject3);
        if (bool4) {
          continue;
        }
        boolean bool5 = TextUtils.isEmpty(str1);
        if (!bool5) {
          continue;
        }
        localObject1 = "Could not parse the mediation config: Missing required ad_base_url field";
        zzin.zzaK((String)localObject1);
        localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        i = 0;
        localObject3 = null;
        ((AdResponseParcel)localObject1).<init>(0);
      }
      catch (JSONException localJSONException)
      {
        JSONObject localJSONObject;
        Object localObject1;
        int i;
        String str2;
        boolean bool3;
        long l1;
        boolean bool4;
        String str3;
        boolean bool2;
        long l3;
        long l4;
        int k;
        int m;
        boolean bool6;
        int n;
        long l5;
        String str4;
        String str5;
        boolean bool8;
        boolean bool9;
        boolean bool10;
        boolean bool11;
        int i1;
        long l6;
        long l7;
        String str6;
        String str7;
        boolean bool12;
        boolean bool13;
        List localList3;
        List localList4;
        RewardItemParcel localRewardItemParcel;
        boolean bool14;
        boolean bool7;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str1 = "Could not parse the mediation config: ";
        localObject3 = ((StringBuilder)localObject3).append(str1);
        Object localObject2 = localJSONException.getMessage();
        zzin.zzaK((String)localObject2);
        localObject2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        boolean bool1 = false;
        localObject3 = null;
        ((AdResponseParcel)localObject2).<init>(0);
        continue;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "Could not parse the mediation config: Missing required ";
        localObject3 = ((StringBuilder)localObject2).append((String)localObject3);
        if (!bool3) {
          continue;
        }
        localObject2 = "ad_json";
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = " or ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = "ad_url";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = " field.";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        zzin.zzaK((String)localObject2);
        localObject2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        bool1 = false;
        localObject3 = null;
        ((AdResponseParcel)localObject2).<init>(0);
        continue;
        localObject2 = "ad_html";
        continue;
        Object localObject5 = ((AdResponseParcel)localObject2).zzBQ;
        continue;
        List localList1 = ((AdResponseParcel)localObject2).zzBR;
        continue;
        List localList2 = ((AdResponseParcel)localObject2).zzHV;
        continue;
        long l2 = l4;
        continue;
        Object localObject4 = localObject3;
        continue;
      }
      return (AdResponseParcel)localObject1;
      bool3 = false;
      continue;
      localObject1 = "ad_html";
      i = 0;
      localObject3 = null;
      localObject3 = localJSONObject.optString((String)localObject1, null);
      continue;
      l4 = -1;
      continue;
      localObject5 = "landscape";
      bool2 = ((String)localObject5).equals(localObject1);
      if (bool2)
      {
        localObject1 = zzr.zzbE();
        k = ((zzis)localObject1).zzhv();
        continue;
        bool2 = TextUtils.isEmpty((CharSequence)localObject4);
        if (bool2) {
          continue;
        }
        localObject1 = paramAdRequestInfoParcel.zzrl;
        str1 = ((VersionInfoParcel)localObject1).afmaVersion;
        bool4 = false;
        localObject5 = null;
        localList1 = null;
        m = 0;
        bool6 = false;
        localObject1 = paramAdRequestInfoParcel;
        localObject3 = paramContext;
        localObject1 = zzhd.zza(paramAdRequestInfoParcel, paramContext, str1, (String)localObject4, null, null, null, null, null);
        str1 = ((AdResponseParcel)localObject1).zzEF;
        localObject4 = ((AdResponseParcel)localObject1).body;
        l3 = ((AdResponseParcel)localObject1).zzHX;
        l1 = l3;
        localObject3 = "click_urls";
        localObject3 = localJSONObject.optJSONArray((String)localObject3);
        if (localObject1 != null) {
          continue;
        }
        bool4 = false;
        localObject5 = null;
        if (localObject3 != null) {
          localObject5 = zza((JSONArray)localObject3, (List)localObject5);
        }
        localObject3 = "impression_urls";
        localObject3 = localJSONObject.optJSONArray((String)localObject3);
        if (localObject1 != null) {
          continue;
        }
        localList1 = null;
        if (localObject3 != null) {
          localList1 = zza((JSONArray)localObject3, localList1);
        }
        localObject3 = "manual_impression_urls";
        localObject3 = localJSONObject.optJSONArray((String)localObject3);
        if (localObject1 != null) {
          continue;
        }
        localList2 = null;
        if (localObject3 != null) {
          localList2 = zza((JSONArray)localObject3, localList2);
        }
        if (localObject1 == null) {
          continue;
        }
        i = ((AdResponseParcel)localObject1).orientation;
        m = -1;
        if (i != m)
        {
          n = ((AdResponseParcel)localObject1).orientation;
          k = n;
        }
        l2 = ((AdResponseParcel)localObject1).zzHS;
        l5 = 0L;
        bool1 = l2 < l5;
        if (!bool1) {
          continue;
        }
        l2 = ((AdResponseParcel)localObject1).zzHS;
        localObject1 = "active_view";
        str4 = localJSONObject.optString((String)localObject1);
        str5 = null;
        localObject1 = "ad_is_javascript";
        bool1 = false;
        localObject3 = null;
        bool8 = localJSONObject.optBoolean((String)localObject1, false);
        if (bool8)
        {
          localObject1 = "ad_passback_url";
          bool1 = false;
          localObject3 = null;
          str5 = localJSONObject.optString((String)localObject1, null);
        }
        localObject1 = "mediation";
        bool1 = false;
        localObject3 = null;
        bool6 = localJSONObject.optBoolean((String)localObject1, false);
        localObject1 = "custom_render_allowed";
        bool1 = false;
        localObject3 = null;
        bool9 = localJSONObject.optBoolean((String)localObject1, false);
        localObject1 = "content_url_opted_out";
        bool1 = true;
        bool10 = localJSONObject.optBoolean((String)localObject1, bool1);
        localObject1 = "prefetch";
        bool1 = false;
        localObject3 = null;
        bool11 = localJSONObject.optBoolean((String)localObject1, false);
        localObject1 = "oauth2_token_status";
        bool1 = false;
        localObject3 = null;
        i1 = localJSONObject.optInt((String)localObject1, 0);
        localObject1 = "refresh_interval_milliseconds";
        l4 = -1;
        l4 = localJSONObject.optLong((String)localObject1, l4);
        localObject1 = "mediation_config_cache_time_milliseconds";
        l6 = -1;
        l7 = localJSONObject.optLong((String)localObject1, l6);
        localObject1 = "gws_query_id";
        localObject3 = "";
        str6 = localJSONObject.optString((String)localObject1, (String)localObject3);
        localObject1 = "height";
        localObject3 = "fluid";
        str7 = "";
        localObject3 = localJSONObject.optString((String)localObject3, str7);
        bool12 = ((String)localObject1).equals(localObject3);
        localObject1 = "native_express";
        bool1 = false;
        localObject3 = null;
        bool13 = localJSONObject.optBoolean((String)localObject1, false);
        localObject1 = "video_start_urls";
        localObject1 = localJSONObject.optJSONArray((String)localObject1);
        bool1 = false;
        localObject3 = null;
        localList3 = zza((JSONArray)localObject1, null);
        localObject1 = "video_complete_urls";
        localObject1 = localJSONObject.optJSONArray((String)localObject1);
        bool1 = false;
        localObject3 = null;
        localList4 = zza((JSONArray)localObject1, null);
        localObject1 = "rewards";
        localObject1 = localJSONObject.optJSONArray((String)localObject1);
        localRewardItemParcel = RewardItemParcel.zza((JSONArray)localObject1);
        localObject1 = "use_displayed_impression";
        bool1 = false;
        localObject3 = null;
        bool14 = localJSONObject.optBoolean((String)localObject1, false);
        localObject1 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
        bool7 = paramAdRequestInfoParcel.zzHB;
        localObject3 = paramAdRequestInfoParcel;
        ((AdResponseParcel)localObject1).<init>(paramAdRequestInfoParcel, str1, (String)localObject4, (List)localObject5, localList1, l2, bool6, l7, localList2, l4, k, str2, l1, str3, bool8, str5, str4, bool9, bool3, bool7, bool10, bool11, i1, str6, bool12, bool13, localRewardItemParcel, localList3, localList4, bool14);
      }
    }
  }
  
  private static List zza(JSONArray paramJSONArray, List paramList)
  {
    if (paramJSONArray == null)
    {
      paramList = null;
      return paramList;
    }
    if (paramList == null)
    {
      paramList = new java/util/LinkedList;
      paramList.<init>();
    }
    int i = 0;
    for (;;)
    {
      int j = paramJSONArray.length();
      if (i >= j) {
        break;
      }
      String str = paramJSONArray.getString(i);
      paramList.add(str);
      i += 1;
    }
  }
  
  public static JSONObject zza(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzhj paramzzhj, zzhn.zza paramzza, Location paramLocation, zzbm paramzzbm, String paramString1, String paramString2, List paramList, Bundle paramBundle)
  {
    for (;;)
    {
      try
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        int i = paramList.size();
        if (i > 0)
        {
          localObject2 = "eid";
          localObject3 = ",";
          localObject3 = TextUtils.join((CharSequence)localObject3, paramList);
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        localObject2 = paramAdRequestInfoParcel.zzHs;
        if (localObject2 != null)
        {
          localObject2 = "ad_pos";
          localObject3 = paramAdRequestInfoParcel.zzHs;
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        localObject2 = paramAdRequestInfoParcel.zzHt;
        zza((HashMap)localObject1, (AdRequestParcel)localObject2);
        localObject2 = "format";
        localObject3 = paramAdRequestInfoParcel.zzrp;
        localObject3 = ((AdSizeParcel)localObject3).zzuh;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = paramAdRequestInfoParcel.zzrp;
        i = ((AdSizeParcel)localObject2).width;
        int i3 = -1;
        f1 = 0.0F / 0.0F;
        if (i == i3)
        {
          localObject2 = "smart_w";
          localObject3 = "full";
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        localObject2 = paramAdRequestInfoParcel.zzrp;
        i = ((AdSizeParcel)localObject2).height;
        i3 = -2;
        f1 = 0.0F / 0.0F;
        if (i == i3)
        {
          localObject2 = "smart_h";
          localObject3 = "auto";
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        localObject2 = paramAdRequestInfoParcel.zzrp;
        boolean bool1 = ((AdSizeParcel)localObject2).zzul;
        if (bool1)
        {
          localObject2 = "fluid";
          localObject3 = "height";
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        localObject2 = paramAdRequestInfoParcel.zzrp;
        localObject2 = ((AdSizeParcel)localObject2).zzuj;
        if (localObject2 != null)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject2 = paramAdRequestInfoParcel.zzrp;
          AdSizeParcel[] arrayOfAdSizeParcel = ((AdSizeParcel)localObject2).zzuj;
          int i5 = arrayOfAdSizeParcel.length;
          bool1 = false;
          f2 = 0.0F;
          localObject2 = null;
          i3 = 0;
          localObject3 = null;
          f1 = 0.0F;
          if (i3 < i5)
          {
            AdSizeParcel localAdSizeParcel = arrayOfAdSizeParcel[i3];
            j = ((StringBuilder)localObject4).length();
            if (j != 0)
            {
              localObject2 = "|";
              ((StringBuilder)localObject4).append((String)localObject2);
            }
            j = localAdSizeParcel.width;
            int i6 = -1;
            float f3 = 0.0F / 0.0F;
            if (j == i6)
            {
              j = localAdSizeParcel.widthPixels;
              f2 = j;
              f3 = paramzzhj.zzHF;
              f2 /= f3;
              j = (int)f2;
              ((StringBuilder)localObject4).append(j);
              localObject2 = "x";
              ((StringBuilder)localObject4).append((String)localObject2);
              j = localAdSizeParcel.height;
              i6 = -2;
              f3 = 0.0F / 0.0F;
              if (j == i6)
              {
                j = localAdSizeParcel.heightPixels;
                f2 = j;
                float f4 = paramzzhj.zzHF;
                f2 /= f4;
                j = (int)f2;
                ((StringBuilder)localObject4).append(j);
                j = i3 + 1;
                i3 = j;
              }
            }
            else
            {
              j = localAdSizeParcel.width;
              continue;
            }
            j = localAdSizeParcel.height;
            continue;
          }
          localObject2 = "sz";
          ((HashMap)localObject1).put(localObject2, localObject4);
        }
        int j = paramAdRequestInfoParcel.zzHz;
        if (j != 0)
        {
          localObject2 = "native_version";
          i3 = paramAdRequestInfoParcel.zzHz;
          localObject3 = Integer.valueOf(i3);
          ((HashMap)localObject1).put(localObject2, localObject3);
          localObject2 = paramAdRequestInfoParcel.zzrp;
          boolean bool2 = ((AdSizeParcel)localObject2).zzum;
          if (!bool2)
          {
            localObject2 = "native_templates";
            localObject3 = paramAdRequestInfoParcel.zzrH;
            ((HashMap)localObject1).put(localObject2, localObject3);
            localObject2 = "native_image_orientation";
            localObject3 = paramAdRequestInfoParcel.zzrD;
            localObject3 = zzc((NativeAdOptionsParcel)localObject3);
            ((HashMap)localObject1).put(localObject2, localObject3);
            localObject2 = paramAdRequestInfoParcel.zzHK;
            bool2 = ((List)localObject2).isEmpty();
            if (!bool2)
            {
              localObject2 = "native_custom_templates";
              localObject3 = paramAdRequestInfoParcel.zzHK;
              ((HashMap)localObject1).put(localObject2, localObject3);
            }
          }
        }
        localObject2 = "slotname";
        localObject3 = paramAdRequestInfoParcel.zzrj;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = "pn";
        localObject3 = paramAdRequestInfoParcel.applicationInfo;
        localObject3 = ((ApplicationInfo)localObject3).packageName;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = paramAdRequestInfoParcel.zzHu;
        if (localObject2 != null)
        {
          localObject2 = "vc";
          localObject3 = paramAdRequestInfoParcel.zzHu;
          i3 = ((PackageInfo)localObject3).versionCode;
          localObject3 = Integer.valueOf(i3);
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        localObject2 = "ms";
        ((HashMap)localObject1).put(localObject2, paramString2);
        localObject2 = "seq_num";
        localObject3 = paramAdRequestInfoParcel.zzHw;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = "session_id";
        localObject3 = paramAdRequestInfoParcel.zzHx;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = "js";
        localObject3 = paramAdRequestInfoParcel.zzrl;
        localObject3 = ((VersionInfoParcel)localObject3).afmaVersion;
        ((HashMap)localObject1).put(localObject2, localObject3);
        zza((HashMap)localObject1, paramzzhj, paramzza);
        localObject2 = "platform";
        localObject3 = Build.MANUFACTURER;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = "submodel";
        localObject3 = Build.MODEL;
        ((HashMap)localObject1).put(localObject2, localObject3);
        localObject2 = paramAdRequestInfoParcel.zzHt;
        int k = ((AdRequestParcel)localObject2).versionCode;
        i3 = 2;
        f1 = 2.8E-45F;
        if (k >= i3)
        {
          localObject2 = paramAdRequestInfoParcel.zzHt;
          localObject2 = ((AdRequestParcel)localObject2).zztK;
          if (localObject2 != null)
          {
            localObject2 = paramAdRequestInfoParcel.zzHt;
            localObject2 = ((AdRequestParcel)localObject2).zztK;
            zza((HashMap)localObject1, (Location)localObject2);
          }
        }
        k = paramAdRequestInfoParcel.versionCode;
        i3 = 2;
        f1 = 2.8E-45F;
        if (k >= i3)
        {
          localObject2 = "quality_signals";
          localObject3 = paramAdRequestInfoParcel.zzHy;
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
        k = paramAdRequestInfoParcel.versionCode;
        i3 = 4;
        f1 = 5.6E-45F;
        if (k >= i3)
        {
          boolean bool3 = paramAdRequestInfoParcel.zzHB;
          if (bool3)
          {
            localObject2 = "forceHttps";
            boolean bool7 = paramAdRequestInfoParcel.zzHB;
            localObject3 = Boolean.valueOf(bool7);
            ((HashMap)localObject1).put(localObject2, localObject3);
          }
        }
        if (paramBundle != null)
        {
          localObject2 = "content_info";
          ((HashMap)localObject1).put(localObject2, paramBundle);
        }
        int m = paramAdRequestInfoParcel.versionCode;
        i4 = 5;
        f1 = 7.0E-45F;
        if (m >= i4)
        {
          localObject2 = "u_sd";
          f1 = paramAdRequestInfoParcel.zzHF;
          localObject3 = Float.valueOf(f1);
          ((HashMap)localObject1).put(localObject2, localObject3);
          localObject2 = "sh";
          i4 = paramAdRequestInfoParcel.zzHE;
          localObject3 = Integer.valueOf(i4);
          ((HashMap)localObject1).put(localObject2, localObject3);
          localObject2 = "sw";
          i4 = paramAdRequestInfoParcel.zzHD;
          localObject3 = Integer.valueOf(i4);
          ((HashMap)localObject1).put(localObject2, localObject3);
          m = paramAdRequestInfoParcel.versionCode;
          i4 = 6;
          f1 = 8.4E-45F;
          if (m >= i4)
          {
            localObject2 = paramAdRequestInfoParcel.zzHG;
            boolean bool4 = TextUtils.isEmpty((CharSequence)localObject2);
            if (!bool4) {
              localObject2 = "view_hierarchy";
            }
          }
        }
      }
      catch (JSONException localJSONException1)
      {
        Object localObject2;
        float f1;
        Object localObject4;
        int i4;
        long l;
        int n;
        boolean bool5;
        int i1;
        int i7;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject1 = "Problem serializing ad request to JSON: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
        String str = localJSONException1.getMessage();
        zzin.zzaK(str);
        boolean bool6 = false;
        float f2 = 0.0F;
        str = null;
        continue;
      }
      try
      {
        localObject3 = new org/json/JSONObject;
        localObject4 = paramAdRequestInfoParcel.zzHG;
        ((JSONObject)localObject3).<init>((String)localObject4);
        ((HashMap)localObject1).put(localObject2, localObject3);
      }
      catch (JSONException localJSONException2)
      {
        localObject3 = "Problem serializing view hierarchy to JSON";
        zzin.zzd((String)localObject3, localJSONException2);
        continue;
        int i2 = paramAdRequestInfoParcel.zzHQ;
        continue;
      }
      localObject2 = "correlation_id";
      l = paramAdRequestInfoParcel.zzHH;
      localObject3 = Long.valueOf(l);
      ((HashMap)localObject1).put(localObject2, localObject3);
      n = paramAdRequestInfoParcel.versionCode;
      i4 = 7;
      f1 = 9.8E-45F;
      if (n >= i4)
      {
        localObject2 = "request_id";
        localObject3 = paramAdRequestInfoParcel.zzHI;
        ((HashMap)localObject1).put(localObject2, localObject3);
      }
      n = paramAdRequestInfoParcel.versionCode;
      i4 = 11;
      f1 = 1.5E-44F;
      if (n >= i4)
      {
        localObject2 = paramAdRequestInfoParcel.zzHM;
        if (localObject2 != null)
        {
          localObject2 = "capability";
          localObject3 = paramAdRequestInfoParcel.zzHM;
          localObject3 = ((CapabilityParcel)localObject3).toBundle();
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
      }
      zza((HashMap)localObject1, paramString1);
      n = paramAdRequestInfoParcel.versionCode;
      i4 = 12;
      f1 = 1.7E-44F;
      if (n >= i4)
      {
        localObject2 = paramAdRequestInfoParcel.zzHN;
        bool5 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool5)
        {
          localObject2 = "anchor";
          localObject3 = paramAdRequestInfoParcel.zzHN;
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
      }
      i1 = paramAdRequestInfoParcel.versionCode;
      i4 = 13;
      f1 = 1.8E-44F;
      if (i1 >= i4)
      {
        localObject2 = "avol";
        f1 = paramAdRequestInfoParcel.zzHO;
        localObject3 = Float.valueOf(f1);
        ((HashMap)localObject1).put(localObject2, localObject3);
      }
      i1 = paramAdRequestInfoParcel.versionCode;
      i4 = 14;
      f1 = 2.0E-44F;
      if (i1 >= i4)
      {
        i1 = paramAdRequestInfoParcel.zzHP;
        if (i1 > 0)
        {
          localObject2 = "target_api";
          i4 = paramAdRequestInfoParcel.zzHP;
          localObject3 = Integer.valueOf(i4);
          ((HashMap)localObject1).put(localObject2, localObject3);
        }
      }
      i1 = paramAdRequestInfoParcel.versionCode;
      i4 = 15;
      f1 = 2.1E-44F;
      if (i1 >= i4)
      {
        localObject3 = "scroll_index";
        i1 = paramAdRequestInfoParcel.zzHQ;
        i7 = -1;
        if (i1 != i7) {
          break;
        }
        i1 = -1;
        f2 = 0.0F / 0.0F;
        localObject2 = Integer.valueOf(i1);
        ((HashMap)localObject1).put(localObject3, localObject2);
      }
      i1 = 2;
      f2 = 2.8E-45F;
      bool6 = zzin.zzQ(i1);
      if (bool6)
      {
        localObject2 = zzr.zzbC();
        localObject2 = ((zzir)localObject2).zzG((Map)localObject1);
        i4 = 2;
        f1 = 2.8E-45F;
        localObject2 = ((JSONObject)localObject2).toString(i4);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Ad Request JSON: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
        zzin.v((String)localObject2);
      }
      localObject2 = zzr.zzbC();
      localObject2 = ((zzir)localObject2).zzG((Map)localObject1);
      return (JSONObject)localObject2;
      localObject2 = "u_sd";
      f1 = paramzzhj.zzHF;
      localObject3 = Float.valueOf(f1);
      ((HashMap)localObject1).put(localObject2, localObject3);
      localObject2 = "sh";
      i4 = paramzzhj.zzHE;
      localObject3 = Integer.valueOf(i4);
      ((HashMap)localObject1).put(localObject2, localObject3);
      localObject2 = "sw";
      i4 = paramzzhj.zzHD;
      localObject3 = Integer.valueOf(i4);
      ((HashMap)localObject1).put(localObject2, localObject3);
    }
  }
  
  private static void zza(HashMap paramHashMap, Location paramLocation)
  {
    double d = 1.0E7D;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Float localFloat = Float.valueOf(paramLocation.getAccuracy() * 1000.0F);
    Long localLong1 = Long.valueOf(paramLocation.getTime() * 1000L);
    Long localLong2 = Long.valueOf((paramLocation.getLatitude() * d));
    Long localLong3 = Long.valueOf((paramLocation.getLongitude() * d));
    localHashMap.put("radius", localFloat);
    localHashMap.put("lat", localLong2);
    localHashMap.put("long", localLong3);
    localHashMap.put("time", localLong1);
    paramHashMap.put("uule", localHashMap);
  }
  
  private static void zza(HashMap paramHashMap, AdRequestParcel paramAdRequestParcel)
  {
    int i = -1;
    Object localObject1 = zzil.zzhm();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = "abf";
      paramHashMap.put(localObject2, localObject1);
    }
    long l1 = paramAdRequestParcel.zztC;
    long l2 = -1;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      localObject1 = "cust_age";
      localObject2 = zzJg;
      Date localDate = new java/util/Date;
      long l3 = paramAdRequestParcel.zztC;
      localDate.<init>(l3);
      localObject2 = ((SimpleDateFormat)localObject2).format(localDate);
      paramHashMap.put(localObject1, localObject2);
    }
    localObject1 = paramAdRequestParcel.extras;
    if (localObject1 != null)
    {
      localObject1 = "extras";
      localObject2 = paramAdRequestParcel.extras;
      paramHashMap.put(localObject1, localObject2);
    }
    int j = paramAdRequestParcel.zztD;
    if (j != i)
    {
      localObject1 = "cust_gender";
      n = paramAdRequestParcel.zztD;
      localObject2 = Integer.valueOf(n);
      paramHashMap.put(localObject1, localObject2);
    }
    localObject1 = paramAdRequestParcel.zztE;
    if (localObject1 != null)
    {
      localObject1 = "kw";
      localObject2 = paramAdRequestParcel.zztE;
      paramHashMap.put(localObject1, localObject2);
    }
    j = paramAdRequestParcel.zztG;
    if (j != i)
    {
      localObject1 = "tag_for_child_directed_treatment";
      n = paramAdRequestParcel.zztG;
      localObject2 = Integer.valueOf(n);
      paramHashMap.put(localObject1, localObject2);
    }
    boolean bool2 = paramAdRequestParcel.zztF;
    if (bool2)
    {
      localObject1 = "adtest";
      localObject2 = "on";
      paramHashMap.put(localObject1, localObject2);
    }
    int k = paramAdRequestParcel.versionCode;
    int n = 2;
    if (k >= n)
    {
      boolean bool3 = paramAdRequestParcel.zztH;
      if (bool3)
      {
        localObject1 = "d_imp_hdr";
        n = 1;
        localObject2 = Integer.valueOf(n);
        paramHashMap.put(localObject1, localObject2);
      }
      localObject1 = paramAdRequestParcel.zztI;
      bool3 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool3)
      {
        localObject1 = "ppid";
        localObject2 = paramAdRequestParcel.zztI;
        paramHashMap.put(localObject1, localObject2);
      }
      localObject1 = paramAdRequestParcel.zztJ;
      if (localObject1 != null)
      {
        localObject1 = paramAdRequestParcel.zztJ;
        zza(paramHashMap, (SearchAdRequestParcel)localObject1);
      }
    }
    int m = paramAdRequestParcel.versionCode;
    n = 3;
    if (m >= n)
    {
      localObject1 = paramAdRequestParcel.zztL;
      if (localObject1 != null)
      {
        localObject1 = "url";
        localObject2 = paramAdRequestParcel.zztL;
        paramHashMap.put(localObject1, localObject2);
      }
    }
    m = paramAdRequestParcel.versionCode;
    n = 5;
    if (m >= n)
    {
      localObject1 = paramAdRequestParcel.zztN;
      if (localObject1 != null)
      {
        localObject1 = "custom_targeting";
        localObject2 = paramAdRequestParcel.zztN;
        paramHashMap.put(localObject1, localObject2);
      }
      localObject1 = paramAdRequestParcel.zztO;
      if (localObject1 != null)
      {
        localObject1 = "category_exclusions";
        localObject2 = paramAdRequestParcel.zztO;
        paramHashMap.put(localObject1, localObject2);
      }
      localObject1 = paramAdRequestParcel.zztP;
      if (localObject1 != null)
      {
        localObject1 = "request_agent";
        localObject2 = paramAdRequestParcel.zztP;
        paramHashMap.put(localObject1, localObject2);
      }
    }
    m = paramAdRequestParcel.versionCode;
    n = 6;
    if (m >= n)
    {
      localObject1 = paramAdRequestParcel.zztQ;
      if (localObject1 != null)
      {
        localObject1 = "request_pkg";
        localObject2 = paramAdRequestParcel.zztQ;
        paramHashMap.put(localObject1, localObject2);
      }
    }
    m = paramAdRequestParcel.versionCode;
    n = 7;
    if (m >= n)
    {
      localObject1 = "is_designed_for_families";
      boolean bool4 = paramAdRequestParcel.zztR;
      localObject2 = Boolean.valueOf(bool4);
      paramHashMap.put(localObject1, localObject2);
    }
  }
  
  private static void zza(HashMap paramHashMap, SearchAdRequestParcel paramSearchAdRequestParcel)
  {
    int i = 0;
    Object localObject = null;
    int j = Color.alpha(paramSearchAdRequestParcel.zzvd);
    if (j != 0)
    {
      str1 = "acolor";
      k = paramSearchAdRequestParcel.zzvd;
      str2 = zzL(k);
      paramHashMap.put(str1, str2);
    }
    j = Color.alpha(paramSearchAdRequestParcel.backgroundColor);
    if (j != 0)
    {
      str1 = "bgcolor";
      k = paramSearchAdRequestParcel.backgroundColor;
      str2 = zzL(k);
      paramHashMap.put(str1, str2);
    }
    j = Color.alpha(paramSearchAdRequestParcel.zzve);
    if (j != 0)
    {
      j = Color.alpha(paramSearchAdRequestParcel.zzvf);
      if (j != 0)
      {
        str2 = zzL(paramSearchAdRequestParcel.zzve);
        paramHashMap.put("gradientto", str2);
        str1 = "gradientfrom";
        k = paramSearchAdRequestParcel.zzvf;
        str2 = zzL(k);
        paramHashMap.put(str1, str2);
      }
    }
    j = Color.alpha(paramSearchAdRequestParcel.zzvg);
    if (j != 0)
    {
      str1 = "bcolor";
      k = paramSearchAdRequestParcel.zzvg;
      str2 = zzL(k);
      paramHashMap.put(str1, str2);
    }
    String str1 = "bthick";
    int k = paramSearchAdRequestParcel.zzvh;
    String str2 = Integer.toString(k);
    paramHashMap.put(str1, str2);
    j = paramSearchAdRequestParcel.zzvi;
    switch (j)
    {
    default: 
      j = 0;
      str1 = null;
      if (str1 != null)
      {
        str2 = "btype";
        paramHashMap.put(str2, str1);
      }
      j = paramSearchAdRequestParcel.zzvj;
      switch (j)
      {
      }
      break;
    }
    for (;;)
    {
      if (localObject != null)
      {
        str1 = "callbuttoncolor";
        paramHashMap.put(str1, localObject);
      }
      localObject = paramSearchAdRequestParcel.zzvk;
      if (localObject != null)
      {
        localObject = "channel";
        str1 = paramSearchAdRequestParcel.zzvk;
        paramHashMap.put(localObject, str1);
      }
      i = Color.alpha(paramSearchAdRequestParcel.zzvl);
      if (i != 0)
      {
        localObject = "dcolor";
        j = paramSearchAdRequestParcel.zzvl;
        str1 = zzL(j);
        paramHashMap.put(localObject, str1);
      }
      localObject = paramSearchAdRequestParcel.zzvm;
      if (localObject != null)
      {
        localObject = "font";
        str1 = paramSearchAdRequestParcel.zzvm;
        paramHashMap.put(localObject, str1);
      }
      i = Color.alpha(paramSearchAdRequestParcel.zzvn);
      if (i != 0)
      {
        localObject = "hcolor";
        j = paramSearchAdRequestParcel.zzvn;
        str1 = zzL(j);
        paramHashMap.put(localObject, str1);
      }
      j = paramSearchAdRequestParcel.zzvo;
      str1 = Integer.toString(j);
      paramHashMap.put("headersize", str1);
      localObject = paramSearchAdRequestParcel.zzvp;
      if (localObject != null)
      {
        localObject = "q";
        str1 = paramSearchAdRequestParcel.zzvp;
        paramHashMap.put(localObject, str1);
      }
      return;
      str1 = "none";
      break;
      str1 = "dashed";
      break;
      str1 = "dotted";
      break;
      str1 = "solid";
      break;
      localObject = "dark";
      continue;
      localObject = "light";
      continue;
      localObject = "medium";
    }
  }
  
  private static void zza(HashMap paramHashMap, zzhj paramzzhj, zzhn.zza paramzza)
  {
    int i = 1;
    Object localObject1 = Integer.valueOf(paramzzhj.zzJQ);
    paramHashMap.put("am", localObject1);
    localObject1 = zzy(paramzzhj.zzJR);
    paramHashMap.put("cog", localObject1);
    boolean bool1 = paramzzhj.zzJS;
    localObject1 = zzy(bool1);
    paramHashMap.put("coh", localObject1);
    Object localObject2 = paramzzhj.zzJT;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool2)
    {
      localObject2 = "carrier";
      localObject1 = paramzzhj.zzJT;
      paramHashMap.put(localObject2, localObject1);
    }
    localObject2 = "gl";
    localObject1 = paramzzhj.zzJU;
    paramHashMap.put(localObject2, localObject1);
    bool2 = paramzzhj.zzJV;
    if (bool2)
    {
      localObject2 = "simulator";
      localObject1 = Integer.valueOf(i);
      paramHashMap.put(localObject2, localObject1);
    }
    bool2 = paramzzhj.zzJW;
    if (bool2)
    {
      localObject2 = "is_sidewinder";
      localObject1 = Integer.valueOf(i);
      paramHashMap.put(localObject2, localObject1);
    }
    localObject1 = zzy(paramzzhj.zzJX);
    paramHashMap.put("ma", localObject1);
    bool1 = paramzzhj.zzJY;
    localObject1 = zzy(bool1);
    paramHashMap.put("sp", localObject1);
    localObject1 = paramzzhj.zzJZ;
    paramHashMap.put("hl", localObject1);
    localObject2 = paramzzhj.zzKa;
    bool2 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool2)
    {
      localObject2 = "mv";
      localObject1 = paramzzhj.zzKa;
      paramHashMap.put(localObject2, localObject1);
    }
    localObject2 = "muv";
    localObject1 = Integer.valueOf(paramzzhj.zzKb);
    paramHashMap.put(localObject2, localObject1);
    int k = paramzzhj.zzKc;
    int j = -2;
    if (k != j)
    {
      localObject2 = "cnt";
      j = paramzzhj.zzKc;
      localObject1 = Integer.valueOf(j);
      paramHashMap.put(localObject2, localObject1);
    }
    localObject1 = Integer.valueOf(paramzzhj.zzKd);
    paramHashMap.put("gnt", localObject1);
    localObject1 = Integer.valueOf(paramzzhj.zzKe);
    paramHashMap.put("pt", localObject1);
    localObject1 = Integer.valueOf(paramzzhj.zzKf);
    paramHashMap.put("rm", localObject1);
    j = paramzzhj.zzKg;
    localObject1 = Integer.valueOf(j);
    paramHashMap.put("riv", localObject1);
    localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    Object localObject3 = paramzzhj.zzKl;
    ((Bundle)localObject2).putString("build", (String)localObject3);
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    boolean bool3 = paramzzhj.zzKi;
    ((Bundle)localObject1).putBoolean("is_charging", bool3);
    double d = paramzzhj.zzKh;
    ((Bundle)localObject1).putDouble("battery_level", d);
    ((Bundle)localObject2).putBundle("battery", (Bundle)localObject1);
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    int m = paramzzhj.zzKk;
    ((Bundle)localObject1).putInt("active_network_state", m);
    localObject3 = "active_network_metered";
    boolean bool4 = paramzzhj.zzKj;
    ((Bundle)localObject1).putBoolean((String)localObject3, bool4);
    if (paramzza != null)
    {
      localObject3 = new android/os/Bundle;
      ((Bundle)localObject3).<init>();
      int n = paramzza.zzKq;
      ((Bundle)localObject3).putInt("predicted_latency_micros", n);
      long l = paramzza.zzKr;
      ((Bundle)localObject3).putLong("predicted_down_throughput_bps", l);
      l = paramzza.zzKs;
      ((Bundle)localObject3).putLong("predicted_up_throughput_bps", l);
      String str = "predictions";
      ((Bundle)localObject1).putBundle(str, (Bundle)localObject3);
    }
    ((Bundle)localObject2).putBundle("network", (Bundle)localObject1);
    paramHashMap.put("device", localObject2);
  }
  
  private static void zza(HashMap paramHashMap, String paramString)
  {
    if (paramString != null)
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localHashMap.put("token", paramString);
      String str = "pan";
      paramHashMap.put(str, localHashMap);
    }
  }
  
  private static String zzc(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    int i;
    String str;
    if (paramNativeAdOptionsParcel != null)
    {
      i = paramNativeAdOptionsParcel.zzyB;
      switch (i)
      {
      default: 
        str = "any";
      }
    }
    for (;;)
    {
      return str;
      i = 0;
      str = null;
      break;
      str = "portrait";
      continue;
      str = "landscape";
    }
  }
  
  public static JSONObject zzc(AdResponseParcel paramAdResponseParcel)
  {
    long l1 = -1;
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = paramAdResponseParcel.zzEF;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = "ad_base_url";
      localObject2 = paramAdResponseParcel.zzEF;
      localJSONObject.put((String)localObject1, localObject2);
    }
    localObject1 = paramAdResponseParcel.zzHW;
    if (localObject1 != null)
    {
      localObject1 = "ad_size";
      localObject2 = paramAdResponseParcel.zzHW;
      localJSONObject.put((String)localObject1, localObject2);
    }
    localObject1 = "native";
    boolean bool1 = paramAdResponseParcel.zzuk;
    localJSONObject.put((String)localObject1, bool1);
    boolean bool4 = paramAdResponseParcel.zzuk;
    if (bool4)
    {
      localObject1 = "ad_json";
      localObject2 = paramAdResponseParcel.body;
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = paramAdResponseParcel.zzHY;
      if (localObject1 != null)
      {
        localObject1 = "debug_dialog";
        localObject2 = paramAdResponseParcel.zzHY;
        localJSONObject.put((String)localObject1, localObject2);
      }
      long l2 = paramAdResponseParcel.zzHS;
      bool4 = l2 < l1;
      if (bool4)
      {
        localObject1 = "interstitial_timeout";
        l2 = paramAdResponseParcel.zzHS;
        double d1 = l2;
        double d2 = 1000.0D;
        d1 /= d2;
        localJSONObject.put((String)localObject1, d1);
      }
      int m = paramAdResponseParcel.orientation;
      localObject2 = zzr.zzbE();
      int i = ((zzis)localObject2).zzhw();
      if (m != i) {
        break label789;
      }
      localObject1 = "orientation";
      localObject2 = "portrait";
      localJSONObject.put((String)localObject1, localObject2);
      label246:
      localObject1 = paramAdResponseParcel.zzBQ;
      if (localObject1 != null)
      {
        localObject1 = "click_urls";
        localObject2 = zzi(paramAdResponseParcel.zzBQ);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = paramAdResponseParcel.zzBR;
      if (localObject1 != null)
      {
        localObject1 = "impression_urls";
        localObject2 = zzi(paramAdResponseParcel.zzBR);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = paramAdResponseParcel.zzHV;
      if (localObject1 != null)
      {
        localObject1 = "manual_impression_urls";
        localObject2 = zzi(paramAdResponseParcel.zzHV);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = paramAdResponseParcel.zzIb;
      if (localObject1 != null)
      {
        localObject1 = "active_view";
        localObject2 = paramAdResponseParcel.zzIb;
        localJSONObject.put((String)localObject1, localObject2);
      }
      boolean bool2 = paramAdResponseParcel.zzHZ;
      localJSONObject.put("ad_is_javascript", bool2);
      localObject1 = paramAdResponseParcel.zzIa;
      if (localObject1 != null)
      {
        localObject1 = "ad_passback_url";
        localObject2 = paramAdResponseParcel.zzIa;
        localJSONObject.put((String)localObject1, localObject2);
      }
      bool2 = paramAdResponseParcel.zzHT;
      localJSONObject.put("mediation", bool2);
      bool2 = paramAdResponseParcel.zzIc;
      localJSONObject.put("custom_render_allowed", bool2);
      bool2 = paramAdResponseParcel.zzId;
      localJSONObject.put("content_url_opted_out", bool2);
      bool2 = paramAdResponseParcel.zzIe;
      localJSONObject.put("prefetch", bool2);
      localObject1 = "oauth2_token_status";
      int j = paramAdResponseParcel.zzIf;
      localJSONObject.put((String)localObject1, j);
      l2 = paramAdResponseParcel.zzBU;
      boolean bool5 = l2 < l1;
      if (bool5)
      {
        localObject1 = "refresh_interval_milliseconds";
        l2 = paramAdResponseParcel.zzBU;
        localJSONObject.put((String)localObject1, l2);
      }
      l2 = paramAdResponseParcel.zzHU;
      bool5 = l2 < l1;
      if (bool5)
      {
        localObject1 = "mediation_config_cache_time_milliseconds";
        l2 = paramAdResponseParcel.zzHU;
        localJSONObject.put((String)localObject1, l2);
      }
      localObject1 = paramAdResponseParcel.zzIi;
      bool5 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool5)
      {
        localObject1 = "gws_query_id";
        localObject2 = paramAdResponseParcel.zzIi;
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject2 = "fluid";
      bool5 = paramAdResponseParcel.zzul;
      if (!bool5) {
        break label834;
      }
    }
    label789:
    label834:
    for (localObject1 = "height";; localObject1 = "")
    {
      localJSONObject.put((String)localObject2, localObject1);
      boolean bool3 = paramAdResponseParcel.zzum;
      localJSONObject.put("native_express", bool3);
      localObject1 = paramAdResponseParcel.zzIk;
      if (localObject1 != null)
      {
        localObject1 = "video_start_urls";
        localObject2 = zzi(paramAdResponseParcel.zzIk);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = paramAdResponseParcel.zzIl;
      if (localObject1 != null)
      {
        localObject1 = "video_complete_urls";
        localObject2 = zzi(paramAdResponseParcel.zzIl);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = paramAdResponseParcel.zzIj;
      if (localObject1 != null)
      {
        localObject1 = "rewards";
        localObject2 = paramAdResponseParcel.zzIj.zzgR();
        localJSONObject.put((String)localObject1, localObject2);
      }
      bool3 = paramAdResponseParcel.zzIm;
      localJSONObject.put("use_displayed_impression", bool3);
      return localJSONObject;
      localObject1 = "ad_html";
      localObject2 = paramAdResponseParcel.body;
      localJSONObject.put((String)localObject1, localObject2);
      break;
      int n = paramAdResponseParcel.orientation;
      localObject2 = zzr.zzbE();
      int k = ((zzis)localObject2).zzhv();
      if (n != k) {
        break label246;
      }
      localObject1 = "orientation";
      localObject2 = "landscape";
      localJSONObject.put((String)localObject1, localObject2);
      break label246;
    }
  }
  
  static JSONArray zzi(List paramList)
  {
    JSONArray localJSONArray = new org/json/JSONArray;
    localJSONArray.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      localJSONArray.put(str);
    }
    return localJSONArray;
  }
  
  private static Integer zzy(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return Integer.valueOf(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */