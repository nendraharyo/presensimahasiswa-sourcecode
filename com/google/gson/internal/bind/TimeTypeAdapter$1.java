package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.sql.Time;

final class TimeTypeAdapter$1
  implements TypeAdapterFactory
{
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject = paramTypeToken.getRawType();
    Class localClass = Time.class;
    if (localObject == localClass)
    {
      localObject = new com/google/gson/internal/bind/TimeTypeAdapter;
      ((TimeTypeAdapter)localObject).<init>();
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TimeTypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */