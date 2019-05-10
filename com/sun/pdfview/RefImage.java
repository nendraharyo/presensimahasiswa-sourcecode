package com.sun.pdfview;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;

public class RefImage
{
  private Bitmap bi;
  private Canvas g;
  
  public RefImage(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
    this.bi = localBitmap;
  }
  
  public Canvas createGraphics()
  {
    Canvas localCanvas = this.g;
    if (localCanvas == null)
    {
      localCanvas = new android/graphics/Canvas;
      Bitmap localBitmap = this.bi;
      localCanvas.<init>(localBitmap);
      this.g = localCanvas;
    }
    return this.g;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\RefImage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */