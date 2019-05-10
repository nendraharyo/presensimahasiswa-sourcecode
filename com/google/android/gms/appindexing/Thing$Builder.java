package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

public class Thing$Builder
{
  final Bundle zzUH;
  
  public Thing$Builder()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.zzUH = localBundle;
  }
  
  public Thing build()
  {
    Thing localThing = new com/google/android/gms/appindexing/Thing;
    Bundle localBundle = this.zzUH;
    localThing.<init>(localBundle);
    return localThing;
  }
  
  public Builder put(String paramString, Thing paramThing)
  {
    zzx.zzz(paramString);
    if (paramThing != null)
    {
      Bundle localBundle1 = this.zzUH;
      Bundle localBundle2 = paramThing.zzUG;
      localBundle1.putParcelable(paramString, localBundle2);
    }
    return this;
  }
  
  public Builder put(String paramString1, String paramString2)
  {
    zzx.zzz(paramString1);
    if (paramString2 != null)
    {
      Bundle localBundle = this.zzUH;
      localBundle.putString(paramString1, paramString2);
    }
    return this;
  }
  
  public Builder put(String paramString, boolean paramBoolean)
  {
    zzx.zzz(paramString);
    this.zzUH.putBoolean(paramString, paramBoolean);
    return this;
  }
  
  public Builder put(String paramString, Thing[] paramArrayOfThing)
  {
    zzx.zzz(paramString);
    if (paramArrayOfThing != null)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = paramArrayOfThing.length;
      int j = 0;
      Object localObject1 = null;
      while (j < i)
      {
        Object localObject2 = paramArrayOfThing[j];
        if (localObject2 != null)
        {
          localObject2 = ((Thing)localObject2).zzUG;
          localArrayList.add(localObject2);
        }
        j += 1;
      }
      Bundle localBundle = this.zzUH;
      j = localArrayList.size();
      localObject1 = new Bundle[j];
      localObject1 = (Parcelable[])localArrayList.toArray((Object[])localObject1);
      localBundle.putParcelableArray(paramString, (Parcelable[])localObject1);
    }
    return this;
  }
  
  public Builder put(String paramString, String[] paramArrayOfString)
  {
    zzx.zzz(paramString);
    if (paramArrayOfString != null)
    {
      Bundle localBundle = this.zzUH;
      localBundle.putStringArray(paramString, paramArrayOfString);
    }
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    put("description", paramString);
    return this;
  }
  
  public Builder setId(String paramString)
  {
    if (paramString != null)
    {
      String str = "id";
      put(str, paramString);
    }
    return this;
  }
  
  public Builder setName(String paramString)
  {
    zzx.zzz(paramString);
    put("name", paramString);
    return this;
  }
  
  public Builder setType(String paramString)
  {
    put("type", paramString);
    return this;
  }
  
  public Builder setUrl(Uri paramUri)
  {
    zzx.zzz(paramUri);
    String str = paramUri.toString();
    put("url", str);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appindexing\Thing$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */