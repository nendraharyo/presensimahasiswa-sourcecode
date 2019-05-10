package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.b.a.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class AppCompatProgressBarHelper
{
  private static final int[] TINT_ATTRS;
  private Bitmap mSampleTile;
  private final ProgressBar mView;
  
  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 16843067;
    arrayOfInt[1] = 16843068;
    TINT_ATTRS = arrayOfInt;
  }
  
  AppCompatProgressBarHelper(ProgressBar paramProgressBar)
  {
    this.mView = paramProgressBar;
  }
  
  private Shape getDrawableShape()
  {
    float[] arrayOfFloat = new float[8];
    float[] tmp6_5 = arrayOfFloat;
    float[] tmp7_6 = tmp6_5;
    float[] tmp7_6 = tmp6_5;
    tmp7_6[0] = 5.0F;
    tmp7_6[1] = 5.0F;
    float[] tmp16_7 = tmp7_6;
    float[] tmp16_7 = tmp7_6;
    tmp16_7[2] = 5.0F;
    tmp16_7[3] = 5.0F;
    float[] tmp25_16 = tmp16_7;
    float[] tmp25_16 = tmp16_7;
    tmp25_16[4] = 5.0F;
    tmp25_16[5] = 5.0F;
    tmp25_16[6] = 5.0F;
    tmp25_16[7] = 5.0F;
    RoundRectShape localRoundRectShape = new android/graphics/drawable/shapes/RoundRectShape;
    localRoundRectShape.<init>(arrayOfFloat, null, null);
    return localRoundRectShape;
  }
  
  private Drawable tileify(Drawable paramDrawable, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    boolean bool1 = paramDrawable instanceof c;
    Object localObject2;
    if (bool1)
    {
      localObject2 = paramDrawable;
      localObject2 = ((c)paramDrawable).a();
      if (localObject2 != null)
      {
        localObject1 = tileify((Drawable)localObject2, paramBoolean);
        localObject2 = paramDrawable;
        localObject2 = (c)paramDrawable;
        ((c)localObject2).a((Drawable)localObject1);
      }
      localObject2 = paramDrawable;
    }
    for (;;)
    {
      return (Drawable)localObject2;
      bool1 = paramDrawable instanceof LayerDrawable;
      Object localObject3;
      int i1;
      Object localObject4;
      if (bool1)
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int n = paramDrawable.getNumberOfLayers();
        localObject3 = new Drawable[n];
        i1 = 0;
        localObject4 = null;
        if (i1 < n)
        {
          int k = paramDrawable.getId(i1);
          Drawable localDrawable = paramDrawable.getDrawable(i1);
          int i2 = 16908301;
          if (k != i2)
          {
            int i3 = 16908303;
            if (k != i3) {}
          }
          else
          {
            k = i;
          }
          for (;;)
          {
            localObject2 = tileify(localDrawable, k);
            localObject3[i1] = localObject2;
            int m = i1 + 1;
            i1 = m;
            break;
            m = 0;
            localObject2 = null;
          }
        }
        localObject2 = new android/graphics/drawable/LayerDrawable;
        ((LayerDrawable)localObject2).<init>((Drawable[])localObject3);
        while (j < n)
        {
          i = paramDrawable.getId(j);
          ((LayerDrawable)localObject2).setId(j, i);
          j += 1;
        }
      }
      else
      {
        boolean bool2 = paramDrawable instanceof BitmapDrawable;
        if (!bool2) {
          break;
        }
        paramDrawable = (BitmapDrawable)paramDrawable;
        localObject2 = paramDrawable.getBitmap();
        localObject1 = this.mSampleTile;
        if (localObject1 == null) {
          this.mSampleTile = ((Bitmap)localObject2);
        }
        localObject1 = new android/graphics/drawable/ShapeDrawable;
        localObject4 = getDrawableShape();
        ((ShapeDrawable)localObject1).<init>((Shape)localObject4);
        localObject4 = new android/graphics/BitmapShader;
        Shader.TileMode localTileMode = Shader.TileMode.REPEAT;
        localObject3 = Shader.TileMode.CLAMP;
        ((BitmapShader)localObject4).<init>((Bitmap)localObject2, localTileMode, (Shader.TileMode)localObject3);
        ((ShapeDrawable)localObject1).getPaint().setShader((Shader)localObject4);
        localObject2 = ((ShapeDrawable)localObject1).getPaint();
        localObject4 = paramDrawable.getPaint().getColorFilter();
        ((Paint)localObject2).setColorFilter((ColorFilter)localObject4);
        if (paramBoolean)
        {
          localObject2 = new android/graphics/drawable/ClipDrawable;
          i1 = 3;
          ((ClipDrawable)localObject2).<init>((Drawable)localObject1, i1, i);
        }
        else
        {
          localObject2 = localObject1;
        }
      }
    }
  }
  
  private Drawable tileifyIndeterminate(Drawable paramDrawable)
  {
    int i = 10000;
    boolean bool = paramDrawable instanceof AnimationDrawable;
    if (bool)
    {
      paramDrawable = (AnimationDrawable)paramDrawable;
      int j = paramDrawable.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable = new android/graphics/drawable/AnimationDrawable;
      localAnimationDrawable.<init>();
      int k = paramDrawable.isOneShot();
      localAnimationDrawable.setOneShot(k);
      k = 0;
      while (k < j)
      {
        Drawable localDrawable = paramDrawable.getFrame(k);
        localDrawable = tileify(localDrawable, true);
        localDrawable.setLevel(i);
        int n = paramDrawable.getDuration(k);
        localAnimationDrawable.addFrame(localDrawable, n);
        int m;
        k += 1;
      }
      localAnimationDrawable.setLevel(i);
      paramDrawable = localAnimationDrawable;
    }
    return paramDrawable;
  }
  
  Bitmap getSampleTime()
  {
    return this.mSampleTile;
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.mView.getContext();
    Object localObject2 = TINT_ATTRS;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject2 = ((TintTypedArray)localObject1).getDrawableIfKnown(0);
    ProgressBar localProgressBar;
    if (localObject2 != null)
    {
      localProgressBar = this.mView;
      localObject2 = tileifyIndeterminate((Drawable)localObject2);
      localProgressBar.setIndeterminateDrawable((Drawable)localObject2);
    }
    int i = 1;
    localObject2 = ((TintTypedArray)localObject1).getDrawableIfKnown(i);
    if (localObject2 != null)
    {
      localProgressBar = this.mView;
      localObject2 = tileify((Drawable)localObject2, false);
      localProgressBar.setProgressDrawable((Drawable)localObject2);
    }
    ((TintTypedArray)localObject1).recycle();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatProgressBarHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */