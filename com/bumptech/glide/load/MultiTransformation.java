package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MultiTransformation
  implements Transformation
{
  private final Collection transformations;
  
  public MultiTransformation(Collection paramCollection)
  {
    boolean bool = paramCollection.isEmpty();
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("MultiTransformation must contain at least one Transformation");
      throw localIllegalArgumentException;
    }
    this.transformations = paramCollection;
  }
  
  public MultiTransformation(Transformation... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i == 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("MultiTransformation must contain at least one Transformation");
      throw ((Throwable)localObject);
    }
    Object localObject = Arrays.asList(paramVarArgs);
    this.transformations = ((Collection)localObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof MultiTransformation;
    Collection localCollection1;
    if (bool)
    {
      paramObject = (MultiTransformation)paramObject;
      localCollection1 = this.transformations;
      Collection localCollection2 = ((MultiTransformation)paramObject).transformations;
      bool = localCollection1.equals(localCollection2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCollection1 = null;
    }
  }
  
  public int hashCode()
  {
    return this.transformations.hashCode();
  }
  
  public Resource transform(Context paramContext, Resource paramResource, int paramInt1, int paramInt2)
  {
    Object localObject1 = this.transformations;
    Iterator localIterator = ((Collection)localObject1).iterator();
    for (Object localObject2 = paramResource;; localObject2 = localObject1)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = ((Transformation)localIterator.next()).transform(paramContext, (Resource)localObject2, paramInt1, paramInt2);
      if (localObject2 != null)
      {
        boolean bool2 = localObject2.equals(paramResource);
        if (!bool2)
        {
          bool2 = localObject2.equals(localObject1);
          if (!bool2) {
            ((Resource)localObject2).recycle();
          }
        }
      }
    }
    return (Resource)localObject2;
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    Object localObject = this.transformations;
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Transformation)localIterator.next();
      ((Transformation)localObject).updateDiskCacheKey(paramMessageDigest);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\MultiTransformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */