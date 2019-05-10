package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.util.Args;

public class UriPatternMatcher
{
  private final Map map;
  
  public UriPatternMatcher()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.map = localHashMap;
  }
  
  public Map getObjects()
  {
    try
    {
      Map localMap = this.map;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Object lookup(String paramString)
  {
    Object localObject1 = "Request path";
    for (;;)
    {
      Object localObject4;
      try
      {
        Args.notNull(paramString, (String)localObject1);
        localObject1 = this.map;
        localObject4 = ((Map)localObject1).get(paramString);
        if (localObject4 == null)
        {
          localObject5 = null;
          localObject1 = this.map;
          localObject1 = ((Map)localObject1).keySet();
          Iterator localIterator = ((Set)localObject1).iterator();
          boolean bool1 = localIterator.hasNext();
          if (bool1)
          {
            localObject1 = localIterator.next();
            localObject1 = (String)localObject1;
            boolean bool2 = matchUriRequestPattern((String)localObject1, paramString);
            if (!bool2) {
              break label187;
            }
            if (localObject5 != null)
            {
              int i = ((String)localObject5).length();
              int j = ((String)localObject1).length();
              if (i >= j)
              {
                i = ((String)localObject5).length();
                j = ((String)localObject1).length();
                if (i != j) {
                  break label187;
                }
                String str = "*";
                boolean bool3 = ((String)localObject1).endsWith(str);
                if (!bool3) {
                  break label187;
                }
              }
            }
            localObject5 = this.map;
            localObject5 = ((Map)localObject5).get(localObject1);
            localObject4 = localObject5;
            localObject5 = localObject1;
            continue;
          }
        }
        return localObject4;
      }
      finally {}
      label187:
      Object localObject3 = localObject5;
      Object localObject5 = localObject4;
    }
  }
  
  protected boolean matchUriRequestPattern(String paramString1, String paramString2)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    String str = "*";
    boolean bool1 = paramString1.equals(str);
    if (bool1) {}
    for (;;)
    {
      return j;
      str = "*";
      bool1 = paramString1.endsWith(str);
      boolean bool2;
      if (bool1)
      {
        int k = paramString1.length() + -1;
        str = paramString1.substring(0, k);
        bool2 = paramString2.startsWith(str);
        if (bool2) {}
      }
      else
      {
        str = "*";
        bool2 = paramString1.startsWith(str);
        if (!bool2) {
          break label132;
        }
        int m = paramString1.length();
        str = paramString1.substring(j, m);
        boolean bool3 = paramString2.endsWith(str);
        if (!bool3) {
          break label132;
        }
      }
      i = j;
      f1 = f2;
      label132:
      j = i;
      f2 = f1;
    }
  }
  
  public void register(String paramString, Object paramObject)
  {
    Object localObject1 = "URI request pattern";
    try
    {
      Args.notNull(paramString, (String)localObject1);
      localObject1 = this.map;
      ((Map)localObject1).put(paramString, paramObject);
      return;
    }
    finally {}
  }
  
  public void setHandlers(Map paramMap)
  {
    Object localObject1 = "Map of handlers";
    try
    {
      Args.notNull(paramMap, (String)localObject1);
      localObject1 = this.map;
      ((Map)localObject1).clear();
      localObject1 = this.map;
      ((Map)localObject1).putAll(paramMap);
      return;
    }
    finally {}
  }
  
  public void setObjects(Map paramMap)
  {
    Object localObject1 = "Map of handlers";
    try
    {
      Args.notNull(paramMap, (String)localObject1);
      localObject1 = this.map;
      ((Map)localObject1).clear();
      localObject1 = this.map;
      ((Map)localObject1).putAll(paramMap);
      return;
    }
    finally {}
  }
  
  public String toString()
  {
    return this.map.toString();
  }
  
  public void unregister(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      try
      {
        Map localMap = this.map;
        localMap.remove(paramString);
      }
      finally {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\UriPatternMatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */