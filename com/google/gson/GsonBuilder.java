package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GsonBuilder
{
  private boolean complexMapKeySerialization;
  private String datePattern;
  private int dateStyle;
  private boolean escapeHtmlChars;
  private Excluder excluder;
  private final List factories;
  private FieldNamingStrategy fieldNamingPolicy;
  private boolean generateNonExecutableJson;
  private final List hierarchyFactories;
  private final Map instanceCreators;
  private boolean lenient;
  private LongSerializationPolicy longSerializationPolicy;
  private boolean prettyPrinting;
  private boolean serializeNulls;
  private boolean serializeSpecialFloatingPointValues;
  private int timeStyle;
  
  public GsonBuilder()
  {
    Object localObject = Excluder.DEFAULT;
    this.excluder = ((Excluder)localObject);
    localObject = LongSerializationPolicy.DEFAULT;
    this.longSerializationPolicy = ((LongSerializationPolicy)localObject);
    localObject = FieldNamingPolicy.IDENTITY;
    this.fieldNamingPolicy = ((FieldNamingStrategy)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.instanceCreators = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.factories = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.hierarchyFactories = ((List)localObject);
    this.serializeNulls = false;
    this.dateStyle = i;
    this.timeStyle = i;
    this.complexMapKeySerialization = false;
    this.serializeSpecialFloatingPointValues = false;
    this.escapeHtmlChars = true;
    this.prettyPrinting = false;
    this.generateNonExecutableJson = false;
    this.lenient = false;
  }
  
  private void addTypeAdaptersForDate(String paramString, int paramInt1, int paramInt2, List paramList)
  {
    int i = 2;
    Object localObject1;
    Object localObject2;
    if (paramString != null)
    {
      localObject1 = "";
      localObject2 = paramString.trim();
      boolean bool = ((String)localObject1).equals(localObject2);
      if (!bool)
      {
        localObject1 = new com/google/gson/DefaultDateTypeAdapter;
        ((DefaultDateTypeAdapter)localObject1).<init>(paramString);
      }
    }
    for (;;)
    {
      localObject2 = TreeTypeAdapter.newFactory(TypeToken.get(java.util.Date.class), localObject1);
      paramList.add(localObject2);
      localObject2 = TreeTypeAdapter.newFactory(TypeToken.get(Timestamp.class), localObject1);
      paramList.add(localObject2);
      localObject2 = TypeToken.get(java.sql.Date.class);
      localObject1 = TreeTypeAdapter.newFactory((TypeToken)localObject2, localObject1);
      paramList.add(localObject1);
      do
      {
        return;
      } while ((paramInt1 == i) || (paramInt2 == i));
      localObject1 = new com/google/gson/DefaultDateTypeAdapter;
      ((DefaultDateTypeAdapter)localObject1).<init>(paramInt1, paramInt2);
    }
  }
  
  public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy)
  {
    Excluder localExcluder = this.excluder.withExclusionStrategy(paramExclusionStrategy, false, true);
    this.excluder = localExcluder;
    return this;
  }
  
  public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy)
  {
    Excluder localExcluder = this.excluder.withExclusionStrategy(paramExclusionStrategy, true, false);
    this.excluder = localExcluder;
    return this;
  }
  
  public Gson create()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.factories;
    localArrayList.addAll((Collection)localObject);
    Collections.reverse(localArrayList);
    localObject = this.hierarchyFactories;
    localArrayList.addAll((Collection)localObject);
    localObject = this.datePattern;
    int i = this.dateStyle;
    int j = this.timeStyle;
    addTypeAdaptersForDate((String)localObject, i, j, localArrayList);
    localObject = new com/google/gson/Gson;
    Excluder localExcluder = this.excluder;
    FieldNamingStrategy localFieldNamingStrategy = this.fieldNamingPolicy;
    Map localMap = this.instanceCreators;
    boolean bool1 = this.serializeNulls;
    boolean bool2 = this.complexMapKeySerialization;
    boolean bool3 = this.generateNonExecutableJson;
    boolean bool4 = this.escapeHtmlChars;
    boolean bool5 = this.prettyPrinting;
    boolean bool6 = this.lenient;
    boolean bool7 = this.serializeSpecialFloatingPointValues;
    LongSerializationPolicy localLongSerializationPolicy = this.longSerializationPolicy;
    ((Gson)localObject).<init>(localExcluder, localFieldNamingStrategy, localMap, bool1, bool2, bool3, bool4, bool5, bool6, bool7, localLongSerializationPolicy, localArrayList);
    return (Gson)localObject;
  }
  
  public GsonBuilder disableHtmlEscaping()
  {
    this.escapeHtmlChars = false;
    return this;
  }
  
  public GsonBuilder disableInnerClassSerialization()
  {
    Excluder localExcluder = this.excluder.disableInnerClassSerialization();
    this.excluder = localExcluder;
    return this;
  }
  
  public GsonBuilder enableComplexMapKeySerialization()
  {
    this.complexMapKeySerialization = true;
    return this;
  }
  
  public GsonBuilder excludeFieldsWithModifiers(int... paramVarArgs)
  {
    Excluder localExcluder = this.excluder.withModifiers(paramVarArgs);
    this.excluder = localExcluder;
    return this;
  }
  
  public GsonBuilder excludeFieldsWithoutExposeAnnotation()
  {
    Excluder localExcluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
    this.excluder = localExcluder;
    return this;
  }
  
  public GsonBuilder generateNonExecutableJson()
  {
    this.generateNonExecutableJson = true;
    return this;
  }
  
  public GsonBuilder registerTypeAdapter(Type paramType, Object paramObject)
  {
    boolean bool = paramObject instanceof JsonSerializer;
    if (!bool)
    {
      bool = paramObject instanceof JsonDeserializer;
      if (!bool)
      {
        bool = paramObject instanceof InstanceCreator;
        if (!bool)
        {
          bool = paramObject instanceof TypeAdapter;
          if (!bool) {
            break label171;
          }
        }
      }
    }
    bool = true;
    for (;;)
    {
      .Gson.Preconditions.checkArgument(bool);
      bool = paramObject instanceof InstanceCreator;
      Object localObject1;
      if (bool)
      {
        localObject1 = this.instanceCreators;
        localObject2 = paramObject;
        localObject2 = (InstanceCreator)paramObject;
        ((Map)localObject1).put(paramType, localObject2);
      }
      bool = paramObject instanceof JsonSerializer;
      if (!bool)
      {
        bool = paramObject instanceof JsonDeserializer;
        if (!bool) {}
      }
      else
      {
        localObject2 = TypeToken.get(paramType);
        localObject1 = this.factories;
        localObject2 = TreeTypeAdapter.newFactoryWithMatchRawType((TypeToken)localObject2, paramObject);
        ((List)localObject1).add(localObject2);
      }
      bool = paramObject instanceof TypeAdapter;
      if (bool)
      {
        localObject2 = this.factories;
        localObject1 = TypeToken.get(paramType);
        paramObject = (TypeAdapter)paramObject;
        localObject1 = TypeAdapters.newFactory((TypeToken)localObject1, (TypeAdapter)paramObject);
        ((List)localObject2).add(localObject1);
      }
      return this;
      label171:
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory paramTypeAdapterFactory)
  {
    this.factories.add(paramTypeAdapterFactory);
    return this;
  }
  
  public GsonBuilder registerTypeHierarchyAdapter(Class paramClass, Object paramObject)
  {
    TypeAdapterFactory localTypeAdapterFactory1 = null;
    boolean bool = paramObject instanceof JsonSerializer;
    if (!bool)
    {
      bool = paramObject instanceof JsonDeserializer;
      if (!bool)
      {
        bool = paramObject instanceof TypeAdapter;
        if (!bool) {
          break label127;
        }
      }
    }
    bool = true;
    for (;;)
    {
      .Gson.Preconditions.checkArgument(bool);
      bool = paramObject instanceof JsonDeserializer;
      if (!bool)
      {
        bool = paramObject instanceof JsonSerializer;
        if (!bool) {}
      }
      else
      {
        localList = this.hierarchyFactories;
        TypeAdapterFactory localTypeAdapterFactory2 = TreeTypeAdapter.newTypeHierarchyFactory(paramClass, paramObject);
        localList.add(0, localTypeAdapterFactory2);
      }
      bool = paramObject instanceof TypeAdapter;
      if (bool)
      {
        localList = this.factories;
        paramObject = (TypeAdapter)paramObject;
        localTypeAdapterFactory1 = TypeAdapters.newTypeHierarchyFactory(paramClass, (TypeAdapter)paramObject);
        localList.add(localTypeAdapterFactory1);
      }
      return this;
      label127:
      bool = false;
      List localList = null;
    }
  }
  
  public GsonBuilder serializeNulls()
  {
    this.serializeNulls = true;
    return this;
  }
  
  public GsonBuilder serializeSpecialFloatingPointValues()
  {
    this.serializeSpecialFloatingPointValues = true;
    return this;
  }
  
  public GsonBuilder setDateFormat(int paramInt)
  {
    this.dateStyle = paramInt;
    this.datePattern = null;
    return this;
  }
  
  public GsonBuilder setDateFormat(int paramInt1, int paramInt2)
  {
    this.dateStyle = paramInt1;
    this.timeStyle = paramInt2;
    this.datePattern = null;
    return this;
  }
  
  public GsonBuilder setDateFormat(String paramString)
  {
    this.datePattern = paramString;
    return this;
  }
  
  public GsonBuilder setExclusionStrategies(ExclusionStrategy... paramVarArgs)
  {
    boolean bool = true;
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramVarArgs[j];
      Excluder localExcluder = this.excluder;
      localObject = localExcluder.withExclusionStrategy((ExclusionStrategy)localObject, bool, bool);
      this.excluder = ((Excluder)localObject);
      j += 1;
    }
    return this;
  }
  
  public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy paramFieldNamingPolicy)
  {
    this.fieldNamingPolicy = paramFieldNamingPolicy;
    return this;
  }
  
  public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy paramFieldNamingStrategy)
  {
    this.fieldNamingPolicy = paramFieldNamingStrategy;
    return this;
  }
  
  public GsonBuilder setLenient()
  {
    this.lenient = true;
    return this;
  }
  
  public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy paramLongSerializationPolicy)
  {
    this.longSerializationPolicy = paramLongSerializationPolicy;
    return this;
  }
  
  public GsonBuilder setPrettyPrinting()
  {
    this.prettyPrinting = true;
    return this;
  }
  
  public GsonBuilder setVersion(double paramDouble)
  {
    Excluder localExcluder = this.excluder.withVersion(paramDouble);
    this.excluder = localExcluder;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\GsonBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */