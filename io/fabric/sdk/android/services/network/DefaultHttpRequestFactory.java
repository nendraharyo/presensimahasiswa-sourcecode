package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.DefaultLogger;
import io.fabric.sdk.android.Logger;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class DefaultHttpRequestFactory
  implements HttpRequestFactory
{
  private static final String HTTPS = "https";
  private boolean attemptedSslInit;
  private final Logger logger;
  private PinningInfoProvider pinningInfo;
  private SSLSocketFactory sslSocketFactory;
  
  public DefaultHttpRequestFactory()
  {
    this(localDefaultLogger);
  }
  
  public DefaultHttpRequestFactory(Logger paramLogger)
  {
    this.logger = paramLogger;
  }
  
  private SSLSocketFactory getSSLSocketFactory()
  {
    try
    {
      SSLSocketFactory localSSLSocketFactory = this.sslSocketFactory;
      if (localSSLSocketFactory == null)
      {
        boolean bool = this.attemptedSslInit;
        if (!bool)
        {
          localSSLSocketFactory = initSSLSocketFactory();
          this.sslSocketFactory = localSSLSocketFactory;
        }
      }
      localSSLSocketFactory = this.sslSocketFactory;
      return localSSLSocketFactory;
    }
    finally {}
  }
  
  private SSLSocketFactory initSSLSocketFactory()
  {
    boolean bool = true;
    try
    {
      this.attemptedSslInit = bool;
      try
      {
        localObject1 = this.pinningInfo;
        localObject1 = NetworkUtils.getSSLSocketFactory((PinningInfoProvider)localObject1);
        localLogger = this.logger;
        str1 = "Fabric";
        str2 = "Custom SSL pinning enabled";
        localLogger.d(str1, str2);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          Logger localLogger = this.logger;
          String str1 = "Fabric";
          String str2 = "Exception while validating pinned certs";
          localLogger.e(str1, str2, localException);
          bool = false;
          Object localObject2 = null;
        }
      }
      return (SSLSocketFactory)localObject1;
    }
    finally {}
  }
  
  private boolean isHttps(String paramString)
  {
    Object localObject;
    boolean bool;
    if (paramString != null)
    {
      localObject = Locale.US;
      localObject = paramString.toLowerCase((Locale)localObject);
      String str = "https";
      bool = ((String)localObject).startsWith(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void resetSSLSocketFactory()
  {
    Object localObject1 = null;
    try
    {
      this.attemptedSslInit = false;
      localObject1 = null;
      this.sslSocketFactory = null;
      return;
    }
    finally {}
  }
  
  public HttpRequest buildHttpRequest(HttpMethod paramHttpMethod, String paramString)
  {
    Map localMap = Collections.emptyMap();
    return buildHttpRequest(paramHttpMethod, paramString, localMap);
  }
  
  public HttpRequest buildHttpRequest(HttpMethod paramHttpMethod, String paramString, Map paramMap)
  {
    boolean bool1 = true;
    Object localObject1 = DefaultHttpRequestFactory.1.$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod;
    int i = paramHttpMethod.ordinal();
    int j = localObject1[i];
    Object localObject2;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Unsupported HTTP method!");
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = HttpRequest.get(paramString, paramMap, bool1);
      localObject2 = localObject1;
    }
    for (;;)
    {
      boolean bool2 = isHttps(paramString);
      if (bool2)
      {
        localObject1 = this.pinningInfo;
        if (localObject1 != null)
        {
          SSLSocketFactory localSSLSocketFactory = getSSLSocketFactory();
          if (localSSLSocketFactory != null)
          {
            localObject1 = (HttpsURLConnection)((HttpRequest)localObject2).getConnection();
            ((HttpsURLConnection)localObject1).setSSLSocketFactory(localSSLSocketFactory);
          }
        }
      }
      return (HttpRequest)localObject2;
      localObject1 = HttpRequest.post(paramString, paramMap, bool1);
      localObject2 = localObject1;
      continue;
      localObject1 = HttpRequest.put(paramString);
      localObject2 = localObject1;
      continue;
      localObject1 = HttpRequest.delete(paramString);
      localObject2 = localObject1;
    }
  }
  
  public PinningInfoProvider getPinningInfoProvider()
  {
    return this.pinningInfo;
  }
  
  public void setPinningInfoProvider(PinningInfoProvider paramPinningInfoProvider)
  {
    PinningInfoProvider localPinningInfoProvider = this.pinningInfo;
    if (localPinningInfoProvider != paramPinningInfoProvider)
    {
      this.pinningInfo = paramPinningInfoProvider;
      resetSSLSocketFactory();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\DefaultHttpRequestFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */