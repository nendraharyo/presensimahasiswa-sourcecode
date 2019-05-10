package android.support.v4.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a
{
  public static a.a a(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    int i = 2;
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
      XmlPullParserException localXmlPullParserException = new org/xmlpull/v1/XmlPullParserException;
      localXmlPullParserException.<init>("No start tag found");
      throw localXmlPullParserException;
    }
    return b(paramXmlPullParser, paramResources);
  }
  
  public static List a(Resources paramResources, int paramInt)
  {
    int i = 0;
    Object localObject = null;
    ArrayList localArrayList;
    if (paramInt != 0)
    {
      TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
      int j = localTypedArray.length();
      if (j > 0)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        i = localTypedArray.getResourceId(0, 0);
        if (i != 0) {
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label130;
          }
          i = 0;
          localObject = null;
          for (;;)
          {
            int k = localTypedArray.length();
            if (i >= k) {
              break;
            }
            k = localTypedArray.getResourceId(i, 0);
            List localList = a(paramResources.getStringArray(k));
            localArrayList.add(localList);
            i += 1;
          }
          i = 0;
          localObject = null;
        }
        localObject = localArrayList;
      }
      localTypedArray.recycle();
    }
    if (localObject != null) {}
    for (;;)
    {
      return (List)localObject;
      label130:
      localObject = a(paramResources.getStringArray(paramInt));
      localArrayList.add(localObject);
      localObject = localArrayList;
      break;
      localObject = Collections.emptyList();
    }
  }
  
  private static List a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfString.length;
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte = Base64.decode(paramArrayOfString[j], 0);
      localArrayList.add(arrayOfByte);
      j += 1;
    }
    return localArrayList;
  }
  
  private static void a(XmlPullParser paramXmlPullParser)
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlPullParser.next();
      switch (j)
      {
      default: 
        break;
      case 2: 
        i += 1;
        break;
      case 3: 
        i += -1;
      }
    }
  }
  
  private static a.a b(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    a.a locala = null;
    paramXmlPullParser.require(2, null, "font-family");
    String str1 = paramXmlPullParser.getName();
    String str2 = "font-family";
    boolean bool = str1.equals(str2);
    if (bool) {
      locala = c(paramXmlPullParser, paramResources);
    }
    for (;;)
    {
      return locala;
      a(paramXmlPullParser);
    }
  }
  
  private static a.a c(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    int i = 3;
    Object localObject1 = Xml.asAttributeSet(paramXmlPullParser);
    Object localObject2 = android.support.a.a.b.FontFamily;
    localObject1 = paramResources.obtainAttributes((AttributeSet)localObject1, (int[])localObject2);
    int j = android.support.a.a.b.FontFamily_fontProviderAuthority;
    localObject2 = ((TypedArray)localObject1).getString(j);
    int k = android.support.a.a.b.FontFamily_fontProviderPackage;
    Object localObject3 = ((TypedArray)localObject1).getString(k);
    int m = android.support.a.a.b.FontFamily_fontProviderQuery;
    String str = ((TypedArray)localObject1).getString(m);
    int n = android.support.a.a.b.FontFamily_fontProviderCerts;
    n = ((TypedArray)localObject1).getResourceId(n, 0);
    int i1 = android.support.a.a.b.FontFamily_fontProviderFetchStrategy;
    i1 = ((TypedArray)localObject1).getInteger(i1, 1);
    int i2 = android.support.a.a.b.FontFamily_fontProviderFetchTimeout;
    int i3 = 500;
    i2 = ((TypedArray)localObject1).getInteger(i2, i3);
    ((TypedArray)localObject1).recycle();
    int i4;
    if ((localObject2 != null) && (localObject3 != null) && (str != null))
    {
      for (;;)
      {
        i4 = paramXmlPullParser.next();
        if (i4 == i) {
          break;
        }
        a(paramXmlPullParser);
      }
      List localList = a(paramResources, n);
      localObject1 = new android/support/v4/a/a/a$d;
      android.support.v4.f.a locala = new android/support/v4/f/a;
      locala.<init>((String)localObject2, (String)localObject3, str, localList);
      ((a.d)localObject1).<init>(locala, i1, i2);
    }
    for (;;)
    {
      return (a.a)localObject1;
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      for (;;)
      {
        j = paramXmlPullParser.next();
        if (j == i) {
          break;
        }
        j = paramXmlPullParser.getEventType();
        k = 2;
        if (j == k)
        {
          localObject2 = paramXmlPullParser.getName();
          localObject3 = "font";
          bool = ((String)localObject2).equals(localObject3);
          if (bool)
          {
            localObject2 = d(paramXmlPullParser, paramResources);
            ((List)localObject1).add(localObject2);
          }
          else
          {
            a(paramXmlPullParser);
          }
        }
      }
      boolean bool = ((List)localObject1).isEmpty();
      if (bool)
      {
        i4 = 0;
        localObject1 = null;
      }
      else
      {
        localObject2 = new android/support/v4/a/a/a$b;
        k = ((List)localObject1).size();
        localObject3 = new a.c[k];
        localObject1 = (a.c[])((List)localObject1).toArray((Object[])localObject3);
        ((a.b)localObject2).<init>((a.c[])localObject1);
        localObject1 = localObject2;
      }
    }
  }
  
  private static a.c d(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    int i = 1;
    int k = 0;
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    Object localObject = android.support.a.a.b.FontFamilyFont;
    localObject = paramResources.obtainAttributes(localAttributeSet, (int[])localObject);
    int m = android.support.a.a.b.FontFamilyFont_fontWeight;
    boolean bool2 = ((TypedArray)localObject).hasValue(m);
    int i2;
    int i1;
    if (bool2)
    {
      int n = android.support.a.a.b.FontFamilyFont_fontWeight;
      i2 = ((TypedArray)localObject).getInt(n, 400);
      n = android.support.a.a.b.FontFamilyFont_fontStyle;
      boolean bool3 = ((TypedArray)localObject).hasValue(n);
      if (!bool3) {
        break label177;
      }
      i1 = android.support.a.a.b.FontFamilyFont_fontStyle;
      label85:
      i1 = ((TypedArray)localObject).getInt(i1, 0);
      if (i != i1) {
        break label185;
      }
      i1 = i;
      label104:
      i = android.support.a.a.b.FontFamilyFont_font;
      boolean bool1 = ((TypedArray)localObject).hasValue(i);
      if (!bool1) {
        break label194;
      }
    }
    String str;
    label177:
    label185:
    label194:
    for (int j = android.support.a.a.b.FontFamilyFont_font;; j = android.support.a.a.b.FontFamilyFont_android_font)
    {
      k = ((TypedArray)localObject).getResourceId(j, 0);
      str = ((TypedArray)localObject).getString(j);
      ((TypedArray)localObject).recycle();
      for (;;)
      {
        int i3 = paramXmlPullParser.next();
        int i4 = 3;
        if (i3 == i4) {
          break;
        }
        a(paramXmlPullParser);
      }
      i1 = android.support.a.a.b.FontFamilyFont_android_fontWeight;
      break;
      i1 = android.support.a.a.b.FontFamilyFont_android_fontStyle;
      break label85;
      i1 = 0;
      localAttributeSet = null;
      break label104;
    }
    localObject = new android/support/v4/a/a/a$c;
    ((a.c)localObject).<init>(str, i2, i1, k);
    return (a.c)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */