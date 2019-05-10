package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class aa
{
  public final Map a;
  public View b;
  final ArrayList c;
  
  public aa()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.a = ((Map)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.c = ((ArrayList)localObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof aa;
    Object localObject2;
    if (bool)
    {
      Object localObject1 = this.b;
      localObject2 = paramObject;
      localObject2 = ((aa)paramObject).b;
      if (localObject1 == localObject2)
      {
        localObject2 = this.a;
        paramObject = (aa)paramObject;
        localObject1 = ((aa)paramObject).a;
        bool = ((Map)localObject2).equals(localObject1);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject2 = null;
    }
  }
  
  public int hashCode()
  {
    int i = this.b.hashCode() * 31;
    int j = this.a.hashCode();
    return i + j;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("TransitionValues@");
    int i = hashCode();
    Object localObject2 = Integer.toHexString(i);
    localObject1 = (String)localObject2 + ":\n";
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("    view = ");
    localObject2 = this.b;
    localObject1 = localObject2 + "\n";
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = (String)localObject1 + "    values:";
    Iterator localIterator = this.a.keySet().iterator();
    for (localObject2 = localObject1;; localObject2 = localObject1)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2).append("    ").append((String)localObject1).append(": ");
      localObject3 = this.a;
      localObject1 = ((Map)localObject3).get(localObject1);
      localObject1 = localObject1 + "\n";
    }
    return (String)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */