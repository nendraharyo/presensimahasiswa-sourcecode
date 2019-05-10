package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProductAction
{
  public static final String ACTION_ADD = "add";
  public static final String ACTION_CHECKOUT = "checkout";
  public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
  public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
  public static final String ACTION_CLICK = "click";
  public static final String ACTION_DETAIL = "detail";
  public static final String ACTION_PURCHASE = "purchase";
  public static final String ACTION_REFUND = "refund";
  public static final String ACTION_REMOVE = "remove";
  Map zzPU;
  
  public ProductAction(String paramString)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzPU = localHashMap;
    put("&pa", paramString);
  }
  
  public Map build()
  {
    HashMap localHashMap = new java/util/HashMap;
    Map localMap = this.zzPU;
    localHashMap.<init>(localMap);
    return localHashMap;
  }
  
  void put(String paramString1, String paramString2)
  {
    zzx.zzb(paramString1, "Name should be non-null");
    this.zzPU.put(paramString1, paramString2);
  }
  
  public ProductAction setCheckoutOptions(String paramString)
  {
    put("&col", paramString);
    return this;
  }
  
  public ProductAction setCheckoutStep(int paramInt)
  {
    String str = Integer.toString(paramInt);
    put("&cos", str);
    return this;
  }
  
  public ProductAction setProductActionList(String paramString)
  {
    put("&pal", paramString);
    return this;
  }
  
  public ProductAction setProductListSource(String paramString)
  {
    put("&pls", paramString);
    return this;
  }
  
  public ProductAction setTransactionAffiliation(String paramString)
  {
    put("&ta", paramString);
    return this;
  }
  
  public ProductAction setTransactionCouponCode(String paramString)
  {
    put("&tcc", paramString);
    return this;
  }
  
  public ProductAction setTransactionId(String paramString)
  {
    put("&ti", paramString);
    return this;
  }
  
  public ProductAction setTransactionRevenue(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    put("&tr", str);
    return this;
  }
  
  public ProductAction setTransactionShipping(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    put("&ts", str);
    return this;
  }
  
  public ProductAction setTransactionTax(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    put("&tt", str);
    return this;
  }
  
  public String toString()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.zzPU.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      String str = "&";
      boolean bool2 = ((String)localObject2).startsWith(str);
      if (bool2)
      {
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        int i = 1;
        localObject2 = ((String)localObject2).substring(i);
        localObject1 = ((Map.Entry)localObject1).getValue();
        localHashMap.put(localObject2, localObject1);
      }
      else
      {
        localObject2 = ((Map.Entry)localObject1).getKey();
        localObject1 = ((Map.Entry)localObject1).getValue();
        localHashMap.put(localObject2, localObject1);
      }
    }
    return zze.zzO(localHashMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\ecommerce\ProductAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */