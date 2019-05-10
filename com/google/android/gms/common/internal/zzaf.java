package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

public class zzaf
{
  public static String zza(String paramString1, String paramString2, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, String paramString3)
  {
    if (paramAttributeSet == null) {}
    for (str = null;; str = paramAttributeSet.getAttributeValue(paramString1, paramString2))
    {
      if (str != null)
      {
        localObject1 = "@string/";
        boolean bool1 = str.startsWith((String)localObject1);
        if ((bool1) && (paramBoolean1))
        {
          int i = "@string/".length();
          localObject1 = str.substring(i);
          localObject3 = paramContext.getPackageName();
          localTypedValue = new android/util/TypedValue;
          localTypedValue.<init>();
        }
      }
      try
      {
        Resources localResources = paramContext.getResources();
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject4 = ":string/";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject1 = ((StringBuilder)localObject1).toString();
        boolean bool2 = true;
        localResources.getValue((String)localObject1, localTypedValue, bool2);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        for (;;)
        {
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Could not find resource for ").append(paramString2);
          localObject3 = ": ";
          localObject2 = (String)localObject3 + str;
          Log.w(paramString3, (String)localObject2);
          continue;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Resource ").append(paramString2);
          localObject3 = " was not a string: ";
          localObject2 = (String)localObject3 + localTypedValue;
          Log.w(paramString3, (String)localObject2);
        }
      }
      Object localObject1 = localTypedValue.string;
      if (localObject1 == null) {
        break;
      }
      str = localTypedValue.string.toString();
      if ((paramBoolean2) && (str == null))
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Required XML attribute \"").append(paramString2);
        localObject3 = "\" missing";
        localObject1 = (String)localObject3;
        Log.w(paramString3, (String)localObject1);
      }
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzaf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */