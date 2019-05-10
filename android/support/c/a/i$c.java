package android.support.c.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.support.v4.a.a.c;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class i$c
{
  final ArrayList a;
  float b;
  int c;
  private final Matrix d;
  private float e;
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private final Matrix k;
  private int[] l;
  private String m;
  
  public i$c()
  {
    Object localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.d = ((Matrix)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.a = ((ArrayList)localObject);
    this.b = 0.0F;
    this.e = 0.0F;
    this.f = 0.0F;
    this.g = f1;
    this.h = f1;
    this.i = 0.0F;
    this.j = 0.0F;
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.k = ((Matrix)localObject);
    this.m = null;
  }
  
  public i$c(c paramc, android.support.v4.h.a parama)
  {
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    this.d = ((Matrix)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.a = ((ArrayList)localObject1);
    this.b = 0.0F;
    this.e = 0.0F;
    this.f = 0.0F;
    this.g = f1;
    this.h = f1;
    this.i = 0.0F;
    this.j = 0.0F;
    localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    this.k = ((Matrix)localObject1);
    this.m = null;
    float f2 = paramc.b;
    this.b = f2;
    f2 = paramc.e;
    this.e = f2;
    f2 = paramc.f;
    this.f = f2;
    f2 = paramc.g;
    this.g = f2;
    f2 = paramc.h;
    this.h = f2;
    f2 = paramc.i;
    this.i = f2;
    f2 = paramc.j;
    this.j = f2;
    localObject1 = paramc.l;
    this.l = ((int[])localObject1);
    localObject1 = paramc.m;
    this.m = ((String)localObject1);
    int i2 = paramc.c;
    this.c = i2;
    localObject1 = this.m;
    if (localObject1 != null)
    {
      localObject1 = this.m;
      parama.put(localObject1, this);
    }
    localObject1 = this.k;
    localMatrix = paramc.k;
    ((Matrix)localObject1).set(localMatrix);
    ArrayList localArrayList = paramc.a;
    i2 = 0;
    f2 = 0.0F;
    localObject1 = null;
    i1 = 0;
    localMatrix = null;
    Object localObject2;
    for (;;)
    {
      i2 = localArrayList.size();
      if (i1 >= i2) {
        return;
      }
      localObject1 = localArrayList.get(i1);
      bool = localObject1 instanceof c;
      if (!bool) {
        break;
      }
      localObject1 = (c)localObject1;
      localObject2 = this.a;
      c localc = new android/support/c/a/i$c;
      localc.<init>((c)localObject1, parama);
      ((ArrayList)localObject2).add(localc);
      i2 = i1 + 1;
      i1 = i2;
    }
    boolean bool = localObject1 instanceof i.b;
    if (bool)
    {
      localObject2 = new android/support/c/a/i$b;
      localObject1 = (i.b)localObject1;
      ((i.b)localObject2).<init>((i.b)localObject1);
    }
    for (localObject1 = localObject2;; localObject1 = localObject2)
    {
      this.a.add(localObject1);
      localObject2 = ((i.d)localObject1).n;
      if (localObject2 == null) {
        break;
      }
      localObject2 = ((i.d)localObject1).n;
      parama.put(localObject2, localObject1);
      break;
      bool = localObject1 instanceof i.a;
      if (!bool) {
        break label482;
      }
      localObject2 = new android/support/c/a/i$a;
      localObject1 = (i.a)localObject1;
      ((i.a)localObject2).<init>((i.a)localObject1);
    }
    label482:
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Unknown object in the tree!");
    throw ((Throwable)localObject1);
  }
  
  private void a()
  {
    this.k.reset();
    Matrix localMatrix = this.k;
    float f1 = -this.e;
    float f2 = -this.f;
    localMatrix.postTranslate(f1, f2);
    localMatrix = this.k;
    f1 = this.g;
    f2 = this.h;
    localMatrix.postScale(f1, f2);
    localMatrix = this.k;
    f1 = this.b;
    localMatrix.postRotate(f1, 0.0F, 0.0F);
    localMatrix = this.k;
    f1 = this.i;
    f2 = this.e;
    f1 += f2;
    f2 = this.j;
    float f3 = this.f;
    f2 += f3;
    localMatrix.postTranslate(f1, f2);
  }
  
  private void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    this.l = null;
    float f1 = this.b;
    float f2 = c.a(paramTypedArray, paramXmlPullParser, "rotation", 5, f1);
    this.b = f2;
    float f3 = this.e;
    f2 = paramTypedArray.getFloat(1, f3);
    this.e = f2;
    f3 = this.f;
    f2 = paramTypedArray.getFloat(2, f3);
    this.f = f2;
    f1 = this.g;
    f2 = c.a(paramTypedArray, paramXmlPullParser, "scaleX", 3, f1);
    this.g = f2;
    f1 = this.h;
    f2 = c.a(paramTypedArray, paramXmlPullParser, "scaleY", 4, f1);
    this.h = f2;
    f1 = this.i;
    f2 = c.a(paramTypedArray, paramXmlPullParser, "translateX", 6, f1);
    this.i = f2;
    int n = 7;
    f3 = 9.8E-45F;
    f1 = this.j;
    f2 = c.a(paramTypedArray, paramXmlPullParser, "translateY", n, f1);
    this.j = f2;
    f2 = 0.0F;
    String str = paramTypedArray.getString(0);
    if (str != null) {
      this.m = str;
    }
    a();
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject = a.b;
    localObject = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
    a((TypedArray)localObject, paramXmlPullParser);
    ((TypedArray)localObject).recycle();
  }
  
  public String getGroupName()
  {
    return this.m;
  }
  
  public Matrix getLocalMatrix()
  {
    return this.k;
  }
  
  public float getPivotX()
  {
    return this.e;
  }
  
  public float getPivotY()
  {
    return this.f;
  }
  
  public float getRotation()
  {
    return this.b;
  }
  
  public float getScaleX()
  {
    return this.g;
  }
  
  public float getScaleY()
  {
    return this.h;
  }
  
  public float getTranslateX()
  {
    return this.i;
  }
  
  public float getTranslateY()
  {
    return this.j;
  }
  
  public void setPivotX(float paramFloat)
  {
    float f1 = this.e;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.e = paramFloat;
      a();
    }
  }
  
  public void setPivotY(float paramFloat)
  {
    float f1 = this.f;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.f = paramFloat;
      a();
    }
  }
  
  public void setRotation(float paramFloat)
  {
    float f1 = this.b;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.b = paramFloat;
      a();
    }
  }
  
  public void setScaleX(float paramFloat)
  {
    float f1 = this.g;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.g = paramFloat;
      a();
    }
  }
  
  public void setScaleY(float paramFloat)
  {
    float f1 = this.h;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.h = paramFloat;
      a();
    }
  }
  
  public void setTranslateX(float paramFloat)
  {
    float f1 = this.i;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.i = paramFloat;
      a();
    }
  }
  
  public void setTranslateY(float paramFloat)
  {
    float f1 = this.j;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.j = paramFloat;
      a();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */