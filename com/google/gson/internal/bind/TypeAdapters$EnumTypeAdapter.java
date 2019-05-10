package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class TypeAdapters$EnumTypeAdapter
  extends TypeAdapter
{
  private final Map constantToName;
  private final Map nameToConstant;
  
  public TypeAdapters$EnumTypeAdapter(Class paramClass)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.nameToConstant = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.constantToName = ((Map)localObject1);
    try
    {
      localObject1 = paramClass.getEnumConstants();
      localObject1 = (Enum[])localObject1;
      int i = localObject1.length;
      Object localObject3;
      Object localObject4;
      int m;
      for (int j = 0; j < i; j = m)
      {
        Object localObject2 = localObject1[j];
        localObject3 = ((Enum)localObject2).name();
        localObject4 = paramClass.getField((String)localObject3);
        Object localObject5 = SerializedName.class;
        localObject4 = ((Field)localObject4).getAnnotation((Class)localObject5);
        localObject4 = (SerializedName)localObject4;
        if (localObject4 != null)
        {
          localObject3 = ((SerializedName)localObject4).value();
          localObject5 = ((SerializedName)localObject4).alternate();
          int k = localObject5.length;
          m = 0;
          localObject4 = null;
          while (m < k)
          {
            Object localObject6 = localObject5[m];
            Map localMap = this.nameToConstant;
            localMap.put(localObject6, localObject2);
            m += 1;
          }
        }
        localObject4 = localObject3;
        localObject3 = this.nameToConstant;
        ((Map)localObject3).put(localObject4, localObject2);
        localObject3 = this.constantToName;
        ((Map)localObject3).put(localObject2, localObject4);
        m = j + 1;
      }
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      localObject4 = new java/lang/AssertionError;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Missing field in ");
      str = paramClass.getName();
      localObject3 = str;
      ((AssertionError)localObject4).<init>((String)localObject3, localNoSuchFieldException);
      throw ((Throwable)localObject4);
    }
  }
  
  public Enum read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    if (localObject1 == localObject2) {
      paramJsonReader.nextNull();
    }
    for (localObject1 = null;; localObject1 = (Enum)((Map)localObject1).get(localObject2))
    {
      return (Enum)localObject1;
      localObject1 = this.nameToConstant;
      localObject2 = paramJsonReader.nextString();
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Enum paramEnum)
  {
    if (paramEnum == null) {}
    for (String str = null;; str = (String)this.constantToName.get(paramEnum))
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters$EnumTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */