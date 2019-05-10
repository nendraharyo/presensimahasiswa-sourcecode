package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.LayoutInflater;
import android.view.View;

public class WindowDecorActionBar$TabImpl
  extends ActionBar.Tab
{
  private ActionBar.TabListener mCallback;
  private CharSequence mContentDesc;
  private View mCustomView;
  private Drawable mIcon;
  private int mPosition = -1;
  private Object mTag;
  private CharSequence mText;
  
  public WindowDecorActionBar$TabImpl(WindowDecorActionBar paramWindowDecorActionBar) {}
  
  public ActionBar.TabListener getCallback()
  {
    return this.mCallback;
  }
  
  public CharSequence getContentDescription()
  {
    return this.mContentDesc;
  }
  
  public View getCustomView()
  {
    return this.mCustomView;
  }
  
  public Drawable getIcon()
  {
    return this.mIcon;
  }
  
  public int getPosition()
  {
    return this.mPosition;
  }
  
  public Object getTag()
  {
    return this.mTag;
  }
  
  public CharSequence getText()
  {
    return this.mText;
  }
  
  public void select()
  {
    this.this$0.selectTab(this);
  }
  
  public ActionBar.Tab setContentDescription(int paramInt)
  {
    CharSequence localCharSequence = this.this$0.mContext.getResources().getText(paramInt);
    return setContentDescription(localCharSequence);
  }
  
  public ActionBar.Tab setContentDescription(CharSequence paramCharSequence)
  {
    this.mContentDesc = paramCharSequence;
    int i = this.mPosition;
    if (i >= 0)
    {
      ScrollingTabContainerView localScrollingTabContainerView = this.this$0.mTabScrollView;
      int j = this.mPosition;
      localScrollingTabContainerView.updateTab(j);
    }
    return this;
  }
  
  public ActionBar.Tab setCustomView(int paramInt)
  {
    View localView = LayoutInflater.from(this.this$0.getThemedContext()).inflate(paramInt, null);
    return setCustomView(localView);
  }
  
  public ActionBar.Tab setCustomView(View paramView)
  {
    this.mCustomView = paramView;
    int i = this.mPosition;
    if (i >= 0)
    {
      ScrollingTabContainerView localScrollingTabContainerView = this.this$0.mTabScrollView;
      int j = this.mPosition;
      localScrollingTabContainerView.updateTab(j);
    }
    return this;
  }
  
  public ActionBar.Tab setIcon(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(this.this$0.mContext, paramInt);
    return setIcon(localDrawable);
  }
  
  public ActionBar.Tab setIcon(Drawable paramDrawable)
  {
    this.mIcon = paramDrawable;
    int i = this.mPosition;
    if (i >= 0)
    {
      ScrollingTabContainerView localScrollingTabContainerView = this.this$0.mTabScrollView;
      int j = this.mPosition;
      localScrollingTabContainerView.updateTab(j);
    }
    return this;
  }
  
  public void setPosition(int paramInt)
  {
    this.mPosition = paramInt;
  }
  
  public ActionBar.Tab setTabListener(ActionBar.TabListener paramTabListener)
  {
    this.mCallback = paramTabListener;
    return this;
  }
  
  public ActionBar.Tab setTag(Object paramObject)
  {
    this.mTag = paramObject;
    return this;
  }
  
  public ActionBar.Tab setText(int paramInt)
  {
    CharSequence localCharSequence = this.this$0.mContext.getResources().getText(paramInt);
    return setText(localCharSequence);
  }
  
  public ActionBar.Tab setText(CharSequence paramCharSequence)
  {
    this.mText = paramCharSequence;
    int i = this.mPosition;
    if (i >= 0)
    {
      ScrollingTabContainerView localScrollingTabContainerView = this.this$0.mTabScrollView;
      int j = this.mPosition;
      localScrollingTabContainerView.updateTab(j);
    }
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\WindowDecorActionBar$TabImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */