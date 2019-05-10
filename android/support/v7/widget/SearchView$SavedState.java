package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

class SearchView$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  boolean isIconified;
  
  static
  {
    SearchView.SavedState.1 local1 = new android/support/v7/widget/SearchView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SearchView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    boolean bool = ((Boolean)paramParcel.readValue(null)).booleanValue();
    this.isIconified = bool;
  }
  
  SearchView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SearchView.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append(str).append(" isIconified=");
    boolean bool = this.isIconified;
    return bool + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Boolean localBoolean = Boolean.valueOf(this.isIconified);
    paramParcel.writeValue(localBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SearchView$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */