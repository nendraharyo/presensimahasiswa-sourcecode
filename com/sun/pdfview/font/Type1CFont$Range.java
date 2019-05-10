package com.sun.pdfview.font;

class Type1CFont$Range
{
  private int len;
  private int start;
  
  public Type1CFont$Range(Type1CFont paramType1CFont, int paramInt1, int paramInt2)
  {
    this.start = paramInt1;
    this.len = paramInt2;
  }
  
  public final int getEnd()
  {
    int i = this.start;
    int j = this.len;
    return i + j;
  }
  
  public final int getLen()
  {
    return this.len;
  }
  
  public final int getStart()
  {
    return this.start;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Range: start: ");
    int i = this.start;
    localStringBuilder = localStringBuilder.append(i).append(", len: ");
    i = this.len;
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\Type1CFont$Range.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */