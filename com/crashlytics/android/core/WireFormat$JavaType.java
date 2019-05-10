package com.crashlytics.android.core;

 enum WireFormat$JavaType
{
  private final Object defaultDefault;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    Object localObject2 = Integer.valueOf(0);
    ((JavaType)localObject1).<init>("INT", 0, localObject2);
    INT = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    localObject2 = Long.valueOf(0L);
    ((JavaType)localObject1).<init>("LONG", m, localObject2);
    LONG = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    localObject2 = Float.valueOf(0.0F);
    ((JavaType)localObject1).<init>("FLOAT", k, localObject2);
    FLOAT = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    localObject2 = Double.valueOf(0.0D);
    ((JavaType)localObject1).<init>("DOUBLE", j, localObject2);
    DOUBLE = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    localObject2 = Boolean.valueOf(false);
    ((JavaType)localObject1).<init>("BOOLEAN", i, localObject2);
    BOOLEAN = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    ((JavaType)localObject1).<init>("STRING", 5, "");
    STRING = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    ByteString localByteString = ByteString.EMPTY;
    ((JavaType)localObject1).<init>("BYTE_STRING", 6, localByteString);
    BYTE_STRING = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    ((JavaType)localObject1).<init>("ENUM", 7, null);
    ENUM = (JavaType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$JavaType;
    ((JavaType)localObject1).<init>("MESSAGE", 8, null);
    MESSAGE = (JavaType)localObject1;
    localObject1 = new JavaType[9];
    JavaType localJavaType = INT;
    localObject1[0] = localJavaType;
    localJavaType = LONG;
    localObject1[m] = localJavaType;
    localJavaType = FLOAT;
    localObject1[k] = localJavaType;
    localJavaType = DOUBLE;
    localObject1[j] = localJavaType;
    localJavaType = BOOLEAN;
    localObject1[i] = localJavaType;
    localObject2 = STRING;
    localObject1[5] = localObject2;
    localObject2 = BYTE_STRING;
    localObject1[6] = localObject2;
    localObject2 = ENUM;
    localObject1[7] = localObject2;
    localObject2 = MESSAGE;
    localObject1[8] = localObject2;
    $VALUES = (JavaType[])localObject1;
  }
  
  private WireFormat$JavaType(Object paramObject)
  {
    this.defaultDefault = paramObject;
  }
  
  Object getDefaultDefault()
  {
    return this.defaultDefault;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\WireFormat$JavaType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */