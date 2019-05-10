package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import java.util.Map;

class EngineKey
  implements Key
{
  private int hashCode;
  private final int height;
  private final Object model;
  private final Options options;
  private final Class resourceClass;
  private final Key signature;
  private final Class transcodeClass;
  private final Map transformations;
  private final int width;
  
  EngineKey(Object paramObject, Key paramKey, int paramInt1, int paramInt2, Map paramMap, Class paramClass1, Class paramClass2, Options paramOptions)
  {
    Object localObject = Preconditions.checkNotNull(paramObject);
    this.model = localObject;
    localObject = (Key)Preconditions.checkNotNull(paramKey, "Signature must not be null");
    this.signature = ((Key)localObject);
    this.width = paramInt1;
    this.height = paramInt2;
    localObject = (Map)Preconditions.checkNotNull(paramMap);
    this.transformations = ((Map)localObject);
    localObject = (Class)Preconditions.checkNotNull(paramClass1, "Resource class must not be null");
    this.resourceClass = ((Class)localObject);
    localObject = (Class)Preconditions.checkNotNull(paramClass2, "Transcode class must not be null");
    this.transcodeClass = ((Class)localObject);
    localObject = (Options)Preconditions.checkNotNull(paramOptions);
    this.options = ((Options)localObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof EngineKey;
    if (bool2)
    {
      paramObject = (EngineKey)paramObject;
      Object localObject1 = this.model;
      Object localObject2 = ((EngineKey)paramObject).model;
      bool2 = localObject1.equals(localObject2);
      if (bool2)
      {
        localObject1 = this.signature;
        localObject2 = ((EngineKey)paramObject).signature;
        bool2 = ((Key)localObject1).equals(localObject2);
        if (bool2)
        {
          int i = this.height;
          int j = ((EngineKey)paramObject).height;
          if (i == j)
          {
            i = this.width;
            j = ((EngineKey)paramObject).width;
            if (i == j)
            {
              localObject1 = this.transformations;
              localObject2 = ((EngineKey)paramObject).transformations;
              boolean bool3 = ((Map)localObject1).equals(localObject2);
              if (bool3)
              {
                localObject1 = this.resourceClass;
                localObject2 = ((EngineKey)paramObject).resourceClass;
                bool3 = localObject1.equals(localObject2);
                if (bool3)
                {
                  localObject1 = this.transcodeClass;
                  localObject2 = ((EngineKey)paramObject).transcodeClass;
                  bool3 = localObject1.equals(localObject2);
                  if (bool3)
                  {
                    localObject1 = this.options;
                    localObject2 = ((EngineKey)paramObject).options;
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
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = this.hashCode;
    if (i == 0)
    {
      Object localObject = this.model;
      i = localObject.hashCode();
      this.hashCode = i;
      i = this.hashCode * 31;
      int j = this.signature.hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 31;
      j = this.width;
      i += j;
      this.hashCode = i;
      i = this.hashCode * 31;
      j = this.height;
      i += j;
      this.hashCode = i;
      i = this.hashCode * 31;
      j = this.transformations.hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 31;
      j = this.resourceClass.hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 31;
      j = this.transcodeClass.hashCode();
      i += j;
      this.hashCode = i;
      i = this.hashCode * 31;
      Options localOptions = this.options;
      j = localOptions.hashCode();
      i += j;
      this.hashCode = i;
    }
    return this.hashCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("EngineKey{model=");
    Object localObject = this.model;
    localStringBuilder = localStringBuilder.append(localObject).append(", width=");
    int i = this.width;
    localStringBuilder = localStringBuilder.append(i).append(", height=");
    i = this.height;
    localStringBuilder = localStringBuilder.append(i).append(", resourceClass=");
    localObject = this.resourceClass;
    localStringBuilder = localStringBuilder.append(localObject).append(", transcodeClass=");
    localObject = this.transcodeClass;
    localStringBuilder = localStringBuilder.append(localObject).append(", signature=");
    localObject = this.signature;
    localStringBuilder = localStringBuilder.append(localObject).append(", hashCode=");
    i = this.hashCode;
    localStringBuilder = localStringBuilder.append(i).append(", transformations=");
    localObject = this.transformations;
    localStringBuilder = localStringBuilder.append(localObject).append(", options=");
    localObject = this.options;
    return localObject + '}';
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\EngineKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */