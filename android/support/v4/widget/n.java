package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.os.a;
import android.widget.TextView;

public final class n
{
  static final n.g a;
  
  static
  {
    boolean bool = a.a();
    Object localObject;
    if (bool)
    {
      localObject = new android/support/v4/widget/n$f;
      ((n.f)localObject).<init>();
      a = (n.g)localObject;
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 26;
      if (i >= j)
      {
        localObject = new android/support/v4/widget/n$e;
        ((n.e)localObject).<init>();
        a = (n.g)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 23;
        if (i >= j)
        {
          localObject = new android/support/v4/widget/n$d;
          ((n.d)localObject).<init>();
          a = (n.g)localObject;
        }
        else
        {
          i = Build.VERSION.SDK_INT;
          j = 18;
          if (i >= j)
          {
            localObject = new android/support/v4/widget/n$c;
            ((n.c)localObject).<init>();
            a = (n.g)localObject;
          }
          else
          {
            i = Build.VERSION.SDK_INT;
            j = 17;
            if (i >= j)
            {
              localObject = new android/support/v4/widget/n$b;
              ((n.b)localObject).<init>();
              a = (n.g)localObject;
            }
            else
            {
              i = Build.VERSION.SDK_INT;
              j = 16;
              if (i >= j)
              {
                localObject = new android/support/v4/widget/n$a;
                ((n.a)localObject).<init>();
                a = (n.g)localObject;
              }
              else
              {
                localObject = new android/support/v4/widget/n$g;
                ((n.g)localObject).<init>();
                a = (n.g)localObject;
              }
            }
          }
        }
      }
    }
  }
  
  public static void a(TextView paramTextView, int paramInt)
  {
    a.a(paramTextView, paramInt);
  }
  
  public static void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    a.a(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static Drawable[] a(TextView paramTextView)
  {
    return a.a(paramTextView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */