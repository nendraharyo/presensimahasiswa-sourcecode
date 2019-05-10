package com.google.gson;

 enum LongSerializationPolicy$2
{
  LongSerializationPolicy$2()
  {
    super(paramString, paramInt, null);
  }
  
  public JsonElement serialize(Long paramLong)
  {
    JsonPrimitive localJsonPrimitive = new com/google/gson/JsonPrimitive;
    String str = String.valueOf(paramLong);
    localJsonPrimitive.<init>(str);
    return localJsonPrimitive;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\LongSerializationPolicy$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */