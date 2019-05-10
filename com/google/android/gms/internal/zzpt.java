package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.zze;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzpt
  extends zze
{
  private ProductAction zzPn;
  private final Map zzPo;
  private final List zzPp;
  private final List zzPq;
  
  public zzpt()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzPq = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzPp = ((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzPo = ((Map)localObject);
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.zzPq;
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = "products";
      localObject2 = this.zzPq;
      localHashMap.put(localObject1, localObject2);
    }
    localObject1 = this.zzPp;
    bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = "promotions";
      localObject2 = this.zzPp;
      localHashMap.put(localObject1, localObject2);
    }
    localObject1 = this.zzPo;
    bool = ((Map)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = "impressions";
      localObject2 = this.zzPo;
      localHashMap.put(localObject1, localObject2);
    }
    Object localObject2 = this.zzPn;
    localHashMap.put("productAction", localObject2);
    return zzF(localHashMap);
  }
  
  public ProductAction zzAV()
  {
    return this.zzPn;
  }
  
  public List zzAW()
  {
    return Collections.unmodifiableList(this.zzPq);
  }
  
  public Map zzAX()
  {
    return this.zzPo;
  }
  
  public List zzAY()
  {
    return Collections.unmodifiableList(this.zzPp);
  }
  
  public void zza(Product paramProduct, String paramString)
  {
    if (paramProduct == null) {}
    for (;;)
    {
      return;
      if (paramString == null) {
        paramString = "";
      }
      Object localObject = this.zzPo;
      boolean bool = ((Map)localObject).containsKey(paramString);
      if (!bool)
      {
        localObject = this.zzPo;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        ((Map)localObject).put(paramString, localArrayList);
      }
      localObject = (List)this.zzPo.get(paramString);
      ((List)localObject).add(paramProduct);
    }
  }
  
  public void zza(zzpt paramzzpt)
  {
    Object localObject1 = paramzzpt.zzPq;
    Object localObject2 = this.zzPq;
    ((List)localObject1).addAll((Collection)localObject2);
    localObject1 = paramzzpt.zzPp;
    localObject2 = this.zzPp;
    ((List)localObject1).addAll((Collection)localObject2);
    localObject1 = this.zzPo.entrySet();
    Iterator localIterator1 = ((Set)localObject1).iterator();
    boolean bool = localIterator1.hasNext();
    if (bool)
    {
      localObject1 = (Map.Entry)localIterator1.next();
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (List)((Map.Entry)localObject1).getValue();
      Iterator localIterator2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool = localIterator2.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Product)localIterator2.next();
        paramzzpt.zza((Product)localObject1, (String)localObject2);
      }
    }
    localObject1 = this.zzPn;
    if (localObject1 != null)
    {
      localObject1 = this.zzPn;
      paramzzpt.zzPn = ((ProductAction)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */