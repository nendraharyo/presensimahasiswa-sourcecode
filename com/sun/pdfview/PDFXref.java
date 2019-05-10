package com.sun.pdfview;

import c.a.a.d.b;

public class PDFXref
{
  private boolean compressed;
  private int generation;
  private int id;
  private b reference;
  
  public PDFXref(int paramInt1, int paramInt2)
  {
    this.reference = null;
    this.id = paramInt1;
    this.generation = paramInt2;
    this.compressed = false;
  }
  
  public PDFXref(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.reference = null;
    this.id = paramInt1;
    this.generation = paramInt2;
    this.compressed = paramBoolean;
  }
  
  public PDFXref(byte[] paramArrayOfByte)
  {
    int j = 0;
    String str = null;
    this.reference = null;
    if (paramArrayOfByte == null) {
      this.id = i;
    }
    for (this.generation = i;; this.generation = j)
    {
      this.compressed = false;
      return;
      str = new java/lang/String;
      str.<init>(paramArrayOfByte, 0, 10);
      j = Integer.parseInt(str);
      this.id = j;
      str = new java/lang/String;
      i = 11;
      int k = 5;
      str.<init>(paramArrayOfByte, i, k);
      j = Integer.parseInt(str);
    }
  }
  
  public boolean getCompressed()
  {
    return this.compressed;
  }
  
  public int getFilePos()
  {
    return this.id;
  }
  
  public int getGeneration()
  {
    return this.generation;
  }
  
  public int getID()
  {
    return this.id;
  }
  
  public int getIndex()
  {
    return this.generation;
  }
  
  public PDFObject getObject()
  {
    Object localObject = this.reference;
    if (localObject != null) {}
    for (localObject = (PDFObject)this.reference.a();; localObject = null) {
      return (PDFObject)localObject;
    }
  }
  
  public void setObject(PDFObject paramPDFObject)
  {
    b localb = new c/a/a/d/b;
    localb.<init>(paramPDFObject);
    this.reference = localb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFXref.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */