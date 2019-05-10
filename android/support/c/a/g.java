package android.support.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.a.a.c;
import android.support.v4.b.b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

public class g
  implements Interpolator
{
  private float[] a;
  private float[] b;
  
  public g(Context paramContext, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    this(localResources, localTheme, paramAttributeSet, paramXmlPullParser);
  }
  
  public g(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    Object localObject = a.l;
    localObject = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
    a((TypedArray)localObject, paramXmlPullParser);
    ((TypedArray)localObject).recycle();
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    float f = 1.0F;
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    localPath.moveTo(0.0F, 0.0F);
    localPath.quadTo(paramFloat1, paramFloat2, f, f);
    a(localPath);
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f = 1.0F;
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    localPath.moveTo(0.0F, 0.0F);
    localPath.cubicTo(paramFloat1, paramFloat2, paramFloat3, paramFloat4, f, f);
    a(localPath);
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = "pathData";
    boolean bool1 = c.a(paramXmlPullParser, (String)localObject1);
    int i;
    float f1;
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      i = 4;
      f1 = 5.6E-45F;
      localObject1 = c.a(paramTypedArray, paramXmlPullParser, "pathData", i);
      localObject2 = b.a((String)localObject1);
      if (localObject2 == null)
      {
        localObject2 = new android/view/InflateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = "The path is null, which is created from " + (String)localObject1;
        ((InflateException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      a((Path)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = "controlX1";
      bool1 = c.a(paramXmlPullParser, (String)localObject1);
      if (!bool1)
      {
        localObject1 = new android/view/InflateException;
        ((InflateException)localObject1).<init>("pathInterpolator requires the controlX1 attribute");
        throw ((Throwable)localObject1);
      }
      localObject1 = "controlY1";
      bool1 = c.a(paramXmlPullParser, (String)localObject1);
      if (!bool1)
      {
        localObject1 = new android/view/InflateException;
        ((InflateException)localObject1).<init>("pathInterpolator requires the controlY1 attribute");
        throw ((Throwable)localObject1);
      }
      localObject1 = "controlX1";
      i = 0;
      float f2 = c.a(paramTypedArray, paramXmlPullParser, (String)localObject1, 0, 0.0F);
      localObject2 = "controlY1";
      float f3 = Float.MIN_VALUE;
      f1 = c.a(paramTypedArray, paramXmlPullParser, (String)localObject2, 1, 0.0F);
      localObject3 = "controlX2";
      boolean bool2 = c.a(paramXmlPullParser, (String)localObject3);
      String str = "controlY2";
      boolean bool3 = c.a(paramXmlPullParser, str);
      if (bool2 != bool3)
      {
        localObject1 = new android/view/InflateException;
        ((InflateException)localObject1).<init>("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        throw ((Throwable)localObject1);
      }
      if (!bool2)
      {
        a(f2, f1);
      }
      else
      {
        localObject3 = "controlX2";
        int j = 2;
        f3 = c.a(paramTypedArray, paramXmlPullParser, (String)localObject3, j, 0.0F);
        str = "controlY2";
        int k = 3;
        float f4 = c.a(paramTypedArray, paramXmlPullParser, str, k, 0.0F);
        a(f2, f1, f3, f4);
      }
    }
  }
  
  private void a(Path paramPath)
  {
    float f1 = 1.0F;
    double d1 = 1.0E-5D;
    int i = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    PathMeasure localPathMeasure = new android/graphics/PathMeasure;
    localPathMeasure.<init>(paramPath, false);
    float f3 = localPathMeasure.getLength();
    int j = 3000;
    float f4 = 4.204E-42F;
    float f5 = f3 / 0.002F;
    int k = (int)f5 + 1;
    int m = Math.min(j, k);
    if (m <= 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "The Path has a invalid length " + f3;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new float[m];
    this.a = ((float[])localObject2);
    localObject2 = new float[m];
    this.b = ((float[])localObject2);
    float[] arrayOfFloat1 = new float[2];
    j = 0;
    localObject2 = null;
    f4 = 0.0F;
    float[] arrayOfFloat2;
    while (j < m)
    {
      float f6 = j * f3;
      float f7 = m + -1;
      f6 /= f7;
      localPathMeasure.getPosTan(f6, arrayOfFloat1, null);
      arrayOfFloat2 = this.a;
      f7 = arrayOfFloat1[0];
      arrayOfFloat2[j] = f7;
      arrayOfFloat2 = this.b;
      int n = 1;
      f7 = arrayOfFloat1[n];
      arrayOfFloat2[j] = f7;
      j += 1;
    }
    localObject2 = this.a;
    f4 = Math.abs(localObject2[0]);
    double d2 = f4;
    boolean bool2 = d2 < d1;
    int i1;
    if (!bool2)
    {
      localObject2 = this.b;
      f4 = Math.abs(localObject2[0]);
      d2 = f4;
      bool2 = d2 < d1;
      if (!bool2)
      {
        localObject2 = this.a;
        i1 = m + -1;
        f4 = Math.abs(localObject2[i1] - f1);
        d2 = f4;
        bool2 = d2 < d1;
        if (!bool2)
        {
          localObject2 = this.b;
          i1 = m + -1;
          f4 = Math.abs(localObject2[i1] - f1);
          d2 = f4;
          bool2 = d2 < d1;
          if (!bool2) {
            break label527;
          }
        }
      }
    }
    localObject2 = new java/lang/IllegalArgumentException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("The Path must start at (0,0) and end at (1,1) start: ");
    f5 = this.a[0];
    localObject3 = ((StringBuilder)localObject3).append(f5).append(",");
    f2 = this.b[0];
    localObject1 = ((StringBuilder)localObject3).append(f2).append(" end:");
    localObject3 = this.a;
    k = m + -1;
    f3 = localObject3[k];
    localObject1 = ((StringBuilder)localObject1).append(f3).append(",");
    localObject3 = this.b;
    k = m + -1;
    f3 = localObject3[k];
    localObject1 = f3;
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
    label527:
    k = 0;
    arrayOfFloat1 = null;
    f5 = 0.0F;
    bool2 = false;
    localObject2 = null;
    f4 = 0.0F;
    while (i < m)
    {
      arrayOfFloat2 = this.a;
      i1 = bool2 + true;
      f4 = arrayOfFloat2[bool2];
      boolean bool3 = f4 < f5;
      if (bool3)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = "The Path cannot loop back on itself, x :" + f4;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      arrayOfFloat1 = this.a;
      arrayOfFloat1[i] = f4;
      i += 1;
      f5 = f4;
      bool2 = i1;
    }
    boolean bool1 = localPathMeasure.nextContour();
    if (bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The Path should be continuous, can't have 2+ contours");
      throw ((Throwable)localObject1);
    }
  }
  
  public float getInterpolation(float paramFloat)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    boolean bool1 = false;
    float f2 = 0.0F;
    float[] arrayOfFloat1 = null;
    boolean bool2 = paramFloat < 0.0F;
    float[] arrayOfFloat2;
    if (!bool2)
    {
      i = 0;
      arrayOfFloat2 = null;
      f1 = 0.0F;
    }
    for (;;)
    {
      return f1;
      bool2 = paramFloat < f1;
      if (bool2)
      {
        int k = 0;
        float f3 = 0.0F;
        arrayOfFloat2 = this.a;
        i = arrayOfFloat2.length;
        int j = i + -1;
        i = j - k;
        int m = 1;
        float f4 = Float.MIN_VALUE;
        if (i > m)
        {
          i = (k + j) / 2;
          arrayOfFloat3 = this.a;
          f4 = arrayOfFloat3[i];
          boolean bool3 = paramFloat < f4;
          if (bool3) {
            j = k;
          }
          for (;;)
          {
            k = j;
            j = i;
            break;
            int n = j;
            j = i;
            i = n;
          }
        }
        arrayOfFloat2 = this.a;
        f1 = arrayOfFloat2[j];
        float[] arrayOfFloat3 = this.a;
        f4 = arrayOfFloat3[k];
        f1 -= f4;
        bool1 = f1 < 0.0F;
        if (!bool1)
        {
          arrayOfFloat2 = this.b;
          f1 = arrayOfFloat2[k];
        }
        else
        {
          f2 = this.a[k];
          f2 = paramFloat - f2;
          f1 = f2 / f1;
          f3 = this.b[k];
          arrayOfFloat1 = this.b;
          float f5 = arrayOfFloat1[j] - f3;
          f1 = f1 * f5 + f3;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */