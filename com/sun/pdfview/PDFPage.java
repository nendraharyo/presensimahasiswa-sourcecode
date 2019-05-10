package com.sun.pdfview;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c.a.a.d.c;
import c.a.a.e.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PDFPage
{
  private static int lastRenderedCommand;
  private static int parsedCommands;
  private RectF bbox;
  private Cache cache;
  private final List commands;
  private boolean finished;
  private int pageNumber;
  private final Map renderers;
  private int rotation;
  
  public PDFPage(int paramInt1, RectF paramRectF, int paramInt2, Cache paramCache)
  {
    Object localObject = new java/util/ArrayList;
    int i = 250;
    ((ArrayList)localObject).<init>(i);
    localObject = Collections.synchronizedList((List)localObject);
    this.commands = ((List)localObject);
    float f3 = 0.0F;
    this.finished = false;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.renderers = ((Map)localObject);
    this.pageNumber = paramInt1;
    this.cache = paramCache;
    if (paramRectF == null)
    {
      localObject = new android/graphics/RectF;
      ((RectF)localObject).<init>(0.0F, 0.0F, f1, f1);
    }
    for (;;)
    {
      if (paramInt2 < 0) {
        paramInt2 += 360;
      }
      this.rotation = paramInt2;
      i = 90;
      if (paramInt2 != i)
      {
        i = 270;
        if (paramInt2 != i) {}
      }
      else
      {
        RectF localRectF = new android/graphics/RectF;
        f2 = ((RectF)localObject).left;
        f1 = ((RectF)localObject).top;
        float f4 = ((RectF)localObject).left;
        float f5 = ((RectF)localObject).height();
        f4 += f5;
        f5 = ((RectF)localObject).top;
        f3 = ((RectF)localObject).width() + f5;
        localRectF.<init>(f2, f1, f4, f3);
        localObject = localRectF;
      }
      this.bbox = ((RectF)localObject);
      return;
      localObject = paramRectF;
    }
  }
  
  public PDFPage(RectF paramRectF, int paramInt)
  {
    this(-1, paramRectF, paramInt, null);
  }
  
  public static int getLastRenderedCommand()
  {
    return lastRenderedCommand;
  }
  
  public static int getParsedCommands()
  {
    return parsedCommands;
  }
  
  public void addCommand(PDFCmd paramPDFCmd)
  {
    synchronized (this.commands)
    {
      List localList2 = this.commands;
      localList2.add(paramPDFCmd);
      updateImages();
      return;
    }
  }
  
  public void addCommands(PDFPage paramPDFPage)
  {
    addCommands(paramPDFPage, null);
  }
  
  public void addCommands(PDFPage paramPDFPage, Matrix paramMatrix)
  {
    synchronized (this.commands)
    {
      addPush();
      if (paramMatrix != null) {
        addXform(paramMatrix);
      }
      List localList2 = this.commands;
      List localList3 = paramPDFPage.getCommands();
      localList2.addAll(localList3);
      addPop();
      updateImages();
      return;
    }
  }
  
  public void addDash(float[] paramArrayOfFloat, float paramFloat)
  {
    PDFChangeStrokeCmd localPDFChangeStrokeCmd = new com/sun/pdfview/PDFChangeStrokeCmd;
    localPDFChangeStrokeCmd.<init>();
    localPDFChangeStrokeCmd.setDash(paramArrayOfFloat, paramFloat);
    addCommand(localPDFChangeStrokeCmd);
  }
  
  public void addEndCap(int paramInt)
  {
    PDFChangeStrokeCmd localPDFChangeStrokeCmd = new com/sun/pdfview/PDFChangeStrokeCmd;
    localPDFChangeStrokeCmd.<init>();
    Paint.Cap localCap = Paint.Cap.BUTT;
    switch (paramInt)
    {
    }
    for (;;)
    {
      localPDFChangeStrokeCmd.setEndCap(localCap);
      addCommand(localPDFChangeStrokeCmd);
      return;
      localCap = Paint.Cap.BUTT;
      continue;
      localCap = Paint.Cap.ROUND;
      continue;
      localCap = Paint.Cap.SQUARE;
    }
  }
  
  public void addFillAlpha(float paramFloat)
  {
    PDFFillAlphaCmd localPDFFillAlphaCmd = new com/sun/pdfview/PDFFillAlphaCmd;
    localPDFFillAlphaCmd.<init>(paramFloat);
    addCommand(localPDFFillAlphaCmd);
  }
  
  public void addFillPaint(PDFPaint paramPDFPaint)
  {
    PDFFillPaintCmd localPDFFillPaintCmd = new com/sun/pdfview/PDFFillPaintCmd;
    localPDFFillPaintCmd.<init>(paramPDFPaint);
    addCommand(localPDFFillPaintCmd);
  }
  
  public void addImage(PDFImage paramPDFImage)
  {
    PDFImageCmd localPDFImageCmd = new com/sun/pdfview/PDFImageCmd;
    localPDFImageCmd.<init>(paramPDFImage);
    addCommand(localPDFImageCmd);
  }
  
  public void addLineJoin(int paramInt)
  {
    PDFChangeStrokeCmd localPDFChangeStrokeCmd = new com/sun/pdfview/PDFChangeStrokeCmd;
    localPDFChangeStrokeCmd.<init>();
    Paint.Join localJoin = Paint.Join.MITER;
    switch (paramInt)
    {
    }
    for (;;)
    {
      localPDFChangeStrokeCmd.setLineJoin(localJoin);
      addCommand(localPDFChangeStrokeCmd);
      return;
      localJoin = Paint.Join.MITER;
      continue;
      localJoin = Paint.Join.ROUND;
      continue;
      localJoin = Paint.Join.BEVEL;
    }
  }
  
  public void addMiterLimit(float paramFloat)
  {
    PDFChangeStrokeCmd localPDFChangeStrokeCmd = new com/sun/pdfview/PDFChangeStrokeCmd;
    localPDFChangeStrokeCmd.<init>();
    localPDFChangeStrokeCmd.setMiterLimit(paramFloat);
    addCommand(localPDFChangeStrokeCmd);
  }
  
  public void addPath(Path paramPath, int paramInt)
  {
    PDFShapeCmd localPDFShapeCmd = new com/sun/pdfview/PDFShapeCmd;
    localPDFShapeCmd.<init>(paramPath, paramInt);
    addCommand(localPDFShapeCmd);
  }
  
  public void addPop()
  {
    PDFPopCmd localPDFPopCmd = new com/sun/pdfview/PDFPopCmd;
    localPDFPopCmd.<init>();
    addCommand(localPDFPopCmd);
  }
  
  public void addPush()
  {
    PDFPushCmd localPDFPushCmd = new com/sun/pdfview/PDFPushCmd;
    localPDFPushCmd.<init>();
    addCommand(localPDFPushCmd);
  }
  
  public void addStrokeAlpha(float paramFloat)
  {
    PDFStrokeAlphaCmd localPDFStrokeAlphaCmd = new com/sun/pdfview/PDFStrokeAlphaCmd;
    localPDFStrokeAlphaCmd.<init>(paramFloat);
    addCommand(localPDFStrokeAlphaCmd);
  }
  
  public void addStrokePaint(PDFPaint paramPDFPaint)
  {
    PDFStrokePaintCmd localPDFStrokePaintCmd = new com/sun/pdfview/PDFStrokePaintCmd;
    localPDFStrokePaintCmd.<init>(paramPDFPaint);
    addCommand(localPDFStrokePaintCmd);
  }
  
  public void addStrokeWidth(float paramFloat)
  {
    PDFChangeStrokeCmd localPDFChangeStrokeCmd = new com/sun/pdfview/PDFChangeStrokeCmd;
    localPDFChangeStrokeCmd.<init>();
    localPDFChangeStrokeCmd.setWidth(paramFloat);
    addCommand(localPDFChangeStrokeCmd);
  }
  
  public void addXform(Matrix paramMatrix)
  {
    PDFXformCmd localPDFXformCmd = new com/sun/pdfview/PDFXformCmd;
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>(paramMatrix);
    localPDFXformCmd.<init>(localMatrix);
    addCommand(localPDFXformCmd);
  }
  
  public void clearCommands()
  {
    synchronized (this.commands)
    {
      List localList2 = this.commands;
      localList2.clear();
      updateImages();
      return;
    }
  }
  
  public void finish()
  {
    boolean bool = true;
    try
    {
      this.finished = bool;
      notifyAll();
      updateImages();
      return;
    }
    finally {}
  }
  
  public float getAspectRatio()
  {
    float f1 = getWidth();
    float f2 = getHeight();
    return f1 / f2;
  }
  
  public RectF getBBox()
  {
    return this.bbox;
  }
  
  public PDFCmd getCommand(int paramInt)
  {
    lastRenderedCommand = paramInt;
    return (PDFCmd)this.commands.get(paramInt);
  }
  
  public int getCommandCount()
  {
    return this.commands.size();
  }
  
  public List getCommands()
  {
    return this.commands;
  }
  
  public List getCommands(int paramInt)
  {
    int i = getCommandCount();
    return getCommands(paramInt, i);
  }
  
  public List getCommands(int paramInt1, int paramInt2)
  {
    return this.commands.subList(paramInt1, paramInt2);
  }
  
  public float getHeight()
  {
    return this.bbox.height();
  }
  
  public Bitmap getImage(int paramInt1, int paramInt2, RectF paramRectF)
  {
    return getImage(paramInt1, paramInt2, paramRectF, true, false);
  }
  
  public Bitmap getImage(int paramInt1, int paramInt2, RectF paramRectF, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = null;
    int i = -1;
    ImageInfo localImageInfo = new com/sun/pdfview/ImageInfo;
    localImageInfo.<init>(paramInt1, paramInt2, paramRectF, i);
    Bitmap localBitmap;
    if (0 == 0)
    {
      if (paramBoolean1) {
        localImageInfo.bgColor = i;
      }
      localObject = Bitmap.Config.RGB_565;
      localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject);
      localObject = new com/sun/pdfview/PDFRenderer;
      ((PDFRenderer)localObject).<init>(this, localImageInfo, localBitmap);
      Map localMap = this.renderers;
      c localc = new c/a/a/d/c;
      localc.<init>(localObject);
      localMap.put(localImageInfo, localc);
    }
    for (;;)
    {
      if (localObject != null)
      {
        boolean bool = ((PDFRenderer)localObject).isFinished();
        if (!bool) {
          ((PDFRenderer)localObject).go(paramBoolean2);
        }
      }
      return localBitmap;
      i = 0;
      localBitmap = null;
    }
  }
  
  public Matrix getInitialTransform(int paramInt1, int paramInt2, RectF paramRectF)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    int j = -1082130432;
    float f2 = -1.0F;
    int k = 0;
    float f3 = 0.0F;
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    int m = getRotation();
    switch (m)
    {
    default: 
      if (paramRectF == null) {
        paramRectF = getBBox();
      }
      break;
    }
    for (;;)
    {
      f1 = paramInt1;
      f3 = paramRectF.width();
      f1 /= f3;
      f3 = paramInt2;
      float f4 = paramRectF.height();
      f3 /= f4;
      localMatrix.preScale(f1, f3);
      f1 = -paramRectF.left;
      f3 = -paramRectF.top;
      localMatrix.preTranslate(f1, f3);
      return localMatrix;
      float f5 = paramInt2;
      m = 0;
      f4 = 0.0F;
      b.a(localMatrix, f1, 0.0F, 0.0F, f2, 0.0F, f5);
      break;
      j = 0;
      f2 = 0.0F;
      f5 = f1;
      float f6 = 0.0F;
      float f7 = 0.0F;
      b.a(localMatrix, 0.0F, f1, f1, 0.0F, 0.0F, 0.0F);
      break;
      f7 = paramInt1;
      f5 = 0.0F;
      f6 = f1;
      b.a(localMatrix, f2, 0.0F, 0.0F, f1, f7, 0.0F);
      break;
      f5 = paramInt1;
      f6 = paramInt2;
      m = j;
      f4 = f2;
      b.a(localMatrix, 0.0F, f2, f2, 0.0F, f5, f6);
      break;
      i = getRotation();
      k = 90;
      f3 = 1.26E-43F;
      if (i != k)
      {
        i = getRotation();
        k = 270;
        f3 = 3.78E-43F;
        if (i != k) {}
      }
      else
      {
        int n = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = n;
      }
    }
  }
  
  public int getPageNumber()
  {
    return this.pageNumber;
  }
  
  public int getRotation()
  {
    return this.rotation;
  }
  
  public PointF getUnstretchedSize(int paramInt1, int paramInt2, RectF paramRectF)
  {
    double d1 = 0.5D;
    float f1;
    float f2;
    double d2;
    if (paramRectF == null)
    {
      paramRectF = this.bbox;
      f1 = paramRectF.height();
      f2 = paramRectF.width();
      f1 /= f2;
      f2 = paramInt2 / paramInt1;
      boolean bool = f2 < f1;
      if (!bool) {
        break label190;
      }
      f2 = paramInt1;
      f1 *= f2;
      d2 = f1 + d1;
      paramInt2 = (int)d2;
    }
    for (;;)
    {
      Object localObject = new android/graphics/PointF;
      f2 = paramInt1;
      float f3 = paramInt2;
      ((PointF)localObject).<init>(f2, f3);
      return (PointF)localObject;
      int j = getRotation();
      int i = 90;
      f2 = 1.26E-43F;
      if (j != i)
      {
        j = getRotation();
        i = 270;
        f2 = 3.78E-43F;
        if (j != i) {
          break;
        }
      }
      localObject = new android/graphics/RectF;
      f2 = paramRectF.left;
      f3 = paramRectF.top;
      float f4 = paramRectF.height();
      float f5 = paramRectF.width();
      ((RectF)localObject).<init>(f2, f3, f4, f5);
      paramRectF = (RectF)localObject;
      break;
      label190:
      f2 = paramInt2;
      f1 = f2 / f1;
      d2 = f1 + d1;
      paramInt1 = (int)d2;
    }
  }
  
  public float getWidth()
  {
    return this.bbox.width();
  }
  
  public boolean isFinished()
  {
    return this.finished;
  }
  
  public void stop(int paramInt1, int paramInt2, RectF paramRectF)
  {
    Object localObject1 = new com/sun/pdfview/ImageInfo;
    ((ImageInfo)localObject1).<init>(paramInt1, paramInt2, paramRectF);
    synchronized (this.renderers)
    {
      Map localMap2 = this.renderers;
      localObject1 = localMap2.get(localObject1);
      localObject1 = (c)localObject1;
      if (localObject1 != null)
      {
        localObject1 = ((c)localObject1).a();
        localObject1 = (PDFRenderer)localObject1;
        if (localObject1 != null) {
          ((PDFRenderer)localObject1).stop();
        }
      }
      return;
    }
  }
  
  public void updateImages()
  {
    int i = this.commands.size();
    parsedCommands = i;
    Object localObject = this.renderers.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        return;
      }
      localObject = (PDFRenderer)((c)localIterator.next()).a();
      if (localObject != null)
      {
        int j = ((PDFRenderer)localObject).getStatus();
        int k = 3;
        if (j == k)
        {
          j = 2;
          ((PDFRenderer)localObject).setStatus(j);
        }
      }
    }
  }
  
  public void waitForFinish()
  {
    try
    {
      boolean bool = this.finished;
      if (!bool) {
        wait();
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFPage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */