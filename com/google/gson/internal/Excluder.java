package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Excluder
  implements TypeAdapterFactory, Cloneable
{
  public static final Excluder DEFAULT;
  private static final double IGNORE_VERSIONS = -1.0D;
  private List deserializationStrategies;
  private int modifiers = 136;
  private boolean requireExpose;
  private List serializationStrategies;
  private boolean serializeInnerClasses = true;
  private double version = -1.0D;
  
  static
  {
    Excluder localExcluder = new com/google/gson/internal/Excluder;
    localExcluder.<init>();
    DEFAULT = localExcluder;
  }
  
  public Excluder()
  {
    List localList = Collections.emptyList();
    this.serializationStrategies = localList;
    localList = Collections.emptyList();
    this.deserializationStrategies = localList;
  }
  
  private boolean isAnonymousOrLocal(Class paramClass)
  {
    Class localClass = Enum.class;
    boolean bool = localClass.isAssignableFrom(paramClass);
    if (!bool)
    {
      bool = paramClass.isAnonymousClass();
      if (!bool)
      {
        bool = paramClass.isLocalClass();
        if (!bool) {}
      }
      else
      {
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
  
  private boolean isInnerClass(Class paramClass)
  {
    boolean bool = paramClass.isMemberClass();
    if (bool)
    {
      bool = isStatic(paramClass);
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean isStatic(Class paramClass)
  {
    int i = paramClass.getModifiers() & 0x8;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  private boolean isValidSince(Since paramSince)
  {
    if (paramSince != null)
    {
      double d1 = paramSince.value();
      double d2 = this.version;
      bool = d1 < d2;
      if (!bool) {}
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  private boolean isValidUntil(Until paramUntil)
  {
    if (paramUntil != null)
    {
      double d1 = paramUntil.value();
      double d2 = this.version;
      bool = d1 < d2;
      if (bool) {}
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  private boolean isValidVersion(Since paramSince, Until paramUntil)
  {
    boolean bool = isValidSince(paramSince);
    if (bool)
    {
      bool = isValidUntil(paramUntil);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected Excluder clone()
  {
    try
    {
      Object localObject = super.clone();
      return (Excluder)localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localCloneNotSupportedException);
      throw localAssertionError;
    }
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
  {
    Object localObject = paramTypeToken.getRawType();
    boolean bool1 = excludeClass((Class)localObject, true);
    boolean bool2 = excludeClass((Class)localObject, false);
    if ((!bool1) && (!bool2)) {
      localObject = null;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/internal/Excluder$1;
      ((Excluder.1)localObject).<init>(this, bool2, bool1, paramGson, paramTypeToken);
    }
  }
  
  public Excluder disableInnerClassSerialization()
  {
    Excluder localExcluder = clone();
    localExcluder.serializeInnerClasses = false;
    return localExcluder;
  }
  
  public boolean excludeClass(Class paramClass, boolean paramBoolean)
  {
    boolean bool1 = true;
    double d1 = this.version;
    double d2 = -1.0D;
    boolean bool2 = d1 < d2;
    Object localObject1;
    Object localObject2;
    if (bool2)
    {
      localObject1 = (Since)paramClass.getAnnotation(Since.class);
      localObject2 = (Until)paramClass.getAnnotation(Until.class);
      bool2 = isValidVersion((Since)localObject1, (Until)localObject2);
      if (!bool2) {
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = this.serializeInnerClasses;
      if (!bool2)
      {
        bool2 = isInnerClass(paramClass);
        if (bool2)
        {
          bool2 = bool1;
          continue;
        }
      }
      bool2 = isAnonymousOrLocal(paramClass);
      if (bool2)
      {
        bool2 = bool1;
      }
      else
      {
        if (paramBoolean) {}
        for (localObject1 = this.serializationStrategies;; localObject1 = this.deserializationStrategies)
        {
          localObject2 = ((List)localObject1).iterator();
          do
          {
            bool2 = ((Iterator)localObject2).hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = (ExclusionStrategy)((Iterator)localObject2).next();
            bool2 = ((ExclusionStrategy)localObject1).shouldSkipClass(paramClass);
          } while (!bool2);
          bool2 = bool1;
          break;
        }
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public boolean excludeField(Field paramField, boolean paramBoolean)
  {
    int i = 1;
    int j = this.modifiers;
    int k = paramField.getModifiers();
    j &= k;
    if (j != 0) {
      j = i;
    }
    for (;;)
    {
      return j;
      double d1 = this.version;
      double d2 = -1.0D;
      boolean bool1 = d1 < d2;
      Object localObject1;
      Object localObject2;
      if (bool1)
      {
        localObject1 = (Since)paramField.getAnnotation(Since.class);
        localObject2 = (Until)paramField.getAnnotation(Until.class);
        bool1 = isValidVersion((Since)localObject1, (Until)localObject2);
        if (!bool1)
        {
          bool1 = i;
          continue;
        }
      }
      bool1 = paramField.isSynthetic();
      if (bool1)
      {
        bool1 = i;
      }
      else
      {
        bool1 = this.requireExpose;
        if (bool1)
        {
          localObject1 = (Expose)paramField.getAnnotation(Expose.class);
          if (localObject1 != null)
          {
            if (!paramBoolean) {
              break label166;
            }
            bool1 = ((Expose)localObject1).serialize();
            if (bool1) {
              break label180;
            }
          }
          label166:
          do
          {
            bool1 = i;
            break;
            bool1 = ((Expose)localObject1).deserialize();
          } while (!bool1);
        }
        label180:
        bool1 = this.serializeInnerClasses;
        if (!bool1)
        {
          localObject1 = paramField.getType();
          bool1 = isInnerClass((Class)localObject1);
          if (bool1)
          {
            bool1 = i;
            continue;
          }
        }
        localObject1 = paramField.getType();
        bool1 = isAnonymousOrLocal((Class)localObject1);
        if (bool1)
        {
          bool1 = i;
        }
        else
        {
          if (paramBoolean) {}
          for (localObject1 = this.serializationStrategies;; localObject1 = this.deserializationStrategies)
          {
            boolean bool2 = ((List)localObject1).isEmpty();
            if (bool2) {
              break label342;
            }
            localObject2 = new com/google/gson/FieldAttributes;
            ((FieldAttributes)localObject2).<init>(paramField);
            Iterator localIterator = ((List)localObject1).iterator();
            do
            {
              bool1 = localIterator.hasNext();
              if (!bool1) {
                break;
              }
              localObject1 = (ExclusionStrategy)localIterator.next();
              bool1 = ((ExclusionStrategy)localObject1).shouldSkipField((FieldAttributes)localObject2);
            } while (!bool1);
            bool1 = i;
            break;
          }
          label342:
          bool1 = false;
          localObject1 = null;
        }
      }
    }
  }
  
  public Excluder excludeFieldsWithoutExposeAnnotation()
  {
    Excluder localExcluder = clone();
    localExcluder.requireExpose = true;
    return localExcluder;
  }
  
  public Excluder withExclusionStrategy(ExclusionStrategy paramExclusionStrategy, boolean paramBoolean1, boolean paramBoolean2)
  {
    Excluder localExcluder = clone();
    Object localObject;
    List localList;
    if (paramBoolean1)
    {
      localObject = new java/util/ArrayList;
      localList = this.serializationStrategies;
      ((ArrayList)localObject).<init>(localList);
      localExcluder.serializationStrategies = ((List)localObject);
      localObject = localExcluder.serializationStrategies;
      ((List)localObject).add(paramExclusionStrategy);
    }
    if (paramBoolean2)
    {
      localObject = new java/util/ArrayList;
      localList = this.deserializationStrategies;
      ((ArrayList)localObject).<init>(localList);
      localExcluder.deserializationStrategies = ((List)localObject);
      localObject = localExcluder.deserializationStrategies;
      ((List)localObject).add(paramExclusionStrategy);
    }
    return localExcluder;
  }
  
  public Excluder withModifiers(int... paramVarArgs)
  {
    int i = 0;
    Excluder localExcluder = clone();
    localExcluder.modifiers = 0;
    int j = paramVarArgs.length;
    while (i < j)
    {
      int k = paramVarArgs[i];
      int m = localExcluder.modifiers;
      k |= m;
      localExcluder.modifiers = k;
      i += 1;
    }
    return localExcluder;
  }
  
  public Excluder withVersion(double paramDouble)
  {
    Excluder localExcluder = clone();
    localExcluder.version = paramDouble;
    return localExcluder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\Excluder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */