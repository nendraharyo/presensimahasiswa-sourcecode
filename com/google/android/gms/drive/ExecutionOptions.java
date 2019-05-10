package com.google.android.gms.drive;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.internal.zzu;

public class ExecutionOptions
{
  public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
  public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
  public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
  private final String zzaoV;
  private final boolean zzaoW;
  private final int zzaoX;
  
  public ExecutionOptions(String paramString, boolean paramBoolean, int paramInt)
  {
    this.zzaoV = paramString;
    this.zzaoW = paramBoolean;
    this.zzaoX = paramInt;
  }
  
  public static boolean zzcX(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      i = paramString.length();
      int k = 65536;
      if (i > k) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean zzcv(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean zzcw(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    Object localObject1;
    Object localObject2;
    if (paramObject != null)
    {
      localObject1 = paramObject.getClass();
      localObject2 = getClass();
      if (localObject1 == localObject2) {}
    }
    else
    {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        paramObject = (ExecutionOptions)paramObject;
        localObject1 = this.zzaoV;
        localObject2 = ((ExecutionOptions)paramObject).zzaoV;
        boolean bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          int i = this.zzaoX;
          int j = ((ExecutionOptions)paramObject).zzaoX;
          if (i == j)
          {
            boolean bool3 = this.zzaoW;
            boolean bool4 = ((ExecutionOptions)paramObject).zzaoW;
            if (bool3 == bool4) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzaoV;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzaoX);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzaoW);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void zzg(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = Drive.zzUI;
    localObject = (zzu)paramGoogleApiClient.zza((Api.zzc)localObject);
    boolean bool1 = zzsC();
    if (bool1)
    {
      boolean bool2 = ((zzu)localObject).zzti();
      if (!bool2)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        throw ((Throwable)localObject);
      }
    }
  }
  
  public String zzsB()
  {
    return this.zzaoV;
  }
  
  public boolean zzsC()
  {
    return this.zzaoW;
  }
  
  public int zzsD()
  {
    return this.zzaoX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\ExecutionOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */