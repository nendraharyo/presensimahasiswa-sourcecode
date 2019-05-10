package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters
{
  public static final TypeAdapter ATOMIC_BOOLEAN;
  public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
  public static final TypeAdapter ATOMIC_INTEGER;
  public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
  public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
  public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
  public static final TypeAdapter BIG_DECIMAL;
  public static final TypeAdapter BIG_INTEGER;
  public static final TypeAdapter BIT_SET;
  public static final TypeAdapterFactory BIT_SET_FACTORY;
  public static final TypeAdapter BOOLEAN;
  public static final TypeAdapter BOOLEAN_AS_STRING;
  public static final TypeAdapterFactory BOOLEAN_FACTORY;
  public static final TypeAdapter BYTE;
  public static final TypeAdapterFactory BYTE_FACTORY;
  public static final TypeAdapter CALENDAR;
  public static final TypeAdapterFactory CALENDAR_FACTORY;
  public static final TypeAdapter CHARACTER;
  public static final TypeAdapterFactory CHARACTER_FACTORY;
  public static final TypeAdapter CLASS;
  public static final TypeAdapterFactory CLASS_FACTORY;
  public static final TypeAdapter CURRENCY;
  public static final TypeAdapterFactory CURRENCY_FACTORY;
  public static final TypeAdapter DOUBLE;
  public static final TypeAdapterFactory ENUM_FACTORY;
  public static final TypeAdapter FLOAT;
  public static final TypeAdapter INET_ADDRESS;
  public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
  public static final TypeAdapter INTEGER;
  public static final TypeAdapterFactory INTEGER_FACTORY;
  public static final TypeAdapter JSON_ELEMENT;
  public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
  public static final TypeAdapter LOCALE;
  public static final TypeAdapterFactory LOCALE_FACTORY;
  public static final TypeAdapter LONG;
  public static final TypeAdapter NUMBER;
  public static final TypeAdapterFactory NUMBER_FACTORY;
  public static final TypeAdapter SHORT;
  public static final TypeAdapterFactory SHORT_FACTORY;
  public static final TypeAdapter STRING;
  public static final TypeAdapter STRING_BUFFER;
  public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
  public static final TypeAdapter STRING_BUILDER;
  public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
  public static final TypeAdapterFactory STRING_FACTORY;
  public static final TypeAdapterFactory TIMESTAMP_FACTORY;
  public static final TypeAdapter URI;
  public static final TypeAdapterFactory URI_FACTORY;
  public static final TypeAdapter URL;
  public static final TypeAdapterFactory URL_FACTORY;
  public static final TypeAdapter UUID;
  public static final TypeAdapterFactory UUID_FACTORY;
  
  static
  {
    Object localObject = new com/google/gson/internal/bind/TypeAdapters$1;
    ((TypeAdapters.1)localObject).<init>();
    CLASS = (TypeAdapter)localObject;
    TypeAdapter localTypeAdapter1 = CLASS;
    CLASS_FACTORY = newFactory(Class.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$2;
    ((TypeAdapters.2)localObject).<init>();
    BIT_SET = (TypeAdapter)localObject;
    localTypeAdapter1 = BIT_SET;
    BIT_SET_FACTORY = newFactory(BitSet.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$3;
    ((TypeAdapters.3)localObject).<init>();
    BOOLEAN = (TypeAdapter)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$4;
    ((TypeAdapters.4)localObject).<init>();
    BOOLEAN_AS_STRING = (TypeAdapter)localObject;
    localObject = Boolean.TYPE;
    TypeAdapter localTypeAdapter2 = BOOLEAN;
    BOOLEAN_FACTORY = newFactory((Class)localObject, Boolean.class, localTypeAdapter2);
    localObject = new com/google/gson/internal/bind/TypeAdapters$5;
    ((TypeAdapters.5)localObject).<init>();
    BYTE = (TypeAdapter)localObject;
    localObject = Byte.TYPE;
    localTypeAdapter2 = BYTE;
    BYTE_FACTORY = newFactory((Class)localObject, Byte.class, localTypeAdapter2);
    localObject = new com/google/gson/internal/bind/TypeAdapters$6;
    ((TypeAdapters.6)localObject).<init>();
    SHORT = (TypeAdapter)localObject;
    localObject = Short.TYPE;
    localTypeAdapter2 = SHORT;
    SHORT_FACTORY = newFactory((Class)localObject, Short.class, localTypeAdapter2);
    localObject = new com/google/gson/internal/bind/TypeAdapters$7;
    ((TypeAdapters.7)localObject).<init>();
    INTEGER = (TypeAdapter)localObject;
    localObject = Integer.TYPE;
    localTypeAdapter2 = INTEGER;
    INTEGER_FACTORY = newFactory((Class)localObject, Integer.class, localTypeAdapter2);
    localObject = new com/google/gson/internal/bind/TypeAdapters$8;
    ((TypeAdapters.8)localObject).<init>();
    ATOMIC_INTEGER = ((TypeAdapters.8)localObject).nullSafe();
    localTypeAdapter1 = ATOMIC_INTEGER;
    ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$9;
    ((TypeAdapters.9)localObject).<init>();
    ATOMIC_BOOLEAN = ((TypeAdapters.9)localObject).nullSafe();
    localTypeAdapter1 = ATOMIC_BOOLEAN;
    ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$10;
    ((TypeAdapters.10)localObject).<init>();
    ATOMIC_INTEGER_ARRAY = ((TypeAdapters.10)localObject).nullSafe();
    localTypeAdapter1 = ATOMIC_INTEGER_ARRAY;
    ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$11;
    ((TypeAdapters.11)localObject).<init>();
    LONG = (TypeAdapter)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$12;
    ((TypeAdapters.12)localObject).<init>();
    FLOAT = (TypeAdapter)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$13;
    ((TypeAdapters.13)localObject).<init>();
    DOUBLE = (TypeAdapter)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$14;
    ((TypeAdapters.14)localObject).<init>();
    NUMBER = (TypeAdapter)localObject;
    localTypeAdapter1 = NUMBER;
    NUMBER_FACTORY = newFactory(Number.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$15;
    ((TypeAdapters.15)localObject).<init>();
    CHARACTER = (TypeAdapter)localObject;
    localObject = Character.TYPE;
    localTypeAdapter2 = CHARACTER;
    CHARACTER_FACTORY = newFactory((Class)localObject, Character.class, localTypeAdapter2);
    localObject = new com/google/gson/internal/bind/TypeAdapters$16;
    ((TypeAdapters.16)localObject).<init>();
    STRING = (TypeAdapter)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$17;
    ((TypeAdapters.17)localObject).<init>();
    BIG_DECIMAL = (TypeAdapter)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$18;
    ((TypeAdapters.18)localObject).<init>();
    BIG_INTEGER = (TypeAdapter)localObject;
    localTypeAdapter1 = STRING;
    STRING_FACTORY = newFactory(String.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$19;
    ((TypeAdapters.19)localObject).<init>();
    STRING_BUILDER = (TypeAdapter)localObject;
    localTypeAdapter1 = STRING_BUILDER;
    STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$20;
    ((TypeAdapters.20)localObject).<init>();
    STRING_BUFFER = (TypeAdapter)localObject;
    localTypeAdapter1 = STRING_BUFFER;
    STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$21;
    ((TypeAdapters.21)localObject).<init>();
    URL = (TypeAdapter)localObject;
    localTypeAdapter1 = URL;
    URL_FACTORY = newFactory(URL.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$22;
    ((TypeAdapters.22)localObject).<init>();
    URI = (TypeAdapter)localObject;
    localTypeAdapter1 = URI;
    URI_FACTORY = newFactory(URI.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$23;
    ((TypeAdapters.23)localObject).<init>();
    INET_ADDRESS = (TypeAdapter)localObject;
    localTypeAdapter1 = INET_ADDRESS;
    INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$24;
    ((TypeAdapters.24)localObject).<init>();
    UUID = (TypeAdapter)localObject;
    localTypeAdapter1 = UUID;
    UUID_FACTORY = newFactory(UUID.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$25;
    ((TypeAdapters.25)localObject).<init>();
    CURRENCY = ((TypeAdapters.25)localObject).nullSafe();
    localTypeAdapter1 = CURRENCY;
    CURRENCY_FACTORY = newFactory(Currency.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$26;
    ((TypeAdapters.26)localObject).<init>();
    TIMESTAMP_FACTORY = (TypeAdapterFactory)localObject;
    localObject = new com/google/gson/internal/bind/TypeAdapters$27;
    ((TypeAdapters.27)localObject).<init>();
    CALENDAR = (TypeAdapter)localObject;
    localTypeAdapter2 = CALENDAR;
    CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, localTypeAdapter2);
    localObject = new com/google/gson/internal/bind/TypeAdapters$28;
    ((TypeAdapters.28)localObject).<init>();
    LOCALE = (TypeAdapter)localObject;
    localTypeAdapter1 = LOCALE;
    LOCALE_FACTORY = newFactory(Locale.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$29;
    ((TypeAdapters.29)localObject).<init>();
    JSON_ELEMENT = (TypeAdapter)localObject;
    localTypeAdapter1 = JSON_ELEMENT;
    JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, localTypeAdapter1);
    localObject = new com/google/gson/internal/bind/TypeAdapters$30;
    ((TypeAdapters.30)localObject).<init>();
    ENUM_FACTORY = (TypeAdapterFactory)localObject;
  }
  
  private TypeAdapters()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static TypeAdapterFactory newFactory(TypeToken paramTypeToken, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.31 local31 = new com/google/gson/internal/bind/TypeAdapters$31;
    local31.<init>(paramTypeToken, paramTypeAdapter);
    return local31;
  }
  
  public static TypeAdapterFactory newFactory(Class paramClass, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.32 local32 = new com/google/gson/internal/bind/TypeAdapters$32;
    local32.<init>(paramClass, paramTypeAdapter);
    return local32;
  }
  
  public static TypeAdapterFactory newFactory(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.33 local33 = new com/google/gson/internal/bind/TypeAdapters$33;
    local33.<init>(paramClass1, paramClass2, paramTypeAdapter);
    return local33;
  }
  
  public static TypeAdapterFactory newFactoryForMultipleTypes(Class paramClass1, Class paramClass2, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.34 local34 = new com/google/gson/internal/bind/TypeAdapters$34;
    local34.<init>(paramClass1, paramClass2, paramTypeAdapter);
    return local34;
  }
  
  public static TypeAdapterFactory newTypeHierarchyFactory(Class paramClass, TypeAdapter paramTypeAdapter)
  {
    TypeAdapters.35 local35 = new com/google/gson/internal/bind/TypeAdapters$35;
    local35.<init>(paramClass, paramTypeAdapter);
    return local35;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bind\TypeAdapters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */