package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class k
{
  private final l a;
  
  private k(l paraml)
  {
    this.a = paraml;
  }
  
  public static k a(l paraml)
  {
    k localk = new android/support/v4/app/k;
    localk.<init>(paraml);
    return localk;
  }
  
  public Fragment a(String paramString)
  {
    return this.a.d.b(paramString);
  }
  
  public m a()
  {
    return this.a.k();
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.d.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void a(Configuration paramConfiguration)
  {
    this.a.d.a(paramConfiguration);
  }
  
  public void a(Parcelable paramParcelable, o paramo)
  {
    this.a.d.a(paramParcelable, paramo);
  }
  
  public void a(Fragment paramFragment)
  {
    n localn = this.a.d;
    l locall1 = this.a;
    l locall2 = this.a;
    localn.a(locall1, locall2, paramFragment);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.d.a(paramBoolean);
  }
  
  public boolean a(Menu paramMenu)
  {
    return this.a.d.a(paramMenu);
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    return this.a.d.a(paramMenu, paramMenuInflater);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return this.a.d.a(paramMenuItem);
  }
  
  public void b()
  {
    this.a.d.o();
  }
  
  public void b(Menu paramMenu)
  {
    this.a.d.b(paramMenu);
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.d.b(paramBoolean);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return this.a.d.b(paramMenuItem);
  }
  
  public Parcelable c()
  {
    return this.a.d.n();
  }
  
  public o d()
  {
    return this.a.d.l();
  }
  
  public void e()
  {
    this.a.d.p();
  }
  
  public void f()
  {
    this.a.d.q();
  }
  
  public void g()
  {
    this.a.d.r();
  }
  
  public void h()
  {
    this.a.d.s();
  }
  
  public void i()
  {
    this.a.d.t();
  }
  
  public void j()
  {
    this.a.d.u();
  }
  
  public void k()
  {
    this.a.d.v();
  }
  
  public void l()
  {
    this.a.d.x();
  }
  
  public void m()
  {
    this.a.d.y();
  }
  
  public boolean n()
  {
    return this.a.d.i();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */