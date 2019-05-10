package org.apache.http.conn.routing;

public enum RouteInfo$LayerType
{
  static
  {
    int i = 1;
    Object localObject = new org/apache/http/conn/routing/RouteInfo$LayerType;
    ((LayerType)localObject).<init>("PLAIN", 0);
    PLAIN = (LayerType)localObject;
    localObject = new org/apache/http/conn/routing/RouteInfo$LayerType;
    ((LayerType)localObject).<init>("LAYERED", i);
    LAYERED = (LayerType)localObject;
    localObject = new LayerType[2];
    LayerType localLayerType = PLAIN;
    localObject[0] = localLayerType;
    localLayerType = LAYERED;
    localObject[i] = localLayerType;
    $VALUES = (LayerType[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\routing\RouteInfo$LayerType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */