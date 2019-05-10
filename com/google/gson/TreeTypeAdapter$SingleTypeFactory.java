package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.reflect.TypeToken;

class TreeTypeAdapter$SingleTypeFactory
  implements TypeAdapterFactory
{
  private final JsonDeserializer deserializer;
  private final TypeToken exactType;
  private final Class hierarchyType;
  private final boolean matchRawType;
  private final JsonSerializer serializer;
  
  TreeTypeAdapter$SingleTypeFactory(Object paramObject, TypeToken paramTypeToken, boolean paramBoolean, Class paramClass)
  {
    boolean bool = paramObject instanceof JsonSerializer;
    Object localObject;
    if (bool)
    {
      localObject = paramObject;
      localObject = (JsonSerializer)paramObject;
      this.serializer = ((JsonSerializer)localObject);
      bool = paramObject instanceof JsonDeserializer;
      if (!bool) {
        break label107;
      }
      paramObject = (JsonDeserializer)paramObject;
      label46:
      this.deserializer = ((JsonDeserializer)paramObject);
      localObject = this.serializer;
      if (localObject == null)
      {
        localObject = this.deserializer;
        if (localObject == null) {
          break label112;
        }
      }
      bool = true;
    }
    for (;;)
    {
      .Gson.Preconditions.checkArgument(bool);
      this.exactType = paramTypeToken;
      this.matchRawType = paramBoolean;
      this.hierarchyType = paramClass;
      return;
      bool = false;
      localObject = null;
      break;
      label107:
      paramObject = null;
      break label46;
      label112:
      bool = false;
      localObject = null;
    }
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = this.exactType;
    boolean bool;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.exactType;
      bool = ((TypeToken)localObject1).equals(paramTypeToken);
      if (!bool)
      {
        bool = this.matchRawType;
        if (bool)
        {
          localObject1 = this.exactType.getType();
          localObject2 = paramTypeToken.getRawType();
          if (localObject1 != localObject2) {}
        }
      }
      else
      {
        bool = true;
        if (!bool) {
          break label124;
        }
        localObject1 = new com/google/gson/TreeTypeAdapter;
        localObject2 = this.serializer;
        JsonDeserializer localJsonDeserializer = this.deserializer;
        ((TreeTypeAdapter)localObject1).<init>((JsonSerializer)localObject2, localJsonDeserializer, paramGson, paramTypeToken, this);
      }
    }
    for (;;)
    {
      return (TypeAdapter)localObject1;
      bool = false;
      localObject1 = null;
      break;
      localObject1 = this.hierarchyType;
      localObject2 = paramTypeToken.getRawType();
      bool = ((Class)localObject1).isAssignableFrom((Class)localObject2);
      break;
      label124:
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\TreeTypeAdapter$SingleTypeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */