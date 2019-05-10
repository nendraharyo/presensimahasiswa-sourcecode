package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson
{
  static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
  static final boolean DEFAULT_ESCAPE_HTML = true;
  static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
  static final boolean DEFAULT_LENIENT = false;
  static final boolean DEFAULT_PRETTY_PRINT = false;
  static final boolean DEFAULT_SERIALIZE_NULLS = false;
  static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
  private final ThreadLocal calls;
  private final ConstructorConstructor constructorConstructor;
  final JsonDeserializationContext deserializationContext;
  private final List factories;
  private final boolean generateNonExecutableJson;
  private final boolean htmlSafe;
  private final boolean lenient;
  private final boolean prettyPrinting;
  final JsonSerializationContext serializationContext;
  private final boolean serializeNulls;
  private final Map typeTokenCache;
  
  public Gson()
  {
    this(localExcluder, localFieldNamingPolicy, localMap, false, false, false, true, false, false, false, localLongSerializationPolicy, localList);
  }
  
  Gson(Excluder paramExcluder, FieldNamingStrategy paramFieldNamingStrategy, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, LongSerializationPolicy paramLongSerializationPolicy, List paramList)
  {
    Object localObject1 = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject1).<init>();
    this.calls = ((ThreadLocal)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    localObject1 = Collections.synchronizedMap((Map)localObject1);
    this.typeTokenCache = ((Map)localObject1);
    localObject1 = new com/google/gson/Gson$1;
    ((Gson.1)localObject1).<init>(this);
    this.deserializationContext = ((JsonDeserializationContext)localObject1);
    localObject1 = new com/google/gson/Gson$2;
    ((Gson.2)localObject1).<init>(this);
    this.serializationContext = ((JsonSerializationContext)localObject1);
    localObject1 = new com/google/gson/internal/ConstructorConstructor;
    ((ConstructorConstructor)localObject1).<init>(paramMap);
    this.constructorConstructor = ((ConstructorConstructor)localObject1);
    this.serializeNulls = paramBoolean1;
    this.generateNonExecutableJson = paramBoolean3;
    this.htmlSafe = paramBoolean4;
    this.prettyPrinting = paramBoolean5;
    this.lenient = paramBoolean6;
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = TypeAdapters.JSON_ELEMENT_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = ObjectTypeAdapter.FACTORY;
    ((List)localObject1).add(localObject2);
    ((List)localObject1).add(paramExcluder);
    ((List)localObject1).addAll(paramList);
    localObject2 = TypeAdapters.STRING_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.INTEGER_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.BOOLEAN_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.BYTE_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.SHORT_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = longAdapter(paramLongSerializationPolicy);
    Object localObject3 = TypeAdapters.newFactory(Long.TYPE, Long.class, (TypeAdapter)localObject2);
    ((List)localObject1).add(localObject3);
    localObject3 = Double.TYPE;
    TypeAdapter localTypeAdapter1 = doubleAdapter(paramBoolean7);
    localObject3 = TypeAdapters.newFactory((Class)localObject3, Double.class, localTypeAdapter1);
    ((List)localObject1).add(localObject3);
    localObject3 = Float.TYPE;
    localTypeAdapter1 = floatAdapter(paramBoolean7);
    localObject3 = TypeAdapters.newFactory((Class)localObject3, Float.class, localTypeAdapter1);
    ((List)localObject1).add(localObject3);
    localObject3 = TypeAdapters.NUMBER_FACTORY;
    ((List)localObject1).add(localObject3);
    localObject3 = TypeAdapters.ATOMIC_INTEGER_FACTORY;
    ((List)localObject1).add(localObject3);
    localObject3 = TypeAdapters.ATOMIC_BOOLEAN_FACTORY;
    ((List)localObject1).add(localObject3);
    TypeAdapter localTypeAdapter2 = atomicLongAdapter((TypeAdapter)localObject2);
    localObject3 = TypeAdapters.newFactory(AtomicLong.class, localTypeAdapter2);
    ((List)localObject1).add(localObject3);
    localObject2 = atomicLongArrayAdapter((TypeAdapter)localObject2);
    localObject2 = TypeAdapters.newFactory(AtomicLongArray.class, (TypeAdapter)localObject2);
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.CHARACTER_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.STRING_BUILDER_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.STRING_BUFFER_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject3 = TypeAdapters.BIG_DECIMAL;
    localObject2 = TypeAdapters.newFactory(BigDecimal.class, (TypeAdapter)localObject3);
    ((List)localObject1).add(localObject2);
    localObject3 = TypeAdapters.BIG_INTEGER;
    localObject2 = TypeAdapters.newFactory(BigInteger.class, (TypeAdapter)localObject3);
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.URL_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.URI_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.UUID_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.CURRENCY_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.LOCALE_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.INET_ADDRESS_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.BIT_SET_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = DateTypeAdapter.FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.CALENDAR_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TimeTypeAdapter.FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = SqlDateTypeAdapter.FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.TIMESTAMP_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = ArrayTypeAdapter.FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.CLASS_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/CollectionTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((CollectionTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3);
    ((List)localObject1).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/MapTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((MapTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3, paramBoolean2);
    ((List)localObject1).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((JsonAdapterAnnotationTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3);
    ((List)localObject1).add(localObject2);
    localObject2 = TypeAdapters.ENUM_FACTORY;
    ((List)localObject1).add(localObject2);
    localObject2 = new com/google/gson/internal/bind/ReflectiveTypeAdapterFactory;
    localObject3 = this.constructorConstructor;
    ((ReflectiveTypeAdapterFactory)localObject2).<init>((ConstructorConstructor)localObject3, paramFieldNamingStrategy, paramExcluder);
    ((List)localObject1).add(localObject2);
    localObject1 = Collections.unmodifiableList((List)localObject1);
    this.factories = ((List)localObject1);
  }
  
  private static void assertFullConsumption(Object paramObject, JsonReader paramJsonReader)
  {
    if (paramObject != null) {
      try
      {
        Object localObject1 = paramJsonReader.peek();
        localObject2 = JsonToken.END_DOCUMENT;
        if (localObject1 != localObject2)
        {
          localObject1 = new com/google/gson/JsonIOException;
          localObject2 = "JSON document was not fully consumed.";
          ((JsonIOException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      catch (MalformedJsonException localMalformedJsonException)
      {
        localObject2 = new com/google/gson/JsonSyntaxException;
        ((JsonSyntaxException)localObject2).<init>(localMalformedJsonException);
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException)
      {
        Object localObject2 = new com/google/gson/JsonIOException;
        ((JsonIOException)localObject2).<init>(localIOException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  private static TypeAdapter atomicLongAdapter(TypeAdapter paramTypeAdapter)
  {
    Gson.6 local6 = new com/google/gson/Gson$6;
    local6.<init>(paramTypeAdapter);
    return local6.nullSafe();
  }
  
  private static TypeAdapter atomicLongArrayAdapter(TypeAdapter paramTypeAdapter)
  {
    Gson.7 local7 = new com/google/gson/Gson$7;
    local7.<init>(paramTypeAdapter);
    return local7.nullSafe();
  }
  
  static void checkValidFloatingPoint(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      bool = Double.isInfinite(paramDouble);
      if (!bool) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  private TypeAdapter doubleAdapter(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = TypeAdapters.DOUBLE;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/Gson$3;
      ((Gson.3)localObject).<init>(this);
    }
  }
  
  private TypeAdapter floatAdapter(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      localObject = TypeAdapters.FLOAT;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/Gson$4;
      ((Gson.4)localObject).<init>(this);
    }
  }
  
  private static TypeAdapter longAdapter(LongSerializationPolicy paramLongSerializationPolicy)
  {
    Object localObject = LongSerializationPolicy.DEFAULT;
    if (paramLongSerializationPolicy == localObject) {
      localObject = TypeAdapters.LONG;
    }
    for (;;)
    {
      return (TypeAdapter)localObject;
      localObject = new com/google/gson/Gson$5;
      ((Gson.5)localObject).<init>();
    }
  }
  
  public Object fromJson(JsonElement paramJsonElement, Class paramClass)
  {
    Object localObject = fromJson(paramJsonElement, paramClass);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(JsonElement paramJsonElement, Type paramType)
  {
    if (paramJsonElement == null) {}
    for (Object localObject = null;; localObject = fromJson((JsonReader)localObject, paramType))
    {
      return localObject;
      localObject = new com/google/gson/internal/bind/JsonTreeReader;
      ((JsonTreeReader)localObject).<init>(paramJsonElement);
    }
  }
  
  /* Error */
  public Object fromJson(JsonReader paramJsonReader, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 411	com/google/gson/stream/JsonReader:isLenient	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iload_3
    //   10: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   13: aload_1
    //   14: invokevirtual 301	com/google/gson/stream/JsonReader:peek	()Lcom/google/gson/stream/JsonToken;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aconst_null
    //   21: astore 5
    //   23: aload_2
    //   24: invokestatic 421	com/google/gson/reflect/TypeToken:get	(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
    //   27: astore 6
    //   29: aload_0
    //   30: aload 6
    //   32: invokevirtual 425	com/google/gson/Gson:getAdapter	(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    //   35: astore 6
    //   37: aload 6
    //   39: aload_1
    //   40: invokevirtual 431	com/google/gson/TypeAdapter:read	(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    //   43: astore 6
    //   45: aload_1
    //   46: iload 4
    //   48: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   51: aload 6
    //   53: areturn
    //   54: astore 6
    //   56: iload_3
    //   57: ifeq +15 -> 72
    //   60: aconst_null
    //   61: astore 6
    //   63: aload_1
    //   64: iload 4
    //   66: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   69: goto -18 -> 51
    //   72: new 316	com/google/gson/JsonSyntaxException
    //   75: astore 5
    //   77: aload 5
    //   79: aload 6
    //   81: invokespecial 319	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   84: aload 5
    //   86: athrow
    //   87: astore 6
    //   89: aload_1
    //   90: iload 4
    //   92: invokevirtual 415	com/google/gson/stream/JsonReader:setLenient	(Z)V
    //   95: aload 6
    //   97: athrow
    //   98: astore 6
    //   100: new 316	com/google/gson/JsonSyntaxException
    //   103: astore 5
    //   105: aload 5
    //   107: aload 6
    //   109: invokespecial 319	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   112: aload 5
    //   114: athrow
    //   115: astore 6
    //   117: new 316	com/google/gson/JsonSyntaxException
    //   120: astore 5
    //   122: aload 5
    //   124: aload 6
    //   126: invokespecial 319	com/google/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   129: aload 5
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	Gson
    //   0	132	1	paramJsonReader	JsonReader
    //   0	132	2	paramType	Type
    //   1	56	3	bool1	boolean
    //   6	85	4	bool2	boolean
    //   21	109	5	localJsonSyntaxException	JsonSyntaxException
    //   27	25	6	localObject1	Object
    //   54	1	6	localEOFException	java.io.EOFException
    //   61	19	6	localThrowable	Throwable
    //   87	9	6	localObject2	Object
    //   98	10	6	localIllegalStateException	IllegalStateException
    //   115	10	6	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   13	18	54	java/io/EOFException
    //   23	27	54	java/io/EOFException
    //   30	35	54	java/io/EOFException
    //   39	43	54	java/io/EOFException
    //   13	18	87	finally
    //   23	27	87	finally
    //   30	35	87	finally
    //   39	43	87	finally
    //   72	75	87	finally
    //   79	84	87	finally
    //   84	87	87	finally
    //   100	103	87	finally
    //   107	112	87	finally
    //   112	115	87	finally
    //   117	120	87	finally
    //   124	129	87	finally
    //   129	132	87	finally
    //   13	18	98	java/lang/IllegalStateException
    //   23	27	98	java/lang/IllegalStateException
    //   30	35	98	java/lang/IllegalStateException
    //   39	43	98	java/lang/IllegalStateException
    //   13	18	115	java/io/IOException
    //   23	27	115	java/io/IOException
    //   30	35	115	java/io/IOException
    //   39	43	115	java/io/IOException
  }
  
  public Object fromJson(Reader paramReader, Class paramClass)
  {
    JsonReader localJsonReader = newJsonReader(paramReader);
    Object localObject = fromJson(localJsonReader, paramClass);
    assertFullConsumption(localObject, localJsonReader);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(Reader paramReader, Type paramType)
  {
    JsonReader localJsonReader = newJsonReader(paramReader);
    Object localObject = fromJson(localJsonReader, paramType);
    assertFullConsumption(localObject, localJsonReader);
    return localObject;
  }
  
  public Object fromJson(String paramString, Class paramClass)
  {
    Object localObject = fromJson(paramString, paramClass);
    return Primitives.wrap(paramClass).cast(localObject);
  }
  
  public Object fromJson(String paramString, Type paramType)
  {
    if (paramString == null) {}
    for (Object localObject = null;; localObject = fromJson((Reader)localObject, paramType))
    {
      return localObject;
      localObject = new java/io/StringReader;
      ((StringReader)localObject).<init>(paramString);
    }
  }
  
  public TypeAdapter getAdapter(TypeToken paramTypeToken)
  {
    Object localObject1 = (TypeAdapter)this.typeTokenCache.get(paramTypeToken);
    if (localObject1 != null) {
      return (TypeAdapter)localObject1;
    }
    localObject1 = (Map)this.calls.get();
    int i = 0;
    Object localObject3 = null;
    boolean bool;
    Object localObject4;
    if (localObject1 == null)
    {
      localObject3 = new java/util/HashMap;
      ((HashMap)localObject3).<init>();
      localObject1 = this.calls;
      ((ThreadLocal)localObject1).set(localObject3);
      bool = true;
      localObject4 = localObject3;
      i = bool;
    }
    for (;;)
    {
      localObject1 = (Gson.FutureTypeAdapter)((Map)localObject4).get(paramTypeToken);
      if (localObject1 != null) {
        break;
      }
      try
      {
        Object localObject5 = new com/google/gson/Gson$FutureTypeAdapter;
        ((Gson.FutureTypeAdapter)localObject5).<init>();
        ((Map)localObject4).put(paramTypeToken, localObject5);
        localObject1 = this.factories;
        Object localObject6 = ((List)localObject1).iterator();
        do
        {
          bool = ((Iterator)localObject6).hasNext();
          if (!bool) {
            break;
          }
          localObject1 = ((Iterator)localObject6).next();
          localObject1 = (TypeAdapterFactory)localObject1;
          localObject1 = ((TypeAdapterFactory)localObject1).create(this, paramTypeToken);
        } while (localObject1 == null);
        ((Gson.FutureTypeAdapter)localObject5).setDelegate((TypeAdapter)localObject1);
        localObject5 = this.typeTokenCache;
        ((Map)localObject5).put(paramTypeToken, localObject1);
        ((Map)localObject4).remove(paramTypeToken);
        if (i == 0) {
          break;
        }
        localObject3 = this.calls;
        ((ThreadLocal)localObject3).remove();
        break;
        localObject1 = new java/lang/IllegalArgumentException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject6 = "GSON cannot handle ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = ((StringBuilder)localObject5).append(paramTypeToken);
        localObject5 = ((StringBuilder)localObject5).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject5);
        throw ((Throwable)localObject1);
      }
      finally
      {
        ((Map)localObject4).remove(paramTypeToken);
        if (i != 0)
        {
          localObject3 = this.calls;
          ((ThreadLocal)localObject3).remove();
        }
      }
      localObject4 = localObject2;
    }
  }
  
  public TypeAdapter getAdapter(Class paramClass)
  {
    TypeToken localTypeToken = TypeToken.get(paramClass);
    return getAdapter(localTypeToken);
  }
  
  public TypeAdapter getDelegateAdapter(TypeAdapterFactory paramTypeAdapterFactory, TypeToken paramTypeToken)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    Object localObject1 = null;
    List localList = this.factories;
    boolean bool3 = localList.contains(paramTypeAdapterFactory);
    if (!bool3) {
      bool2 = bool1;
    }
    localList = this.factories;
    Iterator localIterator = localList.iterator();
    bool3 = bool2;
    do
    {
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break label117;
        }
        localObject1 = (TypeAdapterFactory)localIterator.next();
        if (bool3) {
          break;
        }
        if (localObject1 == paramTypeAdapterFactory) {
          bool3 = bool1;
        }
      }
      localObject1 = ((TypeAdapterFactory)localObject1).create(this, paramTypeToken);
    } while (localObject1 == null);
    return (TypeAdapter)localObject1;
    label117:
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "GSON cannot serialize " + paramTypeToken;
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonReader newJsonReader(Reader paramReader)
  {
    JsonReader localJsonReader = new com/google/gson/stream/JsonReader;
    localJsonReader.<init>(paramReader);
    boolean bool = this.lenient;
    localJsonReader.setLenient(bool);
    return localJsonReader;
  }
  
  public JsonWriter newJsonWriter(Writer paramWriter)
  {
    boolean bool1 = this.generateNonExecutableJson;
    if (bool1)
    {
      localObject = ")]}'\n";
      paramWriter.write((String)localObject);
    }
    Object localObject = new com/google/gson/stream/JsonWriter;
    ((JsonWriter)localObject).<init>(paramWriter);
    boolean bool2 = this.prettyPrinting;
    if (bool2)
    {
      String str = "  ";
      ((JsonWriter)localObject).setIndent(str);
    }
    bool2 = this.serializeNulls;
    ((JsonWriter)localObject).setSerializeNulls(bool2);
    return (JsonWriter)localObject;
  }
  
  public String toJson(JsonElement paramJsonElement)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    toJson(paramJsonElement, localStringWriter);
    return localStringWriter.toString();
  }
  
  public String toJson(Object paramObject)
  {
    if (paramObject == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (Object localObject = toJson((JsonElement)localObject);; localObject = toJson(paramObject, (Type)localObject))
    {
      return (String)localObject;
      localObject = paramObject.getClass();
    }
  }
  
  public String toJson(Object paramObject, Type paramType)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    toJson(paramObject, paramType, localStringWriter);
    return localStringWriter.toString();
  }
  
  public void toJson(JsonElement paramJsonElement, JsonWriter paramJsonWriter)
  {
    boolean bool1 = paramJsonWriter.isLenient();
    paramJsonWriter.setLenient(true);
    boolean bool2 = paramJsonWriter.isHtmlSafe();
    boolean bool3 = this.htmlSafe;
    paramJsonWriter.setHtmlSafe(bool3);
    boolean bool4 = paramJsonWriter.getSerializeNulls();
    bool3 = this.serializeNulls;
    paramJsonWriter.setSerializeNulls(bool3);
    try
    {
      Streams.write(paramJsonElement, paramJsonWriter);
      return;
    }
    catch (IOException localIOException)
    {
      JsonIOException localJsonIOException = new com/google/gson/JsonIOException;
      localJsonIOException.<init>(localIOException);
      throw localJsonIOException;
    }
    finally
    {
      paramJsonWriter.setLenient(bool1);
      paramJsonWriter.setHtmlSafe(bool2);
      paramJsonWriter.setSerializeNulls(bool4);
    }
  }
  
  public void toJson(JsonElement paramJsonElement, Appendable paramAppendable)
  {
    try
    {
      Object localObject = Streams.writerForAppendable(paramAppendable);
      localObject = newJsonWriter((Writer)localObject);
      toJson(paramJsonElement, (JsonWriter)localObject);
      return;
    }
    catch (IOException localIOException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localIOException);
      throw localRuntimeException;
    }
  }
  
  public void toJson(Object paramObject, Appendable paramAppendable)
  {
    Object localObject;
    if (paramObject != null)
    {
      localObject = paramObject.getClass();
      toJson(paramObject, (Type)localObject, paramAppendable);
    }
    for (;;)
    {
      return;
      localObject = JsonNull.INSTANCE;
      toJson((JsonElement)localObject, paramAppendable);
    }
  }
  
  public void toJson(Object paramObject, Type paramType, JsonWriter paramJsonWriter)
  {
    Object localObject1 = TypeToken.get(paramType);
    localObject1 = getAdapter((TypeToken)localObject1);
    boolean bool1 = paramJsonWriter.isLenient();
    paramJsonWriter.setLenient(true);
    boolean bool2 = paramJsonWriter.isHtmlSafe();
    boolean bool3 = this.htmlSafe;
    paramJsonWriter.setHtmlSafe(bool3);
    bool3 = paramJsonWriter.getSerializeNulls();
    boolean bool4 = this.serializeNulls;
    paramJsonWriter.setSerializeNulls(bool4);
    try
    {
      ((TypeAdapter)localObject1).write(paramJsonWriter, paramObject);
      return;
    }
    catch (IOException localIOException)
    {
      JsonIOException localJsonIOException = new com/google/gson/JsonIOException;
      localJsonIOException.<init>(localIOException);
      throw localJsonIOException;
    }
    finally
    {
      paramJsonWriter.setLenient(bool1);
      paramJsonWriter.setHtmlSafe(bool2);
      paramJsonWriter.setSerializeNulls(bool3);
    }
  }
  
  public void toJson(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      Object localObject = Streams.writerForAppendable(paramAppendable);
      localObject = newJsonWriter((Writer)localObject);
      toJson(paramObject, paramType, (JsonWriter)localObject);
      return;
    }
    catch (IOException localIOException)
    {
      JsonIOException localJsonIOException = new com/google/gson/JsonIOException;
      localJsonIOException.<init>(localIOException);
      throw localJsonIOException;
    }
  }
  
  public JsonElement toJsonTree(Object paramObject)
  {
    if (paramObject == null) {}
    for (Object localObject = JsonNull.INSTANCE;; localObject = toJsonTree(paramObject, (Type)localObject))
    {
      return (JsonElement)localObject;
      localObject = paramObject.getClass();
    }
  }
  
  public JsonElement toJsonTree(Object paramObject, Type paramType)
  {
    JsonTreeWriter localJsonTreeWriter = new com/google/gson/internal/bind/JsonTreeWriter;
    localJsonTreeWriter.<init>();
    toJson(paramObject, paramType, localJsonTreeWriter);
    return localJsonTreeWriter.get();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("{serializeNulls:");
    boolean bool = this.serializeNulls;
    localStringBuilder = localStringBuilder.append(bool).append("factories:");
    Object localObject = this.factories;
    localStringBuilder = localStringBuilder.append(localObject).append(",instanceCreators:");
    localObject = this.constructorConstructor;
    return localObject + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\Gson.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */