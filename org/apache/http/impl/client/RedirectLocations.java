package org.apache.http.impl.client;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedirectLocations
  extends AbstractList
{
  private final List all;
  private final Set unique;
  
  public RedirectLocations()
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.unique = ((Set)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.all = ((List)localObject);
  }
  
  public void add(int paramInt, Object paramObject)
  {
    List localList = this.all;
    Object localObject = paramObject;
    localObject = (URI)paramObject;
    localList.add(paramInt, localObject);
    localObject = this.unique;
    paramObject = (URI)paramObject;
    ((Set)localObject).add(paramObject);
  }
  
  public void add(URI paramURI)
  {
    this.unique.add(paramURI);
    this.all.add(paramURI);
  }
  
  public boolean contains(Object paramObject)
  {
    return this.unique.contains(paramObject);
  }
  
  public boolean contains(URI paramURI)
  {
    return this.unique.contains(paramURI);
  }
  
  public URI get(int paramInt)
  {
    return (URI)this.all.get(paramInt);
  }
  
  public List getAll()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    List localList = this.all;
    localArrayList.<init>(localList);
    return localArrayList;
  }
  
  public URI remove(int paramInt)
  {
    URI localURI = (URI)this.all.remove(paramInt);
    this.unique.remove(localURI);
    Object localObject1 = this.all;
    int i = ((List)localObject1).size();
    Object localObject2 = this.unique;
    int j = ((Set)localObject2).size();
    if (i != j)
    {
      localObject1 = this.unique;
      localObject2 = this.all;
      ((Set)localObject1).addAll((Collection)localObject2);
    }
    return localURI;
  }
  
  public boolean remove(URI paramURI)
  {
    Object localObject = this.unique;
    boolean bool1 = ((Set)localObject).remove(paramURI);
    if (bool1)
    {
      localObject = this.all;
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (URI)localIterator.next();
        bool2 = ((URI)localObject).equals(paramURI);
        if (bool2) {
          localIterator.remove();
        }
      }
    }
    return bool1;
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    Object localObject1 = this.all;
    Object localObject2 = paramObject;
    localObject2 = (URI)paramObject;
    localObject2 = (URI)((List)localObject1).set(paramInt, localObject2);
    this.unique.remove(localObject2);
    localObject1 = this.unique;
    paramObject = (URI)paramObject;
    ((Set)localObject1).add(paramObject);
    localObject1 = this.all;
    int i = ((List)localObject1).size();
    Object localObject3 = this.unique;
    int j = ((Set)localObject3).size();
    if (i != j)
    {
      localObject1 = this.unique;
      localObject3 = this.all;
      ((Set)localObject1).addAll((Collection)localObject3);
    }
    return localObject2;
  }
  
  public int size()
  {
    return this.all.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\RedirectLocations.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */