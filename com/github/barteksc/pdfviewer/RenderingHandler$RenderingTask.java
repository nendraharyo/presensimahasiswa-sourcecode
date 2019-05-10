package com.github.barteksc.pdfviewer;

import android.graphics.RectF;

class RenderingHandler$RenderingTask
{
  boolean annotationRendering;
  boolean bestQuality;
  RectF bounds;
  int cacheOrder;
  float height;
  int page;
  boolean thumbnail;
  int userPage;
  float width;
  
  RenderingHandler$RenderingTask(RenderingHandler paramRenderingHandler, float paramFloat1, float paramFloat2, RectF paramRectF, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.page = paramInt2;
    this.width = paramFloat1;
    this.height = paramFloat2;
    this.bounds = paramRectF;
    this.userPage = paramInt1;
    this.thumbnail = paramBoolean1;
    this.cacheOrder = paramInt3;
    this.bestQuality = paramBoolean2;
    this.annotationRendering = paramBoolean3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\RenderingHandler$RenderingTask.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */