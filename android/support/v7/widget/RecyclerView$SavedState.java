package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;

public class RecyclerView$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  Parcelable mLayoutState;
  
  static
  {
    RecyclerView.SavedState.1 local1 = new android/support/v7/widget/RecyclerView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  RecyclerView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    if (paramClassLoader != null) {}
    for (;;)
    {
      Object localObject = paramParcel.readParcelable(paramClassLoader);
      this.mLayoutState = ((Parcelable)localObject);
      return;
      localObject = RecyclerView.LayoutManager.class;
      paramClassLoader = ((Class)localObject).getClassLoader();
    }
  }
  
  RecyclerView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  void copyFrom(SavedState paramSavedState)
  {
    Parcelable localParcelable = paramSavedState.mLayoutState;
    this.mLayoutState = localParcelable;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Parcelable localParcelable = this.mLayoutState;
    paramParcel.writeParcelable(localParcelable, 0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */