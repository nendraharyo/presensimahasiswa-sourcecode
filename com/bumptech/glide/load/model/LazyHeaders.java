package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class LazyHeaders
  implements Headers
{
  private volatile Map combinedHeaders;
  private final Map headers;
  
  LazyHeaders(Map paramMap)
  {
    Map localMap = Collections.unmodifiableMap(paramMap);
    this.headers = localMap;
  }
  
  private String buildHeaderValue(List paramList)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = paramList.size();
    int j = 0;
    String str = null;
    int k;
    for (int m = 0; m < i; m = k)
    {
      str = ((LazyHeaderFactory)paramList.get(m)).buildHeader();
      boolean bool = TextUtils.isEmpty(str);
      if (!bool)
      {
        localStringBuilder.append(str);
        j = paramList.size() + -1;
        if (m != j)
        {
          j = 44;
          localStringBuilder.append(j);
        }
      }
      k = m + 1;
    }
    return localStringBuilder.toString();
  }
  
  private Map generateHeaders()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.headers.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (List)((Map.Entry)localObject1).getValue();
      localObject2 = buildHeaderValue((List)localObject2);
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool2)
      {
        localObject1 = ((Map.Entry)localObject1).getKey();
        localHashMap.put(localObject1, localObject2);
      }
    }
    return localHashMap;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof LazyHeaders;
    Map localMap1;
    if (bool)
    {
      paramObject = (LazyHeaders)paramObject;
      localMap1 = this.headers;
      Map localMap2 = ((LazyHeaders)paramObject).headers;
      bool = localMap1.equals(localMap2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMap1 = null;
    }
  }
  
  public Map getHeaders()
  {
    Map localMap = this.combinedHeaders;
    if (localMap == null) {}
    try
    {
      localMap = this.combinedHeaders;
      if (localMap == null)
      {
        localMap = generateHeaders();
        localMap = Collections.unmodifiableMap(localMap);
        this.combinedHeaders = localMap;
      }
      return this.combinedHeaders;
    }
    finally {}
  }
  
  public int hashCode()
  {
    return this.headers.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("LazyHeaders{headers=");
    Map localMap = this.headers;
    return localMap + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\LazyHeaders.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */