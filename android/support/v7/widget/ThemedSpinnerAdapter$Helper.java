package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;

public final class ThemedSpinnerAdapter$Helper
{
  private final Context mContext;
  private LayoutInflater mDropDownInflater;
  private final LayoutInflater mInflater;
  
  public ThemedSpinnerAdapter$Helper(Context paramContext)
  {
    this.mContext = paramContext;
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    this.mInflater = localLayoutInflater;
  }
  
  public LayoutInflater getDropDownViewInflater()
  {
    LayoutInflater localLayoutInflater = this.mDropDownInflater;
    if (localLayoutInflater != null) {}
    for (localLayoutInflater = this.mDropDownInflater;; localLayoutInflater = this.mInflater) {
      return localLayoutInflater;
    }
  }
  
  public Resources.Theme getDropDownViewTheme()
  {
    Object localObject = this.mDropDownInflater;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mDropDownInflater.getContext().getTheme()) {
      return (Resources.Theme)localObject;
    }
  }
  
  public void setDropDownViewTheme(Resources.Theme paramTheme)
  {
    Object localObject;
    if (paramTheme == null)
    {
      localObject = null;
      this.mDropDownInflater = null;
    }
    for (;;)
    {
      return;
      localObject = this.mContext.getTheme();
      if (paramTheme == localObject)
      {
        localObject = this.mInflater;
        this.mDropDownInflater = ((LayoutInflater)localObject);
      }
      else
      {
        localObject = new android/support/v7/view/ContextThemeWrapper;
        Context localContext = this.mContext;
        ((ContextThemeWrapper)localObject).<init>(localContext, paramTheme);
        localObject = LayoutInflater.from((Context)localObject);
        this.mDropDownInflater = ((LayoutInflater)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ThemedSpinnerAdapter$Helper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */