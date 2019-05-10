package com.sun.pdfview;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.util.Log;
import c.a.a.d.c;
import c.a.a.e.a;
import c.a.a.e.b;
import java.io.PrintStream;
import java.util.Stack;

public class PDFRenderer
  extends BaseWatchable
  implements Runnable
{
  public static final Paint.Cap NOCAP = null;
  public static final float[] NODASH = null;
  public static final Paint.Join NOJOIN = null;
  public static final float NOLIMIT = -1000.0F;
  public static final float NOPHASE = -1000.0F;
  public static final float NOWIDTH = -1000.0F;
  private static final String TAG = "APV.PDFRenderer";
  public static final long UPDATE_DURATION = 200L;
  private int cmdCnt;
  private int currentCommand;
  private Canvas g;
  private RectF globalDirtyRegion;
  private c imageRef;
  private ImageInfo imageinfo;
  private Path lastShape;
  private PDFPage page;
  private Stack stack;
  private PDFRenderer.GraphicsState state;
  private long then = 0L;
  private RectF unupdatedRegion;
  
  public PDFRenderer(PDFPage paramPDFPage, Canvas paramCanvas, RectF paramRectF1, RectF paramRectF2, int paramInt)
  {
    this.page = paramPDFPage;
    this.g = paramCanvas;
    ImageInfo localImageInfo = new com/sun/pdfview/ImageInfo;
    int i = (int)paramRectF1.width();
    int j = (int)paramRectF1.height();
    localImageInfo.<init>(i, j, paramRectF2, paramInt);
    this.imageinfo = localImageInfo;
    float f1 = paramRectF1.left;
    float f2 = paramRectF1.top;
    paramCanvas.translate(f1, f2);
    this.cmdCnt = 0;
  }
  
  public PDFRenderer(PDFPage paramPDFPage, ImageInfo paramImageInfo, Bitmap paramBitmap)
  {
    this.page = paramPDFPage;
    this.imageinfo = paramImageInfo;
    c localc = new c/a/a/d/c;
    a locala = new c/a/a/e/a;
    Canvas localCanvas = this.g;
    locala.<init>(paramBitmap, localCanvas);
    localc.<init>(locala);
    this.imageRef = localc;
    this.cmdCnt = 0;
  }
  
  private RectF addDirtyRegion(RectF paramRectF1, RectF paramRectF2)
  {
    if (paramRectF1 == null) {}
    for (;;)
    {
      return paramRectF2;
      if (paramRectF2 == null) {
        paramRectF2 = paramRectF1;
      } else {
        paramRectF2.union(paramRectF1);
      }
    }
  }
  
  private Bitmap getMaskedImage(Bitmap paramBitmap)
  {
    int i = 1;
    int j = this.state.fillPaint.getPaint().getColor();
    int k = Color.alpha(j) << 24;
    int m = Color.red(j) << 16;
    k |= m;
    m = Color.green(j) << 8;
    k |= m;
    j = Color.blue(j);
    int n = k | j;
    int i1 = paramBitmap.getWidth();
    int i2 = paramBitmap.getHeight();
    Object localObject1 = Bitmap.Config.ARGB_8888;
    Bitmap localBitmap = Bitmap.createBitmap(i1, i2, (Bitmap.Config)localObject1);
    Object localObject2;
    int[] arrayOfInt;
    for (int i3 = 0;; i3 = j)
    {
      if (i3 >= i2) {
        return localBitmap;
      }
      localObject2 = new int[i1];
      arrayOfInt = new int[localObject2.length];
      int i4 = 0 + i3;
      localObject1 = paramBitmap;
      m = 0;
      i5 = 0;
      paramBitmap.getPixels((int[])localObject2, 0, 0, 0, i4, i1, i);
      j = 0;
      localObject1 = null;
      m = localObject2.length;
      if (j < m) {
        break;
      }
      i4 = 0 + i3;
      localObject1 = localBitmap;
      localObject2 = arrayOfInt;
      m = 0;
      i5 = 0;
      localBitmap.setPixels(arrayOfInt, 0, 0, 0, i4, i1, i);
      j = i3 + 1;
    }
    m = localObject2[j];
    int i5 = -16777216;
    if (m == i5) {
      arrayOfInt[j] = n;
    }
    for (;;)
    {
      j += 1;
      break;
      arrayOfInt[j] = 0;
    }
  }
  
  private boolean rendererFinished()
  {
    boolean bool1 = true;
    PDFPage localPDFPage1 = this.page;
    if (localPDFPage1 == null) {}
    for (;;)
    {
      return bool1;
      localPDFPage1 = this.page;
      boolean bool2 = localPDFPage1.isFinished();
      if (bool2)
      {
        int i = this.currentCommand;
        PDFPage localPDFPage2 = this.page;
        int j = localPDFPage2.getCommandCount();
        if (i == j) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  private void setClip(Rect paramRect)
  {
    this.state.cliprgn = paramRect;
    Canvas localCanvas = this.g;
    Region.Op localOp = Region.Op.REPLACE;
    localCanvas.clipRect(paramRect, localOp);
  }
  
  private void setupRendering(Canvas paramCanvas)
  {
    int i = -16777216;
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>();
    int j = this.imageinfo.bgColor;
    localPaint.setColor(j);
    float f1 = this.imageinfo.width;
    float f2 = this.imageinfo.height;
    Object localObject1 = paramCanvas;
    paramCanvas.drawRect(0.0F, 0.0F, f1, f2, localPaint);
    localPaint.setColor(i);
    localObject1 = getInitialTransform();
    paramCanvas.setMatrix((Matrix)localObject1);
    localObject1 = new com/sun/pdfview/PDFRenderer$GraphicsState;
    ((PDFRenderer.GraphicsState)localObject1).<init>(this);
    this.state = ((PDFRenderer.GraphicsState)localObject1);
    this.state.cliprgn = null;
    localObject1 = this.state;
    Object localObject2 = PDFPaint.getColorPaint(i);
    ((PDFRenderer.GraphicsState)localObject1).strokePaint = ((PDFPaint)localObject2);
    localObject1 = this.state;
    localObject2 = PDFPaint.getPaint(i);
    ((PDFRenderer.GraphicsState)localObject1).fillPaint = ((PDFPaint)localObject2);
    localObject1 = this.state;
    localObject2 = paramCanvas.getMatrix();
    ((PDFRenderer.GraphicsState)localObject1).xform = ((Matrix)localObject2);
    localObject1 = new java/util/Stack;
    ((Stack)localObject1).<init>();
    this.stack = ((Stack)localObject1);
    this.currentCommand = 0;
  }
  
  private void showTrans(Matrix paramMatrix, RectF paramRectF)
  {
    Object localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    paramMatrix.mapRect((RectF)localObject1, paramRectF);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("M=");
    localObject2 = paramMatrix;
    Log.i("APV.PDFRenderer", (String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("src=");
    localObject2 = paramRectF;
    Log.i("APV.PDFRenderer", (String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("dst=");
    localObject1 = localObject1;
    Log.i("APV.PDFRenderer", (String)localObject1);
  }
  
  public void cleanup()
  {
    this.page = null;
    this.state = null;
    this.stack = null;
    this.globalDirtyRegion = null;
    this.lastShape = null;
  }
  
  public void clip(Path paramPath)
  {
    this.g.clipPath(paramPath);
  }
  
  public void draw(Path paramPath)
  {
    Canvas localCanvas = this.g;
    Paint localPaint = this.state.fillPaint.getPaint();
    localCanvas.drawPath(paramPath, localPaint);
    localCanvas = this.g;
    localPaint = this.state.strokePaint.getPaint();
    localCanvas.drawPath(paramPath, localPaint);
  }
  
  public RectF drawImage(PDFImage paramPDFImage)
  {
    float f1 = 1.0F;
    int i = 2;
    float f2 = 2.8E-45F;
    int j = 1;
    float f3 = 0.0F;
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    int k = paramPDFImage.getWidth();
    float f4 = k;
    f4 = f1 / f4;
    int m = paramPDFImage.getHeight();
    float f5 = m;
    f5 = -1.0F / f5;
    Object localObject2 = null;
    float f6 = 0.0F;
    float f7 = 0.0F;
    b.a((Matrix)localObject1, f4, 0.0F, 0.0F, f5, 0.0F, f1);
    Object localObject3 = paramPDFImage.getImage();
    boolean bool = paramPDFImage.isImageMask();
    if (bool) {
      localObject3 = getMaskedImage((Bitmap)localObject3);
    }
    for (localObject2 = localObject3;; localObject2 = localObject3)
    {
      this.g.drawBitmap((Bitmap)localObject2, (Matrix)localObject1, null);
      Matrix localMatrix = new android/graphics/Matrix;
      localObject3 = this.g.getMatrix();
      localMatrix.<init>((Matrix)localObject3);
      localMatrix.preConcat((Matrix)localObject1);
      localObject3 = new float[4];
      localObject3[0] = 0.0F;
      localObject3[j] = 0.0F;
      float f8 = ((Bitmap)localObject2).getWidth() + 0.0F;
      localObject3[i] = f8;
      f6 = ((Bitmap)localObject2).getHeight();
      f3 = 0.0F + f6;
      localObject3[3] = f3;
      localObject1 = localMatrix;
      localObject2 = localObject3;
      f7 = f2;
      localMatrix.mapPoints((float[])localObject3, 0, (float[])localObject3, 0, i);
      localObject1 = new android/graphics/RectF;
      f3 = localObject3[0];
      f6 = localObject3[j];
      f5 = localObject3[i];
      f7 = localObject3[0];
      f5 -= f7;
      f7 = localObject3[3];
      f4 = localObject3[j];
      f4 = f7 - f4;
      ((RectF)localObject1).<init>(f3, f6, f5, f4);
      return (RectF)localObject1;
    }
  }
  
  public RectF drawNativeText(String paramString, float paramFloat1, float paramFloat2)
  {
    Object localObject = this.state.fillPaint.getPaint();
    this.g.drawText(paramString, paramFloat1, paramFloat2, (Paint)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    return (RectF)localObject;
  }
  
  public RectF drawNativeText(String paramString, RectF paramRectF)
  {
    Paint localPaint = this.state.fillPaint.getPaint();
    this.g.save();
    Object localObject = this.g.getMatrix();
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>((Matrix)localObject);
    float f1 = paramRectF.left;
    float f2 = paramRectF.top;
    localMatrix.preScale(1.0F, -1.0F, f1, f2);
    this.g.setMatrix(localMatrix);
    localObject = this.g;
    float f3 = paramRectF.left;
    float f4 = paramRectF.top;
    ((Canvas)localObject).drawText(paramString, f3, f4, localPaint);
    this.g.restore();
    return paramRectF;
  }
  
  public RectF fill(Path paramPath)
  {
    PDFPaint localPDFPaint = this.state.fillPaint;
    Canvas localCanvas = this.g;
    return localPDFPaint.fill(this, localCanvas, paramPath);
  }
  
  public Matrix getInitialTransform()
  {
    PDFPage localPDFPage = this.page;
    int i = this.imageinfo.width;
    int j = this.imageinfo.height;
    RectF localRectF = this.imageinfo.clip;
    return localPDFPage.getInitialTransform(i, j, localRectF);
  }
  
  public Path getLastShape()
  {
    return this.lastShape;
  }
  
  public Matrix getTransform()
  {
    return this.state.xform;
  }
  
  public int iterate()
  {
    int i = 6;
    String str = null;
    Object localObject1 = this.page;
    int j;
    if (localObject1 == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      localObject1 = this.imageRef;
      if (localObject1 != null)
      {
        localObject1 = (a)this.imageRef.a();
        if (localObject1 == null)
        {
          localObject1 = System.out;
          str = "Image went away.  Stopping";
          ((PrintStream)localObject1).println(str);
          j = 5;
        }
        else
        {
          localObject1 = ((a)localObject1).a();
          this.g = ((Canvas)localObject1);
        }
      }
      else
      {
        j = this.currentCommand;
        localObject3 = this.page;
        int n = ((PDFPage)localObject3).getCommandCount();
        if (j >= n)
        {
          localObject1 = this.page;
          boolean bool1 = ((PDFPage)localObject1).isFinished();
          if (bool1) {
            bool1 = i;
          } else {
            int k = 3;
          }
        }
        else
        {
          localObject1 = this.page;
          i = this.currentCommand;
          n = i + 1;
          this.currentCommand = n;
          localObject1 = ((PDFPage)localObject1).getCommand(i);
          if (localObject1 == null)
          {
            localObject1 = new com/sun/pdfview/PDFParseException;
            ((PDFParseException)localObject1).<init>("Command not found!");
            throw ((Throwable)localObject1);
          }
        }
      }
      try
      {
        localObject1 = ((PDFCmd)localObject1).execute(this);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          long l1;
          long l2;
          boolean bool2;
          Object localObject4 = "APV.PDFRenderer";
          localObject3 = localException.getMessage();
          Log.e((String)localObject4, (String)localObject3, localException);
          int m = 0;
          Object localObject2 = null;
        }
      }
      localObject4 = this.globalDirtyRegion;
      localObject4 = addDirtyRegion((RectF)localObject1, (RectF)localObject4);
      this.globalDirtyRegion = ((RectF)localObject4);
      localObject4 = this.unupdatedRegion;
      localObject1 = addDirtyRegion((RectF)localObject1, (RectF)localObject4);
      this.unupdatedRegion = ((RectF)localObject1);
      l1 = System.currentTimeMillis();
      l2 = this.then;
      bool2 = l1 < l2;
      if (!bool2)
      {
        bool2 = rendererFinished();
        if (!bool2) {}
      }
      else
      {
        this.unupdatedRegion = null;
        l2 = 200L;
        l1 += l2;
        this.then = l1;
      }
      localObject1 = this.imageRef;
      if (localObject1 != null) {
        this.g = null;
      }
      m = 4;
    }
  }
  
  public void pop()
  {
    Object localObject = (PDFRenderer.GraphicsState)this.stack.pop();
    this.state = ((PDFRenderer.GraphicsState)localObject);
    localObject = this.state.xform;
    setTransform((Matrix)localObject);
    localObject = this.state.cliprgn;
    setClip((Rect)localObject);
  }
  
  public void push()
  {
    Object localObject1 = this.state;
    Object localObject2 = this.g.getClipBounds();
    ((PDFRenderer.GraphicsState)localObject1).cliprgn = ((Rect)localObject2);
    localObject1 = this.stack;
    localObject2 = this.state;
    ((Stack)localObject1).push(localObject2);
    localObject1 = (PDFRenderer.GraphicsState)this.state.clone();
    this.state = ((PDFRenderer.GraphicsState)localObject1);
  }
  
  public void setFillPaint(PDFPaint paramPDFPaint)
  {
    this.state.fillPaint = paramPDFPaint;
  }
  
  public void setLastShape(Path paramPath)
  {
    this.lastShape = paramPath;
  }
  
  public void setStrokePaint(PDFPaint paramPDFPaint)
  {
    this.state.strokePaint = paramPDFPaint;
  }
  
  public void setStrokeParts(float paramFloat1, Paint.Cap paramCap, Paint.Join paramJoin, float paramFloat2, float[] paramArrayOfFloat, float paramFloat3)
  {
    float f = -1000.0F;
    boolean bool = paramFloat1 < f;
    if (!bool)
    {
      localObject = this.state;
      paramFloat1 = ((PDFRenderer.GraphicsState)localObject).lineWidth;
    }
    Object localObject = NOCAP;
    if (paramCap == localObject)
    {
      localObject = this.state;
      paramCap = ((PDFRenderer.GraphicsState)localObject).cap;
    }
    localObject = NOJOIN;
    if (paramJoin == localObject)
    {
      localObject = this.state;
      paramJoin = ((PDFRenderer.GraphicsState)localObject).join;
    }
    bool = paramFloat2 < f;
    if (!bool)
    {
      localObject = this.state;
      paramFloat2 = ((PDFRenderer.GraphicsState)localObject).miterLimit;
    }
    if (paramArrayOfFloat != null)
    {
      int i = paramArrayOfFloat.length;
      if (i == 0)
      {
        i = 0;
        localObject = (float[])null;
      }
    }
    this.state.lineWidth = paramFloat1;
    this.state.cap = paramCap;
    this.state.join = paramJoin;
    this.state.miterLimit = paramFloat2;
  }
  
  public void setTransform(Matrix paramMatrix)
  {
    this.state.xform = paramMatrix;
    Canvas localCanvas = this.g;
    Matrix localMatrix = this.state.xform;
    localCanvas.setMatrix(localMatrix);
  }
  
  public void setup()
  {
    Object localObject = this.imageRef;
    if (localObject != null)
    {
      localObject = (a)this.imageRef.a();
      if (localObject == null) {
        break label47;
      }
      localObject = ((a)localObject).a();
    }
    for (;;)
    {
      if (localObject != null) {
        setupRendering((Canvas)localObject);
      }
      return;
      localObject = this.g;
      continue;
      label47:
      localObject = null;
    }
  }
  
  public RectF stroke(Path paramPath)
  {
    PDFPaint localPDFPaint = this.state.strokePaint;
    Canvas localCanvas = this.g;
    return localPDFPaint.fill(this, localCanvas, paramPath);
  }
  
  public void transform(Matrix paramMatrix)
  {
    this.state.xform.preConcat(paramMatrix);
    Canvas localCanvas = this.g;
    Matrix localMatrix = this.state.xform;
    localCanvas.setMatrix(localMatrix);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFRenderer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */