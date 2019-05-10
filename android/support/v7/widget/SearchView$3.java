package android.support.v7.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

class SearchView$3
  implements View.OnFocusChangeListener
{
  SearchView$3(SearchView paramSearchView) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    View.OnFocusChangeListener localOnFocusChangeListener = this.this$0.mOnQueryTextFocusChangeListener;
    if (localOnFocusChangeListener != null)
    {
      localOnFocusChangeListener = this.this$0.mOnQueryTextFocusChangeListener;
      SearchView localSearchView = this.this$0;
      localOnFocusChangeListener.onFocusChange(localSearchView, paramBoolean);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */