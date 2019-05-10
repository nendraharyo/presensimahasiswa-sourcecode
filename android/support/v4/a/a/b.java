package android.support.v4.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.b.c;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b
{
  public static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, b.a parama)
  {
    Typeface localTypeface = null;
    boolean bool1 = paramContext.isRestricted();
    if (bool1) {}
    for (;;)
    {
      return localTypeface;
      boolean bool2 = true;
      localTypeface = a(paramContext, paramInt1, paramTypedValue, paramInt2, parama, null, bool2);
    }
  }
  
  private static Typeface a(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, b.a parama, Handler paramHandler, boolean paramBoolean)
  {
    Object localObject1 = paramContext.getResources();
    boolean bool = true;
    ((Resources)localObject1).getValue(paramInt1, paramTypedValue, bool);
    Object localObject2 = paramContext;
    Object localObject3 = paramTypedValue;
    localObject2 = a(paramContext, (Resources)localObject1, paramTypedValue, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
    if ((localObject2 == null) && (parama == null))
    {
      localObject2 = new android/content/res/Resources$NotFoundException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Font resource ID #0x");
      localObject3 = Integer.toHexString(paramInt1);
      localObject1 = (String)localObject3 + " could not be retrieved.";
      ((Resources.NotFoundException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    return (Typeface)localObject2;
  }
  
  private static Typeface a(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, b.a parama, Handler paramHandler, boolean paramBoolean)
  {
    Object localObject1 = paramTypedValue.string;
    Object localObject3;
    Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = new android/content/res/Resources$NotFoundException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Resource \"");
      localObject4 = paramResources.getResourceName(paramInt1);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4).append("\" (");
      localObject4 = Integer.toHexString(paramInt1);
      localObject3 = (String)localObject4 + ") is not a Font: " + paramTypedValue;
      ((Resources.NotFoundException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    String str1 = paramTypedValue.string.toString();
    localObject1 = "res/";
    boolean bool1 = str1.startsWith((String)localObject1);
    if (!bool1)
    {
      if (parama != null)
      {
        i = -3;
        parama.callbackFailAsync(i, paramHandler);
      }
      int i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Typeface)localObject1;
      localObject1 = c.a(paramResources, paramInt1, paramInt2);
      if (localObject1 != null)
      {
        if (parama == null) {
          continue;
        }
        parama.callbackSuccessAsync((Typeface)localObject1, paramHandler);
        continue;
      }
      try
      {
        localObject1 = str1.toLowerCase();
        localObject3 = ".xml";
        boolean bool2 = ((String)localObject1).endsWith((String)localObject3);
        if (bool2)
        {
          localObject1 = paramResources.getXml(paramInt1);
          localObject3 = a.a((XmlPullParser)localObject1, paramResources);
          if (localObject3 == null)
          {
            localObject1 = "ResourcesCompat";
            localObject3 = "Failed to find font-family tag";
            Log.e((String)localObject1, (String)localObject3);
            if (parama != null)
            {
              j = -3;
              parama.callbackFailAsync(j, paramHandler);
            }
            j = 0;
            localObject1 = null;
            continue;
          }
          localObject1 = paramContext;
          localObject4 = paramResources;
          localObject1 = c.a(paramContext, (a.a)localObject3, paramResources, paramInt1, paramInt2, parama, paramHandler, paramBoolean);
          continue;
        }
        localObject1 = c.a(paramContext, paramResources, paramInt1, str1, paramInt2);
        if (parama == null) {
          continue;
        }
        if (localObject1 != null) {
          parama.callbackSuccessAsync((Typeface)localObject1, paramHandler);
        }
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        localObject3 = "ResourcesCompat";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        str2 = "Failed to parse xml resource ";
        localObject4 = str2 + str1;
        Log.e((String)localObject3, (String)localObject4, localXmlPullParserException);
        if (parama != null)
        {
          j = -3;
          parama.callbackFailAsync(j, paramHandler);
        }
        int j = 0;
        Object localObject2 = null;
        continue;
        int k = -3;
        parama.callbackFailAsync(k, paramHandler);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject3 = "ResourcesCompat";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str2 = "Failed to read xml resource ";
          localObject4 = str2 + str1;
          Log.e((String)localObject3, (String)localObject4, localIOException);
        }
      }
    }
  }
  
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    for (Drawable localDrawable = paramResources.getDrawable(paramInt, paramTheme);; localDrawable = paramResources.getDrawable(paramInt)) {
      return localDrawable;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\a\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */