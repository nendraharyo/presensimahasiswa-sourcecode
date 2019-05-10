package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory
  implements TypeAdapterFactory
{
  private final ConstructorConstructor constructorConstructor;
  private final Excluder excluder;
  private final FieldNamingStrategy fieldNamingPolicy;
  
  public ReflectiveTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, FieldNamingStrategy paramFieldNamingStrategy, Excluder paramExcluder)
  {
    this.constructorConstructor = paramConstructorConstructor;
    this.fieldNamingPolicy = paramFieldNamingStrategy;
    this.excluder = paramExcluder;
  }
  
  private ReflectiveTypeAdapterFactory.BoundField createBoundField(Gson paramGson, Field paramField, String paramString, TypeToken paramTypeToken, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = Primitives.isPrimitive(paramTypeToken.getRawType());
    ReflectiveTypeAdapterFactory.1 local1 = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$1;
    local1.<init>(this, paramString, paramBoolean1, paramBoolean2, paramGson, paramField, paramTypeToken, bool);
    return local1;
  }
  
  static boolean excludeField(Field paramField, boolean paramBoolean, Excluder paramExcluder)
  {
    Class localClass = paramField.getType();
    boolean bool = paramExcluder.excludeClass(localClass, paramBoolean);
    if (!bool)
    {
      bool = paramExcluder.excludeField(paramField, paramBoolean);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localClass = null;
    }
  }
  
  private Map getBoundFields(Gson paramGson, TypeToken paramTypeToken, Class paramClass)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    boolean bool1 = paramClass.isInterface();
    if (bool1)
    {
      localObject1 = localLinkedHashMap;
      return (Map)localObject1;
    }
    Type localType1 = paramTypeToken.getType();
    label34:
    Object localObject1 = Object.class;
    Object localObject2;
    label112:
    Object localObject3;
    Object localObject4;
    int m;
    if (paramClass != localObject1)
    {
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int j = arrayOfField.length;
      bool1 = false;
      localObject1 = null;
      int k = 0;
      for (;;)
      {
        if (k < j)
        {
          localObject2 = arrayOfField[k];
          boolean bool2 = excludeField((Field)localObject2, true);
          bool1 = false;
          localObject1 = null;
          boolean bool3 = excludeField((Field)localObject2, false);
          int i;
          if ((!bool2) && (!bool3))
          {
            i = k + 1;
            k = i;
          }
          else
          {
            ((Field)localObject2).setAccessible(true);
            localObject1 = paramTypeToken.getType();
            localObject3 = ((Field)localObject2).getGenericType();
            Type localType2 = .Gson.Types.resolve((Type)localObject1, paramClass, (Type)localObject3);
            List localList = getFieldNames((Field)localObject2);
            localObject4 = null;
            i = 0;
            localObject1 = null;
            m = 0;
            label174:
            i = localList.size();
            if (m < i)
            {
              String str = (String)localList.get(m);
              if (m != 0) {
                bool2 = false;
              }
              TypeToken localTypeToken = TypeToken.get(localType2);
              localObject1 = this;
              localObject3 = paramGson;
              localObject1 = createBoundField(paramGson, (Field)localObject2, str, localTypeToken, bool2, bool3);
              localObject1 = (ReflectiveTypeAdapterFactory.BoundField)localLinkedHashMap.put(str, localObject1);
              if (localObject4 != null) {
                break label386;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      int n = m + 1;
      m = n;
      localObject4 = localObject1;
      break label174;
      if (localObject4 == null) {
        break label112;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(localType1).append(" declares multiple JSON fields named ");
      localObject2 = ((ReflectiveTypeAdapterFactory.BoundField)localObject4).name;
      localObject3 = (String)localObject2;
      ((IllegalArgumentException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      localObject1 = paramTypeToken.getType();
      localObject3 = paramClass.getGenericSuperclass();
      localObject1 = .Gson.Types.resolve((Type)localObject1, paramClass, (Type)localObject3);
      paramTypeToken = TypeToken.get((Type)localObject1);
      paramClass = paramTypeToken.getRawType();
      break label34;
      localObject1 = localLinkedHashMap;
      break;
      label386:
      localObject1 = localObject4;
    }
  }
  
  static List getFieldName(FieldNamingStrategy paramFieldNamingStrategy, Field paramField)
  {
    Object localObject1 = (SerializedName)paramField.getAnnotation(SerializedName.class);
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    if (localObject1 == null)
    {
      localObject1 = paramFieldNamingStrategy.translateName(paramField);
      localLinkedList.add(localObject1);
    }
    for (;;)
    {
      return localLinkedList;
      Object localObject2 = ((SerializedName)localObject1).value();
      localLinkedList.add(localObject2);
      localObject2 = ((SerializedName)localObject1).alternate();
      int i = localObject2.length;
      int j = 0;
      localObject1 = null;
      while (j < i)
      {
        Object localObject3 = localObject2[j];
        localLinkedList.add(localObject3);
        j += 1;
      }
    }
  }
  
  private List getFieldNames(Field paramField)
  {
    return getFieldName(this.fieldNamingPolicy, paramField);
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject1 = paramTypeToken.getRawType();
    Object localObject2 = Object.class;
    boolean bool = ((Class)localObject2).isAssignableFrom((Class)localObject1);
    if (!bool)
    {
      bool = false;
      localObject2 = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject2;
      ObjectConstructor localObjectConstructor = this.constructorConstructor.get(paramTypeToken);
      localObject2 = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$Adapter;
      localObject1 = getBoundFields(paramGson, paramTypeToken, (Class)localObject1);
      ((ReflectiveTypeAdapterFactory.Adapter)localObject2).<init>(localObjectConstructor, (Map)localObject1);
    }
  }
  
  public boolean excludeField(Field paramField, boolean paramBoolean)
  {
    Excluder localExcluder = this.excluder;
    return excludeField(paramField, paramBoolean, localExcluder);
  }
  
  TypeAdapter getFieldAdapter(Gson paramGson, Field paramField, TypeToken paramTypeToken)
  {
    Object localObject = (JsonAdapter)paramField.getAnnotation(JsonAdapter.class);
    if (localObject != null)
    {
      ConstructorConstructor localConstructorConstructor = this.constructorConstructor;
      localObject = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(localConstructorConstructor, paramGson, paramTypeToken, (JsonAdapter)localObject);
      if (localObject == null) {}
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = paramGson.getAdapter(paramTypeToken);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */