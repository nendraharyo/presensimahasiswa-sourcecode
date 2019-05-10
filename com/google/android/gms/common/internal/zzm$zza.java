package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

final class zzm$zza
{
  private final String zzSU;
  private final ComponentName zzamc;
  
  public zzm$zza(ComponentName paramComponentName)
  {
    this.zzSU = null;
    ComponentName localComponentName = (ComponentName)zzx.zzz(paramComponentName);
    this.zzamc = localComponentName;
  }
  
  public zzm$zza(String paramString)
  {
    String str = zzx.zzcM(paramString);
    this.zzSU = str;
    this.zzamc = null;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof zza;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (zza)paramObject;
        Object localObject1 = this.zzSU;
        Object localObject2 = ((zza)paramObject).zzSU;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzamc;
          localObject2 = ((zza)paramObject).zzamc;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzSU;
    arrayOfObject[0] = localObject;
    localObject = this.zzamc;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    String str = this.zzSU;
    if (str == null) {}
    for (str = this.zzamc.flattenToString();; str = this.zzSU) {
      return str;
    }
  }
  
  public Intent zzqS()
  {
    Object localObject1 = this.zzSU;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = new android/content/Intent;
      localObject2 = this.zzSU;
      ((Intent)localObject1).<init>((String)localObject2);
      localObject2 = "com.google.android.gms";
    }
    for (localObject1 = ((Intent)localObject1).setPackage((String)localObject2);; localObject1 = ((Intent)localObject1).setComponent((ComponentName)localObject2))
    {
      return (Intent)localObject1;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = this.zzamc;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */