package com.crashlytics.android.core;

 enum WireFormat$FieldType
{
  private final WireFormat.JavaType javaType;
  private final int wireType;
  
  static
  {
    int i = 3;
    int j = 5;
    int k = 2;
    int m = 1;
    Object localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    Object localObject2 = WireFormat.JavaType.DOUBLE;
    ((FieldType)localObject1).<init>("DOUBLE", 0, (WireFormat.JavaType)localObject2, m);
    DOUBLE = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localObject2 = WireFormat.JavaType.FLOAT;
    ((FieldType)localObject1).<init>("FLOAT", m, (WireFormat.JavaType)localObject2, j);
    FLOAT = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localObject2 = WireFormat.JavaType.LONG;
    ((FieldType)localObject1).<init>("INT64", k, (WireFormat.JavaType)localObject2, 0);
    INT64 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localObject2 = WireFormat.JavaType.LONG;
    ((FieldType)localObject1).<init>("UINT64", i, (WireFormat.JavaType)localObject2, 0);
    UINT64 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    WireFormat.JavaType localJavaType = WireFormat.JavaType.INT;
    ((FieldType)localObject1).<init>("INT32", 4, localJavaType, 0);
    INT32 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localObject2 = WireFormat.JavaType.LONG;
    ((FieldType)localObject1).<init>("FIXED64", j, (WireFormat.JavaType)localObject2, m);
    FIXED64 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.INT;
    ((FieldType)localObject1).<init>("FIXED32", 6, localJavaType, j);
    FIXED32 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.BOOLEAN;
    ((FieldType)localObject1).<init>("BOOL", 7, localJavaType, 0);
    BOOL = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType$1;
    localJavaType = WireFormat.JavaType.STRING;
    ((WireFormat.FieldType.1)localObject1).<init>("STRING", 8, localJavaType, k);
    STRING = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType$2;
    localJavaType = WireFormat.JavaType.MESSAGE;
    ((WireFormat.FieldType.2)localObject1).<init>("GROUP", 9, localJavaType, i);
    GROUP = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType$3;
    localJavaType = WireFormat.JavaType.MESSAGE;
    ((WireFormat.FieldType.3)localObject1).<init>("MESSAGE", 10, localJavaType, k);
    MESSAGE = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType$4;
    localJavaType = WireFormat.JavaType.BYTE_STRING;
    ((WireFormat.FieldType.4)localObject1).<init>("BYTES", 11, localJavaType, k);
    BYTES = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.INT;
    ((FieldType)localObject1).<init>("UINT32", 12, localJavaType, 0);
    UINT32 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.ENUM;
    ((FieldType)localObject1).<init>("ENUM", 13, localJavaType, 0);
    ENUM = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.INT;
    ((FieldType)localObject1).<init>("SFIXED32", 14, localJavaType, j);
    SFIXED32 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.LONG;
    ((FieldType)localObject1).<init>("SFIXED64", 15, localJavaType, m);
    SFIXED64 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.INT;
    ((FieldType)localObject1).<init>("SINT32", 16, localJavaType, 0);
    SINT32 = (FieldType)localObject1;
    localObject1 = new com/crashlytics/android/core/WireFormat$FieldType;
    localJavaType = WireFormat.JavaType.LONG;
    ((FieldType)localObject1).<init>("SINT64", 17, localJavaType, 0);
    SINT64 = (FieldType)localObject1;
    localObject1 = new FieldType[18];
    FieldType localFieldType = DOUBLE;
    localObject1[0] = localFieldType;
    localFieldType = FLOAT;
    localObject1[m] = localFieldType;
    localFieldType = INT64;
    localObject1[k] = localFieldType;
    localFieldType = UINT64;
    localObject1[i] = localFieldType;
    localObject2 = INT32;
    localObject1[4] = localObject2;
    localFieldType = FIXED64;
    localObject1[j] = localFieldType;
    localObject2 = FIXED32;
    localObject1[6] = localObject2;
    localObject2 = BOOL;
    localObject1[7] = localObject2;
    localObject2 = STRING;
    localObject1[8] = localObject2;
    localObject2 = GROUP;
    localObject1[9] = localObject2;
    localObject2 = MESSAGE;
    localObject1[10] = localObject2;
    localObject2 = BYTES;
    localObject1[11] = localObject2;
    localObject2 = UINT32;
    localObject1[12] = localObject2;
    localObject2 = ENUM;
    localObject1[13] = localObject2;
    localObject2 = SFIXED32;
    localObject1[14] = localObject2;
    localObject2 = SFIXED64;
    localObject1[15] = localObject2;
    localObject2 = SINT32;
    localObject1[16] = localObject2;
    localObject2 = SINT64;
    localObject1[17] = localObject2;
    $VALUES = (FieldType[])localObject1;
  }
  
  private WireFormat$FieldType(WireFormat.JavaType paramJavaType, int paramInt1)
  {
    this.javaType = paramJavaType;
    this.wireType = paramInt1;
  }
  
  public WireFormat.JavaType getJavaType()
  {
    return this.javaType;
  }
  
  public int getWireType()
  {
    return this.wireType;
  }
  
  public boolean isPackable()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\WireFormat$FieldType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */