package io.fabric.sdk.android.services.network;

public enum HttpMethod
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new io/fabric/sdk/android/services/network/HttpMethod;
    ((HttpMethod)localObject).<init>("GET", 0);
    GET = (HttpMethod)localObject;
    localObject = new io/fabric/sdk/android/services/network/HttpMethod;
    ((HttpMethod)localObject).<init>("POST", k);
    POST = (HttpMethod)localObject;
    localObject = new io/fabric/sdk/android/services/network/HttpMethod;
    ((HttpMethod)localObject).<init>("PUT", j);
    PUT = (HttpMethod)localObject;
    localObject = new io/fabric/sdk/android/services/network/HttpMethod;
    ((HttpMethod)localObject).<init>("DELETE", i);
    DELETE = (HttpMethod)localObject;
    localObject = new HttpMethod[4];
    HttpMethod localHttpMethod = GET;
    localObject[0] = localHttpMethod;
    localHttpMethod = POST;
    localObject[k] = localHttpMethod;
    localHttpMethod = PUT;
    localObject[j] = localHttpMethod;
    localHttpMethod = DELETE;
    localObject[i] = localHttpMethod;
    $VALUES = (HttpMethod[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpMethod.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */