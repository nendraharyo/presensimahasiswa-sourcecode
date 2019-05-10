package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class zzw$zza
{
  private final Object zzML;
  private final List zzamp;
  
  private zzw$zza(Object paramObject)
  {
    Object localObject = zzx.zzz(paramObject);
    this.zzML = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzamp = ((List)localObject);
  }
  
  public String toString()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>(100);
    String str = this.zzML.getClass().getSimpleName();
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(str).append('{');
    int i = this.zzamp.size();
    int j = 0;
    localObject = null;
    int k = 0;
    str = null;
    while (k < i)
    {
      localObject = (String)this.zzamp.get(k);
      localStringBuilder.append((String)localObject);
      j = i + -1;
      if (k < j)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      j = k + 1;
      k = j;
    }
    return '}';
  }
  
  public zza zzg(String paramString, Object paramObject)
  {
    List localList = this.zzamp;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = (String)zzx.zzz(paramString);
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("=");
    localObject1 = String.valueOf(paramObject);
    localObject2 = (String)localObject1;
    localList.add(localObject2);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */