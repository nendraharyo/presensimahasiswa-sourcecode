package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class RecyclerView$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public RecyclerView.SavedState createFromParcel(Parcel paramParcel)
  {
    RecyclerView.SavedState localSavedState = new android/support/v7/widget/RecyclerView$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public RecyclerView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    RecyclerView.SavedState localSavedState = new android/support/v7/widget/RecyclerView$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public RecyclerView.SavedState[] newArray(int paramInt)
  {
    return new RecyclerView.SavedState[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$SavedState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */