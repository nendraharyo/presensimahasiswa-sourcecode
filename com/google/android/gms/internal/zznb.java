package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zznb
{
  private static final Pattern zzaoi = Pattern.compile("\\\\.");
  private static final Pattern zzaoj = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
  
  public static String zzcU(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    Matcher localMatcher;
    StringBuffer localStringBuffer;
    if (!bool1)
    {
      localMatcher = zzaoj.matcher(paramString);
      bool1 = false;
      localStringBuffer = null;
      for (;;)
      {
        boolean bool2 = localMatcher.find();
        if (!bool2) {
          break;
        }
        if (localStringBuffer == null)
        {
          localStringBuffer = new java/lang/StringBuffer;
          localStringBuffer.<init>();
        }
        String str = localMatcher.group();
        int i = str.charAt(0);
        switch (i)
        {
        default: 
          break;
        case 8: 
          str = "\\\\b";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 34: 
          str = "\\\\\\\"";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 92: 
          str = "\\\\\\\\";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 47: 
          str = "\\\\/";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 12: 
          str = "\\\\f";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 10: 
          str = "\\\\n";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 13: 
          str = "\\\\r";
          localMatcher.appendReplacement(localStringBuffer, str);
          break;
        case 9: 
          str = "\\\\t";
          localMatcher.appendReplacement(localStringBuffer, str);
        }
      }
      if (localStringBuffer != null) {
        break label265;
      }
    }
    for (;;)
    {
      return paramString;
      label265:
      localMatcher.appendTail(localStringBuffer);
      paramString = localStringBuffer.toString();
    }
  }
  
  public static boolean zze(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if ((paramObject1 == null) && (paramObject2 == null)) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      if ((paramObject1 != null) && (paramObject2 != null))
      {
        boolean bool3 = paramObject1 instanceof JSONObject;
        int k;
        Object localObject1;
        label81:
        Object localObject2;
        if (bool3)
        {
          bool3 = paramObject2 instanceof JSONObject;
          if (bool3)
          {
            paramObject1 = (JSONObject)paramObject1;
            paramObject2 = (JSONObject)paramObject2;
            int i = ((JSONObject)paramObject1).length();
            k = ((JSONObject)paramObject2).length();
            if (i != k) {
              continue;
            }
            localObject1 = ((JSONObject)paramObject1).keys();
            bool4 = ((Iterator)localObject1).hasNext();
            if (bool4)
            {
              localObject2 = (String)((Iterator)localObject1).next();
              boolean bool6 = ((JSONObject)paramObject2).has((String)localObject2);
              if (!bool6) {
                continue;
              }
            }
          }
        }
        Object localObject3;
        try
        {
          localObject3 = ((JSONObject)paramObject1).get((String)localObject2);
          localObject2 = ((JSONObject)paramObject2).get((String)localObject2);
          bool4 = zze(localObject3, localObject2);
          if (bool4) {
            break label81;
          }
        }
        catch (JSONException localJSONException2) {}
        bool2 = bool1;
        continue;
        boolean bool4 = paramObject1 instanceof JSONArray;
        int j;
        if (bool4)
        {
          bool4 = paramObject2 instanceof JSONArray;
          if (bool4)
          {
            paramObject1 = (JSONArray)paramObject1;
            paramObject2 = (JSONArray)paramObject2;
            j = ((JSONArray)paramObject1).length();
            k = ((JSONArray)paramObject2).length();
            if (j != k) {
              continue;
            }
            j = 0;
            localObject2 = null;
            k = ((JSONArray)paramObject1).length();
            if (j >= k) {}
          }
        }
        try
        {
          localObject1 = ((JSONArray)paramObject1).get(j);
          localObject3 = ((JSONArray)paramObject2).get(j);
          boolean bool5 = zze(localObject1, localObject3);
          if (!bool5) {
            continue;
          }
          j += 1;
        }
        catch (JSONException localJSONException1) {}
        bool2 = bool1;
        continue;
        bool2 = paramObject1.equals(paramObject2);
        continue;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */