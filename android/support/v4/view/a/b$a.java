package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public class b$a
{
  public static final a A;
  public static final a B;
  public static final a C;
  public static final a D;
  public static final a a;
  public static final a b;
  public static final a c;
  public static final a d;
  public static final a e;
  public static final a f;
  public static final a g;
  public static final a h;
  public static final a i;
  public static final a j;
  public static final a k;
  public static final a l;
  public static final a m;
  public static final a n;
  public static final a o;
  public static final a p;
  public static final a q;
  public static final a r;
  public static final a s;
  public static final a t;
  public static final a u;
  public static final a v;
  public static final a w;
  public static final a x;
  public static final a y;
  public static final a z;
  final Object E;
  
  static
  {
    int i1 = 23;
    AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction = null;
    Object localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(1, null);
    a = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(2, null);
    b = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(4, null);
    c = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(8, null);
    d = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(16, null);
    e = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(32, null);
    f = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(64, null);
    g = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(128, null);
    h = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(256, null);
    i = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(512, null);
    j = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(1024, null);
    k = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(2048, null);
    l = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(4096, null);
    m = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(8192, null);
    n = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(16384, null);
    o = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(32768, null);
    p = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(65536, null);
    q = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(131072, null);
    r = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(262144, null);
    s = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(524288, null);
    t = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    ((a)localObject).<init>(1048576, null);
    u = (a)localObject;
    localObject = new android/support/v4/view/a/b$a;
    int i2 = 2097152;
    ((a)localObject).<init>(i2, null);
    v = (a)localObject;
    a locala = new android/support/v4/view/a/b$a;
    int i3 = Build.VERSION.SDK_INT;
    if (i3 >= i1)
    {
      localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
      locala.<init>(localObject);
      w = locala;
      locala = new android/support/v4/view/a/b$a;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label597;
      }
      localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
      label393:
      locala.<init>(localObject);
      x = locala;
      locala = new android/support/v4/view/a/b$a;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label605;
      }
      localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
      label424:
      locala.<init>(localObject);
      y = locala;
      locala = new android/support/v4/view/a/b$a;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label613;
      }
      localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
      label455:
      locala.<init>(localObject);
      z = locala;
      locala = new android/support/v4/view/a/b$a;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label621;
      }
      localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
      label486:
      locala.<init>(localObject);
      A = locala;
      locala = new android/support/v4/view/a/b$a;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label629;
      }
      localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
      label517:
      locala.<init>(localObject);
      B = locala;
      locala = new android/support/v4/view/a/b$a;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label637;
      }
    }
    for (localObject = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;; localObject = null)
    {
      locala.<init>(localObject);
      C = locala;
      localObject = new android/support/v4/view/a/b$a;
      i2 = Build.VERSION.SDK_INT;
      i1 = 24;
      if (i2 >= i1) {
        localAccessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
      }
      ((a)localObject).<init>(localAccessibilityAction);
      D = (a)localObject;
      return;
      i3 = 0;
      localObject = null;
      break;
      label597:
      i3 = 0;
      localObject = null;
      break label393;
      label605:
      i3 = 0;
      localObject = null;
      break label424;
      label613:
      i3 = 0;
      localObject = null;
      break label455;
      label621:
      i3 = 0;
      localObject = null;
      break label486;
      label629:
      i3 = 0;
      localObject = null;
      break label517;
      label637:
      i3 = 0;
    }
  }
  
  public b$a(int paramInt, CharSequence paramCharSequence) {}
  
  b$a(Object paramObject)
  {
    this.E = paramObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */