package org.apache.http.protocol;

public class SyncBasicHttpContext
  extends BasicHttpContext
{
  public SyncBasicHttpContext() {}
  
  public SyncBasicHttpContext(HttpContext paramHttpContext)
  {
    super(paramHttpContext);
  }
  
  public void clear()
  {
    try
    {
      super.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Object getAttribute(String paramString)
  {
    try
    {
      Object localObject1 = super.getAttribute(paramString);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public Object removeAttribute(String paramString)
  {
    try
    {
      Object localObject1 = super.removeAttribute(paramString);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    try
    {
      super.setAttribute(paramString, paramObject);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\SyncBasicHttpContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */