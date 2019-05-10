package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class SearchView$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public SearchView.SavedState createFromParcel(Parcel paramParcel)
  {
    SearchView.SavedState localSavedState = new android/support/v7/widget/SearchView$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public SearchView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    SearchView.SavedState localSavedState = new android/support/v7/widget/SearchView$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public SearchView.SavedState[] newArray(int paramInt)
  {
    return new SearchView.SavedState[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$SavedState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */