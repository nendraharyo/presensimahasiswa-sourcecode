package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class LazyHeaders$Builder
{
  private static final Map DEFAULT_HEADERS;
  private static final String DEFAULT_USER_AGENT = ;
  private static final String USER_AGENT_HEADER = "User-Agent";
  private boolean copyOnModify;
  private Map headers;
  private boolean isUserAgentDefault;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(2);
    String str1 = DEFAULT_USER_AGENT;
    boolean bool = TextUtils.isEmpty(str1);
    if (!bool)
    {
      str1 = "User-Agent";
      Object localObject = new com/bumptech/glide/load/model/LazyHeaders$StringHeaderFactory;
      String str2 = DEFAULT_USER_AGENT;
      ((LazyHeaders.StringHeaderFactory)localObject).<init>(str2);
      localObject = Collections.singletonList(localObject);
      localHashMap.put(str1, localObject);
    }
    DEFAULT_HEADERS = Collections.unmodifiableMap(localHashMap);
  }
  
  public LazyHeaders$Builder()
  {
    this.copyOnModify = bool;
    Map localMap = DEFAULT_HEADERS;
    this.headers = localMap;
    this.isUserAgentDefault = bool;
  }
  
  private Map copyHeaders()
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = this.headers.size();
    localHashMap.<init>(i);
    Object localObject = this.headers.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      ArrayList localArrayList = new java/util/ArrayList;
      Collection localCollection = (Collection)((Map.Entry)localObject).getValue();
      localArrayList.<init>(localCollection);
      localObject = ((Map.Entry)localObject).getKey();
      localHashMap.put(localObject, localArrayList);
    }
    return localHashMap;
  }
  
  private void copyIfNecessary()
  {
    boolean bool = this.copyOnModify;
    if (bool)
    {
      bool = false;
      this.copyOnModify = false;
      Map localMap = copyHeaders();
      this.headers = localMap;
    }
  }
  
  private List getFactories(String paramString)
  {
    Object localObject = (List)this.headers.get(paramString);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      Map localMap = this.headers;
      localMap.put(paramString, localObject);
    }
    return (List)localObject;
  }
  
  static String getSanitizedUserAgent()
  {
    String str = System.getProperty("http.agent");
    boolean bool = TextUtils.isEmpty(str);
    if (bool) {}
    for (;;)
    {
      return str;
      int j = str.length();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      int i = str.length();
      localStringBuilder.<init>(i);
      i = 0;
      if (i < j)
      {
        char c1 = str.charAt(i);
        char c2 = '\037';
        if (c1 <= c2)
        {
          c2 = '\t';
          if (c1 != c2) {}
        }
        else
        {
          c2 = '';
          if (c1 < c2) {
            localStringBuilder.append(c1);
          }
        }
        for (;;)
        {
          i += 1;
          break;
          c1 = '?';
          localStringBuilder.append(c1);
        }
      }
      str = localStringBuilder.toString();
    }
  }
  
  public Builder addHeader(String paramString, LazyHeaderFactory paramLazyHeaderFactory)
  {
    boolean bool = this.isUserAgentDefault;
    Object localObject;
    if (bool)
    {
      localObject = "User-Agent";
      bool = ((String)localObject).equalsIgnoreCase(paramString);
      if (bool) {
        this = setHeader(paramString, paramLazyHeaderFactory);
      }
    }
    for (;;)
    {
      return this;
      copyIfNecessary();
      localObject = getFactories(paramString);
      ((List)localObject).add(paramLazyHeaderFactory);
    }
  }
  
  public Builder addHeader(String paramString1, String paramString2)
  {
    LazyHeaders.StringHeaderFactory localStringHeaderFactory = new com/bumptech/glide/load/model/LazyHeaders$StringHeaderFactory;
    localStringHeaderFactory.<init>(paramString2);
    return addHeader(paramString1, localStringHeaderFactory);
  }
  
  public LazyHeaders build()
  {
    this.copyOnModify = true;
    LazyHeaders localLazyHeaders = new com/bumptech/glide/load/model/LazyHeaders;
    Map localMap = this.headers;
    localLazyHeaders.<init>(localMap);
    return localLazyHeaders;
  }
  
  public Builder setHeader(String paramString, LazyHeaderFactory paramLazyHeaderFactory)
  {
    copyIfNecessary();
    Object localObject;
    if (paramLazyHeaderFactory == null)
    {
      localObject = this.headers;
      ((Map)localObject).remove(paramString);
    }
    for (;;)
    {
      boolean bool = this.isUserAgentDefault;
      if (bool)
      {
        localObject = "User-Agent";
        bool = ((String)localObject).equalsIgnoreCase(paramString);
        if (bool)
        {
          bool = false;
          localObject = null;
          this.isUserAgentDefault = false;
        }
      }
      return this;
      localObject = getFactories(paramString);
      ((List)localObject).clear();
      ((List)localObject).add(paramLazyHeaderFactory);
    }
  }
  
  public Builder setHeader(String paramString1, String paramString2)
  {
    Object localObject;
    if (paramString2 == null) {
      localObject = null;
    }
    for (;;)
    {
      return setHeader(paramString1, (LazyHeaderFactory)localObject);
      localObject = new com/bumptech/glide/load/model/LazyHeaders$StringHeaderFactory;
      ((LazyHeaders.StringHeaderFactory)localObject).<init>(paramString2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\LazyHeaders$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */