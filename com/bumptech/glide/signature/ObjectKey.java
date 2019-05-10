package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class ObjectKey
  implements Key
{
  private final Object object;
  
  public ObjectKey(Object paramObject)
  {
    Object localObject = Preconditions.checkNotNull(paramObject);
    this.object = localObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof ObjectKey;
    Object localObject1;
    if (bool)
    {
      paramObject = (ObjectKey)paramObject;
      localObject1 = this.object;
      Object localObject2 = ((ObjectKey)paramObject).object;
      bool = localObject1.equals(localObject2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public int hashCode()
  {
    return this.object.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ObjectKey{object=");
    Object localObject = this.object;
    return localObject + '}';
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    Object localObject = this.object.toString();
    Charset localCharset = CHARSET;
    localObject = ((String)localObject).getBytes(localCharset);
    paramMessageDigest.update((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\signature\ObjectKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */