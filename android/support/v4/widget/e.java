package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class e
  extends Filter
{
  e.a a;
  
  e(e.a parama)
  {
    this.a = parama;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    e.a locala = this.a;
    paramObject = (Cursor)paramObject;
    return locala.convertToString((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = this.a.runQueryOnBackgroundThread(paramCharSequence);
    Filter.FilterResults localFilterResults = new android/widget/Filter$FilterResults;
    localFilterResults.<init>();
    if (localCursor != null)
    {
      int i = localCursor.getCount();
      localFilterResults.count = i;
    }
    for (localFilterResults.values = localCursor;; localFilterResults.values = null)
    {
      return localFilterResults;
      localFilterResults.count = 0;
      localCursor = null;
    }
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Cursor localCursor = this.a.getCursor();
    Object localObject = paramFilterResults.values;
    if (localObject != null)
    {
      localObject = paramFilterResults.values;
      if (localObject != localCursor)
      {
        localObject = this.a;
        localCursor = (Cursor)paramFilterResults.values;
        ((e.a)localObject).changeCursor(localCursor);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */