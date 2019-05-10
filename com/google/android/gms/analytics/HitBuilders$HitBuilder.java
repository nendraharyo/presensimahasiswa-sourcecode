package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HitBuilders$HitBuilder
{
  private Map zzPm;
  ProductAction zzPn;
  Map zzPo;
  List zzPp;
  List zzPq;
  
  protected HitBuilders$HitBuilder()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzPm = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzPo = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzPp = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzPq = ((List)localObject);
  }
  
  public HitBuilder addImpression(Product paramProduct, String paramString)
  {
    Object localObject;
    if (paramProduct == null)
    {
      localObject = "product should be non-null";
      zzae.zzaK((String)localObject);
    }
    for (;;)
    {
      return this;
      if (paramString == null) {
        paramString = "";
      }
      localObject = this.zzPo;
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
  
  public HitBuilder addProduct(Product paramProduct)
  {
    Object localObject;
    if (paramProduct == null)
    {
      localObject = "product should be non-null";
      zzae.zzaK((String)localObject);
    }
    for (;;)
    {
      return this;
      localObject = this.zzPq;
      ((List)localObject).add(paramProduct);
    }
  }
  
  public HitBuilder addPromotion(Promotion paramPromotion)
  {
    Object localObject;
    if (paramPromotion == null)
    {
      localObject = "promotion should be non-null";
      zzae.zzaK((String)localObject);
    }
    for (;;)
    {
      return this;
      localObject = this.zzPp;
      ((List)localObject).add(paramPromotion);
    }
  }
  
  public Map build()
  {
    int i = 1;
    HashMap localHashMap = new java/util/HashMap;
    Object localObject1 = this.zzPm;
    localHashMap.<init>((Map)localObject1);
    localObject1 = this.zzPn;
    if (localObject1 != null)
    {
      localObject1 = this.zzPn.build();
      localHashMap.putAll((Map)localObject1);
    }
    localObject1 = this.zzPp;
    Iterator localIterator1 = ((List)localObject1).iterator();
    String str1;
    int m;
    for (int j = i;; j = m)
    {
      boolean bool3 = localIterator1.hasNext();
      if (!bool3) {
        break;
      }
      localObject1 = (Promotion)localIterator1.next();
      str1 = zzc.zzZ(j);
      localObject1 = ((Promotion)localObject1).zzba(str1);
      localHashMap.putAll((Map)localObject1);
      m = j + 1;
    }
    localObject1 = this.zzPq;
    localIterator1 = ((List)localObject1).iterator();
    int n;
    for (j = i;; j = n)
    {
      boolean bool4 = localIterator1.hasNext();
      if (!bool4) {
        break;
      }
      localObject1 = (Product)localIterator1.next();
      str1 = zzc.zzX(j);
      localObject1 = ((Product)localObject1).zzba(str1);
      localHashMap.putAll((Map)localObject1);
      n = j + 1;
    }
    localObject1 = this.zzPo.entrySet();
    Iterator localIterator2 = ((Set)localObject1).iterator();
    int i1;
    for (int i2 = i;; i2 = i1)
    {
      boolean bool5 = localIterator2.hasNext();
      if (!bool5) {
        break;
      }
      localObject1 = (Map.Entry)localIterator2.next();
      Object localObject2 = (List)((Map.Entry)localObject1).getValue();
      String str2 = zzc.zzac(i2);
      Iterator localIterator3 = ((List)localObject2).iterator();
      int k;
      for (int i3 = i;; i3 = k)
      {
        boolean bool1 = localIterator3.hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (Product)localIterator3.next();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append(str2);
        String str3 = zzc.zzab(i3);
        localObject3 = str3;
        localObject2 = ((Product)localObject2).zzba((String)localObject3);
        localHashMap.putAll((Map)localObject2);
        k = i3 + 1;
      }
      localObject2 = (CharSequence)((Map.Entry)localObject1).getKey();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool2)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append(str2);
        str1 = "nm";
        localObject2 = str1;
        localObject1 = ((Map.Entry)localObject1).getKey();
        localHashMap.put(localObject2, localObject1);
      }
      i1 = i2 + 1;
    }
    return localHashMap;
  }
  
  protected String get(String paramString)
  {
    return (String)this.zzPm.get(paramString);
  }
  
  public final HitBuilder set(String paramString1, String paramString2)
  {
    Object localObject;
    if (paramString1 != null)
    {
      localObject = this.zzPm;
      ((Map)localObject).put(paramString1, paramString2);
    }
    for (;;)
    {
      return this;
      localObject = " HitBuilder.set() called with a null paramName.";
      zzae.zzaK((String)localObject);
    }
  }
  
  public final HitBuilder setAll(Map paramMap)
  {
    if (paramMap == null) {}
    for (;;)
    {
      return this;
      Map localMap = this.zzPm;
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>(paramMap);
      localMap.putAll(localHashMap);
    }
  }
  
  public HitBuilder setCampaignParamsFromUrl(String paramString)
  {
    String str1 = zzam.zzbu(paramString);
    boolean bool = TextUtils.isEmpty(str1);
    if (bool) {}
    for (;;)
    {
      return this;
      Map localMap = zzam.zzbs(str1);
      str1 = (String)localMap.get("utm_content");
      set("&cc", str1);
      str1 = (String)localMap.get("utm_medium");
      set("&cm", str1);
      str1 = (String)localMap.get("utm_campaign");
      set("&cn", str1);
      str1 = (String)localMap.get("utm_source");
      set("&cs", str1);
      str1 = (String)localMap.get("utm_term");
      set("&ck", str1);
      str1 = (String)localMap.get("utm_id");
      set("&ci", str1);
      str1 = (String)localMap.get("anid");
      set("&anid", str1);
      str1 = (String)localMap.get("gclid");
      set("&gclid", str1);
      str1 = (String)localMap.get("dclid");
      set("&dclid", str1);
      str1 = (String)localMap.get("aclid");
      set("&aclid", str1);
      String str2 = "&gmob_t";
      str1 = (String)localMap.get("gmob_t");
      set(str2, str1);
    }
  }
  
  public HitBuilder setCustomDimension(int paramInt, String paramString)
  {
    String str = zzc.zzT(paramInt);
    set(str, paramString);
    return this;
  }
  
  public HitBuilder setCustomMetric(int paramInt, float paramFloat)
  {
    String str1 = zzc.zzV(paramInt);
    String str2 = Float.toString(paramFloat);
    set(str1, str2);
    return this;
  }
  
  protected HitBuilder setHitType(String paramString)
  {
    set("&t", paramString);
    return this;
  }
  
  public HitBuilder setNewSession()
  {
    set("&sc", "start");
    return this;
  }
  
  public HitBuilder setNonInteraction(boolean paramBoolean)
  {
    String str = zzam.zzK(paramBoolean);
    set("&ni", str);
    return this;
  }
  
  public HitBuilder setProductAction(ProductAction paramProductAction)
  {
    this.zzPn = paramProductAction;
    return this;
  }
  
  public HitBuilder setPromotionAction(String paramString)
  {
    this.zzPm.put("&promoa", paramString);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\HitBuilders$HitBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */