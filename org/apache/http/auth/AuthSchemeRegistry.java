package org.apache.http.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.config.Lookup;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public final class AuthSchemeRegistry
  implements Lookup
{
  private final ConcurrentHashMap registeredSchemes;
  
  public AuthSchemeRegistry()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.registeredSchemes = localConcurrentHashMap;
  }
  
  public AuthScheme getAuthScheme(String paramString, HttpParams paramHttpParams)
  {
    Args.notNull(paramString, "Name");
    Object localObject1 = this.registeredSchemes;
    Object localObject2 = Locale.ENGLISH;
    localObject2 = paramString.toLowerCase((Locale)localObject2);
    localObject1 = (AuthSchemeFactory)((ConcurrentHashMap)localObject1).get(localObject2);
    if (localObject1 != null) {
      return ((AuthSchemeFactory)localObject1).newInstance(paramHttpParams);
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unsupported authentication scheme: " + paramString;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public List getSchemeNames()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    Set localSet = this.registeredSchemes.keySet();
    localArrayList.<init>(localSet);
    return localArrayList;
  }
  
  public AuthSchemeProvider lookup(String paramString)
  {
    AuthSchemeRegistry.1 local1 = new org/apache/http/auth/AuthSchemeRegistry$1;
    local1.<init>(this, paramString);
    return local1;
  }
  
  public void register(String paramString, AuthSchemeFactory paramAuthSchemeFactory)
  {
    Args.notNull(paramString, "Name");
    Args.notNull(paramAuthSchemeFactory, "Authentication scheme factory");
    ConcurrentHashMap localConcurrentHashMap = this.registeredSchemes;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localConcurrentHashMap.put(localObject, paramAuthSchemeFactory);
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
  
  public void unregister(String paramString)
  {
    Args.notNull(paramString, "Name");
    ConcurrentHashMap localConcurrentHashMap = this.registeredSchemes;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localConcurrentHashMap.remove(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthSchemeRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */