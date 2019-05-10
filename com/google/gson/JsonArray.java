package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray
  extends JsonElement
  implements Iterable
{
  private final List elements;
  
  public JsonArray()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.elements = localArrayList;
  }
  
  public void add(JsonElement paramJsonElement)
  {
    if (paramJsonElement == null) {
      paramJsonElement = JsonNull.INSTANCE;
    }
    this.elements.add(paramJsonElement);
  }
  
  public void add(Boolean paramBoolean)
  {
    List localList = this.elements;
    Object localObject;
    if (paramBoolean == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (;;)
    {
      localList.add(localObject);
      return;
      localObject = new com/google/gson/JsonPrimitive;
      ((JsonPrimitive)localObject).<init>(paramBoolean);
    }
  }
  
  public void add(Character paramCharacter)
  {
    List localList = this.elements;
    Object localObject;
    if (paramCharacter == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (;;)
    {
      localList.add(localObject);
      return;
      localObject = new com/google/gson/JsonPrimitive;
      ((JsonPrimitive)localObject).<init>(paramCharacter);
    }
  }
  
  public void add(Number paramNumber)
  {
    List localList = this.elements;
    Object localObject;
    if (paramNumber == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (;;)
    {
      localList.add(localObject);
      return;
      localObject = new com/google/gson/JsonPrimitive;
      ((JsonPrimitive)localObject).<init>(paramNumber);
    }
  }
  
  public void add(String paramString)
  {
    List localList = this.elements;
    Object localObject;
    if (paramString == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (;;)
    {
      localList.add(localObject);
      return;
      localObject = new com/google/gson/JsonPrimitive;
      ((JsonPrimitive)localObject).<init>(paramString);
    }
  }
  
  public void addAll(JsonArray paramJsonArray)
  {
    List localList1 = this.elements;
    List localList2 = paramJsonArray.elements;
    localList1.addAll(localList2);
  }
  
  public boolean contains(JsonElement paramJsonElement)
  {
    return this.elements.contains(paramJsonElement);
  }
  
  JsonArray deepCopy()
  {
    JsonArray localJsonArray = new com/google/gson/JsonArray;
    localJsonArray.<init>();
    Object localObject = this.elements;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = ((JsonElement)localIterator.next()).deepCopy();
      localJsonArray.add((JsonElement)localObject);
    }
    return localJsonArray;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    List localList1;
    if (paramObject != this)
    {
      bool = paramObject instanceof JsonArray;
      if (bool)
      {
        paramObject = (JsonArray)paramObject;
        localList1 = ((JsonArray)paramObject).elements;
        List localList2 = this.elements;
        bool = localList1.equals(localList2);
        if (!bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList1 = null;
    }
  }
  
  public JsonElement get(int paramInt)
  {
    return (JsonElement)this.elements.get(paramInt);
  }
  
  public BigDecimal getAsBigDecimal()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsBigDecimal();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public BigInteger getAsBigInteger()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsBigInteger();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public boolean getAsBoolean()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsBoolean();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public byte getAsByte()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsByte();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public char getAsCharacter()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsCharacter();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public double getAsDouble()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsDouble();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public float getAsFloat()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsFloat();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int getAsInt()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsInt();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public long getAsLong()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsLong();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public Number getAsNumber()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsNumber();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public short getAsShort()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsShort();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public String getAsString()
  {
    Object localObject = this.elements;
    int i = ((List)localObject).size();
    int j = 1;
    if (i == j) {
      return ((JsonElement)this.elements.get(0)).getAsString();
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int hashCode()
  {
    return this.elements.hashCode();
  }
  
  public Iterator iterator()
  {
    return this.elements.iterator();
  }
  
  public JsonElement remove(int paramInt)
  {
    return (JsonElement)this.elements.remove(paramInt);
  }
  
  public boolean remove(JsonElement paramJsonElement)
  {
    return this.elements.remove(paramJsonElement);
  }
  
  public JsonElement set(int paramInt, JsonElement paramJsonElement)
  {
    return (JsonElement)this.elements.set(paramInt, paramJsonElement);
  }
  
  public int size()
  {
    return this.elements.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\JsonArray.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */