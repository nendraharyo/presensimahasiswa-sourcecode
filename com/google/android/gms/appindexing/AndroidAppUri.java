package com.google.android.gms.appindexing;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzw;
import java.util.Iterator;
import java.util.List;

public final class AndroidAppUri
{
  private final Uri mUri;
  
  private AndroidAppUri(Uri paramUri)
  {
    this.mUri = paramUri;
  }
  
  public static AndroidAppUri newAndroidAppUri(Uri paramUri)
  {
    Object localObject = new com/google/android/gms/appindexing/AndroidAppUri;
    ((AndroidAppUri)localObject).<init>(paramUri);
    boolean bool = zza((AndroidAppUri)localObject);
    if (bool) {
      return (AndroidAppUri)localObject;
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("AndroidAppUri validation failed.");
    throw ((Throwable)localObject);
  }
  
  public static AndroidAppUri newAndroidAppUri(String paramString, Uri paramUri)
  {
    Object localObject1 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject1).<init>();
    localObject1 = ((Uri.Builder)localObject1).scheme("android-app");
    Object localObject2 = ((Uri.Builder)localObject1).authority(paramString);
    if (paramUri != null)
    {
      localObject1 = paramUri.getScheme();
      ((Uri.Builder)localObject2).appendPath((String)localObject1);
      localObject1 = paramUri.getAuthority();
      if (localObject1 != null)
      {
        localObject1 = paramUri.getAuthority();
        ((Uri.Builder)localObject2).appendPath((String)localObject1);
      }
      localObject1 = paramUri.getPathSegments();
      Object localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject3).next();
        ((Uri.Builder)localObject2).appendPath((String)localObject1);
      }
      localObject1 = paramUri.getEncodedQuery();
      localObject1 = ((Uri.Builder)localObject2).encodedQuery((String)localObject1);
      localObject3 = paramUri.getEncodedFragment();
      ((Uri.Builder)localObject1).encodedFragment((String)localObject3);
    }
    localObject1 = new com/google/android/gms/appindexing/AndroidAppUri;
    localObject2 = ((Uri.Builder)localObject2).build();
    ((AndroidAppUri)localObject1).<init>((Uri)localObject2);
    return (AndroidAppUri)localObject1;
  }
  
  private static boolean zza(AndroidAppUri paramAndroidAppUri)
  {
    Object localObject1 = "android-app";
    Object localObject2 = paramAndroidAppUri.mUri.getScheme();
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("android-app scheme is required.");
      throw ((Throwable)localObject1);
    }
    localObject1 = paramAndroidAppUri.getPackageName();
    bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Package name is empty.");
      throw ((Throwable)localObject1);
    }
    localObject1 = paramAndroidAppUri.getPackageName();
    localObject2 = paramAndroidAppUri.getDeepLinkUri();
    localObject1 = newAndroidAppUri((String)localObject1, (Uri)localObject2).toUri();
    localObject2 = paramAndroidAppUri.mUri;
    bool = ((Uri)localObject2).equals(localObject1);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("URI is not canonical.");
      throw ((Throwable)localObject1);
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof AndroidAppUri;
    Uri localUri1;
    if (bool)
    {
      localUri1 = this.mUri;
      paramObject = (AndroidAppUri)paramObject;
      Uri localUri2 = ((AndroidAppUri)paramObject).mUri;
      bool = localUri1.equals(localUri2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localUri1 = null;
    }
  }
  
  public Uri getDeepLinkUri()
  {
    int i = 1;
    Object localObject = this.mUri;
    List localList = ((Uri)localObject).getPathSegments();
    int j = localList.size();
    Uri.Builder localBuilder;
    if (j > 0)
    {
      localObject = (String)localList.get(0);
      localBuilder = new android/net/Uri$Builder;
      localBuilder.<init>();
      localBuilder.scheme((String)localObject);
      j = localList.size();
      if (j > i)
      {
        localObject = (String)localList.get(i);
        localBuilder.authority((String)localObject);
        j = 2;
        for (i = j;; i = j)
        {
          j = localList.size();
          if (i >= j) {
            break;
          }
          localObject = (String)localList.get(i);
          localBuilder.appendPath((String)localObject);
          j = i + 1;
        }
      }
      localObject = this.mUri.getEncodedQuery();
      localBuilder.encodedQuery((String)localObject);
      localObject = this.mUri.getEncodedFragment();
      localBuilder.encodedFragment((String)localObject);
    }
    for (localObject = localBuilder.build();; localObject = null)
    {
      return (Uri)localObject;
      j = 0;
    }
  }
  
  public String getPackageName()
  {
    return this.mUri.getAuthority();
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Uri localUri = this.mUri;
    arrayOfObject[0] = localUri;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    return this.mUri.toString();
  }
  
  public Uri toUri()
  {
    return this.mUri;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appindexing\AndroidAppUri.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */