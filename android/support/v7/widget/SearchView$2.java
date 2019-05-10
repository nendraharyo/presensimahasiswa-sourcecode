package android.support.v7.widget;

import android.support.v4.widget.d;

class SearchView$2
  implements Runnable
{
  SearchView$2(SearchView paramSearchView) {}
  
  public void run()
  {
    d locald = this.this$0.mSuggestionsAdapter;
    if (locald != null)
    {
      locald = this.this$0.mSuggestionsAdapter;
      boolean bool = locald instanceof SuggestionsAdapter;
      if (bool)
      {
        locald = this.this$0.mSuggestionsAdapter;
        locald.changeCursor(null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */