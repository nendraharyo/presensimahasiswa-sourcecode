package android.support.v4.view;

import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;

class e$b
{
  public void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    paramLayoutInflater.setFactory2(paramFactory2);
    Object localObject = paramLayoutInflater.getFactory();
    boolean bool = localObject instanceof LayoutInflater.Factory2;
    if (bool)
    {
      localObject = (LayoutInflater.Factory2)localObject;
      e.a(paramLayoutInflater, (LayoutInflater.Factory2)localObject);
    }
    for (;;)
    {
      return;
      e.a(paramLayoutInflater, paramFactory2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\e$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */