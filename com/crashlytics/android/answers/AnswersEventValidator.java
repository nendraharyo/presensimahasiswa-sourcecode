package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.Map;

class AnswersEventValidator
{
  boolean failFast;
  final int maxNumAttributes;
  final int maxStringLength;
  
  public AnswersEventValidator(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.maxNumAttributes = paramInt1;
    this.maxStringLength = paramInt2;
    this.failFast = paramBoolean;
  }
  
  private void logOrThrowException(RuntimeException paramRuntimeException)
  {
    boolean bool = this.failFast;
    if (bool) {
      throw paramRuntimeException;
    }
    Fabric.getLogger().e("Answers", "Invalid user input detected", paramRuntimeException);
  }
  
  public boolean isFullMap(Map paramMap, String paramString)
  {
    boolean bool1 = true;
    String str1 = null;
    int i = paramMap.size();
    int j = this.maxNumAttributes;
    if (i >= j)
    {
      boolean bool2 = paramMap.containsKey(paramString);
      if (!bool2)
      {
        Object localObject = Locale.US;
        String str2 = "Limit of %d attributes reached, skipping attribute";
        Object[] arrayOfObject = new Object[bool1];
        int k = this.maxNumAttributes;
        Integer localInteger = Integer.valueOf(k);
        arrayOfObject[0] = localInteger;
        str1 = String.format((Locale)localObject, str2, arrayOfObject);
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>(str1);
        logOrThrowException((RuntimeException)localObject);
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  public boolean isNull(Object paramObject, String paramString)
  {
    NullPointerException localNullPointerException;
    boolean bool;
    if (paramObject == null)
    {
      localNullPointerException = new java/lang/NullPointerException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      String str = " must not be null";
      localObject = str;
      localNullPointerException.<init>((String)localObject);
      logOrThrowException(localNullPointerException);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localNullPointerException = null;
    }
  }
  
  public String limitStringLength(String paramString)
  {
    int i = paramString.length();
    int j = this.maxStringLength;
    if (i > j)
    {
      Object localObject = Locale.US;
      int k = 1;
      Object[] arrayOfObject = new Object[k];
      int m = this.maxStringLength;
      Integer localInteger = Integer.valueOf(m);
      arrayOfObject[0] = localInteger;
      localObject = String.format((Locale)localObject, "String is too long, truncating to %d characters", arrayOfObject);
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>((String)localObject);
      logOrThrowException(localIllegalArgumentException);
      i = this.maxStringLength;
      paramString = paramString.substring(0, i);
    }
    return paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersEventValidator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */