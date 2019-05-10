package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

final class DataCacheKey
  implements Key
{
  private final Key signature;
  private final Key sourceKey;
  
  DataCacheKey(Key paramKey1, Key paramKey2)
  {
    this.sourceKey = paramKey1;
    this.signature = paramKey2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof DataCacheKey;
    if (bool2)
    {
      paramObject = (DataCacheKey)paramObject;
      Key localKey1 = this.sourceKey;
      Key localKey2 = ((DataCacheKey)paramObject).sourceKey;
      bool2 = localKey1.equals(localKey2);
      if (bool2)
      {
        localKey1 = this.signature;
        localKey2 = ((DataCacheKey)paramObject).signature;
        bool2 = localKey1.equals(localKey2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  Key getSourceKey()
  {
    return this.sourceKey;
  }
  
  public int hashCode()
  {
    int i = this.sourceKey.hashCode() * 31;
    int j = this.signature.hashCode();
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("DataCacheKey{sourceKey=");
    Key localKey = this.sourceKey;
    localStringBuilder = localStringBuilder.append(localKey).append(", signature=");
    localKey = this.signature;
    return localKey + '}';
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    this.sourceKey.updateDiskCacheKey(paramMessageDigest);
    this.signature.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DataCacheKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */