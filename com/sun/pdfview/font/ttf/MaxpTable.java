package com.sun.pdfview.font.ttf;

import c.a.a.b.b;

public class MaxpTable
  extends TrueTypeTable
{
  private int maxComponentContours;
  private int maxComponentDepth;
  private int maxComponentElements;
  private int maxComponentPoints;
  private int maxContours;
  private int maxFunctionDefs;
  private int maxInstructionDefs;
  private int maxPoints;
  private int maxSizeOfInstructions;
  private int maxStackElements;
  private int maxStorage;
  private int maxTwilightPoints;
  private int maxZones;
  private int numGlyphs;
  private int version;
  
  protected MaxpTable()
  {
    super(1835104368);
    setVersion(65536);
    setNumGlyphs(0);
    setMaxPoints(0);
    setMaxContours(0);
    setMaxComponentPoints(0);
    setMaxComponentContours(0);
    setMaxZones(2);
    setMaxTwilightPoints(0);
    setMaxStorage(0);
    setMaxFunctionDefs(0);
    setMaxInstructionDefs(0);
    setMaxStackElements(0);
    setMaxSizeOfInstructions(0);
    setMaxComponentElements(0);
    setMaxComponentDepth(0);
  }
  
  public b getData()
  {
    b localb = b.g(getLength());
    int i = getVersion();
    localb.f(i);
    i = (short)getNumGlyphs();
    localb.a(i);
    short s = (short)getMaxPoints();
    localb.a(s);
    s = (short)getMaxContours();
    localb.a(s);
    s = (short)getMaxComponentPoints();
    localb.a(s);
    s = (short)getMaxComponentContours();
    localb.a(s);
    s = (short)getMaxZones();
    localb.a(s);
    s = (short)getMaxTwilightPoints();
    localb.a(s);
    s = (short)getMaxStorage();
    localb.a(s);
    s = (short)getMaxFunctionDefs();
    localb.a(s);
    s = (short)getMaxInstructionDefs();
    localb.a(s);
    s = (short)getMaxStackElements();
    localb.a(s);
    s = (short)getMaxSizeOfInstructions();
    localb.a(s);
    s = (short)getMaxComponentElements();
    localb.a(s);
    s = (short)getMaxComponentDepth();
    localb.a(s);
    localb.j();
    return localb;
  }
  
  public int getLength()
  {
    return 32;
  }
  
  public int getMaxComponentContours()
  {
    return this.maxComponentContours & (char)-1;
  }
  
  public int getMaxComponentDepth()
  {
    return this.maxComponentDepth & (char)-1;
  }
  
  public int getMaxComponentElements()
  {
    return this.maxComponentElements & (char)-1;
  }
  
  public int getMaxComponentPoints()
  {
    return this.maxComponentPoints & (char)-1;
  }
  
  public int getMaxContours()
  {
    return this.maxContours & (char)-1;
  }
  
  public int getMaxFunctionDefs()
  {
    return this.maxFunctionDefs & (char)-1;
  }
  
  public int getMaxInstructionDefs()
  {
    return this.maxInstructionDefs & (char)-1;
  }
  
  public int getMaxPoints()
  {
    return this.maxPoints & (char)-1;
  }
  
  public int getMaxSizeOfInstructions()
  {
    return this.maxSizeOfInstructions & (char)-1;
  }
  
  public int getMaxStackElements()
  {
    return this.maxStackElements & (char)-1;
  }
  
  public int getMaxStorage()
  {
    return this.maxStorage & (char)-1;
  }
  
  public int getMaxTwilightPoints()
  {
    return this.maxTwilightPoints & (char)-1;
  }
  
  public int getMaxZones()
  {
    return this.maxZones & (char)-1;
  }
  
  public int getNumGlyphs()
  {
    return this.numGlyphs & (char)-1;
  }
  
  public int getVersion()
  {
    return this.version;
  }
  
  public void setData(b paramb)
  {
    int i = paramb.c();
    int j = 32;
    if (i != j)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Bad size for Maxp table");
      throw localIllegalArgumentException;
    }
    i = paramb.l();
    setVersion(i);
    i = paramb.o();
    setNumGlyphs(i);
    i = paramb.o();
    setMaxPoints(i);
    i = paramb.o();
    setMaxContours(i);
    i = paramb.o();
    setMaxComponentPoints(i);
    i = paramb.o();
    setMaxComponentContours(i);
    i = paramb.o();
    setMaxZones(i);
    i = paramb.o();
    setMaxTwilightPoints(i);
    i = paramb.o();
    setMaxStorage(i);
    i = paramb.o();
    setMaxFunctionDefs(i);
    i = paramb.o();
    setMaxInstructionDefs(i);
    i = paramb.o();
    setMaxStackElements(i);
    i = paramb.o();
    setMaxSizeOfInstructions(i);
    i = paramb.o();
    setMaxComponentElements(i);
    i = paramb.o();
    setMaxComponentDepth(i);
  }
  
  public void setMaxComponentContours(int paramInt)
  {
    this.maxComponentContours = paramInt;
  }
  
  public void setMaxComponentDepth(int paramInt)
  {
    this.maxComponentDepth = paramInt;
  }
  
  public void setMaxComponentElements(int paramInt)
  {
    this.maxComponentElements = paramInt;
  }
  
  public void setMaxComponentPoints(int paramInt)
  {
    this.maxComponentPoints = paramInt;
  }
  
  public void setMaxContours(int paramInt)
  {
    this.maxContours = paramInt;
  }
  
  public void setMaxFunctionDefs(int paramInt)
  {
    this.maxFunctionDefs = paramInt;
  }
  
  public void setMaxInstructionDefs(int paramInt)
  {
    this.maxInstructionDefs = paramInt;
  }
  
  public void setMaxPoints(int paramInt)
  {
    this.maxPoints = paramInt;
  }
  
  public void setMaxSizeOfInstructions(int paramInt)
  {
    this.maxSizeOfInstructions = paramInt;
  }
  
  public void setMaxStackElements(int paramInt)
  {
    this.maxStackElements = paramInt;
  }
  
  public void setMaxStorage(int paramInt)
  {
    this.maxStorage = paramInt;
  }
  
  public void setMaxTwilightPoints(int paramInt)
  {
    this.maxTwilightPoints = paramInt;
  }
  
  public void setMaxZones(int paramInt)
  {
    this.maxZones = paramInt;
  }
  
  public void setNumGlyphs(int paramInt)
  {
    this.numGlyphs = paramInt;
  }
  
  public void setVersion(int paramInt)
  {
    this.version = paramInt;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = "    ";
    Object localObject2 = new java/lang/StringBuilder;
    String str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("Version          : ");
    str = Integer.toHexString(getVersion());
    localObject2 = str + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("NumGlyphs        : ");
    int i = getNumGlyphs();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxPoints        : ");
    i = getMaxPoints();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxContours      : ");
    i = getMaxContours();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxCompPoints    : ");
    i = getMaxComponentPoints();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxCompContours  : ");
    i = getMaxComponentContours();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxZones         : ");
    i = getMaxZones();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxTwilightPoints: ");
    i = getMaxTwilightPoints();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxStorage       : ");
    i = getMaxStorage();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxFuncDefs      : ");
    i = getMaxFunctionDefs();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxInstDefs      : ");
    i = getMaxInstructionDefs();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxStackElements : ");
    i = getMaxStackElements();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxSizeInst      : ");
    i = getMaxSizeOfInstructions();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    str = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>(str);
    localObject2 = ((StringBuilder)localObject2).append("MaxCompElements  : ");
    i = getMaxComponentElements();
    localObject2 = i + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    localObject1 = String.valueOf(localObject1);
    ((StringBuilder)localObject2).<init>((String)localObject1);
    localObject1 = ((StringBuilder)localObject2).append("MaxCompDepth     : ");
    int j = getMaxComponentDepth();
    localObject1 = j + "\n";
    localStringBuffer.append((String)localObject1);
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\MaxpTable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */