package com.sun.pdfview.font;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.sun.pdfview.PDFPage;
import com.sun.pdfview.PDFShapeCmd;

public class PDFGlyph
{
  private PointF advance;
  private String name;
  private PDFPage page;
  private Path shape;
  private char src;
  
  public PDFGlyph(char paramChar, String paramString, Path paramPath, PointF paramPointF)
  {
    this.shape = paramPath;
    this.advance = paramPointF;
    this.src = paramChar;
    this.name = paramString;
  }
  
  public PDFGlyph(char paramChar, String paramString, PDFPage paramPDFPage, PointF paramPointF)
  {
    this.page = paramPDFPage;
    this.advance = paramPointF;
    this.src = paramChar;
    this.name = paramString;
  }
  
  public PointF addCommands(PDFPage paramPDFPage, Matrix paramMatrix, int paramInt)
  {
    Object localObject = this.shape;
    if (localObject != null)
    {
      localObject = new android/graphics/Path;
      ((Path)localObject).<init>();
      this.shape.transform(paramMatrix, (Path)localObject);
      PDFShapeCmd localPDFShapeCmd = new com/sun/pdfview/PDFShapeCmd;
      localPDFShapeCmd.<init>((Path)localObject, paramInt);
      paramPDFPage.addCommand(localPDFShapeCmd);
    }
    for (;;)
    {
      return this.advance;
      localObject = this.page;
      if (localObject != null)
      {
        localObject = this.page;
        paramPDFPage.addCommands((PDFPage)localObject, paramMatrix);
      }
    }
  }
  
  public char getChar()
  {
    return this.src;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public PDFPage getPage()
  {
    return this.page;
  }
  
  public Path getShape()
  {
    return this.shape;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    String str = this.name;
    localStringBuffer.append(str);
    return localStringBuffer.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\PDFGlyph.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */