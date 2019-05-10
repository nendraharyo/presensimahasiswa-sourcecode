package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

class ReflectiveTypeAdapterFactory$1
  extends ReflectiveTypeAdapterFactory.BoundField
{
  final TypeAdapter typeAdapter;
  
  ReflectiveTypeAdapterFactory$1(ReflectiveTypeAdapterFactory paramReflectiveTypeAdapterFactory, String paramString, boolean paramBoolean1, boolean paramBoolean2, Gson paramGson, Field paramField, TypeToken paramTypeToken, boolean paramBoolean3)
  {
    super(paramString, paramBoolean1, paramBoolean2);
    Object localObject = this.this$0;
    Gson localGson = this.val$context;
    Field localField = this.val$field;
    TypeToken localTypeToken = this.val$fieldType;
    localObject = ((ReflectiveTypeAdapterFactory)localObject).getFieldAdapter(localGson, localField, localTypeToken);
    this.typeAdapter = ((TypeAdapter)localObject);
  }
  
  void read(JsonReader paramJsonReader, Object paramObject)
  {
    Object localObject = this.typeAdapter.read(paramJsonReader);
    if (localObject == null)
    {
      boolean bool = this.val$isPrimitive;
      if (bool) {}
    }
    else
    {
      Field localField = this.val$field;
      localField.set(paramObject, localObject);
    }
  }
  
  void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    Object localObject = this.val$field.get(paramObject);
    TypeAdapterRuntimeTypeWrapper localTypeAdapterRuntimeTypeWrapper = new com/google/gson/internal/bind/TypeAdapterRuntimeTypeWrapper;
    Gson localGson = this.val$context;
    TypeAdapter localTypeAdapter = this.typeAdapter;
    Type localType = this.val$fieldType.getType();
    localTypeAdapterRuntimeTypeWrapper.<init>(localGson, localTypeAdapter, localType);
    localTypeAdapterRuntimeTypeWrapper.write(paramJsonWriter, localObject);
  }
  
  public boolean writeField(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = this.serialized;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject = this.val$field.get(paramObject);
      if (localObject != paramObject) {
        bool1 = true;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */