package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzdg
  extends zzdd
{
  private static final String ID = zzad.zzcZ.toString();
  private static final String zzblN = zzae.zzdG.toString();
  private static final String zzblO = zzae.zzdQ.toString();
  private static final String zzblP = zzae.zzfn.toString();
  private static final String zzblQ = zzae.zzfh.toString();
  private static final String zzblR = zzae.zzfg.toString();
  private static final String zzblS = zzae.zzdP.toString();
  private static final String zzblT = zzae.zzhO.toString();
  private static final String zzblU = zzae.zzhR.toString();
  private static final String zzblV = zzae.zzhT.toString();
  private static final List zzblW;
  private static final Pattern zzblX = Pattern.compile("dimension(\\d+)");
  private static final Pattern zzblY = Pattern.compile("metric(\\d+)");
  private static Map zzblZ;
  private static Map zzbma;
  private final DataLayer zzbhN;
  private final Set zzbmb;
  private final zzdc zzbmc;
  
  static
  {
    String[] arrayOfString = new String[8];
    arrayOfString[0] = "detail";
    arrayOfString[1] = "checkout";
    arrayOfString[2] = "checkout_option";
    arrayOfString[3] = "click";
    arrayOfString[4] = "add";
    arrayOfString[5] = "remove";
    arrayOfString[6] = "purchase";
    arrayOfString[7] = "refund";
    zzblW = Arrays.asList(arrayOfString);
  }
  
  public zzdg(Context paramContext, DataLayer paramDataLayer)
  {
    this(paramContext, paramDataLayer, localzzdc);
  }
  
  zzdg(Context paramContext, DataLayer paramDataLayer, zzdc paramzzdc)
  {
    super((String)localObject, arrayOfString);
    this.zzbhN = paramDataLayer;
    this.zzbmc = paramzzdc;
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzbmb = ((Set)localObject);
    this.zzbmb.add("");
    this.zzbmb.add("0");
    this.zzbmb.add("false");
  }
  
  private Double zzV(Object paramObject)
  {
    boolean bool = paramObject instanceof String;
    if (bool) {}
    for (;;)
    {
      try
      {
        paramObject = (String)paramObject;
        paramObject = Double.valueOf((String)paramObject);
        return (Double)paramObject;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject2 = new java/lang/RuntimeException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Cannot convert the object to Double: ");
        localObject1 = localNumberFormatException.getMessage();
        localObject1 = (String)localObject1;
        ((RuntimeException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      bool = paramObject instanceof Integer;
      if (bool)
      {
        double d = ((Integer)paramObject).doubleValue();
        paramObject = Double.valueOf(d);
      }
      else
      {
        bool = paramObject instanceof Double;
        if (!bool) {
          break;
        }
        paramObject = (Double)paramObject;
      }
    }
    Object localObject1 = new java/lang/RuntimeException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Cannot convert the object to Double: ");
    Object localObject3 = paramObject.toString();
    localObject2 = (String)localObject3;
    ((RuntimeException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private Integer zzW(Object paramObject)
  {
    boolean bool1 = paramObject instanceof String;
    if (bool1) {}
    for (;;)
    {
      try
      {
        paramObject = (String)paramObject;
        paramObject = Integer.valueOf((String)paramObject);
        return (Integer)paramObject;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject2 = new java/lang/RuntimeException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Cannot convert the object to Integer: ");
        localObject1 = localNumberFormatException.getMessage();
        localObject1 = (String)localObject1;
        ((RuntimeException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      bool1 = paramObject instanceof Double;
      if (bool1)
      {
        int i = ((Double)paramObject).intValue();
        paramObject = Integer.valueOf(i);
      }
      else
      {
        boolean bool2 = paramObject instanceof Integer;
        if (!bool2) {
          break;
        }
        paramObject = (Integer)paramObject;
      }
    }
    Object localObject1 = new java/lang/RuntimeException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Cannot convert the object to Integer: ");
    Object localObject3 = paramObject.toString();
    localObject2 = (String)localObject3;
    ((RuntimeException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private Promotion zzZ(Map paramMap)
  {
    Promotion localPromotion = new com/google/android/gms/analytics/ecommerce/Promotion;
    localPromotion.<init>();
    String str = (String)paramMap.get("id");
    if (str != null)
    {
      str = String.valueOf(str);
      localPromotion.setId(str);
    }
    str = (String)paramMap.get("name");
    if (str != null)
    {
      str = String.valueOf(str);
      localPromotion.setName(str);
    }
    str = (String)paramMap.get("creative");
    if (str != null)
    {
      str = String.valueOf(str);
      localPromotion.setCreative(str);
    }
    str = (String)paramMap.get("position");
    if (str != null)
    {
      str = String.valueOf(str);
      localPromotion.setPosition(str);
    }
    return localPromotion;
  }
  
  private void zza(Tracker paramTracker, Map paramMap)
  {
    Object localObject1 = "transactionId";
    String str = zzgy((String)localObject1);
    if (str == null)
    {
      localObject1 = "Cannot find transactionId in data layer.";
      zzbg.e((String)localObject1);
    }
    LinkedList localLinkedList;
    Object localObject3;
    Iterator localIterator1;
    boolean bool1;
    for (;;)
    {
      return;
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      try
      {
        localObject1 = zzblS;
        localObject1 = paramMap.get(localObject1);
        localObject1 = (zzag.zza)localObject1;
        localObject3 = zzm((zzag.zza)localObject1);
        localObject1 = "&t";
        localObject4 = "transaction";
        ((Map)localObject3).put(localObject1, localObject4);
        localObject1 = zzab(paramMap);
        localObject1 = ((Map)localObject1).entrySet();
        localIterator1 = ((Set)localObject1).iterator();
        for (;;)
        {
          bool1 = localIterator1.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = localIterator1.next();
          localObject1 = (Map.Entry)localObject1;
          localObject4 = ((Map.Entry)localObject1).getValue();
          localObject4 = (String)localObject4;
          localObject1 = ((Map.Entry)localObject1).getKey();
          localObject1 = (String)localObject1;
          localObject1 = zzgy((String)localObject1);
          zze((Map)localObject3, (String)localObject4, (String)localObject1);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject4 = "Unable to send transaction";
        zzbg.zzb((String)localObject4, localIllegalArgumentException);
      }
    }
    localLinkedList.add(localObject3);
    Object localObject2 = "transactionProducts";
    localObject2 = zzgz((String)localObject2);
    if (localObject2 != null)
    {
      localIterator1 = ((List)localObject2).iterator();
      for (;;)
      {
        bool1 = localIterator1.hasNext();
        if (!bool1) {
          break label468;
        }
        localObject2 = localIterator1.next();
        localObject2 = (Map)localObject2;
        localObject4 = "name";
        localObject4 = ((Map)localObject2).get(localObject4);
        if (localObject4 == null)
        {
          localObject2 = "Unable to send transaction item hit due to missing 'name' field.";
          zzbg.e((String)localObject2);
          break;
        }
        localObject4 = zzblS;
        localObject4 = paramMap.get(localObject4);
        localObject4 = (zzag.zza)localObject4;
        Map localMap = zzm((zzag.zza)localObject4);
        localObject4 = "&t";
        localObject3 = "item";
        localMap.put(localObject4, localObject3);
        localObject4 = "&ti";
        localMap.put(localObject4, str);
        localObject4 = zzac(paramMap);
        localObject4 = ((Map)localObject4).entrySet();
        Iterator localIterator2 = ((Set)localObject4).iterator();
        for (;;)
        {
          boolean bool2 = localIterator2.hasNext();
          if (!bool2) {
            break;
          }
          localObject4 = localIterator2.next();
          localObject4 = (Map.Entry)localObject4;
          localObject3 = ((Map.Entry)localObject4).getValue();
          localObject3 = (String)localObject3;
          localObject4 = ((Map.Entry)localObject4).getKey();
          localObject4 = ((Map)localObject2).get(localObject4);
          localObject4 = (String)localObject4;
          zze(localMap, (String)localObject3, (String)localObject4);
        }
        localLinkedList.add(localMap);
      }
    }
    label468:
    Object localObject4 = localLinkedList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = ((Iterator)localObject4).next();
      localObject2 = (Map)localObject2;
      paramTracker.send((Map)localObject2);
    }
  }
  
  private Product zzaa(Map paramMap)
  {
    Product localProduct = new com/google/android/gms/analytics/ecommerce/Product;
    localProduct.<init>();
    Object localObject1 = paramMap.get("id");
    if (localObject1 != null)
    {
      localObject1 = String.valueOf(localObject1);
      localProduct.setId((String)localObject1);
    }
    localObject1 = paramMap.get("name");
    if (localObject1 != null)
    {
      localObject1 = String.valueOf(localObject1);
      localProduct.setName((String)localObject1);
    }
    localObject1 = paramMap.get("brand");
    if (localObject1 != null)
    {
      localObject1 = String.valueOf(localObject1);
      localProduct.setBrand((String)localObject1);
    }
    localObject1 = paramMap.get("category");
    if (localObject1 != null)
    {
      localObject1 = String.valueOf(localObject1);
      localProduct.setCategory((String)localObject1);
    }
    localObject1 = paramMap.get("variant");
    if (localObject1 != null)
    {
      localObject1 = String.valueOf(localObject1);
      localProduct.setVariant((String)localObject1);
    }
    localObject1 = paramMap.get("coupon");
    if (localObject1 != null)
    {
      localObject1 = String.valueOf(localObject1);
      localProduct.setCouponCode((String)localObject1);
    }
    localObject1 = paramMap.get("position");
    int i;
    if (localObject1 != null)
    {
      localObject1 = zzW(localObject1);
      i = ((Integer)localObject1).intValue();
      localProduct.setPosition(i);
    }
    localObject1 = paramMap.get("price");
    if (localObject1 != null)
    {
      localObject1 = zzV(localObject1);
      double d = ((Double)localObject1).doubleValue();
      localProduct.setPrice(d);
    }
    localObject1 = paramMap.get("quantity");
    if (localObject1 != null)
    {
      localObject1 = zzW(localObject1);
      i = ((Integer)localObject1).intValue();
      localProduct.setQuantity(i);
    }
    localObject1 = paramMap.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = zzblX.matcher((CharSequence)localObject1);
      int k = ((Matcher)localObject2).matches();
      int n;
      Object localObject3;
      String str;
      if (k != 0)
      {
        k = 1;
        try
        {
          localObject2 = ((Matcher)localObject2).group(k);
          n = Integer.parseInt((String)localObject2);
          localObject1 = String.valueOf(paramMap.get(localObject1));
          localProduct.setCustomDimension(n, (String)localObject1);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = "illegal number in custom dimension value: ";
          localObject3 = ((StringBuilder)localObject3).append(str);
          localObject1 = (String)localObject1;
          zzbg.zzaK((String)localObject1);
        }
      }
      else
      {
        localObject3 = zzblY.matcher((CharSequence)localObject1);
        int m = ((Matcher)localObject3).matches();
        if (m != 0)
        {
          m = 1;
          try
          {
            localObject3 = ((Matcher)localObject3).group(m);
            n = Integer.parseInt((String)localObject3);
            localObject1 = paramMap.get(localObject1);
            localObject1 = zzW(localObject1);
            int j = ((Integer)localObject1).intValue();
            localProduct.setCustomMetric(n, j);
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            str = "illegal number in custom metric value: ";
            localStringBuilder = localStringBuilder.append(str);
            localObject1 = (String)localObject1;
            zzbg.zzaK((String)localObject1);
          }
        }
      }
    }
    return localProduct;
  }
  
  private Map zzab(Map paramMap)
  {
    Object localObject = zzblU;
    localObject = (zzag.zza)paramMap.get(localObject);
    if (localObject != null) {}
    for (localObject = zzc((zzag.zza)localObject);; localObject = zzblZ)
    {
      return (Map)localObject;
      localObject = zzblZ;
      if (localObject == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        ((HashMap)localObject).put("transactionId", "&ti");
        ((HashMap)localObject).put("transactionAffiliation", "&ta");
        ((HashMap)localObject).put("transactionTax", "&tt");
        ((HashMap)localObject).put("transactionShipping", "&ts");
        ((HashMap)localObject).put("transactionTotal", "&tr");
        String str1 = "transactionCurrency";
        String str2 = "&cu";
        ((HashMap)localObject).put(str1, str2);
        zzblZ = (Map)localObject;
      }
    }
  }
  
  private Map zzac(Map paramMap)
  {
    Object localObject = zzblV;
    localObject = (zzag.zza)paramMap.get(localObject);
    if (localObject != null) {}
    for (localObject = zzc((zzag.zza)localObject);; localObject = zzbma)
    {
      return (Map)localObject;
      localObject = zzbma;
      if (localObject == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        ((HashMap)localObject).put("name", "&in");
        ((HashMap)localObject).put("sku", "&ic");
        ((HashMap)localObject).put("category", "&iv");
        ((HashMap)localObject).put("price", "&ip");
        ((HashMap)localObject).put("quantity", "&iq");
        String str1 = "currency";
        String str2 = "&cu";
        ((HashMap)localObject).put(str1, str2);
        zzbma = (Map)localObject;
      }
    }
  }
  
  private void zzb(Tracker paramTracker, Map paramMap)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    HitBuilders.ScreenViewBuilder localScreenViewBuilder = new com/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;
    localScreenViewBuilder.<init>();
    Object localObject2 = zzblS;
    localObject2 = (zzag.zza)paramMap.get(localObject2);
    Object localObject5 = zzm((zzag.zza)localObject2);
    localScreenViewBuilder.setAll((Map)localObject5);
    localObject2 = zzblQ;
    boolean bool2 = zzj(paramMap, (String)localObject2);
    Object localObject6;
    boolean bool3;
    if (bool2)
    {
      localObject2 = this.zzbhN;
      localObject6 = "ecommerce";
      localObject2 = ((DataLayer)localObject2).get((String)localObject6);
      bool3 = localObject2 instanceof Map;
      if (!bool3) {
        break label1044;
      }
    }
    String str1;
    for (localObject2 = (Map)localObject2;; str1 = null)
    {
      localObject6 = localObject2;
      for (;;)
      {
        boolean bool4;
        Object localObject7;
        String str3;
        Object localObject3;
        if (localObject6 != null)
        {
          localObject2 = (String)((Map)localObject5).get("&cu");
          if (localObject2 == null) {
            localObject2 = (String)((Map)localObject6).get("currencyCode");
          }
          if (localObject2 != null)
          {
            localObject5 = "&cu";
            localScreenViewBuilder.set((String)localObject5, (String)localObject2);
          }
          localObject2 = ((Map)localObject6).get("impressions");
          bool4 = localObject2 instanceof List;
          if (bool4)
          {
            localObject2 = (List)localObject2;
            localObject5 = ((List)localObject2).iterator();
            for (;;)
            {
              bool2 = ((Iterator)localObject5).hasNext();
              if (!bool2) {
                break;
              }
              localObject2 = (Map)((Iterator)localObject5).next();
              try
              {
                localObject7 = zzaa((Map)localObject2);
                str3 = "list";
                localObject2 = ((Map)localObject2).get(str3);
                localObject2 = (String)localObject2;
                localScreenViewBuilder.addImpression((Product)localObject7, (String)localObject2);
              }
              catch (RuntimeException localRuntimeException1)
              {
                localObject7 = new java/lang/StringBuilder;
                ((StringBuilder)localObject7).<init>();
                str3 = "Failed to extract a product from DataLayer. ";
                localObject7 = ((StringBuilder)localObject7).append(str3);
                localObject3 = localRuntimeException1.getMessage();
                localObject3 = (String)localObject3;
                zzbg.e((String)localObject3);
              }
            }
            localObject3 = zzblR;
            localObject3 = zzdf.zzl((zzag.zza)paramMap.get(localObject3));
            bool3 = localObject3 instanceof Map;
            if (!bool3) {
              break label1035;
            }
            localObject3 = (Map)localObject3;
            localObject6 = localObject3;
            continue;
          }
          localObject3 = "promoClick";
          bool2 = ((Map)localObject6).containsKey(localObject3);
          if (bool2)
          {
            localObject3 = (Map)((Map)localObject6).get("promoClick");
            localObject1 = "promotions";
            localObject3 = (List)((Map)localObject3).get(localObject1);
          }
        }
        for (;;)
        {
          bool1 = true;
          Object localObject4;
          if (localObject3 != null)
          {
            localObject5 = ((List)localObject3).iterator();
            for (;;)
            {
              bool2 = ((Iterator)localObject5).hasNext();
              if (!bool2) {
                break;
              }
              localObject3 = (Map)((Iterator)localObject5).next();
              try
              {
                localObject3 = zzZ((Map)localObject3);
                localScreenViewBuilder.addPromotion((Promotion)localObject3);
              }
              catch (RuntimeException localRuntimeException2)
              {
                localObject7 = new java/lang/StringBuilder;
                ((StringBuilder)localObject7).<init>();
                str3 = "Failed to extract a promotion from DataLayer. ";
                localObject7 = ((StringBuilder)localObject7).append(str3);
                localObject4 = localRuntimeException2.getMessage();
                localObject4 = (String)localObject4;
                zzbg.e((String)localObject4);
              }
            }
            localObject4 = "promoView";
            bool2 = ((Map)localObject6).containsKey(localObject4);
            if (!bool2) {
              break label1026;
            }
            localObject4 = (Map)((Map)localObject6).get("promoView");
            localObject1 = "promotions";
            localObject4 = (List)((Map)localObject4).get(localObject1);
            continue;
            localObject4 = "promoClick";
            bool2 = ((Map)localObject6).containsKey(localObject4);
            if (bool2)
            {
              localObject1 = "click";
              localScreenViewBuilder.set("&promoa", (String)localObject1);
              bool2 = false;
              localObject4 = null;
            }
          }
          while (bool2)
          {
            localObject4 = zzblW;
            localObject1 = ((List)localObject4).iterator();
            do
            {
              bool2 = ((Iterator)localObject1).hasNext();
              if (!bool2) {
                break;
              }
              localObject4 = (String)((Iterator)localObject1).next();
              bool4 = ((Map)localObject6).containsKey(localObject4);
            } while (!bool4);
            localObject1 = (Map)((Map)localObject6).get(localObject4);
            localObject6 = (List)((Map)localObject1).get("products");
            if (localObject6 != null)
            {
              localObject5 = ((List)localObject6).iterator();
              for (;;)
              {
                bool3 = ((Iterator)localObject5).hasNext();
                if (!bool3) {
                  break;
                }
                localObject6 = (Map)((Iterator)localObject5).next();
                try
                {
                  localObject6 = zzaa((Map)localObject6);
                  localScreenViewBuilder.addProduct((Product)localObject6);
                }
                catch (RuntimeException localRuntimeException4)
                {
                  localObject7 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject7).<init>();
                  str3 = "Failed to extract a product from DataLayer. ";
                  localObject7 = ((StringBuilder)localObject7).append(str3);
                  str2 = localRuntimeException4.getMessage();
                  str2 = str2;
                  zzbg.e(str2);
                }
              }
              localObject4 = "&promoa";
              localObject5 = "view";
              localScreenViewBuilder.set((String)localObject4, (String)localObject5);
              bool2 = bool1;
            }
            else
            {
              str2 = "actionField";
            }
          }
          for (;;)
          {
            try
            {
              bool3 = ((Map)localObject1).containsKey(str2);
              if (!bool3) {
                continue;
              }
              str2 = "actionField";
              localObject1 = ((Map)localObject1).get(str2);
              localObject1 = (Map)localObject1;
              localObject4 = zzd((String)localObject4, (Map)localObject1);
              localScreenViewBuilder.setProductAction((ProductAction)localObject4);
            }
            catch (RuntimeException localRuntimeException3)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              str2 = "Failed to extract a product action from DataLayer. ";
              localObject1 = ((StringBuilder)localObject1).append(str2);
              str1 = localRuntimeException3.getMessage();
              str1 = str1;
              zzbg.e(str1);
              continue;
            }
            localObject4 = localScreenViewBuilder.build();
            paramTracker.send((Map)localObject4);
            return;
            localObject1 = new com/google/android/gms/analytics/ecommerce/ProductAction;
            ((ProductAction)localObject1).<init>((String)localObject4);
            localObject4 = localObject1;
          }
          label1026:
          bool2 = false;
          str1 = null;
        }
        label1035:
        bool3 = false;
        String str2 = null;
      }
      label1044:
      bool2 = false;
    }
  }
  
  private Map zzc(zzag.zza paramzza)
  {
    Object localObject = zzdf.zzl(paramzza);
    boolean bool1 = localObject instanceof Map;
    boolean bool2;
    if (!bool1) {
      bool2 = false;
    }
    LinkedHashMap localLinkedHashMap;
    for (localObject = null;; localObject = localLinkedHashMap)
    {
      return (Map)localObject;
      localObject = (Map)localObject;
      localLinkedHashMap = new java/util/LinkedHashMap;
      localLinkedHashMap.<init>();
      localObject = ((Map)localObject).entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str = ((Map.Entry)localObject).getKey().toString();
        localObject = ((Map.Entry)localObject).getValue().toString();
        localLinkedHashMap.put(str, localObject);
      }
    }
  }
  
  private ProductAction zzd(String paramString, Map paramMap)
  {
    ProductAction localProductAction = new com/google/android/gms/analytics/ecommerce/ProductAction;
    localProductAction.<init>(paramString);
    Object localObject = paramMap.get("id");
    if (localObject != null)
    {
      localObject = String.valueOf(localObject);
      localProductAction.setTransactionId((String)localObject);
    }
    localObject = paramMap.get("affiliation");
    if (localObject != null)
    {
      localObject = String.valueOf(localObject);
      localProductAction.setTransactionAffiliation((String)localObject);
    }
    localObject = paramMap.get("coupon");
    if (localObject != null)
    {
      localObject = String.valueOf(localObject);
      localProductAction.setTransactionCouponCode((String)localObject);
    }
    localObject = paramMap.get("list");
    if (localObject != null)
    {
      localObject = String.valueOf(localObject);
      localProductAction.setProductActionList((String)localObject);
    }
    localObject = paramMap.get("option");
    if (localObject != null)
    {
      localObject = String.valueOf(localObject);
      localProductAction.setCheckoutOptions((String)localObject);
    }
    localObject = paramMap.get("revenue");
    double d;
    if (localObject != null)
    {
      localObject = zzV(localObject);
      d = ((Double)localObject).doubleValue();
      localProductAction.setTransactionRevenue(d);
    }
    localObject = paramMap.get("tax");
    if (localObject != null)
    {
      localObject = zzV(localObject);
      d = ((Double)localObject).doubleValue();
      localProductAction.setTransactionTax(d);
    }
    localObject = paramMap.get("shipping");
    if (localObject != null)
    {
      localObject = zzV(localObject);
      d = ((Double)localObject).doubleValue();
      localProductAction.setTransactionShipping(d);
    }
    localObject = paramMap.get("step");
    if (localObject != null)
    {
      localObject = zzW(localObject);
      int i = ((Integer)localObject).intValue();
      localProductAction.setCheckoutStep(i);
    }
    return localProductAction;
  }
  
  private void zze(Map paramMap, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private String zzgy(String paramString)
  {
    Object localObject = this.zzbhN.get(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = localObject.toString()) {
      return (String)localObject;
    }
  }
  
  private List zzgz(String paramString)
  {
    Object localObject1 = this.zzbhN;
    Object localObject2 = ((DataLayer)localObject1).get(paramString);
    if (localObject2 == null) {}
    for (localObject2 = null;; localObject2 = (List)localObject2)
    {
      return (List)localObject2;
      boolean bool1 = localObject2 instanceof List;
      if (!bool1)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("transactionProducts should be of type List.");
        throw ((Throwable)localObject1);
      }
      localObject1 = localObject2;
      localObject1 = ((List)localObject2).iterator();
      boolean bool2;
      do
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        Object localObject3 = ((Iterator)localObject1).next();
        bool2 = localObject3 instanceof Map;
      } while (bool2);
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Each element of transactionProducts should be of type Map.");
      throw ((Throwable)localObject1);
    }
  }
  
  private boolean zzj(Map paramMap, String paramString)
  {
    Object localObject = (zzag.zza)paramMap.get(paramString);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = zzdf.zzk((zzag.zza)localObject);
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  private Map zzm(zzag.zza paramzza)
  {
    Object localObject;
    if (paramzza == null)
    {
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
    }
    for (;;)
    {
      return (Map)localObject;
      Map localMap = zzc(paramzza);
      if (localMap == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
      }
      else
      {
        localObject = (String)localMap.get("&aip");
        if (localObject != null)
        {
          Set localSet = this.zzbmb;
          localObject = ((String)localObject).toLowerCase();
          boolean bool = localSet.contains(localObject);
          if (bool)
          {
            localObject = "&aip";
            localMap.remove(localObject);
          }
        }
        localObject = localMap;
      }
    }
  }
  
  public void zzR(Map paramMap)
  {
    Tracker localTracker = this.zzbmc.zzgq("_GTM_DEFAULT_TRACKER_");
    boolean bool = zzj(paramMap, "collect_adid");
    localTracker.enableAdvertisingIdCollection(bool);
    Object localObject = zzblP;
    bool = zzj(paramMap, (String)localObject);
    if (bool) {
      zzb(localTracker, paramMap);
    }
    for (;;)
    {
      return;
      localObject = zzblO;
      bool = zzj(paramMap, (String)localObject);
      if (bool)
      {
        localObject = zzblS;
        localObject = (zzag.zza)paramMap.get(localObject);
        localObject = zzm((zzag.zza)localObject);
        localTracker.send((Map)localObject);
      }
      else
      {
        localObject = zzblT;
        bool = zzj(paramMap, (String)localObject);
        if (bool)
        {
          zza(localTracker, paramMap);
        }
        else
        {
          localObject = "Ignoring unknown tag.";
          zzbg.zzaK((String)localObject);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */