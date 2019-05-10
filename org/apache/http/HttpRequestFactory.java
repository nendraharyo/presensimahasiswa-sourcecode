package org.apache.http;

public abstract interface HttpRequestFactory
{
  public abstract HttpRequest newHttpRequest(String paramString1, String paramString2);
  
  public abstract HttpRequest newHttpRequest(RequestLine paramRequestLine);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HttpRequestFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */