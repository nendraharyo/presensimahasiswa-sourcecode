package org.apache.http.conn.scheme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;

public final class SchemeRegistry
{
  private final ConcurrentHashMap registeredSchemes;
  
  public SchemeRegistry()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.registeredSchemes = localConcurrentHashMap;
  }
  
  public final Scheme get(String paramString)
  {
    Args.notNull(paramString, "Scheme name");
    return (Scheme)this.registeredSchemes.get(paramString);
  }
  
  public final Scheme getScheme(String paramString)
  {
    Object localObject1 = get(paramString);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Scheme '" + paramString + "' not registered.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (Scheme)localObject1;
  }
  
  public final Scheme getScheme(HttpHost paramHttpHost)
  {
    Args.notNull(paramHttpHost, "Host");
    String str = paramHttpHost.getSchemeName();
    return getScheme(str);
  }
  
  public final List getSchemeNames()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Set localSet = this.registeredSchemes.keySet();
    localArrayList.<init>(localSet);
    return localArrayList;
  }
  
  public final Scheme register(Scheme paramScheme)
  {
    Args.notNull(paramScheme, "Scheme");
    ConcurrentHashMap localConcurrentHashMap = this.registeredSchemes;
    String str = paramScheme.getName();
    return (Scheme)localConcurrentHashMap.put(str, paramScheme);
  }
  
  public void setItems(Map paramMap)
  {
    if (paramMap == null) {}
    for (;;)
    {
      return;
      this.registeredSchemes.clear();
      ConcurrentHashMap localConcurrentHashMap = this.registeredSchemes;
      localConcurrentHashMap.putAll(paramMap);
    }
  }
  
  public final Scheme unregister(String paramString)
  {
    Args.notNull(paramString, "Scheme name");
    return (Scheme)this.registeredSchemes.remove(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\scheme\SchemeRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */