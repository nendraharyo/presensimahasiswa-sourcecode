package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzlp
{
  private static final zzl zzaaf;
  private static final String[] zzaeC;
  private static final String zzaeD;
  
  static
  {
    Object localObject = new com/google/android/gms/cast/internal/zzl;
    ((zzl)localObject).<init>("MetadataUtils");
    zzaaf = (zzl)localObject;
    localObject = new String[4];
    localObject[0] = "Z";
    localObject[1] = "+hh";
    localObject[2] = "+hhmm";
    localObject[3] = "+hh:mm";
    zzaeC = (String[])localObject;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("yyyyMMdd'T'HHmmss");
    String str = zzaeC[0];
    zzaeD = str;
  }
  
  public static String zza(Calendar paramCalendar)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramCalendar == null)
    {
      localObject1 = zzaaf;
      localObject2 = "Calendar object cannot be null";
      localObject3 = new Object[0];
      ((zzl)localObject1).zzb((String)localObject2, (Object[])localObject3);
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = zzaeD;
      int i = paramCalendar.get(11);
      if (i == 0)
      {
        i = paramCalendar.get(12);
        if (i == 0)
        {
          i = paramCalendar.get(13);
          if (i == 0) {
            localObject1 = "yyyyMMdd";
          }
        }
      }
      localObject2 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject2).<init>((String)localObject1);
      localObject1 = paramCalendar.getTimeZone();
      ((SimpleDateFormat)localObject2).setTimeZone((TimeZone)localObject1);
      localObject1 = paramCalendar.getTime();
      localObject1 = ((SimpleDateFormat)localObject2).format((Date)localObject1);
      localObject2 = "+0000";
      boolean bool = ((String)localObject1).endsWith((String)localObject2);
      if (bool)
      {
        localObject2 = "+0000";
        localObject3 = zzaeC[0];
        localObject1 = ((String)localObject1).replace((CharSequence)localObject2, (CharSequence)localObject3);
      }
    }
  }
  
  public static void zza(List paramList, JSONObject paramJSONObject)
  {
    for (;;)
    {
      int j;
      JSONObject localJSONObject;
      WebImage localWebImage;
      try
      {
        paramList.clear();
        String str = "images";
        JSONArray localJSONArray = paramJSONObject.getJSONArray(str);
        int i = localJSONArray.length();
        j = 0;
        str = null;
        if (j < i) {
          localJSONObject = localJSONArray.getJSONObject(j);
        }
      }
      catch (JSONException localJSONException) {}
      try
      {
        localWebImage = new com/google/android/gms/common/images/WebImage;
        localWebImage.<init>(localJSONObject);
        paramList.add(localWebImage);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        continue;
      }
      j += 1;
    }
  }
  
  public static void zza(JSONObject paramJSONObject, List paramList)
  {
    JSONArray localJSONArray;
    Object localObject;
    if (paramList != null)
    {
      boolean bool = paramList.isEmpty();
      if (!bool)
      {
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        Iterator localIterator = paramList.iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject = ((WebImage)localIterator.next()).toJson();
          localJSONArray.put(localObject);
        }
        localObject = "images";
      }
    }
    try
    {
      paramJSONObject.put((String)localObject, localJSONArray);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public static Calendar zzco(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      localObject1 = zzaaf;
      localObject2 = "Input string is empty or null";
      localObject3 = new Object[0];
      ((zzl)localObject1).zzb((String)localObject2, (Object[])localObject3);
      bool1 = false;
      localObject1 = null;
    }
    boolean bool2;
    int i;
    for (;;)
    {
      return (Calendar)localObject1;
      localObject2 = zzcp(paramString);
      bool1 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool1)
      {
        localObject1 = zzaaf;
        localObject2 = "Invalid date format";
        localObject3 = new Object[0];
        ((zzl)localObject1).zzb((String)localObject2, (Object[])localObject3);
        bool1 = false;
        localObject1 = null;
      }
      else
      {
        localObject3 = zzcq(paramString);
        localObject1 = "yyyyMMdd";
        bool2 = TextUtils.isEmpty((CharSequence)localObject3);
        if (!bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("T").append((String)localObject3);
          localObject2 = ((StringBuilder)localObject1).toString();
          i = ((String)localObject3).length();
          localObject3 = "HHmmss";
          int j = ((String)localObject3).length();
          if (i != j) {
            break label187;
          }
        }
        for (localObject1 = "yyyyMMdd'T'HHmmss";; localObject1 = zzaeD)
        {
          localObject3 = GregorianCalendar.getInstance();
          try
          {
            localObject4 = new java/text/SimpleDateFormat;
            ((SimpleDateFormat)localObject4).<init>((String)localObject1);
            localObject1 = ((SimpleDateFormat)localObject4).parse((String)localObject2);
            ((Calendar)localObject3).setTime((Date)localObject1);
            localObject1 = localObject3;
          }
          catch (ParseException localParseException)
          {
            label187:
            localObject2 = zzaaf;
            localObject3 = "Error parsing string: %s";
            bool2 = true;
            Object localObject4 = new Object[bool2];
            String str = localParseException.getMessage();
            localObject4[0] = str;
            ((zzl)localObject2).zzb((String)localObject3, (Object[])localObject4);
            i = 0;
            str = null;
          }
        }
      }
    }
  }
  
  private static String zzcp(String paramString)
  {
    String str1 = null;
    boolean bool = TextUtils.isEmpty(paramString);
    zzl localzzl;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localzzl = zzaaf;
      localObject1 = "Input string is empty or null";
      localObject2 = new Object[0];
      localzzl.zzb((String)localObject1, (Object[])localObject2);
    }
    for (;;)
    {
      return str1;
      bool = false;
      localzzl = null;
      localObject1 = "yyyyMMdd";
      try
      {
        int i = ((String)localObject1).length();
        str1 = paramString.substring(0, i);
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        localObject1 = zzaaf;
        localObject2 = "Error extracting the date: %s";
        int j = 1;
        Object[] arrayOfObject = new Object[j];
        String str2 = localIndexOutOfBoundsException.getMessage();
        arrayOfObject[0] = str2;
        ((zzl)localObject1).zze((String)localObject2, arrayOfObject);
      }
    }
  }
  
  private static String zzcq(String paramString)
  {
    Object localObject1 = null;
    boolean bool1 = TextUtils.isEmpty(paramString);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      localObject2 = zzaaf;
      localObject3 = "string is empty or null";
      localObject4 = new Object[0];
      ((zzl)localObject2).zzb((String)localObject3, (Object[])localObject4);
    }
    for (;;)
    {
      return (String)localObject1;
      int i = paramString.indexOf('T');
      int j = i + 1;
      localObject4 = "yyyyMMdd";
      int m = ((String)localObject4).length();
      if (i != m)
      {
        localObject2 = zzaaf;
        localObject3 = "T delimeter is not found";
        localObject4 = new Object[0];
        ((zzl)localObject2).zzb((String)localObject3, (Object[])localObject4);
      }
      else
      {
        int n;
        Object localObject5;
        String str;
        try
        {
          localObject2 = paramString.substring(j);
          j = ((String)localObject2).length();
          localObject4 = "HHmmss";
          m = ((String)localObject4).length();
          if (j != m) {
            break label167;
          }
          localObject1 = localObject2;
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          localObject3 = zzaaf;
          localObject4 = "Error extracting the time substring: %s";
          n = 1;
          localObject5 = new Object[n];
          str = localIndexOutOfBoundsException.getMessage();
          localObject5[0] = str;
          ((zzl)localObject3).zzb((String)localObject4, (Object[])localObject5);
        }
        continue;
        label167:
        localObject3 = "HHmmss";
        j = ((String)localObject3).length();
        j = str.charAt(j);
        switch (j)
        {
        default: 
          break;
        case 43: 
        case 45: 
          boolean bool2 = zzcr(str);
          if (bool2)
          {
            localObject3 = "$1$2";
            localObject1 = str.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", (String)localObject3);
          }
          break;
        case 90: 
          int k = str.length();
          localObject4 = "HHmmss";
          m = ((String)localObject4).length();
          localObject5 = zzaeC[0];
          n = ((String)localObject5).length();
          m += n;
          if (k == m)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            k = str.length() + -1;
            str = str.substring(0, k);
            localObject1 = ((StringBuilder)localObject1).append(str);
            str = "+0000";
            localObject1 = str;
          }
          break;
        }
      }
    }
  }
  
  private static boolean zzcr(String paramString)
  {
    boolean bool = true;
    int i = paramString.length();
    String str = "HHmmss";
    int j = str.length();
    Object localObject = zzaeC[bool];
    int k = ((String)localObject).length() + j;
    if (i != k)
    {
      localObject = zzaeC;
      int m = 2;
      localObject = localObject[m];
      k = ((String)localObject).length() + j;
      if (i != k)
      {
        localObject = zzaeC;
        m = 3;
        localObject = localObject[m];
        k = ((String)localObject).length();
        j += k;
        if (i != j) {
          break label107;
        }
      }
    }
    for (;;)
    {
      return bool;
      label107:
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */