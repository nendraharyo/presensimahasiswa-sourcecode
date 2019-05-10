package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonPrimitive
  extends JsonElement
{
  private static final Class[] PRIMITIVE_TYPES;
  private Object value;
  
  static
  {
    Class[] arrayOfClass = new Class[16];
    Class localClass = Integer.TYPE;
    arrayOfClass[0] = localClass;
    localClass = Long.TYPE;
    arrayOfClass[1] = localClass;
    localClass = Short.TYPE;
    arrayOfClass[2] = localClass;
    localClass = Float.TYPE;
    arrayOfClass[3] = localClass;
    localClass = Double.TYPE;
    arrayOfClass[4] = localClass;
    localClass = Byte.TYPE;
    arrayOfClass[5] = localClass;
    localClass = Boolean.TYPE;
    arrayOfClass[6] = localClass;
    localClass = Character.TYPE;
    arrayOfClass[7] = localClass;
    arrayOfClass[8] = Integer.class;
    arrayOfClass[9] = Long.class;
    arrayOfClass[10] = Short.class;
    arrayOfClass[11] = Float.class;
    arrayOfClass[12] = Double.class;
    arrayOfClass[13] = Byte.class;
    arrayOfClass[14] = Boolean.class;
    arrayOfClass[15] = Character.class;
    PRIMITIVE_TYPES = arrayOfClass;
  }
  
  public JsonPrimitive(Boolean paramBoolean)
  {
    setValue(paramBoolean);
  }
  
  public JsonPrimitive(Character paramCharacter)
  {
    setValue(paramCharacter);
  }
  
  public JsonPrimitive(Number paramNumber)
  {
    setValue(paramNumber);
  }
  
  JsonPrimitive(Object paramObject)
  {
    setValue(paramObject);
  }
  
  public JsonPrimitive(String paramString)
  {
    setValue(paramString);
  }
  
  private static boolean isIntegral(JsonPrimitive paramJsonPrimitive)
  {
    Object localObject = paramJsonPrimitive.value;
    boolean bool1 = localObject instanceof Number;
    if (bool1)
    {
      localObject = (Number)paramJsonPrimitive.value;
      boolean bool2 = localObject instanceof BigInteger;
      if (!bool2)
      {
        bool2 = localObject instanceof Long;
        if (!bool2)
        {
          bool2 = localObject instanceof Integer;
          if (!bool2)
          {
            bool2 = localObject instanceof Short;
            if (!bool2)
            {
              bool1 = localObject instanceof Byte;
              if (!bool1) {
                break label71;
              }
            }
          }
        }
      }
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      label71:
      bool1 = false;
      localObject = null;
      continue;
      bool1 = false;
      localObject = null;
    }
  }
  
  private static boolean isPrimitiveOrString(Object paramObject)
  {
    boolean bool1 = true;
    int i = paramObject instanceof String;
    if (i != 0) {}
    for (;;)
    {
      return bool1;
      Class localClass1 = paramObject.getClass();
      Class[] arrayOfClass = PRIMITIVE_TYPES;
      int k = arrayOfClass.length;
      i = 0;
      for (;;)
      {
        if (i >= k) {
          break label62;
        }
        Class localClass2 = arrayOfClass[i];
        boolean bool2 = localClass2.isAssignableFrom(localClass1);
        if (bool2) {
          break;
        }
        int j;
        i += 1;
      }
      label62:
      bool1 = false;
    }
  }
  
  JsonPrimitive deepCopy()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    Object localObject1 = null;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      Object localObject3;
      if (paramObject != null)
      {
        localObject2 = getClass();
        Class localClass = paramObject.getClass();
        if (localObject2 == localClass) {}
      }
      else
      {
        bool1 = false;
        localObject3 = null;
        f1 = 0.0F;
        continue;
      }
      paramObject = (JsonPrimitive)paramObject;
      Object localObject2 = this.value;
      if (localObject2 == null)
      {
        localObject2 = ((JsonPrimitive)paramObject).value;
        if (localObject2 != null)
        {
          bool1 = false;
          localObject3 = null;
          f1 = 0.0F;
        }
      }
      else
      {
        boolean bool3 = isIntegral(this);
        Number localNumber;
        if (bool3)
        {
          bool3 = isIntegral((JsonPrimitive)paramObject);
          if (bool3)
          {
            localObject2 = getAsNumber();
            long l1 = ((Number)localObject2).longValue();
            localNumber = ((JsonPrimitive)paramObject).getAsNumber();
            long l2 = localNumber.longValue();
            bool3 = l1 < l2;
            if (!bool3) {
              continue;
            }
            bool1 = false;
            localObject3 = null;
            f1 = 0.0F;
            continue;
          }
        }
        localObject2 = this.value;
        bool3 = localObject2 instanceof Number;
        if (bool3)
        {
          localObject2 = ((JsonPrimitive)paramObject).value;
          bool3 = localObject2 instanceof Number;
          if (bool3)
          {
            localObject2 = getAsNumber();
            double d1 = ((Number)localObject2).doubleValue();
            localNumber = ((JsonPrimitive)paramObject).getAsNumber();
            double d2 = localNumber.doubleValue();
            boolean bool4 = d1 < d2;
            if (bool4)
            {
              bool3 = Double.isNaN(d1);
              if (bool3)
              {
                bool3 = Double.isNaN(d2);
                if (!bool3) {}
              }
            }
            else
            {
              bool2 = bool1;
              f2 = f1;
            }
            bool1 = bool2;
            f1 = f2;
            continue;
          }
        }
        localObject3 = this.value;
        localObject1 = ((JsonPrimitive)paramObject).value;
        bool1 = localObject3.equals(localObject1);
      }
    }
  }
  
  public BigDecimal getAsBigDecimal()
  {
    Object localObject = this.value;
    boolean bool = localObject instanceof BigDecimal;
    if (bool) {
      localObject = (BigDecimal)this.value;
    }
    for (;;)
    {
      return (BigDecimal)localObject;
      localObject = new java/math/BigDecimal;
      String str = this.value.toString();
      ((BigDecimal)localObject).<init>(str);
    }
  }
  
  public BigInteger getAsBigInteger()
  {
    Object localObject = this.value;
    boolean bool = localObject instanceof BigInteger;
    if (bool) {
      localObject = (BigInteger)this.value;
    }
    for (;;)
    {
      return (BigInteger)localObject;
      localObject = new java/math/BigInteger;
      String str = this.value.toString();
      ((BigInteger)localObject).<init>(str);
    }
  }
  
  public boolean getAsBoolean()
  {
    boolean bool = isBoolean();
    Object localObject;
    if (bool) {
      localObject = getAsBooleanWrapper();
    }
    for (bool = ((Boolean)localObject).booleanValue();; bool = Boolean.parseBoolean((String)localObject))
    {
      return bool;
      localObject = getAsString();
    }
  }
  
  Boolean getAsBooleanWrapper()
  {
    return (Boolean)this.value;
  }
  
  public byte getAsByte()
  {
    boolean bool = isNumber();
    Object localObject;
    if (bool) {
      localObject = getAsNumber();
    }
    for (byte b = ((Number)localObject).byteValue();; b = Byte.parseByte((String)localObject))
    {
      return b;
      localObject = getAsString();
    }
  }
  
  public char getAsCharacter()
  {
    return getAsString().charAt(0);
  }
  
  public double getAsDouble()
  {
    boolean bool = isNumber();
    Object localObject;
    if (bool) {
      localObject = getAsNumber();
    }
    for (double d = ((Number)localObject).doubleValue();; d = Double.parseDouble((String)localObject))
    {
      return d;
      localObject = getAsString();
    }
  }
  
  public float getAsFloat()
  {
    boolean bool = isNumber();
    Object localObject;
    if (bool) {
      localObject = getAsNumber();
    }
    for (float f = ((Number)localObject).floatValue();; f = Float.parseFloat((String)localObject))
    {
      return f;
      localObject = getAsString();
    }
  }
  
  public int getAsInt()
  {
    boolean bool = isNumber();
    Object localObject;
    if (bool) {
      localObject = getAsNumber();
    }
    for (int i = ((Number)localObject).intValue();; i = Integer.parseInt((String)localObject))
    {
      return i;
      localObject = getAsString();
    }
  }
  
  public long getAsLong()
  {
    boolean bool = isNumber();
    Object localObject;
    if (bool) {
      localObject = getAsNumber();
    }
    for (long l = ((Number)localObject).longValue();; l = Long.parseLong((String)localObject))
    {
      return l;
      localObject = getAsString();
    }
  }
  
  public Number getAsNumber()
  {
    Object localObject = this.value;
    boolean bool = localObject instanceof String;
    LazilyParsedNumber localLazilyParsedNumber;
    if (bool)
    {
      localLazilyParsedNumber = new com/google/gson/internal/LazilyParsedNumber;
      localObject = (String)this.value;
      localLazilyParsedNumber.<init>((String)localObject);
    }
    for (localObject = localLazilyParsedNumber;; localObject = (Number)this.value) {
      return (Number)localObject;
    }
  }
  
  public short getAsShort()
  {
    boolean bool = isNumber();
    Object localObject;
    if (bool) {
      localObject = getAsNumber();
    }
    for (short s = ((Number)localObject).shortValue();; s = Short.parseShort((String)localObject))
    {
      return s;
      localObject = getAsString();
    }
  }
  
  public String getAsString()
  {
    boolean bool = isNumber();
    String str;
    if (bool) {
      str = getAsNumber().toString();
    }
    for (;;)
    {
      return str;
      bool = isBoolean();
      if (bool) {
        str = getAsBooleanWrapper().toString();
      } else {
        str = (String)this.value;
      }
    }
  }
  
  public int hashCode()
  {
    int i = 32;
    Object localObject = this.value;
    int j;
    if (localObject == null) {
      j = 31;
    }
    for (;;)
    {
      return j;
      boolean bool1 = isIntegral(this);
      long l1;
      long l2;
      if (bool1)
      {
        localObject = getAsNumber();
        l1 = ((Number)localObject).longValue();
        l2 = l1 >>> i;
        l1 ^= l2;
        int k = (int)l1;
      }
      else
      {
        localObject = this.value;
        boolean bool2 = localObject instanceof Number;
        int m;
        if (bool2)
        {
          localObject = getAsNumber();
          double d = ((Number)localObject).doubleValue();
          l1 = Double.doubleToLongBits(d);
          l2 = l1 >>> i;
          l1 ^= l2;
          m = (int)l1;
        }
        else
        {
          localObject = this.value;
          m = localObject.hashCode();
        }
      }
    }
  }
  
  public boolean isBoolean()
  {
    return this.value instanceof Boolean;
  }
  
  public boolean isNumber()
  {
    return this.value instanceof Number;
  }
  
  public boolean isString()
  {
    return this.value instanceof String;
  }
  
  void setValue(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Character;
    String str;
    if (bool1)
    {
      paramObject = (Character)paramObject;
      char c = ((Character)paramObject).charValue();
      str = String.valueOf(c);
      this.value = str;
      return;
    }
    boolean bool2 = paramObject instanceof Number;
    if (!bool2)
    {
      bool2 = isPrimitiveOrString(paramObject);
      if (!bool2) {}
    }
    else
    {
      bool2 = true;
    }
    for (;;)
    {
      .Gson.Preconditions.checkArgument(bool2);
      this.value = paramObject;
      break;
      bool2 = false;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\JsonPrimitive.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */