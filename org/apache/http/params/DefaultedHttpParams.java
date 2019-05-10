package org.apache.http.params;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.util.Args;

public final class DefaultedHttpParams
  extends AbstractHttpParams
{
  private final HttpParams defaults;
  private final HttpParams local;
  
  public DefaultedHttpParams(HttpParams paramHttpParams1, HttpParams paramHttpParams2)
  {
    HttpParams localHttpParams = (HttpParams)Args.notNull(paramHttpParams1, "Local HTTP parameters");
    this.local = localHttpParams;
    this.defaults = paramHttpParams2;
  }
  
  private Set getNames(HttpParams paramHttpParams)
  {
    boolean bool = paramHttpParams instanceof HttpParamsNames;
    if (bool) {
      return ((HttpParamsNames)paramHttpParams).getNames();
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("HttpParams instance does not implement HttpParamsNames");
    throw localUnsupportedOperationException;
  }
  
  public HttpParams copy()
  {
    HttpParams localHttpParams1 = this.local.copy();
    DefaultedHttpParams localDefaultedHttpParams = new org/apache/http/params/DefaultedHttpParams;
    HttpParams localHttpParams2 = this.defaults;
    localDefaultedHttpParams.<init>(localHttpParams1, localHttpParams2);
    return localDefaultedHttpParams;
  }
  
  public Set getDefaultNames()
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = this.defaults;
    localObject = getNames((HttpParams)localObject);
    localHashSet.<init>((Collection)localObject);
    return localHashSet;
  }
  
  public HttpParams getDefaults()
  {
    return this.defaults;
  }
  
  public Set getLocalNames()
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = this.local;
    localObject = getNames((HttpParams)localObject);
    localHashSet.<init>((Collection)localObject);
    return localHashSet;
  }
  
  public Set getNames()
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = this.defaults;
    localObject = getNames((HttpParams)localObject);
    localHashSet.<init>((Collection)localObject);
    localObject = this.local;
    localObject = getNames((HttpParams)localObject);
    localHashSet.addAll((Collection)localObject);
    return localHashSet;
  }
  
  public Object getParameter(String paramString)
  {
    Object localObject = this.local.getParameter(paramString);
    if (localObject == null)
    {
      HttpParams localHttpParams = this.defaults;
      if (localHttpParams != null) {
        localObject = this.defaults.getParameter(paramString);
      }
    }
    return localObject;
  }
  
  public boolean removeParameter(String paramString)
  {
    return this.local.removeParameter(paramString);
  }
  
  public HttpParams setParameter(String paramString, Object paramObject)
  {
    return this.local.setParameter(paramString, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\DefaultedHttpParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */