package com.sun.pdfview.font;

import com.sun.pdfview.font.ttf.GlyfSimple;

class TTFFont$PointRec
{
  boolean onCurve;
  int x;
  int y;
  
  public TTFFont$PointRec(TTFFont paramTTFFont, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.x = paramInt1;
    this.y = paramInt2;
    this.onCurve = paramBoolean;
  }
  
  public TTFFont$PointRec(TTFFont paramTTFFont, GlyfSimple paramGlyfSimple, int paramInt)
  {
    int i = paramGlyfSimple.getXCoord(paramInt);
    this.x = i;
    i = paramGlyfSimple.getYCoord(paramInt);
    this.y = i;
    boolean bool = paramGlyfSimple.onCurve(paramInt);
    this.onCurve = bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\TTFFont$PointRec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */