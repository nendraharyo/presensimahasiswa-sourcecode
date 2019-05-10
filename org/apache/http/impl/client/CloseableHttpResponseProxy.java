package org.apache.http.impl.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

class CloseableHttpResponseProxy
  implements InvocationHandler
{
  private static final Constructor CONSTRUCTOR;
  private final HttpResponse original;
  
  static
  {
    Object localObject1 = CloseableHttpResponseProxy.class;
    try
    {
      localObject1 = ((Class)localObject1).getClassLoader();
      int i = 1;
      localObject2 = new Class[i];
      Class localClass = CloseableHttpResponse.class;
      localObject2[0] = localClass;
      localObject1 = Proxy.getProxyClass((ClassLoader)localObject1, (Class[])localObject2);
      i = 1;
      localObject2 = new Class[i];
      localClass = InvocationHandler.class;
      localObject2[0] = localClass;
      localObject1 = ((Class)localObject1).getConstructor((Class[])localObject2);
      CONSTRUCTOR = (Constructor)localObject1;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localNoSuchMethodException);
      throw ((Throwable)localObject2);
    }
  }
  
  CloseableHttpResponseProxy(HttpResponse paramHttpResponse)
  {
    this.original = paramHttpResponse;
  }
  
  public static CloseableHttpResponse newProxy(HttpResponse paramHttpResponse)
  {
    try
    {
      Object localObject1 = CONSTRUCTOR;
      int i = 1;
      localObject2 = new Object[i];
      CloseableHttpResponseProxy localCloseableHttpResponseProxy = new org/apache/http/impl/client/CloseableHttpResponseProxy;
      localCloseableHttpResponseProxy.<init>(paramHttpResponse);
      localObject2[0] = localCloseableHttpResponseProxy;
      localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      return (CloseableHttpResponse)localObject1;
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localInvocationTargetException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
  }
  
  public void close()
  {
    EntityUtils.consume(this.original.getEntity());
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Object localObject1 = paramMethod.getName();
    Object localObject2 = "close";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      close();
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      try
      {
        localObject1 = this.original;
        localObject1 = paramMethod.invoke(localObject1, paramArrayOfObject);
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localObject2 = localInvocationTargetException.getCause();
        if (localObject2 != null) {
          throw ((Throwable)localObject2);
        }
        throw localInvocationTargetException;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\CloseableHttpResponseProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */