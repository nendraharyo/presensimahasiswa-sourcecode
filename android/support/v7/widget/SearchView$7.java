package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class SearchView$7
  implements TextView.OnEditorActionListener
{
  SearchView$7(SearchView paramSearchView) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    this.this$0.onSubmitQuery();
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */