package org.apache.http.cookie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.config.Lookup;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public final class CookieSpecRegistry
  implements Lookup
{
  private final ConcurrentHashMap registeredSpecs;
  
  public CookieSpecRegistry()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.registeredSpecs = localConcurrentHashMap;
  }
  
  public CookieSpec getCookieSpec(String paramString)
  {
    return getCookieSpec(paramString, null);
  }
  
  public CookieSpec getCookieSpec(String paramString, HttpParams paramHttpParams)
  {
    Args.notNull(paramString, "Name");
    Object localObject1 = this.registeredSpecs;
    Object localObject2 = Locale.ENGLISH;
    localObject2 = paramString.toLowerCase((Locale)localObject2);
    localObject1 = (CookieSpecFactory)((ConcurrentHashMap)localObject1).get(localObject2);
    if (localObject1 != null) {
      return ((CookieSpecFactory)localObject1).newInstance(paramHttpParams);
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unsupported cookie spec: " + paramString;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public List getSpecNames()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Set localSet = this.registeredSpecs.keySet();
    localArrayList.<init>(localSet);
    return localArrayList;
  }
  
  public CookieSpecProvider lookup(String paramString)
  {
    CookieSpecRegistry.1 local1 = new org/apache/http/cookie/CookieSpecRegistry$1;
    local1.<init>(this, paramString);
    return local1;
  }
  
  public void register(String paramString, CookieSpecFactory paramCookieSpecFactory)
  {
    Args.notNull(paramString, "Name");
    Args.notNull(paramCookieSpecFactory, "Cookie spec factory");
    ConcurrentHashMap localConcurrentHashMap = this.registeredSpecs;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localConcurrentHashMap.put(localObject, paramCookieSpecFactory);
  }
  
  public void setItems(Map paramMap)
  {
    if (paramMap == null) {}
    for (;;)
    {
      return;
      this.registeredSpecs.clear();
      ConcurrentHashMap localConcurrentHashMap = this.registeredSpecs;
      localConcurrentHashMap.putAll(paramMap);
    }
  }
  
  public void unregister(String paramString)
  {
    Args.notNull(paramString, "Id");
    ConcurrentHashMap localConcurrentHashMap = this.registeredSpecs;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localConcurrentHashMap.remove(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\cookie\CookieSpecRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */