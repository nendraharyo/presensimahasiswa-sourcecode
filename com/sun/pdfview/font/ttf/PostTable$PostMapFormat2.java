package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

class PostTable$PostMapFormat2
  extends PostTable.PostMapFormat0
{
  short[] glyphNameIndex;
  String[] glyphNames;
  
  PostTable$PostMapFormat2(PostTable paramPostTable)
  {
    super(paramPostTable);
  }
  
  short getCharIndex(String paramString)
  {
    int i = -1;
    short s = 0;
    int j = 0;
    Object localObject = this.glyphNames;
    int k = localObject.length;
    if (j >= k)
    {
      j = i;
      label28:
      if (j == i) {
        j = super.getCharIndex(paramString);
      }
      i = 0;
    }
    for (;;)
    {
      localObject = this.glyphNameIndex;
      k = localObject.length;
      if (i >= k) {}
      for (;;)
      {
        return s;
        localObject = this.glyphNames[j];
        boolean bool = paramString.equals(localObject);
        if (bool)
        {
          localObject = this.stdNames;
          m = localObject.length;
          j = (short)(j + m);
          break label28;
        }
        j += 1;
        break;
        localObject = this.glyphNameIndex;
        int m = localObject[i];
        if (m != j) {
          break label140;
        }
        s = (short)i;
      }
      label140:
      i += 1;
    }
  }
  
  String getCharName(char paramChar)
  {
    Object localObject = this.stdNames;
    char c1 = localObject.length;
    char c2;
    if (paramChar >= c1)
    {
      localObject = this.glyphNames;
      String[] arrayOfString = this.stdNames;
      c2 = arrayOfString.length;
      c2 = paramChar - c2;
    }
    for (localObject = localObject[c2];; localObject = super.getCharName(paramChar)) {
      return (String)localObject;
    }
  }
  
  b getData()
  {
    int i = 0;
    b localb = b.g(getLength());
    int j = (short)this.glyphNameIndex.length;
    localb.a(j);
    j = 0;
    Object localObject = null;
    short[] arrayOfShort = this.glyphNameIndex;
    int m = arrayOfShort.length;
    if (j >= m) {}
    for (;;)
    {
      localObject = this.glyphNames;
      int k = localObject.length;
      if (i >= k)
      {
        localb.j();
        return localb;
        arrayOfShort = this.glyphNameIndex;
        short s = arrayOfShort[k];
        localb.a(s);
        k += 1;
        break;
      }
      k = (byte)this.glyphNames[i].length();
      localb.a(k);
      localObject = this.glyphNames[i].getBytes();
      localb.c((byte[])localObject);
      i += 1;
    }
  }
  
  int getLength()
  {
    int i = this.glyphNameIndex.length * 2 + 2;
    int j = 0;
    for (;;)
    {
      Object localObject = this.glyphNames;
      int k = localObject.length;
      if (j >= k) {
        return i;
      }
      localObject = this.glyphNames[j];
      k = ((String)localObject).length() + 1;
      i += k;
      j += 1;
    }
  }
  
  void setData(b paramb)
  {
    int i = 0;
    byte[] arrayOfByte = null;
    int j = paramb.o();
    Object localObject1 = new short[j];
    this.glyphNameIndex = ((short[])localObject1);
    int k = 257;
    int m = 0;
    if (m >= j)
    {
      m = k + 65279;
      localObject1 = new String[m];
      this.glyphNames = ((String[])localObject1);
      k = 0;
      localObject1 = null;
    }
    for (;;)
    {
      if (k >= m)
      {
        return;
        localObject2 = this.glyphNameIndex;
        int n = paramb.o();
        localObject2[m] = n;
        localObject2 = this.glyphNameIndex;
        int i1 = localObject2[m];
        if (i1 > k)
        {
          localObject1 = this.glyphNameIndex;
          k = localObject1[m];
        }
        m += 1;
        break;
      }
      i = paramb.b();
      arrayOfByte = new byte[i];
      paramb.a(arrayOfByte);
      String[] arrayOfString = this.glyphNames;
      Object localObject2 = new java/lang/String;
      ((String)localObject2).<init>(arrayOfByte);
      arrayOfString[k] = localObject2;
      k += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\PostTable$PostMapFormat2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */