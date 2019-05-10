package com.google.android.gms.plus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.people.Person;

public final class PlusShare
{
  public static final String EXTRA_CALL_TO_ACTION = "com.google.android.apps.plus.CALL_TO_ACTION";
  public static final String EXTRA_CONTENT_DEEP_LINK_ID = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
  public static final String EXTRA_CONTENT_DEEP_LINK_METADATA = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
  public static final String EXTRA_CONTENT_URL = "com.google.android.apps.plus.CONTENT_URL";
  public static final String EXTRA_IS_INTERACTIVE_POST = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
  public static final String EXTRA_SENDER_ID = "com.google.android.apps.plus.SENDER_ID";
  public static final String KEY_CALL_TO_ACTION_DEEP_LINK_ID = "deepLinkId";
  public static final String KEY_CALL_TO_ACTION_LABEL = "label";
  public static final String KEY_CALL_TO_ACTION_URL = "url";
  public static final String KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION = "description";
  public static final String KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL = "thumbnailUrl";
  public static final String KEY_CONTENT_DEEP_LINK_METADATA_TITLE = "title";
  public static final String PARAM_CONTENT_DEEP_LINK_ID = "deep_link_id";
  
  protected PlusShare()
  {
    AssertionError localAssertionError = new java/lang/AssertionError;
    localAssertionError.<init>();
    throw localAssertionError;
  }
  
  public static Person createPerson(String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("MinimalPerson ID must not be empty.");
      throw ((Throwable)localObject);
    }
    bool = TextUtils.isEmpty(paramString2);
    if (bool)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Display name must not be empty.");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/plus/internal/model/people/PersonEntity;
    ((PersonEntity)localObject).<init>(paramString2, paramString1, null, 0, null);
    return (Person)localObject;
  }
  
  public static String getDeepLinkId(Intent paramIntent)
  {
    Object localObject1 = null;
    if (paramIntent != null)
    {
      Object localObject2 = paramIntent.getData();
      if (localObject2 != null)
      {
        localObject1 = paramIntent.getData();
        localObject2 = "deep_link_id";
        localObject1 = ((Uri)localObject1).getQueryParameter((String)localObject2);
      }
    }
    return (String)localObject1;
  }
  
  public static Bundle zza(String paramString1, String paramString2, Uri paramUri)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("title", paramString1);
    String str1 = "description";
    localBundle.putString(str1, paramString2);
    if (paramUri != null)
    {
      str1 = "thumbnailUrl";
      String str2 = paramUri.toString();
      localBundle.putString(str1, str2);
    }
    return localBundle;
  }
  
  protected static boolean zzfD(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = TextUtils.isEmpty(paramString);
    String str1;
    String str2;
    if (bool2)
    {
      str1 = "GooglePlusPlatform";
      str2 = "The provided deep-link ID is empty.";
      Log.e(str1, str2);
    }
    for (;;)
    {
      return bool1;
      str1 = " ";
      bool2 = paramString.contains(str1);
      if (bool2)
      {
        str1 = "GooglePlusPlatform";
        str2 = "Spaces are not allowed in deep-link IDs.";
        Log.e(str1, str2);
      }
      else
      {
        bool1 = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusShare.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */