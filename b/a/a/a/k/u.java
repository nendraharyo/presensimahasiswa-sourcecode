package b.a.a.a.k;

public class u
{
  private final int a;
  private final int b;
  private int c;
  
  public u(int paramInt1, int paramInt2)
  {
    IndexOutOfBoundsException localIndexOutOfBoundsException;
    if (paramInt1 < 0)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localIndexOutOfBoundsException.<init>("Lower bound cannot be negative");
      throw localIndexOutOfBoundsException;
    }
    if (paramInt1 > paramInt2)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localIndexOutOfBoundsException.<init>("Lower bound cannot be greater then upper bound");
      throw localIndexOutOfBoundsException;
    }
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt1;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    int i = this.a;
    IndexOutOfBoundsException localIndexOutOfBoundsException;
    Object localObject;
    int j;
    if (paramInt < i)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("pos: ").append(paramInt).append(" < lowerBound: ");
      j = this.a;
      localObject = j;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    i = this.b;
    if (paramInt > i)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("pos: ").append(paramInt).append(" > upperBound: ");
      j = this.b;
      localObject = j;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    this.c = paramInt;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    int i = this.c;
    int k = this.b;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    char c1 = '>';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('[');
    String str = Integer.toString(this.a);
    localStringBuilder.append(str);
    localStringBuilder.append(c1);
    str = Integer.toString(this.c);
    localStringBuilder.append(str);
    localStringBuilder.append(c1);
    str = Integer.toString(this.b);
    localStringBuilder.append(str);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\\\u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */