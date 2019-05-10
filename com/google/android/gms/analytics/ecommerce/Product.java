package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Product
{
  Map zzPU;
  
  public Product()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzPU = localHashMap;
  }
  
  void put(String paramString1, String paramString2)
  {
    zzx.zzb(paramString1, "Name should be non-null");
    this.zzPU.put(paramString1, paramString2);
  }
  
  public Product setBrand(String paramString)
  {
    put("br", paramString);
    return this;
  }
  
  public Product setCategory(String paramString)
  {
    put("ca", paramString);
    return this;
  }
  
  public Product setCouponCode(String paramString)
  {
    put("cc", paramString);
    return this;
  }
  
  public Product setCustomDimension(int paramInt, String paramString)
  {
    String str = zzc.zzae(paramInt);
    put(str, paramString);
    return this;
  }
  
  public Product setCustomMetric(int paramInt1, int paramInt2)
  {
    String str1 = zzc.zzaf(paramInt1);
    String str2 = Integer.toString(paramInt2);
    put(str1, str2);
    return this;
  }
  
  public Product setId(String paramString)
  {
    put("id", paramString);
    return this;
  }
  
  public Product setName(String paramString)
  {
    put("nm", paramString);
    return this;
  }
  
  public Product setPosition(int paramInt)
  {
    String str = Integer.toString(paramInt);
    put("ps", str);
    return this;
  }
  
  public Product setPrice(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    put("pr", str);
    return this;
  }
  
  public Product setQuantity(int paramInt)
  {
    String str = Integer.toString(paramInt);
    put("qt", str);
    return this;
  }
  
  public Product setVariant(String paramString)
  {
    put("va", paramString);
    return this;
  }
  
  public String toString()
  {
    return zze.zzO(this.zzPU);
  }
  
  public Map zzba(String paramString)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.zzPU.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      StringBuilder localStringBuilder = ((StringBuilder)localObject2).append(paramString);
      localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject2 = (String)localObject2;
      localObject1 = ((Map.Entry)localObject1).getValue();
      localHashMap.put(localObject2, localObject1);
    }
    return localHashMap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\ecommerce\Product.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */