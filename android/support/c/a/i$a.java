package android.support.c.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.a.a.c;
import android.support.v4.b.b;
import android.support.v4.b.b.b;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

class i$a
  extends i.d
{
  public i$a() {}
  
  public i$a(a parama)
  {
    super(parama);
  }
  
  private void a(TypedArray paramTypedArray)
  {
    int i = 0;
    Object localObject = paramTypedArray.getString(0);
    if (localObject != null) {
      this.n = ((String)localObject);
    }
    i = 1;
    localObject = paramTypedArray.getString(i);
    if (localObject != null)
    {
      localObject = b.b((String)localObject);
      this.m = ((b.b[])localObject);
    }
  }
  
  public void a(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    Object localObject = "pathData";
    boolean bool = c.a(paramXmlPullParser, (String)localObject);
    if (!bool) {}
    for (;;)
    {
      return;
      localObject = a.d;
      localObject = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
      a((TypedArray)localObject);
      ((TypedArray)localObject).recycle();
    }
  }
  
  public boolean a()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */