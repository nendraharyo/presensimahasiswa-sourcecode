package b.a.a.a.f;

import java.io.Serializable;
import java.util.Comparator;

public class f
  implements Serializable, Comparator
{
  private String a(b paramb)
  {
    Object localObject1 = paramb.g();
    if (localObject1 == null) {
      localObject1 = "/";
    }
    Object localObject2 = "/";
    boolean bool = ((String)localObject1).endsWith((String)localObject2);
    if (!bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      char c = '/';
      localObject1 = c;
    }
    return (String)localObject1;
  }
  
  public int a(b paramb1, b paramb2)
  {
    int i = 0;
    String str1 = a(paramb1);
    String str2 = a(paramb2);
    boolean bool1 = str1.equals(str2);
    if (bool1) {}
    for (;;)
    {
      return i;
      bool1 = str1.startsWith(str2);
      if (bool1)
      {
        i = -1;
      }
      else
      {
        boolean bool2 = str2.startsWith(str1);
        if (bool2) {
          i = 1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\f\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */