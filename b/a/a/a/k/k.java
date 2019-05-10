package b.a.a.a.k;

import b.a.a.a.e;
import b.a.a.a.h;
import b.a.a.a.o.a;
import b.a.a.a.o.b;
import java.util.List;
import java.util.NoSuchElementException;

public class k
  implements h
{
  protected final List a;
  protected int b;
  protected int c;
  protected String d;
  
  public k(List paramList, String paramString)
  {
    List localList = (List)a.a(paramList, "Header list");
    this.a = localList;
    this.d = paramString;
    int j = a(i);
    this.b = j;
    this.c = i;
  }
  
  protected int a(int paramInt)
  {
    int i = -1;
    if (paramInt < i) {
      return i;
    }
    int j = this.a.size() + -1;
    boolean bool = false;
    for (int k = paramInt; (!bool) && (k < j); k = paramInt)
    {
      paramInt = k + 1;
      bool = b(paramInt);
    }
    if (bool) {}
    for (;;)
    {
      i = k;
      break;
      k = i;
    }
  }
  
  public e a()
  {
    int i = this.b;
    if (i < 0)
    {
      NoSuchElementException localNoSuchElementException = new java/util/NoSuchElementException;
      localNoSuchElementException.<init>("Iteration already finished.");
      throw localNoSuchElementException;
    }
    this.c = i;
    int j = a(i);
    this.b = j;
    return (e)this.a.get(i);
  }
  
  protected boolean b(int paramInt)
  {
    String str1 = this.d;
    if (str1 == null) {}
    String str2;
    for (boolean bool = true;; bool = str2.equalsIgnoreCase(str1))
    {
      return bool;
      str1 = ((e)this.a.get(paramInt)).c();
      str2 = this.d;
    }
  }
  
  public boolean hasNext()
  {
    int i = this.b;
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final Object next()
  {
    return a();
  }
  
  public void remove()
  {
    int i = this.c;
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      b.a(i, "No header to remove");
      List localList = this.a;
      int k = this.c;
      localList.remove(k);
      this.c = -1;
      int j = this.b + -1;
      this.b = j;
      return;
      j = 0;
      localList = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */