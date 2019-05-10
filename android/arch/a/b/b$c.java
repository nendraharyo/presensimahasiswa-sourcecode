package android.arch.a.b;

import java.util.Map.Entry;

class b$c
  implements Map.Entry
{
  final Object a;
  final Object b;
  c c;
  c d;
  
  b$c(Object paramObject1, Object paramObject2)
  {
    this.a = paramObject1;
    this.b = paramObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof c;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (c)paramObject;
        Object localObject1 = this.a;
        Object localObject2 = ((c)paramObject).a;
        bool2 = localObject1.equals(localObject2);
        if (bool2)
        {
          localObject1 = this.b;
          localObject2 = ((c)paramObject).b;
          bool2 = localObject1.equals(localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public Object getKey()
  {
    return this.a;
  }
  
  public Object getValue()
  {
    return this.b;
  }
  
  public Object setValue(Object paramObject)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("An entry modification is not supported");
    throw localUnsupportedOperationException;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.a;
    localStringBuilder = localStringBuilder.append(localObject).append("=");
    localObject = this.b;
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\b\b$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */