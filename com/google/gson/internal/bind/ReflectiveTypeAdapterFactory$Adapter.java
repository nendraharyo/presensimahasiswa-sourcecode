package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory$Adapter
  extends TypeAdapter
{
  private final Map boundFields;
  private final ObjectConstructor constructor;
  
  ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor paramObjectConstructor, Map paramMap)
  {
    this.constructor = paramObjectConstructor;
    this.boundFields = paramMap;
  }
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject3 = JsonToken.NULL;
    boolean bool1;
    if (localObject1 == localObject3)
    {
      paramJsonReader.nextNull();
      bool1 = false;
    }
    label132:
    Object localObject2;
    for (localObject1 = null;; localObject2 = localObject3)
    {
      return localObject1;
      localObject1 = this.constructor;
      localObject3 = ((ObjectConstructor)localObject1).construct();
      try
      {
        paramJsonReader.beginObject();
        for (;;)
        {
          bool1 = paramJsonReader.hasNext();
          if (!bool1) {
            break label132;
          }
          localObject1 = paramJsonReader.nextName();
          Map localMap = this.boundFields;
          localObject1 = localMap.get(localObject1);
          localObject1 = (ReflectiveTypeAdapterFactory.BoundField)localObject1;
          if (localObject1 != null)
          {
            boolean bool2 = ((ReflectiveTypeAdapterFactory.BoundField)localObject1).deserialized;
            if (bool2) {
              break;
            }
          }
          paramJsonReader.skipValue();
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          localObject3 = new com/google/gson/JsonSyntaxException;
          ((JsonSyntaxException)localObject3).<init>(localIllegalStateException);
          throw ((Throwable)localObject3);
          localIllegalStateException.read(paramJsonReader, localObject3);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject3 = new java/lang/AssertionError;
        ((AssertionError)localObject3).<init>(localIllegalAccessException);
        throw ((Throwable)localObject3);
      }
      paramJsonReader.endObject();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginObject();
      try
      {
        Object localObject1 = this.boundFields;
        localObject1 = ((Map)localObject1).values();
        Object localObject2 = ((Collection)localObject1).iterator();
        for (;;)
        {
          boolean bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject2).next();
          localObject1 = (ReflectiveTypeAdapterFactory.BoundField)localObject1;
          boolean bool2 = ((ReflectiveTypeAdapterFactory.BoundField)localObject1).writeField(paramObject);
          if (bool2)
          {
            String str = ((ReflectiveTypeAdapterFactory.BoundField)localObject1).name;
            paramJsonWriter.name(str);
            ((ReflectiveTypeAdapterFactory.BoundField)localObject1).write(paramJsonWriter, paramObject);
          }
        }
        paramJsonWriter.endObject();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject2 = new java/lang/AssertionError;
        ((AssertionError)localObject2).<init>(localIllegalAccessException);
        throw ((Throwable)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */