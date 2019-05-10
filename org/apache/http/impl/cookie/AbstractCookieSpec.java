package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.util.Args;

public abstract class AbstractCookieSpec
  implements CookieSpec
{
  private final Map attribHandlerMap;
  
  public AbstractCookieSpec()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(10);
    this.attribHandlerMap = localHashMap;
  }
  
  protected CookieAttributeHandler findAttribHandler(String paramString)
  {
    return (CookieAttributeHandler)this.attribHandlerMap.get(paramString);
  }
  
  protected CookieAttributeHandler getAttribHandler(String paramString)
  {
    Object localObject1 = findAttribHandler(paramString);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Handler not registered for " + paramString + " attribute.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (CookieAttributeHandler)localObject1;
  }
  
  protected Collection getAttribHandlers()
  {
    return this.attribHandlerMap.values();
  }
  
  public void registerAttribHandler(String paramString, CookieAttributeHandler paramCookieAttributeHandler)
  {
    Args.notNull(paramString, "Attribute name");
    Args.notNull(paramCookieAttributeHandler, "Attribute handler");
    this.attribHandlerMap.put(paramString, paramCookieAttributeHandler);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\AbstractCookieSpec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */