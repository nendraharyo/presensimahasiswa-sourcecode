package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class ConstructorConstructor
{
  private final Map instanceCreators;
  
  public ConstructorConstructor(Map paramMap)
  {
    this.instanceCreators = paramMap;
  }
  
  private ObjectConstructor newDefaultConstructor(Class paramClass)
  {
    bool = false;
    Object localObject1 = null;
    try
    {
      localObject1 = new Class[0];
      Constructor localConstructor = paramClass.getDeclaredConstructor((Class[])localObject1);
      bool = localConstructor.isAccessible();
      if (!bool)
      {
        bool = true;
        localConstructor.setAccessible(bool);
      }
      localObject1 = new com/google/gson/internal/ConstructorConstructor$3;
      ((ConstructorConstructor.3)localObject1).<init>(this, localConstructor);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        bool = false;
        Object localObject2 = null;
      }
    }
    return (ObjectConstructor)localObject1;
  }
  
  private ObjectConstructor newDefaultImplementationConstructor(Type paramType, Class paramClass)
  {
    Object localObject = Collection.class;
    boolean bool = ((Class)localObject).isAssignableFrom(paramClass);
    if (bool)
    {
      localObject = SortedSet.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool)
      {
        localObject = new com/google/gson/internal/ConstructorConstructor$4;
        ((ConstructorConstructor.4)localObject).<init>(this);
      }
    }
    for (;;)
    {
      return (ObjectConstructor)localObject;
      localObject = EnumSet.class;
      bool = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool)
      {
        localObject = new com/google/gson/internal/ConstructorConstructor$5;
        ((ConstructorConstructor.5)localObject).<init>(this, paramType);
      }
      else
      {
        localObject = Set.class;
        bool = ((Class)localObject).isAssignableFrom(paramClass);
        if (bool)
        {
          localObject = new com/google/gson/internal/ConstructorConstructor$6;
          ((ConstructorConstructor.6)localObject).<init>(this);
        }
        else
        {
          localObject = Queue.class;
          bool = ((Class)localObject).isAssignableFrom(paramClass);
          if (bool)
          {
            localObject = new com/google/gson/internal/ConstructorConstructor$7;
            ((ConstructorConstructor.7)localObject).<init>(this);
          }
          else
          {
            localObject = new com/google/gson/internal/ConstructorConstructor$8;
            ((ConstructorConstructor.8)localObject).<init>(this);
            continue;
            localObject = Map.class;
            bool = ((Class)localObject).isAssignableFrom(paramClass);
            if (bool)
            {
              localObject = ConcurrentNavigableMap.class;
              bool = ((Class)localObject).isAssignableFrom(paramClass);
              if (bool)
              {
                localObject = new com/google/gson/internal/ConstructorConstructor$9;
                ((ConstructorConstructor.9)localObject).<init>(this);
              }
              else
              {
                localObject = ConcurrentMap.class;
                bool = ((Class)localObject).isAssignableFrom(paramClass);
                if (bool)
                {
                  localObject = new com/google/gson/internal/ConstructorConstructor$10;
                  ((ConstructorConstructor.10)localObject).<init>(this);
                }
                else
                {
                  localObject = SortedMap.class;
                  bool = ((Class)localObject).isAssignableFrom(paramClass);
                  if (bool)
                  {
                    localObject = new com/google/gson/internal/ConstructorConstructor$11;
                    ((ConstructorConstructor.11)localObject).<init>(this);
                  }
                  else
                  {
                    bool = paramType instanceof ParameterizedType;
                    if (bool)
                    {
                      localObject = String.class;
                      paramType = (ParameterizedType)paramType;
                      Class localClass = TypeToken.get(paramType.getActualTypeArguments()[0]).getRawType();
                      bool = ((Class)localObject).isAssignableFrom(localClass);
                      if (!bool)
                      {
                        localObject = new com/google/gson/internal/ConstructorConstructor$12;
                        ((ConstructorConstructor.12)localObject).<init>(this);
                        continue;
                      }
                    }
                    localObject = new com/google/gson/internal/ConstructorConstructor$13;
                    ((ConstructorConstructor.13)localObject).<init>(this);
                  }
                }
              }
            }
            else
            {
              bool = false;
              localObject = null;
            }
          }
        }
      }
    }
  }
  
  private ObjectConstructor newUnsafeAllocator(Type paramType, Class paramClass)
  {
    ConstructorConstructor.14 local14 = new com/google/gson/internal/ConstructorConstructor$14;
    local14.<init>(this, paramClass, paramType);
    return local14;
  }
  
  public ObjectConstructor get(TypeToken paramTypeToken)
  {
    Type localType = paramTypeToken.getType();
    Object localObject1 = paramTypeToken.getRawType();
    Object localObject2 = (InstanceCreator)this.instanceCreators.get(localType);
    if (localObject2 != null)
    {
      localObject1 = new com/google/gson/internal/ConstructorConstructor$1;
      ((ConstructorConstructor.1)localObject1).<init>(this, (InstanceCreator)localObject2, localType);
      localObject2 = localObject1;
    }
    for (;;)
    {
      return (ObjectConstructor)localObject2;
      localObject2 = (InstanceCreator)this.instanceCreators.get(localObject1);
      if (localObject2 != null)
      {
        localObject1 = new com/google/gson/internal/ConstructorConstructor$2;
        ((ConstructorConstructor.2)localObject1).<init>(this, (InstanceCreator)localObject2, localType);
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = newDefaultConstructor((Class)localObject1);
        if (localObject2 == null)
        {
          localObject2 = newDefaultImplementationConstructor(localType, (Class)localObject1);
          if (localObject2 == null) {
            localObject2 = newUnsafeAllocator(localType, (Class)localObject1);
          }
        }
      }
    }
  }
  
  public String toString()
  {
    return this.instanceCreators.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\ConstructorConstructor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */