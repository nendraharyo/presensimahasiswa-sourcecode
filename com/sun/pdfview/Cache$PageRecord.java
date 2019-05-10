package com.sun.pdfview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Cache$PageRecord
  extends Cache.Record
{
  Map images;
  
  public Cache$PageRecord(Cache paramCache)
  {
    super(paramCache);
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.images = ((Map)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\Cache$PageRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */