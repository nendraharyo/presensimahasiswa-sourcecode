package org.apache.http.util;

import java.util.Collection;

public class Args
{
  public static void check(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static void check(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.format(paramString, paramVarArgs);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
  }
  
  public static CharSequence notBlank(CharSequence paramCharSequence, String paramString)
  {
    IllegalArgumentException localIllegalArgumentException;
    Object localObject;
    if (paramCharSequence == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    boolean bool = TextUtils.isBlank(paramCharSequence);
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be blank";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramCharSequence;
  }
  
  public static CharSequence notEmpty(CharSequence paramCharSequence, String paramString)
  {
    IllegalArgumentException localIllegalArgumentException;
    Object localObject;
    if (paramCharSequence == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be empty";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramCharSequence;
  }
  
  public static Collection notEmpty(Collection paramCollection, String paramString)
  {
    IllegalArgumentException localIllegalArgumentException;
    Object localObject;
    if (paramCollection == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    boolean bool = paramCollection.isEmpty();
    if (bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be empty";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramCollection;
  }
  
  public static int notNegative(int paramInt, String paramString)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be negative";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramInt;
  }
  
  public static long notNegative(long paramLong, String paramString)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be negative";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramLong;
  }
  
  public static Object notNull(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramObject;
  }
  
  public static int positive(int paramInt, String paramString)
  {
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be negative or zero";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramInt;
  }
  
  public static long positive(long paramLong, String paramString)
  {
    long l = 0L;
    boolean bool = paramLong < l;
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " may not be negative or zero";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramLong;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\Args.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */