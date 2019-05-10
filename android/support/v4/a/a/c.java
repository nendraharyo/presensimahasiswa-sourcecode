package android.support.v4.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class c
{
  public static float a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramFloat;
      paramFloat = paramTypedArray.getFloat(paramInt, paramFloat);
    }
  }
  
  public static int a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramTypedArray.getInt(paramInt1, paramInt2);
    }
  }
  
  public static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    TypedArray localTypedArray = null;
    if (paramTheme == null) {}
    for (localTypedArray = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);; localTypedArray = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0)) {
      return localTypedArray;
    }
  }
  
  public static String a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {
      bool = false;
    }
    for (String str = null;; str = paramTypedArray.getString(paramInt)) {
      return str;
    }
  }
  
  public static boolean a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramBoolean;
      paramBoolean = paramTypedArray.getBoolean(paramInt, paramBoolean);
    }
  }
  
  public static boolean a(XmlPullParser paramXmlPullParser, String paramString)
  {
    String str = paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString);
    boolean bool;
    if (str != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public static int b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramTypedArray.getColor(paramInt1, paramInt2);
    }
  }
  
  public static TypedValue b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {
      bool = false;
    }
    for (TypedValue localTypedValue = null;; localTypedValue = paramTypedArray.peekValue(paramInt)) {
      return localTypedValue;
    }
  }
  
  public static int c(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramXmlPullParser, paramString);
    if (!bool) {}
    for (;;)
    {
      return paramInt2;
      paramInt2 = paramTypedArray.getResourceId(paramInt1, paramInt2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */