package android.support.v7.widget;

class DropDownListView$ResolveHoverRunnable
  implements Runnable
{
  private DropDownListView$ResolveHoverRunnable(DropDownListView paramDropDownListView) {}
  
  public void cancel()
  {
    DropDownListView.access$102(this.this$0, null);
    this.this$0.removeCallbacks(this);
  }
  
  public void post()
  {
    this.this$0.post(this);
  }
  
  public void run()
  {
    DropDownListView.access$102(this.this$0, null);
    this.this$0.drawableStateChanged();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DropDownListView$ResolveHoverRunnable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */