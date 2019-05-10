package io.fabric.sdk.android.services.network;

import java.util.Map;

public abstract interface HttpRequestFactory
{
  public abstract HttpRequest buildHttpRequest(HttpMethod paramHttpMethod, String paramString);
  
  public abstract HttpRequest buildHttpRequest(HttpMethod paramHttpMethod, String paramString, Map paramMap);
  
  public abstract PinningInfoProvider getPinningInfoProvider();
  
  public abstract void setPinningInfoProvider(PinningInfoProvider paramPinningInfoProvider);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequestFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */