package com.sun.pdfview.font;

import com.sun.pdfview.PDFObject;

public class Type0Font
  extends PDFFont
{
  PDFFont[] fonts;
  
  public Type0Font(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFFontDescriptor);
    PDFObject[] arrayOfPDFObject = paramPDFObject.getDictRef("DescendantFonts").getArray();
    PDFFont[] arrayOfPDFFont1 = new PDFFont[arrayOfPDFObject.length];
    this.fonts = arrayOfPDFFont1;
    int i = 0;
    arrayOfPDFFont1 = null;
    for (;;)
    {
      int j = arrayOfPDFObject.length;
      if (i >= j) {
        return;
      }
      PDFFont[] arrayOfPDFFont2 = this.fonts;
      PDFFont localPDFFont = PDFFont.getFont(arrayOfPDFObject[i], null);
      arrayOfPDFFont2[i] = localPDFFont;
      i += 1;
    }
  }
  
  public PDFFont getDescendantFont(int paramInt)
  {
    return this.fonts[paramInt];
  }
  
  protected PDFGlyph getGlyph(char paramChar, String paramString)
  {
    return getDescendantFont(0).getGlyph(paramChar, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\Type0Font.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */