package android.support.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.a.a.b;
import android.support.v4.a.a.c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i
  extends h
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  private i.f c;
  private PorterDuffColorFilter d;
  private ColorFilter e;
  private boolean f;
  private boolean g = true;
  private Drawable.ConstantState h;
  private final float[] i;
  private final Matrix j;
  private final Rect k;
  
  i()
  {
    Object localObject = new float[9];
    this.i = ((float[])localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.j = ((Matrix)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.k = ((Rect)localObject);
    localObject = new android/support/c/a/i$f;
    ((i.f)localObject).<init>();
    this.c = ((i.f)localObject);
  }
  
  i(i.f paramf)
  {
    Object localObject = new float[9];
    this.i = ((float[])localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.j = ((Matrix)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.k = ((Rect)localObject);
    this.c = paramf;
    localObject = this.d;
    ColorStateList localColorStateList = paramf.c;
    PorterDuff.Mode localMode = paramf.d;
    localObject = a((PorterDuffColorFilter)localObject, localColorStateList, localMode);
    this.d = ((PorterDuffColorFilter)localObject);
  }
  
  static int a(int paramInt, float paramFloat)
  {
    int m = Color.alpha(paramInt);
    int n = 0xFFFFFF & paramInt;
    return (int)(m * paramFloat) << 24 | n;
  }
  
  private static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramMode;
      paramMode = PorterDuff.Mode.SRC_OVER;
      continue;
      paramMode = PorterDuff.Mode.SRC_IN;
      continue;
      paramMode = PorterDuff.Mode.SRC_ATOP;
      continue;
      paramMode = PorterDuff.Mode.MULTIPLY;
      continue;
      paramMode = PorterDuff.Mode.SCREEN;
      continue;
      paramMode = PorterDuff.Mode.ADD;
    }
  }
  
  public static i a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    int m = 2;
    int n = Build.VERSION.SDK_INT;
    int i1 = 24;
    Object localObject1;
    Object localObject3;
    Object localObject4;
    if (n >= i1)
    {
      localObject1 = new android/support/c/a/i;
      ((i)localObject1).<init>();
      localObject3 = b.a(paramResources, paramInt, paramTheme);
      ((i)localObject1).b = ((Drawable)localObject3);
      localObject3 = new android/support/c/a/i$g;
      localObject4 = ((i)localObject1).b.getConstantState();
      ((i.g)localObject3).<init>((Drawable.ConstantState)localObject4);
      ((i)localObject1).h = ((Drawable.ConstantState)localObject3);
    }
    for (;;)
    {
      return (i)localObject1;
      try
      {
        localObject1 = paramResources.getXml(paramInt);
        localObject3 = Xml.asAttributeSet((XmlPullParser)localObject1);
        int i2;
        int i3;
        do
        {
          i2 = ((XmlPullParser)localObject1).next();
          if (i2 == m) {
            break;
          }
          i3 = 1;
        } while (i2 != i3);
        if (i2 != m)
        {
          localObject1 = new org/xmlpull/v1/XmlPullParserException;
          localObject3 = "No start tag found";
          ((XmlPullParserException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localObject3 = "VectorDrawableCompat";
        localObject4 = "parser error";
        Log.e((String)localObject3, (String)localObject4, localXmlPullParserException);
        n = 0;
        Object localObject2 = null;
        continue;
        localObject2 = a(paramResources, (XmlPullParser)localObject2, (AttributeSet)localObject3, paramTheme);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject3 = "VectorDrawableCompat";
          localObject4 = "parser error";
          Log.e((String)localObject3, (String)localObject4, localIOException);
        }
      }
    }
  }
  
  public static i a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    i locali = new android/support/c/a/i;
    locali.<init>();
    locali.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return locali;
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = this.c;
    Object localObject2 = ((i.f)localObject1).b;
    int m = 6;
    float f1 = 8.4E-45F;
    int n = -1;
    int i1 = c.a(paramTypedArray, paramXmlPullParser, "tintMode", m, n);
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    Object localObject3 = a(i1, localMode);
    ((i.f)localObject1).d = ((PorterDuff.Mode)localObject3);
    i1 = 1;
    float f2 = Float.MIN_VALUE;
    localObject3 = paramTypedArray.getColorStateList(i1);
    if (localObject3 != null) {
      ((i.f)localObject1).c = ((ColorStateList)localObject3);
    }
    localObject3 = "autoMirrored";
    m = 5;
    boolean bool1 = ((i.f)localObject1).e;
    boolean bool2 = c.a(paramTypedArray, paramXmlPullParser, (String)localObject3, m, bool1);
    ((i.f)localObject1).e = bool2;
    f1 = ((i.e)localObject2).d;
    float f3 = c.a(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, f1);
    ((i.e)localObject2).d = f3;
    localObject1 = "viewportHeight";
    int i2 = 8;
    f2 = 1.1E-44F;
    f1 = ((i.e)localObject2).e;
    f3 = c.a(paramTypedArray, paramXmlPullParser, (String)localObject1, i2, f1);
    ((i.e)localObject2).e = f3;
    f3 = ((i.e)localObject2).d;
    boolean bool3 = f3 < 0.0F;
    if (!bool3)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = paramTypedArray.getPositionDescription();
      localObject2 = (String)localObject3 + "<vector> tag requires viewportWidth > 0";
      ((XmlPullParserException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    f3 = ((i.e)localObject2).e;
    bool3 = f3 < 0.0F;
    if (!bool3)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = paramTypedArray.getPositionDescription();
      localObject2 = (String)localObject3 + "<vector> tag requires viewportHeight > 0";
      ((XmlPullParserException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    f2 = ((i.e)localObject2).b;
    f3 = paramTypedArray.getDimension(3, f2);
    ((i.e)localObject2).b = f3;
    f2 = ((i.e)localObject2).c;
    f3 = paramTypedArray.getDimension(2, f2);
    ((i.e)localObject2).c = f3;
    f3 = ((i.e)localObject2).b;
    bool3 = f3 < 0.0F;
    if (!bool3)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = paramTypedArray.getPositionDescription();
      localObject2 = (String)localObject3 + "<vector> tag requires width > 0";
      ((XmlPullParserException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    f3 = ((i.e)localObject2).c;
    bool3 = f3 < 0.0F;
    if (!bool3)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = paramTypedArray.getPositionDescription();
      localObject2 = (String)localObject3 + "<vector> tag requires height > 0";
      ((XmlPullParserException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    i2 = 4;
    f2 = 5.6E-45F;
    f1 = ((i.e)localObject2).getAlpha();
    f3 = c.a(paramTypedArray, paramXmlPullParser, "alpha", i2, f1);
    ((i.e)localObject2).setAlpha(f3);
    bool3 = false;
    f3 = 0.0F;
    localObject1 = paramTypedArray.getString(0);
    if (localObject1 != null)
    {
      ((i.e)localObject2).g = ((String)localObject1);
      localObject3 = ((i.e)localObject2).h;
      ((android.support.v4.h.a)localObject3).put(localObject1, localObject2);
    }
  }
  
  private boolean a()
  {
    int m = 1;
    int n = Build.VERSION.SDK_INT;
    int i2 = 17;
    if (n >= i2)
    {
      boolean bool = isAutoMirrored();
      if (bool)
      {
        int i1 = android.support.v4.b.a.a.i(this);
        if (i1 != m) {}
      }
    }
    for (;;)
    {
      return m;
      m = 0;
      continue;
      m = 0;
    }
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int m = 3;
    int n = 1;
    float f1 = Float.MIN_VALUE;
    i.f localf = this.c;
    i.e locale = localf.b;
    ArrayDeque localArrayDeque = new java/util/ArrayDeque;
    localArrayDeque.<init>();
    Object localObject1 = locale.a;
    localArrayDeque.push(localObject1);
    int i1 = paramXmlPullParser.getEventType();
    int i2 = paramXmlPullParser.getDepth() + 1;
    int i3 = n;
    float f2 = f1;
    if (i1 != n)
    {
      int i4 = paramXmlPullParser.getDepth();
      if ((i4 >= i2) || (i1 != m))
      {
        i4 = 2;
        Object localObject2;
        String str;
        boolean bool3;
        float f3;
        if (i1 == i4)
        {
          localObject2 = paramXmlPullParser.getName();
          localObject1 = (i.c)localArrayDeque.peek();
          str = "path";
          bool3 = str.equals(localObject2);
          if (bool3)
          {
            i.b localb = new android/support/c/a/i$b;
            localb.<init>();
            localb.a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            ((i.c)localObject1).a.add(localb);
            localObject1 = localb.getPathName();
            if (localObject1 != null)
            {
              localObject1 = locale.h;
              localObject2 = localb.getPathName();
              ((android.support.v4.h.a)localObject1).put(localObject2, localb);
            }
            i1 = 0;
            f3 = 0.0F;
            localObject1 = null;
            i4 = localf.a;
            i3 = localb.o | i4;
            localf.a = i3;
            label249:
            i3 = i1;
            f2 = f3;
          }
        }
        for (;;)
        {
          i1 = paramXmlPullParser.next();
          break;
          str = "clip-path";
          bool3 = str.equals(localObject2);
          if (bool3)
          {
            localObject2 = new android/support/c/a/i$a;
            ((i.a)localObject2).<init>();
            ((i.a)localObject2).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            ((i.c)localObject1).a.add(localObject2);
            localObject1 = ((i.a)localObject2).getPathName();
            if (localObject1 != null)
            {
              localObject1 = locale.h;
              str = ((i.a)localObject2).getPathName();
              ((android.support.v4.h.a)localObject1).put(str, localObject2);
            }
            i1 = localf.a;
            i4 = ((i.a)localObject2).o;
            i1 |= i4;
            localf.a = i1;
            i1 = i3;
            f3 = f2;
            break label249;
          }
          str = "group";
          boolean bool2 = str.equals(localObject2);
          if (bool2)
          {
            localObject2 = new android/support/c/a/i$c;
            ((i.c)localObject2).<init>();
            ((i.c)localObject2).a(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            ((i.c)localObject1).a.add(localObject2);
            localArrayDeque.push(localObject2);
            localObject1 = ((i.c)localObject2).getGroupName();
            if (localObject1 != null)
            {
              localObject1 = locale.h;
              str = ((i.c)localObject2).getGroupName();
              ((android.support.v4.h.a)localObject1).put(str, localObject2);
            }
            i1 = localf.a;
            int i5 = ((i.c)localObject2).c;
            i1 |= i5;
            localf.a = i1;
          }
          i1 = i3;
          f3 = f2;
          break label249;
          if (i1 == m)
          {
            localObject1 = paramXmlPullParser.getName();
            localObject2 = "group";
            boolean bool1 = ((String)localObject2).equals(localObject1);
            if (bool1) {
              localArrayDeque.pop();
            }
          }
        }
      }
    }
    if (i3 != 0)
    {
      localObject1 = new org/xmlpull/v1/XmlPullParserException;
      ((XmlPullParserException)localObject1).<init>("no path defined");
      throw ((Throwable)localObject1);
    }
  }
  
  PorterDuffColorFilter a(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    Object localObject;
    if ((paramColorStateList == null) || (paramMode == null)) {
      localObject = null;
    }
    for (;;)
    {
      return (PorterDuffColorFilter)localObject;
      localObject = getState();
      int m = paramColorStateList.getColorForState((int[])localObject, 0);
      localObject = new android/graphics/PorterDuffColorFilter;
      ((PorterDuffColorFilter)localObject).<init>(m, paramMode);
    }
  }
  
  Object a(String paramString)
  {
    return this.c.b.h.get(paramString);
  }
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean canApplyTheme()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      android.support.v4.b.a.a.d(localDrawable);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    int m = 2048;
    int n = 1065353216;
    float f1 = 1.0F;
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      ((Drawable)localObject1).draw(paramCanvas);
    }
    label102:
    Object localObject2;
    int i5;
    int i6;
    do
    {
      int i1;
      do
      {
        do
        {
          return;
          localObject1 = this.k;
          copyBounds((Rect)localObject1);
          localObject1 = this.k;
          i1 = ((Rect)localObject1).width();
        } while (i1 <= 0);
        localObject1 = this.k;
        i1 = ((Rect)localObject1).height();
      } while (i1 <= 0);
      localObject1 = this.e;
      if (localObject1 != null) {
        break;
      }
      localObject1 = this.d;
      localObject2 = this.j;
      paramCanvas.getMatrix((Matrix)localObject2);
      localObject2 = this.j;
      float[] arrayOfFloat = this.i;
      ((Matrix)localObject2).getValues(arrayOfFloat);
      float f2 = Math.abs(this.i[0]);
      localObject2 = this.i;
      float f3 = Math.abs(localObject2[4]);
      Object localObject3 = this.i;
      bool2 = true;
      float f4 = Math.abs(localObject3[bool2]);
      localObject4 = this.i;
      i3 = 3;
      f5 = 4.2E-45F;
      f6 = Math.abs(localObject4[i3]);
      boolean bool3 = f4 < 0.0F;
      if (!bool3)
      {
        bool3 = f6 < 0.0F;
        if (!bool3) {}
      }
      else
      {
        i5 = n;
        f3 = f1;
        i6 = n;
        f2 = f1;
      }
      f4 = this.k.width();
      f2 *= f4;
      i6 = (int)f2;
      localObject3 = this.k;
      i4 = ((Rect)localObject3).height();
      f4 = i4;
      f3 *= f4;
      i5 = (int)f3;
      i6 = Math.min(m, i6);
      i5 = Math.min(m, i5);
    } while ((i6 <= 0) || (i5 <= 0));
    int i4 = paramCanvas.save();
    Object localObject4 = this.k;
    float f6 = ((Rect)localObject4).left;
    Rect localRect = this.k;
    int i3 = localRect.top;
    float f5 = i3;
    paramCanvas.translate(f6, f5);
    boolean bool2 = a();
    if (bool2)
    {
      localObject4 = this.k;
      f6 = ((Rect)localObject4).width();
      paramCanvas.translate(f6, 0.0F);
      int i2 = -1082130432;
      f6 = -1.0F;
      paramCanvas.scale(f6, f1);
    }
    this.k.offsetTo(0, 0);
    Object localObject5 = this.c;
    ((i.f)localObject5).b(i6, i5);
    boolean bool1 = this.g;
    if (!bool1)
    {
      localObject5 = this.c;
      ((i.f)localObject5).a(i6, i5);
    }
    for (;;)
    {
      localObject2 = this.c;
      localObject5 = this.k;
      ((i.f)localObject2).a(paramCanvas, (ColorFilter)localObject1, (Rect)localObject5);
      paramCanvas.restoreToCount(i4);
      break;
      localObject1 = this.e;
      break label102;
      localObject5 = this.c;
      bool1 = ((i.f)localObject5).b();
      if (!bool1)
      {
        localObject5 = this.c;
        ((i.f)localObject5).a(i6, i5);
        localObject2 = this.c;
        ((i.f)localObject2).c();
      }
    }
  }
  
  public int getAlpha()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (int m = android.support.v4.b.a.a.c((Drawable)localObject);; m = ((i.e)localObject).getRootAlpha())
    {
      return m;
      localObject = this.c.b;
    }
  }
  
  public int getChangingConfigurations()
  {
    Drawable localDrawable = this.b;
    int m;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      m = localDrawable.getChangingConfigurations();
    }
    for (;;)
    {
      return m;
      m = super.getChangingConfigurations();
      i.f localf = this.c;
      int n = localf.getChangingConfigurations();
      m |= n;
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    Object localObject = this.b;
    int n;
    if (localObject != null)
    {
      int m = Build.VERSION.SDK_INT;
      n = 24;
      if (m >= n)
      {
        localObject = new android/support/c/a/i$g;
        Drawable.ConstantState localConstantState = this.b.getConstantState();
        ((i.g)localObject).<init>(localConstantState);
      }
    }
    for (;;)
    {
      return (Drawable.ConstantState)localObject;
      localObject = this.c;
      n = getChangingConfigurations();
      ((i.f)localObject).a = n;
      localObject = this.c;
    }
  }
  
  public int getIntrinsicHeight()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    float f1;
    for (int m = ((Drawable)localObject).getIntrinsicHeight();; m = (int)f1)
    {
      return m;
      localObject = this.c.b;
      f1 = ((i.e)localObject).c;
    }
  }
  
  public int getIntrinsicWidth()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    float f1;
    for (int m = ((Drawable)localObject).getIntrinsicWidth();; m = (int)f1)
    {
      return m;
      localObject = this.c.b;
      f1 = ((i.e)localObject).b;
    }
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (int m = localDrawable.getOpacity();; m = -3) {
      return m;
    }
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
    for (;;)
    {
      return;
      localDrawable = null;
      inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
    }
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    for (;;)
    {
      return;
      localObject1 = this.c;
      Object localObject2 = new android/support/c/a/i$e;
      ((i.e)localObject2).<init>();
      ((i.f)localObject1).b = ((i.e)localObject2);
      localObject2 = a.a;
      localObject2 = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject2);
      a((TypedArray)localObject2, paramXmlPullParser);
      ((TypedArray)localObject2).recycle();
      int m = getChangingConfigurations();
      ((i.f)localObject1).a = m;
      m = 1;
      ((i.f)localObject1).k = m;
      b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      localObject2 = this.d;
      ColorStateList localColorStateList = ((i.f)localObject1).c;
      localObject1 = ((i.f)localObject1).d;
      localObject1 = a((PorterDuffColorFilter)localObject2, localColorStateList, (PorterDuff.Mode)localObject1);
      this.d = ((PorterDuffColorFilter)localObject1);
    }
  }
  
  public void invalidateSelf()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.invalidateSelf();
    }
    for (;;)
    {
      return;
      super.invalidateSelf();
    }
  }
  
  public boolean isAutoMirrored()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (boolean bool = android.support.v4.b.a.a.b((Drawable)localObject);; bool = ((i.f)localObject).e)
    {
      return bool;
      localObject = this.c;
    }
  }
  
  public boolean isStateful()
  {
    Object localObject = this.b;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.b;
      bool = ((Drawable)localObject).isStateful();
    }
    for (;;)
    {
      return bool;
      bool = super.isStateful();
      if (!bool)
      {
        localObject = this.c;
        if (localObject != null)
        {
          localObject = this.c.c;
          if (localObject != null)
          {
            localObject = this.c.c;
            bool = ((ColorStateList)localObject).isStateful();
            if (!bool) {}
          }
        }
      }
      else
      {
        bool = true;
        continue;
      }
      bool = false;
      localObject = null;
    }
  }
  
  public Drawable mutate()
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Drawable)localObject).mutate();
    }
    for (;;)
    {
      return this;
      boolean bool = this.f;
      if (!bool)
      {
        localObject = super.mutate();
        if (localObject == this)
        {
          localObject = new android/support/c/a/i$f;
          i.f localf = this.c;
          ((i.f)localObject).<init>(localf);
          this.c = ((i.f)localObject);
          bool = true;
          this.f = bool;
        }
      }
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.setBounds(paramRect);
    }
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject1 = this.b;
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      bool = ((Drawable)localObject1).setState(paramArrayOfInt);
    }
    for (;;)
    {
      return bool;
      localObject1 = this.c;
      Object localObject2 = ((i.f)localObject1).c;
      if (localObject2 != null)
      {
        localObject2 = ((i.f)localObject1).d;
        if (localObject2 != null)
        {
          localObject2 = this.d;
          ColorStateList localColorStateList = ((i.f)localObject1).c;
          localObject1 = ((i.f)localObject1).d;
          localObject1 = a((PorterDuffColorFilter)localObject2, localColorStateList, (PorterDuff.Mode)localObject1);
          this.d = ((PorterDuffColorFilter)localObject1);
          invalidateSelf();
          bool = true;
          continue;
        }
      }
      bool = false;
      localObject1 = null;
    }
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.scheduleSelf(paramRunnable, paramLong);
    }
    for (;;)
    {
      return;
      super.scheduleSelf(paramRunnable, paramLong);
    }
  }
  
  public void setAlpha(int paramInt)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Drawable)localObject).setAlpha(paramInt);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      int m = ((i.e)localObject).getRootAlpha();
      if (m != paramInt)
      {
        localObject = this.c.b;
        ((i.e)localObject).setRootAlpha(paramInt);
        invalidateSelf();
      }
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject, paramBoolean);
    }
    for (;;)
    {
      return;
      localObject = this.c;
      ((i.f)localObject).e = paramBoolean;
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.setColorFilter(paramColorFilter);
    }
    for (;;)
    {
      return;
      this.e = paramColorFilter;
      invalidateSelf();
    }
  }
  
  public void setTint(int paramInt)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject, paramInt);
    }
    for (;;)
    {
      return;
      localObject = ColorStateList.valueOf(paramInt);
      setTintList((ColorStateList)localObject);
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject1, paramColorStateList);
    }
    for (;;)
    {
      return;
      localObject1 = this.c;
      Object localObject2 = ((i.f)localObject1).c;
      if (localObject2 != paramColorStateList)
      {
        ((i.f)localObject1).c = paramColorStateList;
        localObject2 = this.d;
        localObject1 = ((i.f)localObject1).d;
        localObject1 = a((PorterDuffColorFilter)localObject2, paramColorStateList, (PorterDuff.Mode)localObject1);
        this.d = ((PorterDuffColorFilter)localObject1);
        invalidateSelf();
      }
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject1, paramMode);
    }
    for (;;)
    {
      return;
      localObject1 = this.c;
      Object localObject2 = ((i.f)localObject1).d;
      if (localObject2 != paramMode)
      {
        ((i.f)localObject1).d = paramMode;
        localObject2 = this.d;
        localObject1 = ((i.f)localObject1).c;
        localObject1 = a((PorterDuffColorFilter)localObject2, (ColorStateList)localObject1, paramMode);
        this.d = ((PorterDuffColorFilter)localObject1);
        invalidateSelf();
      }
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (boolean bool = localDrawable.setVisible(paramBoolean1, paramBoolean2);; bool = super.setVisible(paramBoolean1, paramBoolean2)) {
      return bool;
    }
  }
  
  public void unscheduleSelf(Runnable paramRunnable)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.unscheduleSelf(paramRunnable);
    }
    for (;;)
    {
      return;
      super.unscheduleSelf(paramRunnable);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */