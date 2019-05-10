package org.apache.http;

import java.net.Socket;

public abstract interface HttpConnectionFactory
{
  public abstract HttpConnection createConnection(Socket paramSocket);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\HttpConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */