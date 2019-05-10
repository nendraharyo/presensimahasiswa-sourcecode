package org.apache.http.client.utils;

import java.lang.ref.SoftReference;
import java.util.HashMap;

final class DateUtils$DateFormatHolder$1
  extends ThreadLocal
{
  protected SoftReference initialValue()
  {
    SoftReference localSoftReference = new java/lang/ref/SoftReference;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localSoftReference.<init>(localHashMap);
    return localSoftReference;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\DateUtils$DateFormatHolder$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */