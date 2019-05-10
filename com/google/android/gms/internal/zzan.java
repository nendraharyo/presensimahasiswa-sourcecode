package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;

public class zzan
{
  private static final String[] zzov;
  private String zzor = "googleads.g.doubleclick.net";
  private String zzos = "/pagead/ads";
  private String zzot = "ad.doubleclick.net";
  private String[] zzou;
  private zzaj zzow;
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "/aclk";
    arrayOfString[1] = "/pcs/click";
    zzov = arrayOfString;
  }
  
  public zzan(zzaj paramzzaj)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ".doubleclick.net";
    arrayOfString[1] = ".googleadservices.com";
    arrayOfString[2] = ".googlesyndication.com";
    this.zzou = arrayOfString;
    this.zzow = paramzzaj;
  }
  
  private Uri zza(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool1;
    String str2;
    try
    {
      bool1 = zza(paramUri);
      if (bool1)
      {
        Object localObject1 = paramUri.toString();
        String str1 = "dc_ms=";
        boolean bool2 = ((String)localObject1).contains(str1);
        if (!bool2) {
          break label108;
        }
        localObject1 = new com/google/android/gms/internal/zzao;
        str2 = "Parameter already exists: dc_ms";
        ((zzao)localObject1).<init>(str2);
        throw ((Throwable)localObject1);
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      localObject2 = new com/google/android/gms/internal/zzao;
      ((zzao)localObject2).<init>("Provided Uri is not in a valid state");
      throw ((Throwable)localObject2);
    }
    Object localObject2 = "ms";
    localObject2 = paramUri.getQueryParameter((String)localObject2);
    if (localObject2 != null)
    {
      localObject2 = new com/google/android/gms/internal/zzao;
      str2 = "Query parameter already exists: ms";
      ((zzao)localObject2).<init>(str2);
      throw ((Throwable)localObject2);
    }
    label108:
    if (paramBoolean)
    {
      localObject2 = this.zzow;
      localObject2 = ((zzaj)localObject2).zzb(paramContext, paramString);
      if (!bool1) {
        break label172;
      }
      str2 = "dc_ms";
    }
    for (localObject2 = zzb(paramUri, str2, (String)localObject2);; localObject2 = zza(paramUri, str2, (String)localObject2))
    {
      return (Uri)localObject2;
      localObject2 = this.zzow;
      localObject2 = ((zzaj)localObject2).zzb(paramContext);
      break;
      label172:
      str2 = "ms";
    }
  }
  
  private Uri zza(Uri paramUri, String paramString1, String paramString2)
  {
    int i = -1;
    String str1 = paramUri.toString();
    Object localObject = "&adurl";
    int j = str1.indexOf((String)localObject);
    if (j == i)
    {
      localObject = "?adurl";
      j = str1.indexOf((String)localObject);
    }
    StringBuilder localStringBuilder;
    if (j != i)
    {
      localStringBuilder = new java/lang/StringBuilder;
      int k = j + 1;
      String str2 = str1.substring(0, k);
      localStringBuilder.<init>(str2);
      localStringBuilder = localStringBuilder.append(paramString1).append("=").append(paramString2);
      str2 = "&";
      localStringBuilder = localStringBuilder.append(str2);
      j += 1;
      localObject = str1.substring(j);
    }
    for (localObject = Uri.parse((String)localObject);; localObject = paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build()) {
      return (Uri)localObject;
    }
  }
  
  private Uri zzb(Uri paramUri, String paramString1, String paramString2)
  {
    Object localObject1 = paramUri.toString();
    String str1 = ";adurl";
    int i = ((String)localObject1).indexOf(str1);
    int j = -1;
    StringBuilder localStringBuilder;
    Object localObject2;
    if (i != j)
    {
      localStringBuilder = new java/lang/StringBuilder;
      int k = i + 1;
      localObject2 = ((String)localObject1).substring(0, k);
      localStringBuilder.<init>((String)localObject2);
      localStringBuilder = localStringBuilder.append(paramString1).append("=").append(paramString2);
      localObject2 = ";";
      localStringBuilder = localStringBuilder.append((String)localObject2);
      i += 1;
      localObject1 = ((String)localObject1).substring(i);
    }
    for (localObject1 = Uri.parse((String)localObject1);; localObject1 = Uri.parse((String)localObject1))
    {
      return (Uri)localObject1;
      str1 = paramUri.getEncodedPath();
      j = ((String)localObject1).indexOf(str1);
      localObject2 = new java/lang/StringBuilder;
      int m = str1.length() + j;
      String str2 = ((String)localObject1).substring(0, m);
      ((StringBuilder)localObject2).<init>(str2);
      localObject2 = ((StringBuilder)localObject2).append(";").append(paramString1).append("=").append(paramString2);
      str2 = ";";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      i = str1.length() + j;
      localObject1 = ((String)localObject1).substring(i);
    }
  }
  
  public Uri zza(Uri paramUri, Context paramContext)
  {
    String str = "ai";
    try
    {
      str = paramUri.getQueryParameter(str);
      boolean bool = true;
      return zza(paramUri, paramContext, str, bool);
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      zzao localzzao = new com/google/android/gms/internal/zzao;
      localzzao.<init>("Provided Uri is not in a valid state");
      throw localzzao;
    }
  }
  
  public void zza(MotionEvent paramMotionEvent)
  {
    this.zzow.zza(paramMotionEvent);
  }
  
  public boolean zza(Uri paramUri)
  {
    Object localObject1;
    if (paramUri == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = paramUri.getHost();
      String str = this.zzot;
      bool = ((String)localObject1).equals(str);
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  public zzaj zzab()
  {
    return this.zzow;
  }
  
  public boolean zzb(Uri paramUri)
  {
    boolean bool1 = false;
    NullPointerException localNullPointerException1 = null;
    if (paramUri == null)
    {
      localNullPointerException1 = new java/lang/NullPointerException;
      localNullPointerException1.<init>();
      throw localNullPointerException1;
    }
    for (;;)
    {
      try
      {
        String str1 = paramUri.getHost();
        String[] arrayOfString = this.zzou;
        int i = arrayOfString.length;
        j = 0;
        if (j < i)
        {
          String str2 = arrayOfString[j];
          boolean bool2 = str1.endsWith(str2);
          if (!bool2) {
            continue;
          }
          bool1 = true;
        }
      }
      catch (NullPointerException localNullPointerException2)
      {
        int j;
        continue;
      }
      return bool1;
      j += 1;
    }
  }
  
  public boolean zzc(Uri paramUri)
  {
    boolean bool1 = false;
    int i = zzb(paramUri);
    String[] arrayOfString;
    int k;
    if (i != 0)
    {
      arrayOfString = zzov;
      k = arrayOfString.length;
      i = 0;
    }
    for (;;)
    {
      if (i < k)
      {
        String str1 = arrayOfString[i];
        String str2 = paramUri.getPath();
        boolean bool2 = str2.endsWith(str1);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      int j;
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzan.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */