package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class NestedScrollView$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int a;
  
  static
  {
    NestedScrollView.SavedState.1 local1 = new android/support/v4/widget/NestedScrollView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  NestedScrollView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readInt();
    this.a = i;
  }
  
  NestedScrollView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("HorizontalScrollView.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append(str).append(" scrollPosition=");
    int i = this.a;
    return i + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.a;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\NestedScrollView$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */