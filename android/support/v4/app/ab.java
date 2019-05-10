package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

public abstract class ab
{
  private static int b = 1048576;
  private Matrix a;
  
  private static Bitmap a(Drawable paramDrawable)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    int j = paramDrawable.getIntrinsicWidth();
    int k = paramDrawable.getIntrinsicHeight();
    float f2;
    Object localObject;
    if ((j <= 0) || (k <= 0))
    {
      j = 0;
      f2 = 0.0F;
      localObject = null;
    }
    for (;;)
    {
      return (Bitmap)localObject;
      int m = b;
      float f3 = m;
      float f4 = j * k;
      f3 /= f4;
      f3 = Math.min(f1, f3);
      boolean bool = paramDrawable instanceof BitmapDrawable;
      if (bool)
      {
        bool = f3 < f1;
        if (!bool)
        {
          paramDrawable = (BitmapDrawable)paramDrawable;
          localObject = paramDrawable.getBitmap();
          continue;
        }
      }
      int n = (int)(j * f3);
      f2 = k * f3;
      k = (int)f2;
      localObject = Bitmap.Config.ARGB_8888;
      localObject = Bitmap.createBitmap(n, k, (Bitmap.Config)localObject);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>((Bitmap)localObject);
      Rect localRect = ((Drawable)paramDrawable).getBounds();
      int i1 = localRect.left;
      int i2 = localRect.top;
      int i3 = localRect.right;
      i = localRect.bottom;
      ((Drawable)paramDrawable).setBounds(0, 0, n, k);
      ((Drawable)paramDrawable).draw(localCanvas);
      ((Drawable)paramDrawable).setBounds(i1, i2, i3, i);
    }
  }
  
  public Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    boolean bool = paramView instanceof ImageView;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int j;
    float f1;
    if (bool)
    {
      localObject1 = paramView;
      localObject1 = (ImageView)paramView;
      localObject2 = ((ImageView)localObject1).getDrawable();
      localObject3 = ((ImageView)localObject1).getBackground();
      if ((localObject2 != null) && (localObject3 == null))
      {
        localObject3 = a((Drawable)localObject2);
        if (localObject3 != null)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          ((Bundle)localObject2).putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject3);
          localObject4 = ((ImageView)localObject1).getScaleType().toString();
          ((Bundle)localObject2).putString("sharedElement:snapshot:imageScaleType", (String)localObject4);
          localObject3 = ((ImageView)localObject1).getScaleType();
          localObject4 = ImageView.ScaleType.MATRIX;
          if (localObject3 == localObject4)
          {
            localObject1 = ((ImageView)localObject1).getImageMatrix();
            j = 9;
            f1 = 1.3E-44F;
            localObject3 = new float[j];
            ((Matrix)localObject1).getValues((float[])localObject3);
            localObject1 = "sharedElement:snapshot:imageMatrix";
            ((Bundle)localObject2).putFloatArray((String)localObject1, (float[])localObject3);
          }
          localObject1 = localObject2;
        }
      }
    }
    for (;;)
    {
      return (Parcelable)localObject1;
      int k = Math.round(paramRectF.width());
      j = Math.round(paramRectF.height());
      bool = false;
      float f2 = 0.0F;
      localObject1 = null;
      if ((k > 0) && (j > 0))
      {
        int i = 1065353216;
        int m = b;
        float f3 = m;
        int n = k * j;
        float f4 = n;
        f3 /= f4;
        f2 = Math.min(1.0F, f3);
        float f5 = k * f2;
        k = (int)f5;
        f1 = j * f2;
        j = (int)f1;
        localObject4 = this.a;
        if (localObject4 == null)
        {
          localObject4 = new android/graphics/Matrix;
          ((Matrix)localObject4).<init>();
          this.a = ((Matrix)localObject4);
        }
        this.a.set(paramMatrix);
        localObject4 = this.a;
        f4 = -paramRectF.left;
        float f6 = -paramRectF.top;
        ((Matrix)localObject4).postTranslate(f4, f6);
        localObject4 = this.a;
        ((Matrix)localObject4).postScale(f2, f2);
        localObject1 = Bitmap.Config.ARGB_8888;
        localObject1 = Bitmap.createBitmap(k, j, (Bitmap.Config)localObject1);
        localObject2 = new android/graphics/Canvas;
        ((Canvas)localObject2).<init>((Bitmap)localObject1);
        localObject3 = this.a;
        ((Canvas)localObject2).concat((Matrix)localObject3);
        ((View)paramView).draw((Canvas)localObject2);
      }
    }
  }
  
  public View a(Context paramContext, Parcelable paramParcelable)
  {
    Object localObject1 = null;
    boolean bool = paramParcelable instanceof Bundle;
    Object localObject2;
    if (bool)
    {
      paramParcelable = (Bundle)paramParcelable;
      localObject2 = (Bitmap)paramParcelable.getParcelable("sharedElement:snapshot:bitmap");
      if (localObject2 == null) {
        return (View)localObject1;
      }
      localObject1 = new android/widget/ImageView;
      ((ImageView)localObject1).<init>(paramContext);
      ((ImageView)localObject1).setImageBitmap((Bitmap)localObject2);
      localObject2 = ImageView.ScaleType.valueOf(paramParcelable.getString("sharedElement:snapshot:imageScaleType"));
      ((ImageView)localObject1).setScaleType((ImageView.ScaleType)localObject2);
      localObject2 = ((ImageView)localObject1).getScaleType();
      Object localObject3 = ImageView.ScaleType.MATRIX;
      if (localObject2 == localObject3)
      {
        localObject2 = paramParcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
        localObject3 = new android/graphics/Matrix;
        ((Matrix)localObject3).<init>();
        ((Matrix)localObject3).setValues((float[])localObject2);
        ((ImageView)localObject1).setImageMatrix((Matrix)localObject3);
      }
      localObject2 = localObject1;
    }
    for (;;)
    {
      localObject1 = localObject2;
      break;
      bool = paramParcelable instanceof Bitmap;
      if (bool)
      {
        paramParcelable = (Bitmap)paramParcelable;
        localObject2 = new android/widget/ImageView;
        ((ImageView)localObject2).<init>(paramContext);
        ((ImageView)localObject2).setImageBitmap(paramParcelable);
      }
      else
      {
        bool = false;
        localObject2 = null;
      }
    }
  }
  
  public void a(List paramList) {}
  
  public void a(List paramList1, List paramList2, ab.a parama)
  {
    parama.a();
  }
  
  public void a(List paramList1, List paramList2, List paramList3) {}
  
  public void a(List paramList, Map paramMap) {}
  
  public void b(List paramList1, List paramList2, List paramList3) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */