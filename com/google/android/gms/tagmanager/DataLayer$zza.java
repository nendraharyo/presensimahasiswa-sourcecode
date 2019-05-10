package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class DataLayer$zza
{
  public final Object zzNc;
  public final String zzvs;
  
  DataLayer$zza(String paramString, Object paramObject)
  {
    this.zzvs = paramString;
    this.zzNc = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof zza;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (zza)paramObject;
      Object localObject1 = this.zzvs;
      Object localObject2 = ((zza)paramObject).zzvs;
      bool2 = ((String)localObject1).equals(localObject2);
      if (bool2)
      {
        localObject1 = this.zzNc;
        localObject2 = ((zza)paramObject).zzNc;
        bool2 = localObject1.equals(localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public int hashCode()
  {
    Integer[] arrayOfInteger = new Integer[2];
    Integer localInteger = Integer.valueOf(this.zzvs.hashCode());
    arrayOfInteger[0] = localInteger;
    localInteger = Integer.valueOf(this.zzNc.hashCode());
    arrayOfInteger[1] = localInteger;
    return Arrays.hashCode(arrayOfInteger);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Key: ");
    String str = this.zzvs;
    localStringBuilder = localStringBuilder.append(str).append(" value: ");
    str = this.zzNc.toString();
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\DataLayer$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */