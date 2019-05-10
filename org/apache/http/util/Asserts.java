package org.apache.http.util;

public class Asserts
{
  public static void check(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(paramString);
      throw localIllegalStateException;
    }
  }
  
  public static void check(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (!paramBoolean)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      String str = String.format(paramString, paramVarArgs);
      localIllegalStateException.<init>(str);
      throw localIllegalStateException;
    }
  }
  
  public static void notBlank(CharSequence paramCharSequence, String paramString)
  {
    boolean bool = TextUtils.isBlank(paramCharSequence);
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " is blank";
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  public static void notEmpty(CharSequence paramCharSequence, String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " is empty";
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  public static void notNull(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " is null";
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\Asserts.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */