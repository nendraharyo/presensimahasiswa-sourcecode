package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class JsonObject
  extends JsonElement
{
  private final LinkedTreeMap members;
  
  public JsonObject()
  {
    LinkedTreeMap localLinkedTreeMap = new com/google/gson/internal/LinkedTreeMap;
    localLinkedTreeMap.<init>();
    this.members = localLinkedTreeMap;
  }
  
  private JsonElement createJsonElement(Object paramObject)
  {
    Object localObject;
    if (paramObject == null) {
      localObject = JsonNull.INSTANCE;
    }
    for (;;)
    {
      return (JsonElement)localObject;
      localObject = new com/google/gson/JsonPrimitive;
      ((JsonPrimitive)localObject).<init>(paramObject);
    }
  }
  
  public void add(String paramString, JsonElement paramJsonElement)
  {
    if (paramJsonElement == null) {
      paramJsonElement = JsonNull.INSTANCE;
    }
    this.members.put(paramString, paramJsonElement);
  }
  
  public void addProperty(String paramString, Boolean paramBoolean)
  {
    JsonElement localJsonElement = createJsonElement(paramBoolean);
    add(paramString, localJsonElement);
  }
  
  public void addProperty(String paramString, Character paramCharacter)
  {
    JsonElement localJsonElement = createJsonElement(paramCharacter);
    add(paramString, localJsonElement);
  }
  
  public void addProperty(String paramString, Number paramNumber)
  {
    JsonElement localJsonElement = createJsonElement(paramNumber);
    add(paramString, localJsonElement);
  }
  
  public void addProperty(String paramString1, String paramString2)
  {
    JsonElement localJsonElement = createJsonElement(paramString2);
    add(paramString1, localJsonElement);
  }
  
  JsonObject deepCopy()
  {
    JsonObject localJsonObject = new com/google/gson/JsonObject;
    localJsonObject.<init>();
    Object localObject = this.members.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((JsonElement)((Map.Entry)localObject).getValue()).deepCopy();
      localJsonObject.add(str, (JsonElement)localObject);
    }
    return localJsonObject;
  }
  
  public Set entrySet()
  {
    return this.members.entrySet();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    LinkedTreeMap localLinkedTreeMap1;
    if (paramObject != this)
    {
      bool = paramObject instanceof JsonObject;
      if (bool)
      {
        paramObject = (JsonObject)paramObject;
        localLinkedTreeMap1 = ((JsonObject)paramObject).members;
        LinkedTreeMap localLinkedTreeMap2 = this.members;
        bool = localLinkedTreeMap1.equals(localLinkedTreeMap2);
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
      localLinkedTreeMap1 = null;
    }
  }
  
  public JsonElement get(String paramString)
  {
    return (JsonElement)this.members.get(paramString);
  }
  
  public JsonArray getAsJsonArray(String paramString)
  {
    return (JsonArray)this.members.get(paramString);
  }
  
  public JsonObject getAsJsonObject(String paramString)
  {
    return (JsonObject)this.members.get(paramString);
  }
  
  public JsonPrimitive getAsJsonPrimitive(String paramString)
  {
    return (JsonPrimitive)this.members.get(paramString);
  }
  
  public boolean has(String paramString)
  {
    return this.members.containsKey(paramString);
  }
  
  public int hashCode()
  {
    return this.members.hashCode();
  }
  
  public JsonElement remove(String paramString)
  {
    return (JsonElement)this.members.remove(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\JsonObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */