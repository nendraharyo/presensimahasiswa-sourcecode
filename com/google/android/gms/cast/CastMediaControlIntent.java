package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public final class CastMediaControlIntent
{
  public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
  public static final String CATEGORY_CAST = "com.google.android.gms.cast.CATEGORY_CAST";
  public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
  public static final int ERROR_CODE_REQUEST_FAILED = 1;
  public static final int ERROR_CODE_SESSION_START_FAILED = 2;
  public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;
  public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
  public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
  public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
  public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
  public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
  public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
  public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";
  
  public static String categoryForCast(String paramString)
  {
    if (paramString == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("applicationId cannot be null");
      throw localIllegalArgumentException;
    }
    return zza("com.google.android.gms.cast.CATEGORY_CAST", paramString, null);
  }
  
  public static String categoryForCast(String paramString, Collection paramCollection)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramString == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("applicationId cannot be null");
      throw localIllegalArgumentException;
    }
    if (paramCollection == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("namespaces cannot be null");
      throw localIllegalArgumentException;
    }
    return zza("com.google.android.gms.cast.CATEGORY_CAST", paramString, paramCollection);
  }
  
  public static String categoryForCast(Collection paramCollection)
  {
    if (paramCollection == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("namespaces cannot be null");
      throw localIllegalArgumentException;
    }
    return zza("com.google.android.gms.cast.CATEGORY_CAST", null, paramCollection);
  }
  
  public static String categoryForRemotePlayback()
  {
    return zza("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", null, null);
  }
  
  public static String categoryForRemotePlayback(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("applicationId cannot be null or empty");
      throw localIllegalArgumentException;
    }
    return zza("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", paramString, null);
  }
  
  public static String languageTagForLocale(Locale paramLocale)
  {
    return zzf.zzb(paramLocale);
  }
  
  private static String zza(String paramString1, String paramString2, Collection paramCollection)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(paramString1);
    Object localObject1;
    Object localObject2;
    boolean bool1;
    if (paramString2 != null)
    {
      localObject1 = paramString2.toUpperCase();
      localObject2 = "[A-F0-9]+";
      bool1 = ((String)localObject1).matches((String)localObject2);
      if (!bool1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Invalid application ID: " + paramString2;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject2 = localStringBuilder.append("/");
      ((StringBuilder)localObject2).append((String)localObject1);
    }
    if (paramCollection != null)
    {
      boolean bool2 = paramCollection.isEmpty();
      if (bool2)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("Must specify at least one namespace");
        throw ((Throwable)localObject1);
      }
      if (paramString2 == null)
      {
        localObject1 = "/";
        localStringBuilder.append((String)localObject1);
      }
      localObject1 = "/";
      localStringBuilder.append((String)localObject1);
      bool2 = true;
      Iterator localIterator = paramCollection.iterator();
      bool1 = bool2;
      bool2 = localIterator.hasNext();
      if (bool2)
      {
        localObject1 = (String)localIterator.next();
        zzf.zzch((String)localObject1);
        if (bool1)
        {
          bool1 = false;
          localObject2 = null;
        }
        for (;;)
        {
          localObject1 = zzf.zzcj((String)localObject1);
          localStringBuilder.append((String)localObject1);
          break;
          String str = ",";
          localStringBuilder.append(str);
        }
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastMediaControlIntent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */