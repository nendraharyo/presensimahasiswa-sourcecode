package org.apache.http;

public abstract interface HttpServerConnection
  extends HttpConnection
{
  public abstract void flush();
  
  public abstract void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest);
  
  public abstract HttpRequest receiveRequestHeader();
  
  public abstract void sendResponseEntity(HttpResponse paramHttpResponse);
  
  public abstract void sendResponseHeader(HttpResponse paramHttpResponse);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HttpServerConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */