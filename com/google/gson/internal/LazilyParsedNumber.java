package com.google.gson.internal;

import java.math.BigDecimal;

public final class LazilyParsedNumber
  extends Number
{
  private final String value;
  
  public LazilyParsedNumber(String paramString)
  {
    this.value = paramString;
  }
  
  private Object writeReplace()
  {
    BigDecimal localBigDecimal = new java/math/BigDecimal;
    String str = this.value;
    localBigDecimal.<init>(str);
    return localBigDecimal;
  }
  
  public double doubleValue()
  {
    return Double.parseDouble(this.value);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (this == paramObject) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      boolean bool3 = paramObject instanceof LazilyParsedNumber;
      if (bool3)
      {
        paramObject = (LazilyParsedNumber)paramObject;
        String str1 = this.value;
        String str2 = ((LazilyParsedNumber)paramObject).value;
        if (str1 != str2)
        {
          str1 = this.value;
          str2 = ((LazilyParsedNumber)paramObject).value;
          bool3 = str1.equals(str2);
          if (!bool3) {}
        }
        else
        {
          bool2 = bool1;
        }
      }
    }
  }
  
  public float floatValue()
  {
    return Float.parseFloat(this.value);
  }
  
  public int hashCode()
  {
    return this.value.hashCode();
  }
  
  public int intValue()
  {
    try
    {
      String str1 = this.value;
      i = Integer.parseInt(str1);
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      for (;;)
      {
        try
        {
          String str2 = this.value;
          long l = Long.parseLong(str2);
          i = (int)l;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          BigDecimal localBigDecimal = new java/math/BigDecimal;
          String str3 = this.value;
          localBigDecimal.<init>(str3);
          int i = localBigDecimal.intValue();
        }
      }
    }
    return i;
  }
  
  public long longValue()
  {
    try
    {
      String str1 = this.value;
      l = Long.parseLong(str1);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        BigDecimal localBigDecimal = new java/math/BigDecimal;
        String str2 = this.value;
        localBigDecimal.<init>(str2);
        long l = localBigDecimal.longValue();
      }
    }
    return l;
  }
  
  public String toString()
  {
    return this.value;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\LazilyParsedNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */