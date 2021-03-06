package com.github.barteksc.pdfviewer.scroll;

import com.github.barteksc.pdfviewer.PDFView;

public abstract interface ScrollHandle
{
  public abstract void destroyLayout();
  
  public abstract void hide();
  
  public abstract void hideDelayed();
  
  public abstract void setPageNum(int paramInt);
  
  public abstract void setScroll(float paramFloat);
  
  public abstract void setupLayout(PDFView paramPDFView);
  
  public abstract void show();
  
  public abstract boolean shown();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\scroll\ScrollHandle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */