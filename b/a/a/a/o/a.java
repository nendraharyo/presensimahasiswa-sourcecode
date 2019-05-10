package b.a.a.a.o;

import java.util.Collection;

public class a
{
  public static int a(int paramInt, String paramString)
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
  
  public static long a(long paramLong, String paramString)
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
  
  public static CharSequence a(CharSequence paramCharSequence, String paramString)
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
    boolean bool = h.a(paramCharSequence);
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
  
  public static Object a(Object paramObject, String paramString)
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
  
  public static Collection a(Collection paramCollection, String paramString)
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
  
  public static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
  }
  
  public static void a(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = String.format(paramString, paramVarArgs);
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
  }
  
  public static int b(int paramInt, String paramString)
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
  
  public static CharSequence b(CharSequence paramCharSequence, String paramString)
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
    boolean bool = h.b(paramCharSequence);
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */