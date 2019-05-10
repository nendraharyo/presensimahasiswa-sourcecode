package org.apache.http.entity.mime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Header
  implements Iterable
{
  private final Map fieldMap;
  private final List fields;
  
  public Header()
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.fields = ((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.fieldMap = ((Map)localObject);
  }
  
  public void addField(MinimalField paramMinimalField)
  {
    if (paramMinimalField == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramMinimalField.getName();
      Object localObject2 = Locale.ENGLISH;
      localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
      localObject1 = (List)this.fieldMap.get(localObject2);
      if (localObject1 == null)
      {
        localObject1 = new java/util/LinkedList;
        ((LinkedList)localObject1).<init>();
        Map localMap = this.fieldMap;
        localMap.put(localObject2, localObject1);
      }
      ((List)localObject1).add(paramMinimalField);
      localObject1 = this.fields;
      ((List)localObject1).add(paramMinimalField);
    }
  }
  
  public MinimalField getField(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    for (;;)
    {
      return (MinimalField)localObject;
      localObject = Locale.ENGLISH;
      localObject = paramString.toLowerCase((Locale)localObject);
      Map localMap = this.fieldMap;
      localObject = (List)localMap.get(localObject);
      if (localObject != null)
      {
        boolean bool = ((List)localObject).isEmpty();
        if (!bool)
        {
          localObject = (MinimalField)((List)localObject).get(0);
          continue;
        }
      }
      localObject = null;
    }
  }
  
  public List getFields()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    List localList = this.fields;
    localArrayList.<init>(localList);
    return localArrayList;
  }
  
  public List getFields(String paramString)
  {
    Object localObject1;
    if (paramString == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (List)localObject1;
      localObject1 = Locale.ENGLISH;
      localObject1 = paramString.toLowerCase((Locale)localObject1);
      Object localObject2 = this.fieldMap;
      localObject1 = (List)((Map)localObject2).get(localObject1);
      if (localObject1 != null)
      {
        boolean bool = ((List)localObject1).isEmpty();
        if (!bool) {}
      }
      else
      {
        localObject1 = Collections.emptyList();
        continue;
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>((Collection)localObject1);
      localObject1 = localObject2;
    }
  }
  
  public Iterator iterator()
  {
    return Collections.unmodifiableList(this.fields).iterator();
  }
  
  public int removeFields(String paramString)
  {
    List localList = null;
    int i;
    Object localObject;
    if (paramString == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = Locale.ENGLISH;
      localObject = paramString.toLowerCase((Locale)localObject);
      Map localMap = this.fieldMap;
      localObject = (List)localMap.remove(localObject);
      if (localObject != null)
      {
        boolean bool = ((List)localObject).isEmpty();
        if (!bool) {}
      }
      else
      {
        i = 0;
        localObject = null;
        continue;
      }
      localList = this.fields;
      localList.removeAll((Collection)localObject);
      i = ((List)localObject).size();
    }
  }
  
  public void setField(MinimalField paramMinimalField)
  {
    int i = -1;
    if (paramMinimalField == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramMinimalField.getName();
      Object localObject2 = Locale.ENGLISH;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      localObject2 = this.fieldMap;
      localObject1 = (List)((Map)localObject2).get(localObject1);
      if (localObject1 != null)
      {
        j = ((List)localObject1).isEmpty();
        if (j == 0) {}
      }
      else
      {
        addField(paramMinimalField);
        continue;
      }
      ((List)localObject1).clear();
      ((List)localObject1).add(paramMinimalField);
      boolean bool = false;
      localObject1 = null;
      Iterator localIterator = this.fields.iterator();
      int j = 0;
      localObject2 = null;
      int m = i;
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((MinimalField)localIterator.next()).getName();
        String str = paramMinimalField.getName();
        bool = ((String)localObject1).equalsIgnoreCase(str);
        if (bool)
        {
          localIterator.remove();
          if (m == i) {
            m = j;
          }
        }
        int k = j + 1;
        j = k;
      }
      localObject1 = this.fields;
      ((List)localObject1).add(m, paramMinimalField);
    }
  }
  
  public String toString()
  {
    return this.fields.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\mime\Header.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */