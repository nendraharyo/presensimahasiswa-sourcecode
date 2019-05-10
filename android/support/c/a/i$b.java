package android.support.c.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.support.v4.a.a.c;
import android.support.v4.b.b;
import android.support.v4.b.b.b;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class i$b
  extends i.d
{
  int a = 0;
  float b = 0.0F;
  int c = 0;
  float d;
  int e;
  float f;
  float g;
  float h;
  float i;
  Paint.Cap j;
  Paint.Join k;
  float l;
  private int[] p;
  
  public i$b()
  {
    this.d = f1;
    this.e = 0;
    this.f = f1;
    this.g = 0.0F;
    this.h = f1;
    this.i = 0.0F;
    Object localObject = Paint.Cap.BUTT;
    this.j = ((Paint.Cap)localObject);
    localObject = Paint.Join.MITER;
    this.k = ((Paint.Join)localObject);
    this.l = 4.0F;
  }
  
  public i$b(b paramb)
  {
    super(paramb);
    this.d = f1;
    this.e = 0;
    this.f = f1;
    this.g = 0.0F;
    this.h = f1;
    this.i = 0.0F;
    Object localObject = Paint.Cap.BUTT;
    this.j = ((Paint.Cap)localObject);
    localObject = Paint.Join.MITER;
    this.k = ((Paint.Join)localObject);
    this.l = 4.0F;
    localObject = paramb.p;
    this.p = ((int[])localObject);
    int m = paramb.a;
    this.a = m;
    float f2 = paramb.b;
    this.b = f2;
    f2 = paramb.d;
    this.d = f2;
    m = paramb.c;
    this.c = m;
    m = paramb.e;
    this.e = m;
    f2 = paramb.f;
    this.f = f2;
    f2 = paramb.g;
    this.g = f2;
    f2 = paramb.h;
    this.h = f2;
    f2 = paramb.i;
    this.i = f2;
    localObject = paramb.j;
    this.j = ((Paint.Cap)localObject);
    localObject = paramb.k;
    this.k = ((Paint.Join)localObject);
    f2 = paramb.l;
    this.l = f2;
  }
  
  private Paint.Cap a(int paramInt, Paint.Cap paramCap)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramCap;
      paramCap = Paint.Cap.BUTT;
      continue;
      paramCap = Paint.Cap.ROUND;
      continue;
      paramCap = Paint.Cap.SQUARE;
    }
  }
  
  private Paint.Join a(int paramInt, Paint.Join paramJoin)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramJoin;
      paramJoin = Paint.Join.MITER;
      continue;
      paramJoin = Paint.Join.ROUND;
      continue;
      paramJoin = Paint.Join.BEVEL;
    }
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    int m = -1;
    float f1 = 0.0F;
    this.p = null;
    Object localObject1 = "pathData";
    boolean bool = c.a(paramXmlPullParser, (String)localObject1);
    if (!bool) {}
    for (;;)
    {
      return;
      bool = false;
      f1 = 0.0F;
      localObject1 = paramTypedArray.getString(0);
      if (localObject1 != null) {
        this.n = ((String)localObject1);
      }
      int n = 2;
      f1 = 2.8E-45F;
      localObject1 = paramTypedArray.getString(n);
      if (localObject1 != null)
      {
        localObject1 = b.b((String)localObject1);
        this.m = ((b.b[])localObject1);
      }
      int i1 = this.c;
      n = c.b(paramTypedArray, paramXmlPullParser, "fillColor", 1, i1);
      this.c = n;
      float f2 = this.f;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, f2);
      this.f = f1;
      n = c.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, m);
      Object localObject2 = this.j;
      localObject1 = a(n, (Paint.Cap)localObject2);
      this.j = ((Paint.Cap)localObject1);
      n = c.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, m);
      localObject2 = this.k;
      localObject1 = a(n, (Paint.Join)localObject2);
      this.k = ((Paint.Join)localObject1);
      f2 = this.l;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, f2);
      this.l = f1;
      i1 = this.a;
      n = c.b(paramTypedArray, paramXmlPullParser, "strokeColor", 3, i1);
      this.a = n;
      f2 = this.d;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, f2);
      this.d = f1;
      f2 = this.b;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, f2);
      this.b = f1;
      f2 = this.h;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, f2);
      this.h = f1;
      f2 = this.i;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, f2);
      this.i = f1;
      f2 = this.g;
      f1 = c.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, f2);
      this.g = f1;
      localObject1 = "fillType";
      int i2 = 13;
      i1 = this.e;
      n = c.a(paramTypedArray, paramXmlPullParser, (String)localObject1, i2, i1);
      this.e = n;
    }
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject = a.c;
    localObject = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
    a((TypedArray)localObject, paramXmlPullParser);
    ((TypedArray)localObject).recycle();
  }
  
  float getFillAlpha()
  {
    return this.f;
  }
  
  int getFillColor()
  {
    return this.c;
  }
  
  float getStrokeAlpha()
  {
    return this.d;
  }
  
  int getStrokeColor()
  {
    return this.a;
  }
  
  float getStrokeWidth()
  {
    return this.b;
  }
  
  float getTrimPathEnd()
  {
    return this.h;
  }
  
  float getTrimPathOffset()
  {
    return this.i;
  }
  
  float getTrimPathStart()
  {
    return this.g;
  }
  
  void setFillAlpha(float paramFloat)
  {
    this.f = paramFloat;
  }
  
  void setFillColor(int paramInt)
  {
    this.c = paramInt;
  }
  
  void setStrokeAlpha(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  void setStrokeColor(int paramInt)
  {
    this.a = paramInt;
  }
  
  void setStrokeWidth(float paramFloat)
  {
    this.b = paramFloat;
  }
  
  void setTrimPathEnd(float paramFloat)
  {
    this.h = paramFloat;
  }
  
  void setTrimPathOffset(float paramFloat)
  {
    this.i = paramFloat;
  }
  
  void setTrimPathStart(float paramFloat)
  {
    this.g = paramFloat;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */