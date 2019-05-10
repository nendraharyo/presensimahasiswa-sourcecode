package com.crashlytics.android.answers;

import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirebaseAnalyticsEventMapper
{
  private static final Set EVENT_NAMES;
  private static final String FIREBASE_LEVEL_NAME = "level_name";
  private static final String FIREBASE_METHOD = "method";
  private static final String FIREBASE_RATING = "rating";
  private static final String FIREBASE_SUCCESS = "success";
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[26];
    localObject[0] = "app_clear_data";
    localObject[1] = "app_exception";
    localObject[2] = "app_remove";
    localObject[3] = "app_upgrade";
    localObject[4] = "app_install";
    localObject[5] = "app_update";
    localObject[6] = "firebase_campaign";
    localObject[7] = "error";
    localObject[8] = "first_open";
    localObject[9] = "first_visit";
    localObject[10] = "in_app_purchase";
    localObject[11] = "notification_dismiss";
    localObject[12] = "notification_foreground";
    localObject[13] = "notification_open";
    localObject[14] = "notification_receive";
    localObject[15] = "os_update";
    localObject[16] = "session_start";
    localObject[17] = "user_engagement";
    localObject[18] = "ad_exposure";
    localObject[19] = "adunit_exposure";
    localObject[20] = "ad_query";
    localObject[21] = "ad_activeview";
    localObject[22] = "ad_impression";
    localObject[23] = "ad_click";
    localObject[24] = "screen_view";
    localObject[25] = "firebase_extra_parameter";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    EVENT_NAMES = localHashSet;
  }
  
  private String mapAttribute(String paramString)
  {
    int i = 40;
    String str1;
    if (paramString != null)
    {
      int j = paramString.length();
      if (j != 0) {}
    }
    else
    {
      str1 = "fabric_unnamed_parameter";
    }
    for (;;)
    {
      return str1;
      str1 = paramString.replaceAll("[^\\p{Alnum}_]+", "_");
      Object localObject = "ga_";
      boolean bool = str1.startsWith((String)localObject);
      if (!bool)
      {
        localObject = "google_";
        bool = str1.startsWith((String)localObject);
        if (!bool)
        {
          localObject = "firebase_";
          bool = str1.startsWith((String)localObject);
          if (!bool)
          {
            bool = Character.isLetter(str1.charAt(0));
            if (bool) {
              break label138;
            }
          }
        }
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "fabric_";
      localObject = ((StringBuilder)localObject).append(str2);
      str1 = str1;
      label138:
      int k = str1.length();
      if (k > i) {
        str1 = str1.substring(0, i);
      }
    }
  }
  
  private Integer mapBooleanValue(String paramString)
  {
    if (paramString == null)
    {
      i = 0;
      localObject = null;
      return (Integer)localObject;
    }
    Object localObject = "true";
    int i = paramString.equals(localObject);
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      localObject = Integer.valueOf(i);
      break;
      int j = 0;
      localObject = null;
    }
  }
  
  private void mapCustomEventAttributes(Bundle paramBundle, Map paramMap)
  {
    Object localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      String str = (String)((Map.Entry)localObject1).getKey();
      str = mapAttribute(str);
      boolean bool2 = localObject2 instanceof String;
      if (bool2)
      {
        localObject1 = ((Map.Entry)localObject1).getValue().toString();
        paramBundle.putString(str, (String)localObject1);
      }
      else
      {
        bool2 = localObject2 instanceof Double;
        if (bool2)
        {
          localObject1 = (Double)((Map.Entry)localObject1).getValue();
          double d = ((Double)localObject1).doubleValue();
          paramBundle.putDouble(str, d);
        }
        else
        {
          bool2 = localObject2 instanceof Long;
          if (bool2)
          {
            localObject1 = (Long)((Map.Entry)localObject1).getValue();
            long l = ((Long)localObject1).longValue();
            paramBundle.putLong(str, l);
          }
          else
          {
            boolean bool3 = localObject2 instanceof Integer;
            if (bool3)
            {
              localObject1 = (Integer)((Map.Entry)localObject1).getValue();
              int i = ((Integer)localObject1).intValue();
              paramBundle.putInt(str, i);
            }
          }
        }
      }
    }
  }
  
  private String mapCustomEventName(String paramString)
  {
    int i = 40;
    Object localObject1;
    if (paramString != null)
    {
      int j = paramString.length();
      if (j != 0) {}
    }
    else
    {
      localObject1 = "fabric_unnamed_event";
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = EVENT_NAMES;
      boolean bool1 = ((Set)localObject1).contains(paramString);
      Object localObject2;
      if (bool1)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "fabric_";
        localObject1 = (String)localObject2 + paramString;
      }
      else
      {
        localObject1 = paramString.replaceAll("[^\\p{Alnum}_]+", "_");
        localObject2 = "ga_";
        boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
        if (!bool2)
        {
          localObject2 = "google_";
          bool2 = ((String)localObject1).startsWith((String)localObject2);
          if (!bool2)
          {
            localObject2 = "firebase_";
            bool2 = ((String)localObject1).startsWith((String)localObject2);
            if (!bool2)
            {
              bool2 = Character.isLetter(((String)localObject1).charAt(0));
              if (bool2) {
                break label189;
              }
            }
          }
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "fabric_";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject1 = (String)localObject1;
        label189:
        int k = ((String)localObject1).length();
        if (k > i) {
          localObject1 = ((String)localObject1).substring(0, i);
        }
      }
    }
  }
  
  private Double mapDouble(Object paramObject)
  {
    Object localObject = String.valueOf(paramObject);
    if (localObject == null) {}
    for (localObject = null;; localObject = Double.valueOf((String)localObject)) {
      return (Double)localObject;
    }
  }
  
  private Bundle mapPredefinedEvent(SessionEvent paramSessionEvent)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = "purchase";
    Object localObject2 = paramSessionEvent.predefinedType;
    boolean bool1 = ((String)localObject1).equals(localObject2);
    String str;
    if (bool1)
    {
      localObject1 = (String)paramSessionEvent.predefinedAttributes.get("itemId");
      putString(localBundle, "item_id", (String)localObject1);
      localObject1 = (String)paramSessionEvent.predefinedAttributes.get("itemName");
      putString(localBundle, "item_name", (String)localObject1);
      localObject1 = (String)paramSessionEvent.predefinedAttributes.get("itemType");
      putString(localBundle, "item_category", (String)localObject1);
      localObject2 = paramSessionEvent.predefinedAttributes.get("itemPrice");
      localObject2 = mapPriceValue(localObject2);
      putDouble(localBundle, "value", (Double)localObject2);
      localObject2 = "currency";
      localObject1 = paramSessionEvent.predefinedAttributes;
      str = "currency";
      localObject1 = (String)((Map)localObject1).get(str);
      putString(localBundle, (String)localObject2, (String)localObject1);
    }
    for (;;)
    {
      localObject1 = paramSessionEvent.customAttributes;
      mapCustomEventAttributes(localBundle, (Map)localObject1);
      return localBundle;
      localObject1 = "addToCart";
      localObject2 = paramSessionEvent.predefinedType;
      bool1 = ((String)localObject1).equals(localObject2);
      if (bool1)
      {
        localObject1 = (String)paramSessionEvent.predefinedAttributes.get("itemId");
        putString(localBundle, "item_id", (String)localObject1);
        localObject1 = (String)paramSessionEvent.predefinedAttributes.get("itemName");
        putString(localBundle, "item_name", (String)localObject1);
        localObject1 = (String)paramSessionEvent.predefinedAttributes.get("itemType");
        putString(localBundle, "item_category", (String)localObject1);
        localObject2 = paramSessionEvent.predefinedAttributes.get("itemPrice");
        localObject2 = mapPriceValue(localObject2);
        putDouble(localBundle, "price", (Double)localObject2);
        localObject2 = paramSessionEvent.predefinedAttributes.get("itemPrice");
        localObject2 = mapPriceValue(localObject2);
        putDouble(localBundle, "value", (Double)localObject2);
        localObject2 = "currency";
        localObject1 = paramSessionEvent.predefinedAttributes;
        str = "currency";
        localObject1 = (String)((Map)localObject1).get(str);
        putString(localBundle, (String)localObject2, (String)localObject1);
        localObject1 = "quantity";
        long l1 = 1L;
        localBundle.putLong((String)localObject1, l1);
      }
      else
      {
        localObject1 = "startCheckout";
        localObject2 = paramSessionEvent.predefinedType;
        bool1 = ((String)localObject1).equals(localObject2);
        if (bool1)
        {
          int i = ((Integer)paramSessionEvent.predefinedAttributes.get("itemCount")).intValue();
          long l2 = i;
          localObject1 = Long.valueOf(l2);
          putLong(localBundle, "quantity", (Long)localObject1);
          localObject2 = paramSessionEvent.predefinedAttributes.get("totalPrice");
          localObject2 = mapPriceValue(localObject2);
          putDouble(localBundle, "value", (Double)localObject2);
          localObject2 = "currency";
          localObject1 = paramSessionEvent.predefinedAttributes;
          str = "currency";
          localObject1 = (String)((Map)localObject1).get(str);
          putString(localBundle, (String)localObject2, (String)localObject1);
        }
        else
        {
          localObject1 = "contentView";
          localObject2 = paramSessionEvent.predefinedType;
          boolean bool2 = ((String)localObject1).equals(localObject2);
          if (bool2)
          {
            localObject1 = (String)paramSessionEvent.predefinedAttributes.get("contentType");
            putString(localBundle, "content_type", (String)localObject1);
            localObject1 = (String)paramSessionEvent.predefinedAttributes.get("contentId");
            putString(localBundle, "item_id", (String)localObject1);
            localObject2 = "item_name";
            localObject1 = paramSessionEvent.predefinedAttributes;
            str = "contentName";
            localObject1 = (String)((Map)localObject1).get(str);
            putString(localBundle, (String)localObject2, (String)localObject1);
          }
          else
          {
            localObject1 = "search";
            localObject2 = paramSessionEvent.predefinedType;
            bool2 = ((String)localObject1).equals(localObject2);
            if (bool2)
            {
              localObject2 = "search_term";
              localObject1 = paramSessionEvent.predefinedAttributes;
              str = "query";
              localObject1 = (String)((Map)localObject1).get(str);
              putString(localBundle, (String)localObject2, (String)localObject1);
            }
            else
            {
              localObject1 = "share";
              localObject2 = paramSessionEvent.predefinedType;
              bool2 = ((String)localObject1).equals(localObject2);
              if (bool2)
              {
                localObject1 = (String)paramSessionEvent.predefinedAttributes.get("method");
                putString(localBundle, "method", (String)localObject1);
                localObject1 = (String)paramSessionEvent.predefinedAttributes.get("contentType");
                putString(localBundle, "content_type", (String)localObject1);
                localObject1 = (String)paramSessionEvent.predefinedAttributes.get("contentId");
                putString(localBundle, "item_id", (String)localObject1);
                localObject2 = "item_name";
                localObject1 = paramSessionEvent.predefinedAttributes;
                str = "contentName";
                localObject1 = (String)((Map)localObject1).get(str);
                putString(localBundle, (String)localObject2, (String)localObject1);
              }
              else
              {
                localObject1 = "rating";
                localObject2 = paramSessionEvent.predefinedType;
                bool2 = ((String)localObject1).equals(localObject2);
                if (bool2)
                {
                  localObject2 = String.valueOf(paramSessionEvent.predefinedAttributes.get("rating"));
                  putString(localBundle, "rating", (String)localObject2);
                  localObject1 = (String)paramSessionEvent.predefinedAttributes.get("contentType");
                  putString(localBundle, "content_type", (String)localObject1);
                  localObject1 = (String)paramSessionEvent.predefinedAttributes.get("contentId");
                  putString(localBundle, "item_id", (String)localObject1);
                  localObject2 = "item_name";
                  localObject1 = paramSessionEvent.predefinedAttributes;
                  str = "contentName";
                  localObject1 = (String)((Map)localObject1).get(str);
                  putString(localBundle, (String)localObject2, (String)localObject1);
                }
                else
                {
                  localObject1 = "signUp";
                  localObject2 = paramSessionEvent.predefinedType;
                  bool2 = ((String)localObject1).equals(localObject2);
                  if (bool2)
                  {
                    localObject2 = "method";
                    localObject1 = paramSessionEvent.predefinedAttributes;
                    str = "method";
                    localObject1 = (String)((Map)localObject1).get(str);
                    putString(localBundle, (String)localObject2, (String)localObject1);
                  }
                  else
                  {
                    localObject1 = "login";
                    localObject2 = paramSessionEvent.predefinedType;
                    bool2 = ((String)localObject1).equals(localObject2);
                    if (bool2)
                    {
                      localObject2 = "method";
                      localObject1 = paramSessionEvent.predefinedAttributes;
                      str = "method";
                      localObject1 = (String)((Map)localObject1).get(str);
                      putString(localBundle, (String)localObject2, (String)localObject1);
                    }
                    else
                    {
                      localObject1 = "invite";
                      localObject2 = paramSessionEvent.predefinedType;
                      bool2 = ((String)localObject1).equals(localObject2);
                      if (bool2)
                      {
                        localObject2 = "method";
                        localObject1 = paramSessionEvent.predefinedAttributes;
                        str = "method";
                        localObject1 = (String)((Map)localObject1).get(str);
                        putString(localBundle, (String)localObject2, (String)localObject1);
                      }
                      else
                      {
                        localObject1 = "levelStart";
                        localObject2 = paramSessionEvent.predefinedType;
                        bool2 = ((String)localObject1).equals(localObject2);
                        if (bool2)
                        {
                          localObject2 = "level_name";
                          localObject1 = paramSessionEvent.predefinedAttributes;
                          str = "levelName";
                          localObject1 = (String)((Map)localObject1).get(str);
                          putString(localBundle, (String)localObject2, (String)localObject1);
                        }
                        else
                        {
                          localObject1 = "levelEnd";
                          localObject2 = paramSessionEvent.predefinedType;
                          bool2 = ((String)localObject1).equals(localObject2);
                          if (bool2)
                          {
                            localObject2 = paramSessionEvent.predefinedAttributes.get("score");
                            localObject2 = mapDouble(localObject2);
                            putDouble(localBundle, "score", (Double)localObject2);
                            localObject1 = (String)paramSessionEvent.predefinedAttributes.get("levelName");
                            putString(localBundle, "level_name", (String)localObject1);
                            localObject2 = "success";
                            localObject1 = paramSessionEvent.predefinedAttributes;
                            str = "success";
                            localObject1 = (String)((Map)localObject1).get(str);
                            localObject1 = mapBooleanValue((String)localObject1);
                            putInt(localBundle, (String)localObject2, (Integer)localObject1);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private String mapPredefinedEventName(String paramString, boolean paramBoolean)
  {
    int i = 2;
    boolean bool1 = true;
    boolean bool2 = false;
    String str1 = null;
    int i6 = -1;
    int i7;
    if (paramBoolean) {
      i7 = paramString.hashCode();
    }
    switch (i7)
    {
    default: 
      i7 = i6;
      switch (i7)
      {
      default: 
        label64:
        i7 = paramString.hashCode();
        switch (i7)
        {
        default: 
          label208:
          bool2 = i6;
          switch (bool2)
          {
          default: 
            label212:
            str1 = mapCustomEventName(paramString);
          }
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      return str1;
      String str2 = "purchase";
      boolean bool11 = paramString.equals(str2);
      if (!bool11) {
        break;
      }
      bool11 = false;
      str2 = null;
      break label64;
      str2 = "signUp";
      bool11 = paramString.equals(str2);
      if (!bool11) {
        break;
      }
      bool11 = bool1;
      break label64;
      str2 = "login";
      bool11 = paramString.equals(str2);
      if (!bool11) {
        break;
      }
      bool11 = i;
      break label64;
      str1 = "failed_ecommerce_purchase";
      continue;
      str1 = "failed_sign_up";
      continue;
      str1 = "failed_login";
      continue;
      String str3 = "purchase";
      bool1 = paramString.equals(str3);
      if (!bool1) {
        break label208;
      }
      break label212;
      str1 = "addToCart";
      bool2 = paramString.equals(str1);
      if (!bool2) {
        break label208;
      }
      bool2 = bool1;
      break label212;
      str1 = "startCheckout";
      bool2 = paramString.equals(str1);
      if (!bool2) {
        break label208;
      }
      bool2 = i;
      break label212;
      str1 = "contentView";
      bool2 = paramString.equals(str1);
      if (!bool2) {
        break label208;
      }
      int j = 3;
      break label212;
      str1 = "search";
      boolean bool3 = paramString.equals(str1);
      if (!bool3) {
        break label208;
      }
      int k = 4;
      break label212;
      str1 = "share";
      boolean bool4 = paramString.equals(str1);
      if (!bool4) {
        break label208;
      }
      int m = 5;
      break label212;
      str1 = "rating";
      boolean bool5 = paramString.equals(str1);
      if (!bool5) {
        break label208;
      }
      int n = 6;
      break label212;
      str1 = "signUp";
      boolean bool6 = paramString.equals(str1);
      if (!bool6) {
        break label208;
      }
      int i1 = 7;
      break label212;
      str1 = "login";
      boolean bool7 = paramString.equals(str1);
      if (!bool7) {
        break label208;
      }
      int i2 = 8;
      break label212;
      str1 = "invite";
      boolean bool8 = paramString.equals(str1);
      if (!bool8) {
        break label208;
      }
      int i3 = 9;
      break label212;
      str1 = "levelStart";
      boolean bool9 = paramString.equals(str1);
      if (!bool9) {
        break label208;
      }
      int i4 = 10;
      break label212;
      str1 = "levelEnd";
      boolean bool10 = paramString.equals(str1);
      if (!bool10) {
        break label208;
      }
      int i5 = 11;
      break label212;
      str1 = "ecommerce_purchase";
      continue;
      str1 = "add_to_cart";
      continue;
      str1 = "begin_checkout";
      continue;
      str1 = "select_content";
      continue;
      str1 = "search";
      continue;
      str1 = "share";
      continue;
      str1 = "rate_content";
      continue;
      str1 = "sign_up";
      continue;
      str1 = "login";
      continue;
      str1 = "invite";
      continue;
      str1 = "level_start";
      continue;
      str1 = "level_end";
    }
  }
  
  private Double mapPriceValue(Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (Long)paramObject;
    if (localObject == null) {}
    double d;
    for (localObject = null;; localObject = Double.valueOf(d))
    {
      return (Double)localObject;
      localObject = new java/math/BigDecimal;
      paramObject = (Long)paramObject;
      long l = ((Long)paramObject).longValue();
      ((BigDecimal)localObject).<init>(l);
      BigDecimal localBigDecimal = AddToCartEvent.MICRO_CONSTANT;
      d = ((BigDecimal)localObject).divide(localBigDecimal).doubleValue();
    }
  }
  
  private void putDouble(Bundle paramBundle, String paramString, Double paramDouble)
  {
    Double localDouble = mapDouble(paramDouble);
    if (localDouble == null) {}
    for (;;)
    {
      return;
      double d = localDouble.doubleValue();
      paramBundle.putDouble(paramString, d);
    }
  }
  
  private void putInt(Bundle paramBundle, String paramString, Integer paramInteger)
  {
    if (paramInteger == null) {}
    for (;;)
    {
      return;
      int i = paramInteger.intValue();
      paramBundle.putInt(paramString, i);
    }
  }
  
  private void putLong(Bundle paramBundle, String paramString, Long paramLong)
  {
    if (paramLong == null) {}
    for (;;)
    {
      return;
      long l = paramLong.longValue();
      paramBundle.putLong(paramString, l);
    }
  }
  
  private void putString(Bundle paramBundle, String paramString1, String paramString2)
  {
    if (paramString2 == null) {}
    for (;;)
    {
      return;
      paramBundle.putString(paramString1, paramString2);
    }
  }
  
  public FirebaseAnalyticsEvent mapEvent(SessionEvent paramSessionEvent)
  {
    boolean bool1 = true;
    String str = null;
    Object localObject1 = SessionEvent.Type.CUSTOM;
    Object localObject2 = paramSessionEvent.type;
    boolean bool2 = ((SessionEvent.Type)localObject1).equals(localObject2);
    Object localObject3;
    boolean bool4;
    if (bool2)
    {
      localObject1 = paramSessionEvent.customType;
      if (localObject1 != null)
      {
        bool2 = bool1;
        localObject2 = SessionEvent.Type.PREDEFINED;
        localObject3 = paramSessionEvent.type;
        boolean bool3 = ((SessionEvent.Type)localObject2).equals(localObject3);
        if (!bool3) {
          break label110;
        }
        localObject2 = paramSessionEvent.predefinedType;
        if (localObject2 == null) {
          break label110;
        }
        bool4 = bool1;
      }
    }
    for (;;)
    {
      if ((bool2) || (bool4)) {
        break label119;
      }
      bool2 = false;
      localObject1 = null;
      return (FirebaseAnalyticsEvent)localObject1;
      bool2 = false;
      localObject1 = null;
      break;
      label110:
      bool4 = false;
      localObject3 = null;
    }
    label119:
    if (bool4)
    {
      localObject1 = mapPredefinedEvent(paramSessionEvent);
      localObject2 = localObject1;
      label135:
      if (!bool4) {
        break label291;
      }
      localObject1 = paramSessionEvent.predefinedAttributes;
      localObject3 = "success";
      localObject1 = (String)((Map)localObject1).get(localObject3);
      if (localObject1 == null) {
        break label283;
      }
      bool2 = Boolean.parseBoolean((String)localObject1);
      if (bool2) {
        break label283;
      }
      label181:
      localObject1 = paramSessionEvent.predefinedType;
    }
    for (localObject1 = mapPredefinedEventName((String)localObject1, bool1);; localObject1 = mapCustomEventName((String)localObject1))
    {
      Object localObject4 = Fabric.getLogger();
      str = "Answers";
      localObject3 = "Logging event into firebase...";
      ((Logger)localObject4).d(str, (String)localObject3);
      localObject4 = new com/crashlytics/android/answers/FirebaseAnalyticsEvent;
      ((FirebaseAnalyticsEvent)localObject4).<init>((String)localObject1, (Bundle)localObject2);
      localObject1 = localObject4;
      break;
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      localObject2 = paramSessionEvent.customAttributes;
      if (localObject2 != null)
      {
        localObject2 = paramSessionEvent.customAttributes;
        mapCustomEventAttributes((Bundle)localObject1, (Map)localObject2);
      }
      localObject2 = localObject1;
      break label135;
      label283:
      bool1 = false;
      localObject4 = null;
      break label181;
      label291:
      localObject1 = paramSessionEvent.customType;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\FirebaseAnalyticsEventMapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */