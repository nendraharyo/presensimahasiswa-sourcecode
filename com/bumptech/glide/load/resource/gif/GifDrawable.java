package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;

public class GifDrawable
  extends Drawable
  implements Animatable, GifFrameLoader.FrameCallback
{
  private static final int GRAVITY = 119;
  public static final int LOOP_FOREVER = 255;
  public static final int LOOP_INTRINSIC;
  private boolean applyGravity;
  private Rect destRect;
  private boolean isRecycled;
  private boolean isRunning;
  private boolean isStarted;
  private boolean isVisible = true;
  private int loopCount;
  private int maxLoopCount = -1;
  private Paint paint;
  private final GifDrawable.GifState state;
  
  public GifDrawable(Context paramContext, GifDecoder paramGifDecoder, Transformation paramTransformation, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(localGifState);
  }
  
  public GifDrawable(Context paramContext, GifDecoder paramGifDecoder, BitmapPool paramBitmapPool, Transformation paramTransformation, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(paramContext, paramGifDecoder, paramTransformation, paramInt1, paramInt2, paramBitmap);
  }
  
  GifDrawable(GifDrawable.GifState paramGifState)
  {
    GifDrawable.GifState localGifState = (GifDrawable.GifState)Preconditions.checkNotNull(paramGifState);
    this.state = localGifState;
  }
  
  GifDrawable(GifFrameLoader paramGifFrameLoader, Paint paramPaint)
  {
    this(localGifState);
    this.paint = paramPaint;
  }
  
  private Drawable.Callback findCallback()
  {
    for (Drawable.Callback localCallback = getCallback();; localCallback = ((Drawable)localCallback).getCallback())
    {
      boolean bool = localCallback instanceof Drawable;
      if (!bool) {
        break;
      }
    }
    return localCallback;
  }
  
  private Rect getDestRect()
  {
    Rect localRect = this.destRect;
    if (localRect == null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>();
      this.destRect = localRect;
    }
    return this.destRect;
  }
  
  private Paint getPaint()
  {
    Paint localPaint = this.paint;
    if (localPaint == null)
    {
      localPaint = new android/graphics/Paint;
      int i = 2;
      localPaint.<init>(i);
      this.paint = localPaint;
    }
    return this.paint;
  }
  
  private void resetLoopCount()
  {
    this.loopCount = 0;
  }
  
  private void startRunning()
  {
    int i = 1;
    boolean bool1 = this.isRecycled;
    GifFrameLoader localGifFrameLoader;
    int j;
    if (!bool1)
    {
      bool1 = i;
      String str = "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.";
      Preconditions.checkArgument(bool1, str);
      localGifFrameLoader = this.state.frameLoader;
      j = localGifFrameLoader.getFrameCount();
      if (j != i) {
        break label54;
      }
      invalidateSelf();
    }
    for (;;)
    {
      return;
      j = 0;
      localGifFrameLoader = null;
      break;
      label54:
      boolean bool2 = this.isRunning;
      if (!bool2)
      {
        this.isRunning = i;
        localGifFrameLoader = this.state.frameLoader;
        localGifFrameLoader.subscribe(this);
        invalidateSelf();
      }
    }
  }
  
  private void stopRunning()
  {
    this.isRunning = false;
    this.state.frameLoader.unsubscribe(this);
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.isRecycled;
    if (bool) {}
    for (;;)
    {
      return;
      bool = this.applyGravity;
      if (bool)
      {
        i = getIntrinsicWidth();
        int j = getIntrinsicHeight();
        localObject = getBounds();
        Rect localRect1 = getDestRect();
        Gravity.apply(119, i, j, (Rect)localObject, localRect1);
        bool = false;
        localBitmap = null;
        this.applyGravity = false;
      }
      Bitmap localBitmap = this.state.frameLoader.getCurrentFrame();
      int i = 0;
      Rect localRect2 = getDestRect();
      Object localObject = getPaint();
      paramCanvas.drawBitmap(localBitmap, null, localRect2, (Paint)localObject);
    }
  }
  
  public ByteBuffer getBuffer()
  {
    return this.state.frameLoader.getBuffer();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.state;
  }
  
  public Bitmap getFirstFrame()
  {
    return this.state.frameLoader.getFirstFrame();
  }
  
  public int getFrameCount()
  {
    return this.state.frameLoader.getFrameCount();
  }
  
  public int getFrameIndex()
  {
    return this.state.frameLoader.getCurrentIndex();
  }
  
  public Transformation getFrameTransformation()
  {
    return this.state.frameLoader.getFrameTransformation();
  }
  
  public int getIntrinsicHeight()
  {
    return this.state.frameLoader.getHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.state.frameLoader.getWidth();
  }
  
  public int getOpacity()
  {
    return -2;
  }
  
  public int getSize()
  {
    return this.state.frameLoader.getSize();
  }
  
  boolean isRecycled()
  {
    return this.isRecycled;
  }
  
  public boolean isRunning()
  {
    return this.isRunning;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.applyGravity = true;
  }
  
  public void onFrameReady()
  {
    Drawable.Callback localCallback = findCallback();
    if (localCallback == null)
    {
      stop();
      invalidateSelf();
    }
    for (;;)
    {
      return;
      invalidateSelf();
      int i = getFrameIndex();
      int j = getFrameCount() + -1;
      if (i == j)
      {
        i = this.loopCount + 1;
        this.loopCount = i;
      }
      i = this.maxLoopCount;
      j = -1;
      if (i != j)
      {
        i = this.loopCount;
        j = this.maxLoopCount;
        if (i >= j) {
          stop();
        }
      }
    }
  }
  
  public void recycle()
  {
    this.isRecycled = true;
    this.state.frameLoader.clear();
  }
  
  public void setAlpha(int paramInt)
  {
    getPaint().setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    getPaint().setColorFilter(paramColorFilter);
  }
  
  public void setFrameTransformation(Transformation paramTransformation, Bitmap paramBitmap)
  {
    this.state.frameLoader.setFrameTransformation(paramTransformation, paramBitmap);
  }
  
  void setIsRunning(boolean paramBoolean)
  {
    this.isRunning = paramBoolean;
  }
  
  public void setLoopCount(int paramInt)
  {
    int i = -1;
    if ((paramInt <= 0) && (paramInt != i) && (paramInt != 0))
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
      throw localIllegalArgumentException;
    }
    int j;
    if (paramInt == 0)
    {
      GifFrameLoader localGifFrameLoader = this.state.frameLoader;
      j = localGifFrameLoader.getLoopCount();
      if (j != 0) {}
    }
    for (this.maxLoopCount = i;; this.maxLoopCount = paramInt)
    {
      return;
      i = j;
      break;
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.isRecycled;
    if (!bool)
    {
      bool = true;
      String str = "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.";
      Preconditions.checkArgument(bool, str);
      this.isVisible = paramBoolean1;
      if (paramBoolean1) {
        break label46;
      }
      stopRunning();
    }
    for (;;)
    {
      return super.setVisible(paramBoolean1, paramBoolean2);
      bool = false;
      break;
      label46:
      bool = this.isStarted;
      if (bool) {
        startRunning();
      }
    }
  }
  
  public void start()
  {
    this.isStarted = true;
    resetLoopCount();
    boolean bool = this.isVisible;
    if (bool) {
      startRunning();
    }
  }
  
  public void startFromFirstFrame()
  {
    boolean bool = this.isRunning;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool, "You cannot restart a currently running animation.");
      this.state.frameLoader.setNextStartFromFirstFrame();
      start();
      return;
    }
  }
  
  public void stop()
  {
    this.isStarted = false;
    stopRunning();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifDrawable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */