package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;

public final class Action$Builder
  extends Thing.Builder
{
  public Action$Builder(String paramString)
  {
    zzx.zzz(paramString);
    super.put("type", paramString);
  }
  
  public Action build()
  {
    zzx.zzb(this.zzUH.get("object"), "setObject is required before calling build().");
    zzx.zzb(this.zzUH.get("type"), "setType is required before calling build().");
    Object localObject = (Bundle)this.zzUH.getParcelable("object");
    zzx.zzb(((Bundle)localObject).get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
    zzx.zzb(((Bundle)localObject).get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
    localObject = new com/google/android/gms/appindexing/Action;
    Bundle localBundle = this.zzUH;
    ((Action)localObject).<init>(localBundle, null);
    return (Action)localObject;
  }
  
  public Builder put(String paramString, Thing paramThing)
  {
    return (Builder)super.put(paramString, paramThing);
  }
  
  public Builder put(String paramString1, String paramString2)
  {
    return (Builder)super.put(paramString1, paramString2);
  }
  
  public Builder put(String paramString, boolean paramBoolean)
  {
    return (Builder)super.put(paramString, paramBoolean);
  }
  
  public Builder put(String paramString, Thing[] paramArrayOfThing)
  {
    return (Builder)super.put(paramString, paramArrayOfThing);
  }
  
  public Builder put(String paramString, String[] paramArrayOfString)
  {
    return (Builder)super.put(paramString, paramArrayOfString);
  }
  
  public Builder setActionStatus(String paramString)
  {
    zzx.zzz(paramString);
    return (Builder)super.put("actionStatus", paramString);
  }
  
  public Builder setName(String paramString)
  {
    return (Builder)super.put("name", paramString);
  }
  
  public Builder setObject(Thing paramThing)
  {
    zzx.zzz(paramThing);
    return (Builder)super.put("object", paramThing);
  }
  
  public Builder setUrl(Uri paramUri)
  {
    if (paramUri != null)
    {
      String str1 = "url";
      String str2 = paramUri.toString();
      super.put(str1, str2);
    }
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appindexing\Action$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */