package com.loopj.android.http;

class Utils
{
  public static void asserts(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(paramString);
      throw localAssertionError;
    }
  }
  
  public static Object notNull(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString + " should not be null!";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    return paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\Utils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */