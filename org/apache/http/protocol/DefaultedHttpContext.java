package org.apache.http.protocol;

import org.apache.http.util.Args;

public final class DefaultedHttpContext
  implements HttpContext
{
  private final HttpContext defaults;
  private final HttpContext local;
  
  public DefaultedHttpContext(HttpContext paramHttpContext1, HttpContext paramHttpContext2)
  {
    HttpContext localHttpContext = (HttpContext)Args.notNull(paramHttpContext1, "HTTP context");
    this.local = localHttpContext;
    this.defaults = paramHttpContext2;
  }
  
  public Object getAttribute(String paramString)
  {
    Object localObject = this.local.getAttribute(paramString);
    if (localObject == null) {
      localObject = this.defaults.getAttribute(paramString);
    }
    return localObject;
  }
  
  public HttpContext getDefaults()
  {
    return this.defaults;
  }
  
  public Object removeAttribute(String paramString)
  {
    return this.local.removeAttribute(paramString);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    this.local.setAttribute(paramString, paramObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[local: ");
    HttpContext localHttpContext = this.local;
    localStringBuilder2.append(localHttpContext);
    localStringBuilder2 = localStringBuilder1.append("defaults: ");
    localHttpContext = this.defaults;
    localStringBuilder2.append(localHttpContext);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\DefaultedHttpContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */