package org.apache.http.message;

public class ParserCursor
{
  private final int lowerBound;
  private int pos;
  private final int upperBound;
  
  public ParserCursor(int paramInt1, int paramInt2)
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
    this.lowerBound = paramInt1;
    this.upperBound = paramInt2;
    this.pos = paramInt1;
  }
  
  public boolean atEnd()
  {
    int i = this.pos;
    int k = this.upperBound;
    if (i >= k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int getLowerBound()
  {
    return this.lowerBound;
  }
  
  public int getPos()
  {
    return this.pos;
  }
  
  public int getUpperBound()
  {
    return this.upperBound;
  }
  
  public String toString()
  {
    char c = '>';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('[');
    String str = Integer.toString(this.lowerBound);
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = Integer.toString(this.pos);
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = Integer.toString(this.upperBound);
    localStringBuilder.append(str);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public void updatePos(int paramInt)
  {
    int i = this.lowerBound;
    IndexOutOfBoundsException localIndexOutOfBoundsException;
    Object localObject;
    int j;
    if (paramInt < i)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("pos: ").append(paramInt).append(" < lowerBound: ");
      j = this.lowerBound;
      localObject = j;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    i = this.upperBound;
    if (paramInt > i)
    {
      localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("pos: ").append(paramInt).append(" > upperBound: ");
      j = this.upperBound;
      localObject = j;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
    }
    this.pos = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\ParserCursor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */