package org.apache.http.conn.ssl;

import java.net.Socket;
import java.util.Map;

public abstract interface PrivateKeyStrategy
{
  public abstract String chooseAlias(Map paramMap, Socket paramSocket);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\PrivateKeyStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */