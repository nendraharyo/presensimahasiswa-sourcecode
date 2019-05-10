package com.sun.pdfview.font;

import com.sun.pdfview.PDFFile;

class Type1Font$PSParser
{
  byte[] data;
  int loc;
  
  public Type1Font$PSParser(Type1Font paramType1Font, byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.loc = paramInt;
  }
  
  public int getLoc()
  {
    return this.loc;
  }
  
  public byte[] getNEncodedBytes(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = this.this$0;
    byte[] arrayOfByte = this.data;
    int i = this.loc;
    int j = this.loc + paramInt1;
    localObject = Type1Font.access$0((Type1Font)localObject, arrayOfByte, i, j, paramInt2, paramInt3);
    int k = this.loc + paramInt1;
    this.loc = k;
    return (byte[])localObject;
  }
  
  public float[] readArray(int paramInt)
  {
    float[] arrayOfFloat = new float[paramInt];
    int i = 0;
    for (;;)
    {
      if (i >= paramInt) {
        return arrayOfFloat;
      }
      Object localObject = readThing();
      int j = ((String)localObject).charAt(0);
      int m = 91;
      if (j == m)
      {
        j = 1;
        localObject = ((String)localObject).substring(j);
      }
      String str = "]";
      boolean bool = ((String)localObject).endsWith(str);
      if (bool)
      {
        k = ((String)localObject).length() + -1;
        localObject = ((String)localObject).substring(0, k);
      }
      int k = ((String)localObject).length();
      if (k > 0)
      {
        k = i + 1;
        localObject = Float.valueOf((String)localObject);
        float f = ((Float)localObject).floatValue();
        arrayOfFloat[i] = f;
        i = k;
      }
    }
  }
  
  public String readThing()
  {
    byte[] arrayOfByte1 = this.data;
    int i = this.loc;
    boolean bool3 = PDFFile.isWhiteSpace(arrayOfByte1[i]);
    int k;
    label26:
    Object localObject;
    int m;
    if (!bool3)
    {
      k = this.loc;
      localObject = this.data;
      m = this.loc;
      boolean bool1 = PDFFile.isWhiteSpace(localObject[m]);
      if (!bool1) {
        break label98;
      }
    }
    for (;;)
    {
      localObject = new java/lang/String;
      byte[] arrayOfByte2 = this.data;
      int n = this.loc - k;
      ((String)localObject).<init>(arrayOfByte2, k, n);
      return (String)localObject;
      k = this.loc + 1;
      this.loc = k;
      break;
      label98:
      int j = this.loc + 1;
      this.loc = j;
      localObject = this.data;
      m = this.loc;
      boolean bool2 = PDFFile.isRegularCharacter(localObject[m]);
      if (bool2) {
        break label26;
      }
    }
  }
  
  public void setLoc(int paramInt)
  {
    this.loc = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\Type1Font$PSParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */