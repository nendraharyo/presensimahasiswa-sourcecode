package org.apache.http;

public abstract interface HttpClientConnection
  extends HttpConnection
{
  public abstract void flush();
  
  public abstract boolean isResponseAvailable(int paramInt);
  
  public abstract void receiveResponseEntity(HttpResponse paramHttpResponse);
  
  public abstract HttpResponse receiveResponseHeader();
  
  public abstract void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest);
  
  public abstract void sendRequestHeader(HttpRequest paramHttpRequest);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */