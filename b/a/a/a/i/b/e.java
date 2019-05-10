package b.a.a.a.i.b;

import b.a.a.a.b.h;
import b.a.a.a.f.b;
import b.a.a.a.f.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class e
  implements h, Serializable
{
  private final TreeSet a;
  
  public e()
  {
    TreeSet localTreeSet = new java/util/TreeSet;
    d locald = new b/a/a/a/f/d;
    locald.<init>();
    localTreeSet.<init>(locald);
    this.a = localTreeSet;
  }
  
  public void addCookie(b paramb)
  {
    if (paramb != null) {}
    try
    {
      Object localObject1 = this.a;
      ((TreeSet)localObject1).remove(paramb);
      localObject1 = new java/util/Date;
      ((Date)localObject1).<init>();
      boolean bool = paramb.a((Date)localObject1);
      if (!bool)
      {
        localObject1 = this.a;
        ((TreeSet)localObject1).add(paramb);
      }
      return;
    }
    finally {}
  }
  
  public List getCookies()
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      TreeSet localTreeSet = this.a;
      localArrayList.<init>(localTreeSet);
      return localArrayList;
    }
    finally {}
  }
  
  public String toString()
  {
    try
    {
      Object localObject1 = this.a;
      localObject1 = ((TreeSet)localObject1).toString();
      return (String)localObject1;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */