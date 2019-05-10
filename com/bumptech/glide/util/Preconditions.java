package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;

public final class Preconditions
{
  public static void checkArgument(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static String checkNotEmpty(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must not be null or empty");
      throw localIllegalArgumentException;
    }
    return paramString;
  }
  
  public static Collection checkNotEmpty(Collection paramCollection)
  {
    boolean bool = paramCollection.isEmpty();
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must not be empty.");
      throw localIllegalArgumentException;
    }
    return paramCollection;
  }
  
  public static Object checkNotNull(Object paramObject)
  {
    return checkNotNull(paramObject, "Argument must not be null");
  }
  
  public static Object checkNotNull(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      NullPointerException localNullPointerException = new java/lang/NullPointerException;
      localNullPointerException.<init>(paramString);
      throw localNullPointerException;
    }
    return paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\Preconditions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */