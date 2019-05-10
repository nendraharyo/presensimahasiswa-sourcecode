package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class GlyfTable
  extends TrueTypeTable
{
  private Object[] glyphs;
  private LocaTable loca;
  
  protected GlyfTable(TrueTypeFont paramTrueTypeFont)
  {
    super(1735162214);
    Object localObject = (LocaTable)paramTrueTypeFont.getTable("loca");
    this.loca = ((LocaTable)localObject);
    localObject = new Object[((MaxpTable)paramTrueTypeFont.getTable("maxp")).getNumGlyphs()];
    this.glyphs = ((Object[])localObject);
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.glyphs;
      i = localObject.length;
      if (j >= i)
      {
        localb.j();
        return localb;
      }
      localObject = this.glyphs[j];
      if (localObject != null) {
        break;
      }
      i = j + 1;
    }
    boolean bool = localObject instanceof b;
    if (bool) {}
    for (localObject = (b)localObject;; localObject = ((Glyf)localObject).getData())
    {
      ((b)localObject).e();
      localb.a((b)localObject);
      ((b)localObject).j();
      break;
    }
  }
  
  public Glyf getGlyph(int paramInt)
  {
    Object localObject = this.glyphs[paramInt];
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Glyf)localObject;
      boolean bool = localObject instanceof b;
      if (bool)
      {
        localObject = Glyf.getGlyf((b)localObject);
        Object[] arrayOfObject = this.glyphs;
        arrayOfObject[paramInt] = localObject;
      }
      else
      {
        localObject = (Glyf)localObject;
      }
    }
  }
  
  public int getLength()
  {
    int i = 0;
    Object localObject = null;
    int j = 0;
    int k = 0;
    localObject = this.glyphs;
    i = localObject.length;
    if (j >= i) {
      return k;
    }
    localObject = this.glyphs[j];
    if (localObject == null) {}
    for (;;)
    {
      i = j + 1;
      j = i;
      break;
      boolean bool = localObject instanceof b;
      if (bool)
      {
        localObject = (b)localObject;
        i = ((b)localObject).c();
        k += i;
      }
      else
      {
        localObject = (Glyf)localObject;
        i = ((Glyf)localObject).getLength();
        k += i;
      }
    }
  }
  
  public void setData(b paramb)
  {
    int i = 0;
    Object localObject1 = this.glyphs;
    int j = localObject1.length;
    if (i >= j) {
      return;
    }
    localObject1 = this.loca;
    j = ((LocaTable)localObject1).getOffset(i);
    Object localObject2 = this.loca;
    int k = ((LocaTable)localObject2).getSize(i);
    if (k == 0) {}
    for (;;)
    {
      i += 1;
      break;
      paramb.a(j);
      localObject1 = paramb.d();
      ((b)localObject1).d(k);
      localObject2 = this.glyphs;
      localObject2[i] = localObject1;
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = "    ";
    Object localObject2 = new java/lang/StringBuilder;
    String str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("Glyf Table: (");
    int i = this.glyphs.length;
    localObject2 = i + " glyphs)\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject1 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject1);
    localObject1 = ((StringBuilder)localObject2).append("  Glyf 0: ");
    localObject2 = getGlyph(0);
    localObject1 = localObject2;
    localStringBuffer.append((String)localObject1);
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\GlyfTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */