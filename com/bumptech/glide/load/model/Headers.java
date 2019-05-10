package com.bumptech.glide.load.model;

import java.util.Map;

public abstract interface Headers
{
  public static final Headers DEFAULT;
  public static final Headers NONE;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/model/Headers$1;
    ((Headers.1)localObject).<init>();
    NONE = (Headers)localObject;
    localObject = new com/bumptech/glide/load/model/LazyHeaders$Builder;
    ((LazyHeaders.Builder)localObject).<init>();
    DEFAULT = ((LazyHeaders.Builder)localObject).build();
  }
  
  public abstract Map getHeaders();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\Headers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */