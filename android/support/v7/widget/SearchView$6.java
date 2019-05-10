package android.support.v7.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class SearchView$6
  implements View.OnKeyListener
{
  SearchView$6(SearchView paramSearchView) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    boolean bool1 = false;
    SearchView localSearchView = null;
    Object localObject = this.this$0.mSearchable;
    if (localObject == null) {}
    for (;;)
    {
      return bool1;
      localObject = this.this$0.mSearchSrcTextView;
      boolean bool2 = ((SearchView.SearchAutoComplete)localObject).isPopupShowing();
      int m;
      if (bool2)
      {
        localObject = this.this$0.mSearchSrcTextView;
        int j = ((SearchView.SearchAutoComplete)localObject).getListSelection();
        m = -1;
        if (j != m)
        {
          localSearchView = this.this$0;
          bool1 = localSearchView.onSuggestionsKey(paramView, paramInt, paramKeyEvent);
          continue;
        }
      }
      localObject = this.this$0.mSearchSrcTextView;
      boolean bool3 = SearchView.SearchAutoComplete.access$100((SearchView.SearchAutoComplete)localObject);
      if (!bool3)
      {
        bool3 = paramKeyEvent.hasNoModifiers();
        if (bool3)
        {
          int k = paramKeyEvent.getAction();
          if (k == i)
          {
            k = 66;
            if (paramInt == k)
            {
              paramView.cancelLongPress();
              localObject = this.this$0;
              m = 0;
              String str = this.this$0.mSearchSrcTextView.getText().toString();
              ((SearchView)localObject).launchQuerySearch(0, null, str);
              bool1 = i;
            }
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */