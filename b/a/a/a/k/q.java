package b.a.a.a.k;

import b.a.a.a.e;
import b.a.a.a.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q
  implements Serializable, Cloneable
{
  private final List a;
  
  public q()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(16);
    this.a = localArrayList;
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(e parame)
  {
    if (parame == null) {}
    for (;;)
    {
      return;
      List localList = this.a;
      localList.add(parame);
    }
  }
  
  public void a(e[] paramArrayOfe)
  {
    a();
    if (paramArrayOfe == null) {}
    for (;;)
    {
      return;
      List localList = this.a;
      Collections.addAll(localList, paramArrayOfe);
    }
  }
  
  public e[] a(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.a;
      i = ((List)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = (e)this.a.get(j);
      String str = ((e)localObject).c();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (bool) {
        localArrayList.add(localObject);
      }
      i = j + 1;
    }
    localObject = new e[localArrayList.size()];
    return (e[])localArrayList.toArray((Object[])localObject);
  }
  
  public e b(String paramString)
  {
    int i = 0;
    Object localObject = null;
    int j = 0;
    localObject = this.a;
    i = ((List)localObject).size();
    if (j < i)
    {
      localObject = (e)this.a.get(j);
      String str = ((e)localObject).c();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return (e)localObject;
      i = j + 1;
      j = i;
      break;
      i = 0;
      localObject = null;
    }
  }
  
  public void b(e parame)
  {
    if (parame == null) {}
    for (;;)
    {
      return;
      List localList = this.a;
      localList.remove(parame);
    }
  }
  
  public e[] b()
  {
    List localList = this.a;
    e[] arrayOfe = new e[this.a.size()];
    return (e[])localList.toArray(arrayOfe);
  }
  
  public e c(String paramString)
  {
    Object localObject = this.a;
    int i = ((List)localObject).size() + -1;
    int j = i;
    if (j >= 0)
    {
      localObject = (e)this.a.get(j);
      String str = ((e)localObject).c();
      boolean bool = str.equalsIgnoreCase(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return (e)localObject;
      i = j + -1;
      j = i;
      break;
      i = 0;
      localObject = null;
    }
  }
  
  public h c()
  {
    k localk = new b/a/a/a/k/k;
    List localList = this.a;
    localk.<init>(localList, null);
    return localk;
  }
  
  public void c(e parame)
  {
    if (parame == null) {}
    for (;;)
    {
      return;
      int i = 0;
      Object localObject = null;
      int j;
      for (int k = 0;; k = j)
      {
        localObject = this.a;
        i = ((List)localObject).size();
        if (k >= i) {
          break label98;
        }
        localObject = ((e)this.a.get(k)).c();
        String str = parame.c();
        boolean bool = ((String)localObject).equalsIgnoreCase(str);
        if (bool)
        {
          localObject = this.a;
          ((List)localObject).set(k, parame);
          break;
        }
        j = k + 1;
      }
      label98:
      localObject = this.a;
      ((List)localObject).add(parame);
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public boolean d(String paramString)
  {
    boolean bool1 = false;
    int k;
    for (int i = 0;; i = k)
    {
      Object localObject = this.a;
      int j = ((List)localObject).size();
      if (i < j)
      {
        localObject = ((e)this.a.get(i)).c();
        boolean bool2 = ((String)localObject).equalsIgnoreCase(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      k = i + 1;
    }
  }
  
  public h e(String paramString)
  {
    k localk = new b/a/a/a/k/k;
    List localList = this.a;
    localk.<init>(localList, paramString);
    return localk;
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */