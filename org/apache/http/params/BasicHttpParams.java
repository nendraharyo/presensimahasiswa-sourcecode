package org.apache.http.params;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class BasicHttpParams
  extends AbstractHttpParams
  implements Serializable, Cloneable
{
  private static final long serialVersionUID = -7086398485908701455L;
  private final Map parameters;
  
  public BasicHttpParams()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.parameters = localConcurrentHashMap;
  }
  
  public void clear()
  {
    this.parameters.clear();
  }
  
  public Object clone()
  {
    BasicHttpParams localBasicHttpParams = (BasicHttpParams)super.clone();
    copyParams(localBasicHttpParams);
    return localBasicHttpParams;
  }
  
  public HttpParams copy()
  {
    try
    {
      Object localObject = clone();
      return (HttpParams)localObject;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("Cloning not supported");
      throw localUnsupportedOperationException;
    }
  }
  
  public void copyParams(HttpParams paramHttpParams)
  {
    Object localObject = this.parameters.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      paramHttpParams.setParameter(str, localObject);
    }
  }
  
  public Set getNames()
  {
    HashSet localHashSet = new java/util/HashSet;
    Set localSet = this.parameters.keySet();
    localHashSet.<init>(localSet);
    return localHashSet;
  }
  
  public Object getParameter(String paramString)
  {
    return this.parameters.get(paramString);
  }
  
  public boolean isParameterSet(String paramString)
  {
    Object localObject = getParameter(paramString);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean isParameterSetLocally(String paramString)
  {
    Object localObject = this.parameters.get(paramString);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean removeParameter(String paramString)
  {
    Map localMap = this.parameters;
    boolean bool = localMap.containsKey(paramString);
    if (bool)
    {
      localMap = this.parameters;
      localMap.remove(paramString);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMap = null;
    }
  }
  
  public HttpParams setParameter(String paramString, Object paramObject)
  {
    if (paramString == null) {}
    for (;;)
    {
      return this;
      Map localMap;
      if (paramObject != null)
      {
        localMap = this.parameters;
        localMap.put(paramString, paramObject);
      }
      else
      {
        localMap = this.parameters;
        localMap.remove(paramString);
      }
    }
  }
  
  public void setParameters(String[] paramArrayOfString, Object paramObject)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str = paramArrayOfString[j];
      setParameter(str, paramObject);
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\BasicHttpParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */