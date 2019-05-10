package b.a.a.a.i.b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class v
  extends AbstractList
{
  private final Set a;
  private final List b;
  
  public v()
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.a = ((Set)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.b = ((List)localObject);
  }
  
  public URI a(int paramInt)
  {
    return (URI)this.b.get(paramInt);
  }
  
  public boolean a(URI paramURI)
  {
    return this.a.contains(paramURI);
  }
  
  public void add(int paramInt, Object paramObject)
  {
    List localList = this.b;
    Object localObject = paramObject;
    localObject = (URI)paramObject;
    localList.add(paramInt, localObject);
    localObject = this.a;
    paramObject = (URI)paramObject;
    ((Set)localObject).add(paramObject);
  }
  
  public URI b(int paramInt)
  {
    URI localURI = (URI)this.b.remove(paramInt);
    this.a.remove(localURI);
    Object localObject1 = this.b;
    int i = ((List)localObject1).size();
    Object localObject2 = this.a;
    int j = ((Set)localObject2).size();
    if (i != j)
    {
      localObject1 = this.a;
      localObject2 = this.b;
      ((Set)localObject1).addAll((Collection)localObject2);
    }
    return localURI;
  }
  
  public void b(URI paramURI)
  {
    this.a.add(paramURI);
    this.b.add(paramURI);
  }
  
  public boolean contains(Object paramObject)
  {
    return this.a.contains(paramObject);
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    Object localObject1 = this.b;
    Object localObject2 = paramObject;
    localObject2 = (URI)paramObject;
    localObject2 = (URI)((List)localObject1).set(paramInt, localObject2);
    this.a.remove(localObject2);
    localObject1 = this.a;
    paramObject = (URI)paramObject;
    ((Set)localObject1).add(paramObject);
    localObject1 = this.b;
    int i = ((List)localObject1).size();
    Object localObject3 = this.a;
    int j = ((Set)localObject3).size();
    if (i != j)
    {
      localObject1 = this.a;
      localObject3 = this.b;
      ((Set)localObject1).addAll((Collection)localObject3);
    }
    return localObject2;
  }
  
  public int size()
  {
    return this.b.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */