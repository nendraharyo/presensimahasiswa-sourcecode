package com.sun.pdfview;

import android.graphics.Path;
import android.graphics.RectF;

public class PDFShapeCmd
  extends PDFCmd
{
  public static final int BOTH = 3;
  public static final int CLIP = 4;
  public static final int FILL = 2;
  public static final int STROKE = 1;
  private RectF bounds;
  private Path gp;
  private int style;
  
  public PDFShapeCmd(Path paramPath, int paramInt)
  {
    Object localObject = new android/graphics/Path;
    ((Path)localObject).<init>(paramPath);
    this.gp = ((Path)localObject);
    this.style = paramInt;
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.bounds = ((RectF)localObject);
    localObject = this.bounds;
    paramPath.computeBounds((RectF)localObject, false);
  }
  
  public RectF execute(PDFRenderer paramPDFRenderer)
  {
    Object localObject1 = null;
    int i = this.style & 0x2;
    Object localObject2;
    if (i != 0)
    {
      localObject1 = this.gp;
      localObject1 = paramPDFRenderer.fill((Path)localObject1);
      localObject2 = this.gp;
      if (localObject2 != null)
      {
        localObject2 = this.gp;
        paramPDFRenderer.setLastShape((Path)localObject2);
      }
    }
    i = this.style & 0x1;
    if (i != 0)
    {
      localObject2 = this.gp;
      localObject2 = paramPDFRenderer.stroke((Path)localObject2);
      if (localObject1 != null) {
        break label104;
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      i = this.style & 0x4;
      if (i != 0)
      {
        localObject2 = this.gp;
        paramPDFRenderer.clip((Path)localObject2);
      }
      return (RectF)localObject1;
      label104:
      ((RectF)localObject1).union((RectF)localObject2);
    }
  }
  
  public String getDetails()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    this.gp.computeBounds((RectF)localObject1, false);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("ShapeCommand at: ");
    float f1 = ((RectF)localObject1).left;
    localObject2 = ((StringBuilder)localObject2).append(f1).append(", ");
    f1 = ((RectF)localObject1).top;
    localObject2 = f1 + "\n";
    localStringBuffer.append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Size: ");
    f1 = ((RectF)localObject1).width();
    localObject2 = ((StringBuilder)localObject2).append(f1);
    String str = " x ";
    localObject2 = ((StringBuilder)localObject2).append(str);
    float f2 = ((RectF)localObject1).height();
    localObject1 = ((StringBuilder)localObject2).append(f2);
    localObject2 = "\n";
    localObject1 = (String)localObject2;
    localStringBuffer.append((String)localObject1);
    localObject1 = "Mode: ";
    localStringBuffer.append((String)localObject1);
    int i = this.style & 0x2;
    if (i != 0)
    {
      localObject1 = "FILL ";
      localStringBuffer.append((String)localObject1);
    }
    i = this.style & 0x1;
    if (i != 0)
    {
      localObject1 = "STROKE ";
      localStringBuffer.append((String)localObject1);
    }
    i = this.style & 0x4;
    if (i != 0)
    {
      localObject1 = "CLIP";
      localStringBuffer.append((String)localObject1);
    }
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFShapeCmd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */