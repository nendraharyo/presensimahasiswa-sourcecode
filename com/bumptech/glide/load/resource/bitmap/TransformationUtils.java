package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.Xfermode;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class TransformationUtils
{
  private static final Lock BITMAP_DRAWABLE_LOCK;
  private static final Paint CIRCLE_CROP_BITMAP_PAINT;
  private static final int CIRCLE_CROP_PAINT_FLAGS = 7;
  private static final Paint CIRCLE_CROP_SHAPE_PAINT;
  private static final Paint DEFAULT_PAINT;
  private static final Set MODELS_REQUIRING_BITMAP_LOCK;
  public static final int PAINT_FLAGS = 6;
  private static final String TAG = "TransformationUtils";
  
  static
  {
    int i = 6;
    int j = 7;
    Object localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>(i);
    DEFAULT_PAINT = (Paint)localObject1;
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>(j);
    CIRCLE_CROP_SHAPE_PAINT = (Paint)localObject1;
    localObject1 = new java/util/HashSet;
    int k = 29;
    Object localObject2 = new String[k];
    localObject2[0] = "XT1085";
    localObject2[1] = "XT1092";
    localObject2[2] = "XT1093";
    localObject2[3] = "XT1094";
    localObject2[4] = "XT1095";
    localObject2[5] = "XT1096";
    localObject2[i] = "XT1097";
    Object localObject3 = "XT1098";
    localObject2[j] = localObject3;
    localObject2[8] = "XT1031";
    localObject2[9] = "XT1028";
    localObject2[10] = "XT937C";
    localObject2[11] = "XT1032";
    localObject2[12] = "XT1008";
    localObject2[13] = "XT1033";
    localObject2[14] = "XT1035";
    localObject2[15] = "XT1034";
    localObject2[16] = "XT939G";
    localObject2[17] = "XT1039";
    localObject2[18] = "XT1040";
    localObject2[19] = "XT1042";
    localObject2[20] = "XT1045";
    localObject2[21] = "XT1063";
    localObject2[22] = "XT1064";
    localObject2[23] = "XT1068";
    localObject2[24] = "XT1069";
    localObject2[25] = "XT1072";
    localObject2[26] = "XT1077";
    localObject2[27] = "XT1078";
    int m = 28;
    String str = "XT1079";
    localObject2[m] = str;
    localObject2 = Arrays.asList((Object[])localObject2);
    ((HashSet)localObject1).<init>((Collection)localObject2);
    MODELS_REQUIRING_BITMAP_LOCK = (Set)localObject1;
    localObject1 = MODELS_REQUIRING_BITMAP_LOCK;
    localObject2 = Build.MODEL;
    boolean bool = ((Set)localObject1).contains(localObject2);
    if (bool)
    {
      localObject1 = new java/util/concurrent/locks/ReentrantLock;
      ((ReentrantLock)localObject1).<init>();
    }
    for (;;)
    {
      BITMAP_DRAWABLE_LOCK = (Lock)localObject1;
      localObject1 = new android/graphics/Paint;
      ((Paint)localObject1).<init>(j);
      CIRCLE_CROP_BITMAP_PAINT = (Paint)localObject1;
      localObject1 = CIRCLE_CROP_BITMAP_PAINT;
      localObject2 = new android/graphics/PorterDuffXfermode;
      localObject3 = PorterDuff.Mode.SRC_IN;
      ((PorterDuffXfermode)localObject2).<init>((PorterDuff.Mode)localObject3);
      ((Paint)localObject1).setXfermode((Xfermode)localObject2);
      return;
      localObject1 = new com/bumptech/glide/load/resource/bitmap/TransformationUtils$NoLock;
      ((TransformationUtils.NoLock)localObject1).<init>();
    }
  }
  
  private static void applyMatrix(Bitmap paramBitmap1, Bitmap paramBitmap2, Matrix paramMatrix)
  {
    Object localObject1 = BITMAP_DRAWABLE_LOCK;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = new android/graphics/Canvas;
      ((Canvas)localObject1).<init>(paramBitmap2);
      Paint localPaint = DEFAULT_PAINT;
      ((Canvas)localObject1).drawBitmap(paramBitmap1, paramMatrix, localPaint);
      clear((Canvas)localObject1);
      return;
    }
    finally
    {
      BITMAP_DRAWABLE_LOCK.unlock();
    }
  }
  
  public static Bitmap centerCrop(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject = null;
    float f2 = 0.5F;
    int j = paramBitmap.getWidth();
    if (j == paramInt1)
    {
      j = paramBitmap.getHeight();
      if (j == paramInt2) {
        return paramBitmap;
      }
    }
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    j = paramBitmap.getWidth() * paramInt2;
    int k = paramBitmap.getHeight() * paramInt1;
    float f3;
    float f4;
    int m;
    float f5;
    if (j > k)
    {
      f3 = paramInt2;
      k = paramBitmap.getHeight();
      f4 = k;
      f4 = f3 / f4;
      f3 = paramInt1;
      m = paramBitmap.getWidth();
      f5 = m * f4;
      f3 = (f3 - f5) * f2;
    }
    for (;;)
    {
      localMatrix.setScale(f4, f4);
      j = (int)(f3 + f2);
      f3 = j;
      i = (int)(f1 + f2);
      f1 = i;
      localMatrix.postTranslate(f3, f1);
      localObject = getNonNullConfig(paramBitmap);
      localObject = paramBitmapPool.get(paramInt1, paramInt2, (Bitmap.Config)localObject);
      setAlpha(paramBitmap, (Bitmap)localObject);
      applyMatrix(paramBitmap, (Bitmap)localObject, localMatrix);
      paramBitmap = (Bitmap)localObject;
      break;
      f3 = paramInt1;
      k = paramBitmap.getWidth();
      f4 = k;
      f4 = f3 / f4;
      f3 = paramInt2;
      m = paramBitmap.getHeight();
      f5 = m * f4;
      float f6 = (f3 - f5) * f2;
      j = 0;
      f3 = 0.0F;
      f1 = f6;
    }
  }
  
  public static Bitmap centerInside(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = paramBitmap.getWidth();
    String str1;
    boolean bool;
    String str2;
    if (j <= paramInt1)
    {
      j = paramBitmap.getHeight();
      if (j <= paramInt2)
      {
        str1 = "TransformationUtils";
        bool = Log.isLoggable(str1, i);
        if (bool)
        {
          str1 = "TransformationUtils";
          str2 = "requested target size larger or equal to input, returning input";
          Log.v(str1, str2);
        }
      }
    }
    for (;;)
    {
      return paramBitmap;
      str1 = "TransformationUtils";
      bool = Log.isLoggable(str1, i);
      if (bool)
      {
        str1 = "TransformationUtils";
        str2 = "requested target size too big for input, fit centering instead";
        Log.v(str1, str2);
      }
      paramBitmap = fitCenter(paramBitmapPool, paramBitmap, paramInt1, paramInt2);
    }
  }
  
  public static Bitmap circleCrop(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    float f1 = 2.0F;
    int i = Math.min(paramInt1, paramInt2);
    float f2 = i / f1;
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    float f3 = i;
    float f4 = j;
    f3 /= f4;
    f4 = i;
    float f5 = k;
    f4 /= f5;
    f3 = Math.max(f3, f4);
    float f6 = j * f3;
    float f7 = k * f3;
    f3 = (i - f6) / f1;
    f4 = (i - f7) / f1;
    RectF localRectF = new android/graphics/RectF;
    f6 += f3;
    f7 += f4;
    localRectF.<init>(f3, f4, f6, f7);
    Bitmap localBitmap1 = getAlphaSafeBitmap(paramBitmapPool, paramBitmap);
    Object localObject1 = getAlphaSafeConfig(paramBitmap);
    Bitmap localBitmap2 = paramBitmapPool.get(i, i, (Bitmap.Config)localObject1);
    k = 1;
    f7 = Float.MIN_VALUE;
    localBitmap2.setHasAlpha(k);
    localObject1 = BITMAP_DRAWABLE_LOCK;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = new android/graphics/Canvas;
      ((Canvas)localObject1).<init>(localBitmap2);
      Paint localPaint = CIRCLE_CROP_SHAPE_PAINT;
      ((Canvas)localObject1).drawCircle(f2, f2, f2, localPaint);
      boolean bool = false;
      f2 = 0.0F;
      Lock localLock = null;
      localPaint = CIRCLE_CROP_BITMAP_PAINT;
      ((Canvas)localObject1).drawBitmap(localBitmap1, null, localRectF, localPaint);
      clear((Canvas)localObject1);
      localLock = BITMAP_DRAWABLE_LOCK;
      localLock.unlock();
      bool = localBitmap1.equals(paramBitmap);
      if (!bool) {
        paramBitmapPool.put(localBitmap1);
      }
      return localBitmap2;
    }
    finally
    {
      BITMAP_DRAWABLE_LOCK.unlock();
    }
  }
  
  private static void clear(Canvas paramCanvas)
  {
    paramCanvas.setBitmap(null);
  }
  
  public static Bitmap fitCenter(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = paramBitmap.getWidth();
    Object localObject1;
    String str1;
    if (j == paramInt1)
    {
      j = paramBitmap.getHeight();
      if (j == paramInt2)
      {
        localObject1 = "TransformationUtils";
        boolean bool1 = Log.isLoggable((String)localObject1, i);
        if (bool1)
        {
          localObject1 = "TransformationUtils";
          str1 = "requested target size matches input, returning input";
          Log.v((String)localObject1, str1);
        }
      }
    }
    for (;;)
    {
      return paramBitmap;
      float f1 = paramInt1;
      int n = paramBitmap.getWidth();
      float f2 = n;
      f1 /= f2;
      f2 = paramInt2;
      float f3 = paramBitmap.getHeight();
      f2 /= f3;
      f2 = Math.min(f1, f2);
      f1 = paramBitmap.getWidth() * f2;
      int k = Math.round(f1);
      f3 = paramBitmap.getHeight() * f2;
      int i1 = Math.round(f3);
      int i2 = paramBitmap.getWidth();
      if (i2 == k)
      {
        k = paramBitmap.getHeight();
        if (k == i1)
        {
          localObject1 = "TransformationUtils";
          boolean bool2 = Log.isLoggable((String)localObject1, i);
          if (!bool2) {
            continue;
          }
          localObject1 = "TransformationUtils";
          str1 = "adjusted target size matches input, returning input";
          Log.v((String)localObject1, str1);
          continue;
        }
      }
      f1 = paramBitmap.getWidth() * f2;
      int m = (int)f1;
      f3 = paramBitmap.getHeight() * f2;
      i1 = (int)f3;
      Object localObject2 = getNonNullConfig(paramBitmap);
      localObject1 = paramBitmapPool.get(m, i1, (Bitmap.Config)localObject2);
      setAlpha(paramBitmap, (Bitmap)localObject1);
      Object localObject3 = "TransformationUtils";
      boolean bool3 = Log.isLoggable((String)localObject3, i);
      if (bool3)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "request: " + paramInt1 + "x" + paramInt2;
        Log.v("TransformationUtils", (String)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("toFit:   ");
        i = paramBitmap.getWidth();
        localObject2 = ((StringBuilder)localObject2).append(i).append("x");
        i = paramBitmap.getHeight();
        localObject2 = i;
        Log.v("TransformationUtils", (String)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("toReuse: ");
        i = ((Bitmap)localObject1).getWidth();
        localObject2 = ((StringBuilder)localObject2).append(i).append("x");
        i = ((Bitmap)localObject1).getHeight();
        localObject2 = i;
        Log.v("TransformationUtils", (String)localObject2);
        localObject3 = "TransformationUtils";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "minPct:   ";
        localObject2 = str2 + f2;
        Log.v((String)localObject3, (String)localObject2);
      }
      localObject3 = new android/graphics/Matrix;
      ((Matrix)localObject3).<init>();
      ((Matrix)localObject3).setScale(f2, f2);
      applyMatrix(paramBitmap, (Bitmap)localObject1, (Matrix)localObject3);
      paramBitmap = (Bitmap)localObject1;
    }
  }
  
  private static Bitmap getAlphaSafeBitmap(BitmapPool paramBitmapPool, Bitmap paramBitmap)
  {
    Object localObject1 = getAlphaSafeConfig(paramBitmap);
    Object localObject2 = paramBitmap.getConfig();
    boolean bool = ((Bitmap.Config)localObject1).equals(localObject2);
    if (bool) {}
    for (;;)
    {
      return paramBitmap;
      int i = paramBitmap.getWidth();
      int j = paramBitmap.getHeight();
      localObject1 = paramBitmapPool.get(i, j, (Bitmap.Config)localObject1);
      localObject2 = new android/graphics/Canvas;
      ((Canvas)localObject2).<init>((Bitmap)localObject1);
      j = 0;
      ((Canvas)localObject2).drawBitmap(paramBitmap, 0.0F, 0.0F, null);
      paramBitmap = (Bitmap)localObject1;
    }
  }
  
  private static Bitmap.Config getAlphaSafeConfig(Bitmap paramBitmap)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j)
    {
      localConfig1 = Bitmap.Config.RGBA_F16;
      Bitmap.Config localConfig2 = paramBitmap.getConfig();
      boolean bool = localConfig1.equals(localConfig2);
      if (!bool) {}
    }
    for (Bitmap.Config localConfig1 = Bitmap.Config.RGBA_F16;; localConfig1 = Bitmap.Config.ARGB_8888) {
      return localConfig1;
    }
  }
  
  public static Lock getBitmapDrawableLock()
  {
    return BITMAP_DRAWABLE_LOCK;
  }
  
  public static int getExifOrientationDegrees(int paramInt)
  {
    int i;
    switch (paramInt)
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      return i;
      i = 90;
      continue;
      i = 180;
      continue;
      i = 270;
    }
  }
  
  private static Bitmap.Config getNonNullConfig(Bitmap paramBitmap)
  {
    Bitmap.Config localConfig = paramBitmap.getConfig();
    if (localConfig != null) {}
    for (localConfig = paramBitmap.getConfig();; localConfig = Bitmap.Config.ARGB_8888) {
      return localConfig;
    }
  }
  
  static void initializeMatrixForRotation(int paramInt, Matrix paramMatrix)
  {
    float f1 = 180.0F;
    float f2 = 90.0F;
    float f3 = -90.0F;
    float f4 = 1.0F;
    float f5 = -1.0F;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      paramMatrix.setScale(f5, f4);
      continue;
      paramMatrix.setRotate(f1);
      continue;
      paramMatrix.setRotate(f1);
      paramMatrix.postScale(f5, f4);
      continue;
      paramMatrix.setRotate(f2);
      paramMatrix.postScale(f5, f4);
      continue;
      paramMatrix.setRotate(f2);
      continue;
      paramMatrix.setRotate(f3);
      paramMatrix.postScale(f5, f4);
      continue;
      paramMatrix.setRotate(f3);
    }
  }
  
  public static boolean isExifOrientationRequired(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static Bitmap rotateImage(Bitmap paramBitmap, int paramInt)
  {
    if (paramInt != 0) {}
    try
    {
      Matrix localMatrix = new android/graphics/Matrix;
      localMatrix.<init>();
      float f = paramInt;
      localMatrix.setRotate(f);
      bool1 = false;
      str1 = null;
      i = 0;
      str2 = null;
      int j = paramBitmap.getWidth();
      int k = paramBitmap.getHeight();
      boolean bool2 = true;
      Bitmap localBitmap = paramBitmap;
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, j, k, localMatrix, bool2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str2;
        String str1 = "TransformationUtils";
        int i = 6;
        boolean bool1 = Log.isLoggable(str1, i);
        if (bool1)
        {
          str1 = "TransformationUtils";
          str2 = "Exception when trying to orient image";
          Log.e(str1, str2, localException);
        }
      }
    }
    return paramBitmap;
  }
  
  public static Bitmap rotateImageExif(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt)
  {
    Bitmap.Config localConfig = null;
    boolean bool = isExifOrientationRequired(paramInt);
    if (!bool) {}
    for (;;)
    {
      return paramBitmap;
      Matrix localMatrix = new android/graphics/Matrix;
      localMatrix.<init>();
      initializeMatrixForRotation(paramInt, localMatrix);
      RectF localRectF = new android/graphics/RectF;
      float f1 = paramBitmap.getWidth();
      float f2 = paramBitmap.getHeight();
      localRectF.<init>(0.0F, 0.0F, f1, f2);
      localMatrix.mapRect(localRectF);
      f1 = localRectF.width();
      int i = Math.round(f1);
      int j = Math.round(localRectF.height());
      localConfig = getNonNullConfig(paramBitmap);
      Bitmap localBitmap = paramBitmapPool.get(i, j, localConfig);
      f2 = -localRectF.left;
      float f3 = -localRectF.top;
      localMatrix.postTranslate(f2, f3);
      applyMatrix(paramBitmap, localBitmap, localMatrix);
      paramBitmap = localBitmap;
    }
  }
  
  public static Bitmap roundedCorners(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    float f1 = 0.0F;
    PorterDuff.Mode localMode = null;
    boolean bool2 = true;
    if (paramInt > 0) {
      bool1 = bool2;
    }
    Preconditions.checkArgument(bool1, "roundingRadius must be greater than 0.");
    localObject1 = getAlphaSafeConfig(paramBitmap);
    Bitmap localBitmap = getAlphaSafeBitmap(paramBitmapPool, paramBitmap);
    int i = localBitmap.getWidth();
    int j = localBitmap.getHeight();
    localObject1 = paramBitmapPool.get(i, j, (Bitmap.Config)localObject1);
    ((Bitmap)localObject1).setHasAlpha(bool2);
    Object localObject3 = new android/graphics/BitmapShader;
    Object localObject4 = Shader.TileMode.CLAMP;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    ((BitmapShader)localObject3).<init>(localBitmap, (Shader.TileMode)localObject4, localTileMode);
    localObject4 = new android/graphics/Paint;
    ((Paint)localObject4).<init>();
    ((Paint)localObject4).setAntiAlias(bool2);
    ((Paint)localObject4).setShader((Shader)localObject3);
    Object localObject5 = new android/graphics/RectF;
    i = ((Bitmap)localObject1).getWidth();
    float f2 = i;
    int k = ((Bitmap)localObject1).getHeight();
    float f3 = k;
    ((RectF)localObject5).<init>(0.0F, 0.0F, f2, f3);
    localObject3 = BITMAP_DRAWABLE_LOCK;
    ((Lock)localObject3).lock();
    try
    {
      localObject3 = new android/graphics/Canvas;
      ((Canvas)localObject3).<init>((Bitmap)localObject1);
      k = 0;
      f3 = 0.0F;
      localTileMode = null;
      localMode = PorterDuff.Mode.CLEAR;
      ((Canvas)localObject3).drawColor(0, localMode);
      f3 = paramInt;
      f1 = paramInt;
      ((Canvas)localObject3).drawRoundRect((RectF)localObject5, f3, f1, (Paint)localObject4);
      clear((Canvas)localObject3);
      localObject5 = BITMAP_DRAWABLE_LOCK;
      ((Lock)localObject5).unlock();
      bool2 = localBitmap.equals(paramBitmap);
      if (!bool2) {
        paramBitmapPool.put(localBitmap);
      }
      return (Bitmap)localObject1;
    }
    finally
    {
      BITMAP_DRAWABLE_LOCK.unlock();
    }
  }
  
  public static Bitmap roundedCorners(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3)
  {
    return roundedCorners(paramBitmapPool, paramBitmap, paramInt3);
  }
  
  public static void setAlpha(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    boolean bool = paramBitmap1.hasAlpha();
    paramBitmap2.setHasAlpha(bool);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\TransformationUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */