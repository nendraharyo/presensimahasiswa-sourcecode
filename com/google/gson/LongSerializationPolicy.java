package com.google.gson;

public enum LongSerializationPolicy
{
  static
  {
    int i = 1;
    Object localObject = new com/google/gson/LongSerializationPolicy$1;
    ((LongSerializationPolicy.1)localObject).<init>("DEFAULT", 0);
    DEFAULT = (LongSerializationPolicy)localObject;
    localObject = new com/google/gson/LongSerializationPolicy$2;
    ((LongSerializationPolicy.2)localObject).<init>("STRING", i);
    STRING = (LongSerializationPolicy)localObject;
    localObject = new LongSerializationPolicy[2];
    LongSerializationPolicy localLongSerializationPolicy = DEFAULT;
    localObject[0] = localLongSerializationPolicy;
    localLongSerializationPolicy = STRING;
    localObject[i] = localLongSerializationPolicy;
    $VALUES = (LongSerializationPolicy[])localObject;
  }
  
  public abstract JsonElement serialize(Long paramLong);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\LongSerializationPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */