package android.support.v4.h;

public class j
{
  public final Object a;
  public final Object b;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        break label23;
      }
      bool = paramObject1.equals(paramObject2);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof j;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (j)paramObject;
      Object localObject1 = ((j)paramObject).a;
      Object localObject2 = this.a;
      bool2 = a(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = ((j)paramObject).b;
        localObject2 = this.b;
        bool2 = a(localObject1, localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.a;
    int j;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      Object localObject3 = this.b;
      if (localObject3 != null) {
        break label48;
      }
    }
    for (;;)
    {
      return j ^ i;
      localObject2 = this.a;
      j = localObject2.hashCode();
      break;
      label48:
      localObject1 = this.b;
      i = localObject1.hashCode();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Pair{");
    String str = String.valueOf(this.a);
    localStringBuilder = localStringBuilder.append(str).append(" ");
    str = String.valueOf(this.b);
    return str + "}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */