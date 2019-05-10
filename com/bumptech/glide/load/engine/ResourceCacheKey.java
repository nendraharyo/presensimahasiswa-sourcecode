package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

final class ResourceCacheKey
  implements Key
{
  private static final LruCache RESOURCE_CLASS_BYTES;
  private final ArrayPool arrayPool;
  private final Class decodedResourceClass;
  private final int height;
  private final Options options;
  private final Key signature;
  private final Key sourceKey;
  private final Transformation transformation;
  private final int width;
  
  static
  {
    LruCache localLruCache = new com/bumptech/glide/util/LruCache;
    localLruCache.<init>(50);
    RESOURCE_CLASS_BYTES = localLruCache;
  }
  
  ResourceCacheKey(ArrayPool paramArrayPool, Key paramKey1, Key paramKey2, int paramInt1, int paramInt2, Transformation paramTransformation, Class paramClass, Options paramOptions)
  {
    this.arrayPool = paramArrayPool;
    this.sourceKey = paramKey1;
    this.signature = paramKey2;
    this.width = paramInt1;
    this.height = paramInt2;
    this.transformation = paramTransformation;
    this.decodedResourceClass = paramClass;
    this.options = paramOptions;
  }
  
  private byte[] getResourceClassBytes()
  {
    Object localObject1 = RESOURCE_CLASS_BYTES;
    Object localObject2 = this.decodedResourceClass;
    localObject1 = (byte[])((LruCache)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = this.decodedResourceClass.getName();
      localObject2 = CHARSET;
      localObject1 = ((String)localObject1).getBytes((Charset)localObject2);
      localObject2 = RESOURCE_CLASS_BYTES;
      Class localClass = this.decodedResourceClass;
      ((LruCache)localObject2).put(localClass, localObject1);
    }
    return (byte[])localObject1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof ResourceCacheKey;
    if (bool2)
    {
      paramObject = (ResourceCacheKey)paramObject;
      int i = this.height;
      int j = ((ResourceCacheKey)paramObject).height;
      if (i == j)
      {
        i = this.width;
        j = ((ResourceCacheKey)paramObject).width;
        if (i == j)
        {
          Object localObject1 = this.transformation;
          Object localObject2 = ((ResourceCacheKey)paramObject).transformation;
          boolean bool3 = Util.bothNullOrEqual(localObject1, localObject2);
          if (bool3)
          {
            localObject1 = this.decodedResourceClass;
            localObject2 = ((ResourceCacheKey)paramObject).decodedResourceClass;
            bool3 = localObject1.equals(localObject2);
            if (bool3)
            {
              localObject1 = this.sourceKey;
              localObject2 = ((ResourceCacheKey)paramObject).sourceKey;
              bool3 = ((Key)localObject1).equals(localObject2);
              if (bool3)
              {
                localObject1 = this.signature;
                localObject2 = ((ResourceCacheKey)paramObject).signature;
                bool3 = ((Key)localObject1).equals(localObject2);
                if (bool3)
                {
                  localObject1 = this.options;
                  localObject2 = ((ResourceCacheKey)paramObject).options;
                  bool3 = ((Options)localObject1).equals(localObject2);
                  if (bool3) {
                    bool1 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    Key localKey = this.sourceKey;
    int i = localKey.hashCode() * 31;
    int j = this.signature.hashCode();
    i = (i + j) * 31;
    j = this.width;
    i = (i + j) * 31;
    j = this.height;
    i += j;
    Transformation localTransformation = this.transformation;
    if (localTransformation != null)
    {
      i *= 31;
      localTransformation = this.transformation;
      j = localTransformation.hashCode();
      i += j;
    }
    i *= 31;
    j = this.decodedResourceClass.hashCode();
    i = (i + j) * 31;
    j = this.options.hashCode();
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ResourceCacheKey{sourceKey=");
    Object localObject = this.sourceKey;
    localStringBuilder = localStringBuilder.append(localObject).append(", signature=");
    localObject = this.signature;
    localStringBuilder = localStringBuilder.append(localObject).append(", width=");
    int i = this.width;
    localStringBuilder = localStringBuilder.append(i).append(", height=");
    i = this.height;
    localStringBuilder = localStringBuilder.append(i).append(", decodedResourceClass=");
    localObject = this.decodedResourceClass;
    localStringBuilder = localStringBuilder.append(localObject).append(", transformation='");
    localObject = this.transformation;
    localStringBuilder = localStringBuilder.append(localObject).append('\'').append(", options=");
    localObject = this.options;
    return localObject + '}';
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    Object localObject1 = this.arrayPool;
    int i = 8;
    Class localClass = byte[].class;
    localObject1 = (byte[])((ArrayPool)localObject1).getExact(i, localClass);
    Object localObject2 = ByteBuffer.wrap((byte[])localObject1);
    int j = this.width;
    localObject2 = ((ByteBuffer)localObject2).putInt(j);
    j = this.height;
    ((ByteBuffer)localObject2).putInt(j).array();
    this.signature.updateDiskCacheKey(paramMessageDigest);
    this.sourceKey.updateDiskCacheKey(paramMessageDigest);
    paramMessageDigest.update((byte[])localObject1);
    localObject2 = this.transformation;
    if (localObject2 != null)
    {
      localObject2 = this.transformation;
      ((Transformation)localObject2).updateDiskCacheKey(paramMessageDigest);
    }
    this.options.updateDiskCacheKey(paramMessageDigest);
    localObject2 = getResourceClassBytes();
    paramMessageDigest.update((byte[])localObject2);
    this.arrayPool.put(localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ResourceCacheKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */