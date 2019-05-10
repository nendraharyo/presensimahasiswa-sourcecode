package android.support.v7.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.b.a;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class AppCompatColorStateListInflater
{
  private static final int DEFAULT_COLOR = 16711680;
  
  public static ColorStateList createFromXml(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    int i = 2;
    Object localObject = Xml.asAttributeSet(paramXmlPullParser);
    int j;
    int k;
    do
    {
      j = paramXmlPullParser.next();
      if (j == i) {
        break;
      }
      k = 1;
    } while (j != k);
    if (j != i)
    {
      localObject = new org/xmlpull/v1/XmlPullParserException;
      ((XmlPullParserException)localObject).<init>("No start tag found");
      throw ((Throwable)localObject);
    }
    return createFromXmlInner(paramResources, paramXmlPullParser, (AttributeSet)localObject, paramTheme);
  }
  
  private static ColorStateList createFromXmlInner(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    String str1 = paramXmlPullParser.getName();
    Object localObject = "selector";
    boolean bool = str1.equals(localObject);
    if (!bool)
    {
      localObject = new org/xmlpull/v1/XmlPullParserException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = paramXmlPullParser.getPositionDescription();
      str1 = str2 + ": invalid color state list tag " + str1;
      ((XmlPullParserException)localObject).<init>(str1);
      throw ((Throwable)localObject);
    }
    return inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  private static ColorStateList inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth() + 1;
    Object localObject1 = new int[20][];
    int[] arrayOfInt1 = new int[localObject1.length];
    Object localObject2 = localObject1;
    int[] arrayOfInt2 = arrayOfInt1;
    int j = 0;
    arrayOfInt1 = null;
    Object localObject3 = arrayOfInt2;
    boolean bool1;
    do
    {
      int k;
      do
      {
        k = paramXmlPullParser.next();
        n = 1;
        if (k == n) {
          break;
        }
        n = paramXmlPullParser.getDepth();
        if (n < i)
        {
          i1 = 3;
          if (k == i1) {
            break;
          }
        }
        i1 = 2;
      } while ((k != i1) || (n > i));
      localObject1 = paramXmlPullParser.getName();
      localObject4 = "item";
      bool1 = ((String)localObject1).equals(localObject4);
    } while (!bool1);
    localObject1 = R.styleable.ColorStateListItem;
    Object localObject4 = obtainAttributes(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
    int m = R.styleable.ColorStateListItem_android_color;
    int i4 = ((TypedArray)localObject4).getColor(m, -65281);
    m = 1065353216;
    float f = 1.0F;
    int i1 = R.styleable.ColorStateListItem_android_alpha;
    boolean bool2 = ((TypedArray)localObject4).hasValue(i1);
    int i2;
    label202:
    int i5;
    int[] arrayOfInt3;
    int i7;
    if (bool2)
    {
      i2 = R.styleable.ColorStateListItem_android_alpha;
      f = ((TypedArray)localObject4).getFloat(i2, f);
      ((TypedArray)localObject4).recycle();
      i5 = 0;
      int i6 = paramAttributeSet.getAttributeCount();
      arrayOfInt3 = new int[i6];
      n = 0;
      localObject4 = null;
      i7 = 0;
      label233:
      if (i7 >= i6) {
        break label380;
      }
      n = paramAttributeSet.getAttributeNameResource(i7);
      i2 = 16843173;
      if (n == i2) {
        break label507;
      }
      i2 = 16843551;
      if (n == i2) {
        break label507;
      }
      i2 = R.attr.alpha;
      if (n == i2) {
        break label507;
      }
      i2 = i5 + 1;
      boolean bool4 = paramAttributeSet.getAttributeBooleanValue(i7, false);
      if (!bool4) {
        break label372;
      }
      label306:
      arrayOfInt3[i5] = n;
    }
    label372:
    label380:
    label507:
    for (int n = i2;; n = i5)
    {
      i2 = i7 + 1;
      i7 = i2;
      i5 = n;
      break label233;
      i2 = R.styleable.ColorStateListItem_alpha;
      boolean bool3 = ((TypedArray)localObject4).hasValue(i2);
      if (!bool3) {
        break label202;
      }
      int i3 = R.styleable.ColorStateListItem_alpha;
      f = ((TypedArray)localObject4).getFloat(i3, f);
      break label202;
      n = -n;
      break label306;
      localObject4 = StateSet.trimStateSet(arrayOfInt3, i5);
      m = modulateColorAlpha(i4, f);
      if (j != 0)
      {
        i3 = localObject4.length;
        if (i3 != 0) {}
      }
      localObject1 = GrowingArrayUtils.append((int[])localObject3, j, m);
      localObject3 = (int[][])GrowingArrayUtils.append((Object[])localObject2, j, localObject4);
      j += 1;
      localObject2 = localObject3;
      localObject3 = localObject1;
      break;
      localObject1 = new int[j];
      localObject4 = new int[j][];
      System.arraycopy(localObject3, 0, localObject1, 0, j);
      System.arraycopy(localObject2, 0, localObject4, 0, j);
      localObject3 = new android/content/res/ColorStateList;
      ((ColorStateList)localObject3).<init>((int[][])localObject4, (int[])localObject1);
      return (ColorStateList)localObject3;
    }
  }
  
  private static int modulateColorAlpha(int paramInt, float paramFloat)
  {
    int i = Math.round(Color.alpha(paramInt) * paramFloat);
    return a.b(paramInt, i);
  }
  
  private static TypedArray obtainAttributes(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    TypedArray localTypedArray = null;
    if (paramTheme == null) {}
    for (localTypedArray = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);; localTypedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0)) {
      return localTypedArray;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\content\res\AppCompatColorStateListInflater.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */