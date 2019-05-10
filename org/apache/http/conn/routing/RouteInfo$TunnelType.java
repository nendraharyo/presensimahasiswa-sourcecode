package org.apache.http.conn.routing;

public enum RouteInfo$TunnelType
{
  static
  {
    int i = 1;
    Object localObject = new org/apache/http/conn/routing/RouteInfo$TunnelType;
    ((TunnelType)localObject).<init>("PLAIN", 0);
    PLAIN = (TunnelType)localObject;
    localObject = new org/apache/http/conn/routing/RouteInfo$TunnelType;
    ((TunnelType)localObject).<init>("TUNNELLED", i);
    TUNNELLED = (TunnelType)localObject;
    localObject = new TunnelType[2];
    TunnelType localTunnelType = PLAIN;
    localObject[0] = localTunnelType;
    localTunnelType = TUNNELLED;
    localObject[i] = localTunnelType;
    $VALUES = (TunnelType[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\routing\RouteInfo$TunnelType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */