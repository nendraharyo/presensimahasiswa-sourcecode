package com.google.gson;

import java.lang.reflect.Type;

class Gson$2
  implements JsonSerializationContext
{
  Gson$2(Gson paramGson) {}
  
  public JsonElement serialize(Object paramObject)
  {
    return this.this$0.toJsonTree(paramObject);
  }
  
  public JsonElement serialize(Object paramObject, Type paramType)
  {
    return this.this$0.toJsonTree(paramObject, paramType);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\Gson$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */