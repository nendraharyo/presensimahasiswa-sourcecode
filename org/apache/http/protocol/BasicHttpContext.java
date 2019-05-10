package org.apache.http.protocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.Args;

public class BasicHttpContext
  implements HttpContext
{
  private final Map map;
  private final HttpContext parentContext;
  
  public BasicHttpContext()
  {
    this(null);
  }
  
  public BasicHttpContext(HttpContext paramHttpContext)
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.map = localConcurrentHashMap;
    this.parentContext = paramHttpContext;
  }
  
  public void clear()
  {
    this.map.clear();
  }
  
  public Object getAttribute(String paramString)
  {
    Args.notNull(paramString, "Id");
    Object localObject = this.map.get(paramString);
    if (localObject == null)
    {
      HttpContext localHttpContext = this.parentContext;
      if (localHttpContext != null) {
        localObject = this.parentContext.getAttribute(paramString);
      }
    }
    return localObject;
  }
  
  public Object removeAttribute(String paramString)
  {
    Args.notNull(paramString, "Id");
    return this.map.remove(paramString);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    Object localObject = "Id";
    Args.notNull(paramString, (String)localObject);
    if (paramObject != null)
    {
      localObject = this.map;
      ((Map)localObject).put(paramString, paramObject);
    }
    for (;;)
    {
      return;
      localObject = this.map;
      ((Map)localObject).remove(paramString);
    }
  }
  
  public String toString()
  {
    return this.map.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\BasicHttpContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */