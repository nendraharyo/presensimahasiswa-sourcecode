package org.apache.http.config;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.util.Args;

public final class RegistryBuilder
{
  private final Map items;
  
  RegistryBuilder()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.items = localHashMap;
  }
  
  public static RegistryBuilder create()
  {
    RegistryBuilder localRegistryBuilder = new org/apache/http/config/RegistryBuilder;
    localRegistryBuilder.<init>();
    return localRegistryBuilder;
  }
  
  public Registry build()
  {
    Registry localRegistry = new org/apache/http/config/Registry;
    Map localMap = this.items;
    localRegistry.<init>(localMap);
    return localRegistry;
  }
  
  public RegistryBuilder register(String paramString, Object paramObject)
  {
    Args.notEmpty(paramString, "ID");
    Args.notNull(paramObject, "Item");
    Map localMap = this.items;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localMap.put(localObject, paramObject);
    return this;
  }
  
  public String toString()
  {
    return this.items.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\config\RegistryBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */