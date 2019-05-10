package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class SimpleResource
  implements Resource
{
  protected final Object data;
  
  public SimpleResource(Object paramObject)
  {
    Object localObject = Preconditions.checkNotNull(paramObject);
    this.data = localObject;
  }
  
  public final Object get()
  {
    return this.data;
  }
  
  public Class getResourceClass()
  {
    return this.data.getClass();
  }
  
  public final int getSize()
  {
    return 1;
  }
  
  public void recycle() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\SimpleResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */