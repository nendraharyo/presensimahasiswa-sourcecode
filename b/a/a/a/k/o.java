package b.a.a.a.k;

import b.a.a.a.aa;
import b.a.a.a.ag;
import b.a.a.a.e;
import b.a.a.a.h;
import b.a.a.a.o.a;
import java.util.NoSuchElementException;

public class o
  implements ag
{
  protected final h a;
  protected String b;
  protected String c;
  protected int d;
  
  public o(h paramh)
  {
    h localh = (h)a.a(paramh, "Header iterator");
    this.a = localh;
    int i = a(-1);
    this.d = i;
  }
  
  protected int a(int paramInt)
  {
    int i = -1;
    Object localObject;
    int j;
    if (paramInt < 0)
    {
      localObject = this.a;
      j = ((h)localObject).hasNext();
      if (j == 0) {
        j = i;
      }
    }
    for (;;)
    {
      return j;
      localObject = this.a.a().d();
      this.b = ((String)localObject);
      int k = 0;
      localObject = null;
      int m;
      for (;;)
      {
        m = b(k);
        if (m >= 0) {
          break label91;
        }
        localObject = null;
        this.c = null;
        k = i;
        break;
        k = c(paramInt);
      }
      label91:
      k = d(m);
      String str = this.b;
      str = a(str, m, k);
      this.c = str;
    }
  }
  
  public String a()
  {
    Object localObject = this.c;
    if (localObject == null)
    {
      localObject = new java/util/NoSuchElementException;
      ((NoSuchElementException)localObject).<init>("Iteration already finished.");
      throw ((Throwable)localObject);
    }
    localObject = this.c;
    int i = this.d;
    i = a(i);
    this.d = i;
    return (String)localObject;
  }
  
  protected String a(String paramString, int paramInt1, int paramInt2)
  {
    return paramString.substring(paramInt1, paramInt2);
  }
  
  protected boolean a(char paramChar)
  {
    char c1 = ',';
    if (paramChar == c1) {}
    for (c1 = '\001';; c1 = '\000') {
      return c1;
    }
  }
  
  protected int b(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = "Search position";
    int i = a.b(paramInt, (String)localObject2);
    int m = 0;
    Object localObject3 = null;
    float f1 = 0.0F;
    float f2;
    int j;
    if (m == 0)
    {
      Object localObject4 = this.b;
      if (localObject4 != null)
      {
        localObject4 = this.b;
        int n = ((String)localObject4).length();
        int i1 = m;
        m = i;
        i = i1;
        f2 = f1;
        while ((i == 0) && (m < n))
        {
          String str = this.b;
          char c1 = str.charAt(m);
          boolean bool3 = a(c1);
          if (!bool3)
          {
            boolean bool2 = b(c1);
            if (!bool2) {}
          }
          else
          {
            m += 1;
            continue;
          }
          localObject2 = this.b;
          i = ((String)localObject2).charAt(m);
          j = c(i);
          if (j != 0)
          {
            j = 1;
            f2 = Float.MIN_VALUE;
          }
          else
          {
            localObject2 = new b/a/a/a/aa;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = ((StringBuilder)localObject1).append("Invalid character before token (pos ").append(m).append("): ");
            localObject1 = this.b;
            localObject3 = (String)localObject1;
            ((aa)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
        }
        boolean bool1;
        if (j == 0)
        {
          localObject4 = this.a;
          bool1 = ((h)localObject4).hasNext();
          if (!bool1) {
            break label293;
          }
          localObject3 = this.a.a().d();
          this.b = ((String)localObject3);
          m = 0;
          localObject3 = null;
          f1 = 0.0F;
        }
        for (;;)
        {
          i1 = j;
          j = m;
          m = i1;
          f1 = f2;
          break;
          label293:
          bool1 = false;
          localObject4 = null;
          this.b = null;
        }
      }
    }
    if (m != 0) {}
    for (;;)
    {
      return j;
      int k = -1;
      f2 = 0.0F / 0.0F;
    }
  }
  
  protected boolean b(char paramChar)
  {
    char c1 = '\t';
    if (paramChar != c1)
    {
      bool = Character.isSpaceChar(paramChar);
      if (!bool) {
        break label21;
      }
    }
    label21:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected int c(int paramInt)
  {
    int i = a.b(paramInt, "Search position");
    boolean bool1 = false;
    aa localaa = null;
    Object localObject1 = this.b;
    int j = ((String)localObject1).length();
    while ((!bool1) && (i < j))
    {
      String str = this.b;
      char c1 = str.charAt(i);
      boolean bool2 = a(c1);
      if (bool2)
      {
        bool1 = true;
      }
      else
      {
        bool2 = b(c1);
        if (bool2)
        {
          i += 1;
        }
        else
        {
          bool1 = c(c1);
          if (bool1)
          {
            localaa = new b/a/a/a/aa;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = ((StringBuilder)localObject1).append("Tokens without separator (pos ").append(i).append("): ");
            localObject1 = this.b;
            localObject2 = (String)localObject1;
            localaa.<init>((String)localObject2);
            throw localaa;
          }
          localaa = new b/a/a/a/aa;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = ((StringBuilder)localObject1).append("Invalid character after token (pos ").append(i).append("): ");
          localObject1 = this.b;
          localObject2 = (String)localObject1;
          localaa.<init>((String)localObject2);
          throw localaa;
        }
      }
    }
    return i;
  }
  
  protected boolean c(char paramChar)
  {
    boolean bool1 = true;
    boolean bool2 = Character.isLetterOrDigit(paramChar);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = Character.isISOControl(paramChar);
      if (bool2)
      {
        bool1 = false;
      }
      else
      {
        bool2 = d(paramChar);
        if (bool2) {
          bool1 = false;
        }
      }
    }
  }
  
  protected int d(int paramInt)
  {
    a.b(paramInt, "Search position");
    String str1 = this.b;
    int i = str1.length();
    int j = paramInt + 1;
    while (j < i)
    {
      String str2 = this.b;
      char c1 = str2.charAt(j);
      boolean bool = c(c1);
      if (!bool) {
        break;
      }
      j += 1;
    }
    return j;
  }
  
  protected boolean d(char paramChar)
  {
    String str = " ,;=()<>@:\\\"/[]?{}\t";
    int i = str.indexOf(paramChar);
    if (i >= 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  public boolean hasNext()
  {
    String str = this.c;
    boolean bool;
    if (str != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public final Object next()
  {
    return a();
  }
  
  public final void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Removing tokens is not supported.");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\k\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */