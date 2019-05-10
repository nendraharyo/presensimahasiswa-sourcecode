package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public class zzej
  implements zzei
{
  private final zzeh zzBx;
  private final HashSet zzBy;
  
  public zzej(zzeh paramzzeh)
  {
    this.zzBx = paramzzeh;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzBy = localHashSet;
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    this.zzBx.zza(paramString, paramzzdf);
    HashSet localHashSet = this.zzBy;
    AbstractMap.SimpleEntry localSimpleEntry = new java/util/AbstractMap$SimpleEntry;
    localSimpleEntry.<init>(paramString, paramzzdf);
    localHashSet.add(localSimpleEntry);
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    this.zzBx.zza(paramString, paramJSONObject);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    this.zzBx.zzb(paramString, paramzzdf);
    HashSet localHashSet = this.zzBy;
    AbstractMap.SimpleEntry localSimpleEntry = new java/util/AbstractMap$SimpleEntry;
    localSimpleEntry.<init>(paramString, paramzzdf);
    localHashSet.remove(localSimpleEntry);
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    this.zzBx.zzb(paramString, paramJSONObject);
  }
  
  public void zze(String paramString1, String paramString2)
  {
    this.zzBx.zze(paramString1, paramString2);
  }
  
  public void zzew()
  {
    Object localObject1 = this.zzBy;
    Iterator localIterator = ((HashSet)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (AbstractMap.SimpleEntry)localIterator.next();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = ((StringBuilder)localObject2).append("Unregistering eventhandler: ");
      localObject2 = ((zzdf)((AbstractMap.SimpleEntry)localObject1).getValue()).toString();
      zzin.v((String)localObject2);
      localObject3 = this.zzBx;
      localObject2 = (String)((AbstractMap.SimpleEntry)localObject1).getKey();
      localObject1 = (zzdf)((AbstractMap.SimpleEntry)localObject1).getValue();
      ((zzeh)localObject3).zzb((String)localObject2, (zzdf)localObject1);
    }
    this.zzBy.clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzej.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */