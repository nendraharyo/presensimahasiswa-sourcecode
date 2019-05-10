package org.apache.http.entity.mime;

public enum HttpMultipartMode
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new org/apache/http/entity/mime/HttpMultipartMode;
    ((HttpMultipartMode)localObject).<init>("STRICT", 0);
    STRICT = (HttpMultipartMode)localObject;
    localObject = new org/apache/http/entity/mime/HttpMultipartMode;
    ((HttpMultipartMode)localObject).<init>("BROWSER_COMPATIBLE", j);
    BROWSER_COMPATIBLE = (HttpMultipartMode)localObject;
    localObject = new org/apache/http/entity/mime/HttpMultipartMode;
    ((HttpMultipartMode)localObject).<init>("RFC6532", i);
    RFC6532 = (HttpMultipartMode)localObject;
    localObject = new HttpMultipartMode[3];
    HttpMultipartMode localHttpMultipartMode = STRICT;
    localObject[0] = localHttpMultipartMode;
    localHttpMultipartMode = BROWSER_COMPATIBLE;
    localObject[j] = localHttpMultipartMode;
    localHttpMultipartMode = RFC6532;
    localObject[i] = localHttpMultipartMode;
    $VALUES = (HttpMultipartMode[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\HttpMultipartMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */