package org.apache.http.config;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Registry
  implements Lookup
{
  private final Map map;
  
  Registry(Map paramMap)
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>(paramMap);
    this.map = localConcurrentHashMap;
  }
  
  public Object lookup(String paramString)
  {
    if (paramString == null) {}
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = ((Map)localObject1).get(localObject2))
    {
      return localObject1;
      localObject1 = this.map;
      localObject2 = Locale.ENGLISH;
      localObject2 = paramString.toLowerCase((Locale)localObject2);
    }
  }
  
  public String toString()
  {
    return this.map.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\Registry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */