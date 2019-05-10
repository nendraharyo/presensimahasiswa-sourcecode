package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

final class TypeAdapters$26
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = paramTypeToken.getRawType();
    Object localObject2 = Timestamp.class;
    if (localObject1 != localObject2) {
      localObject1 = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject1;
      localObject2 = paramGson.getAdapter(Date.class);
      localObject1 = new com/google/gson/internal/bind/TypeAdapters$26$1;
      ((TypeAdapters.26.1)localObject1).<init>(this, (TypeAdapter)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$26.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */