package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LinearLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  boolean mAnchorLayoutFromEnd;
  int mAnchorOffset;
  int mAnchorPosition;
  
  static
  {
    LinearLayoutManager.SavedState.1 local1 = new android/support/v7/widget/LinearLayoutManager$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public LinearLayoutManager$SavedState() {}
  
  LinearLayoutManager$SavedState(Parcel paramParcel)
  {
    int j = paramParcel.readInt();
    this.mAnchorPosition = j;
    j = paramParcel.readInt();
    this.mAnchorOffset = j;
    j = paramParcel.readInt();
    if (j == i) {}
    for (;;)
    {
      this.mAnchorLayoutFromEnd = i;
      return;
      i = 0;
    }
  }
  
  public LinearLayoutManager$SavedState(SavedState paramSavedState)
  {
    int i = paramSavedState.mAnchorPosition;
    this.mAnchorPosition = i;
    i = paramSavedState.mAnchorOffset;
    this.mAnchorOffset = i;
    boolean bool = paramSavedState.mAnchorLayoutFromEnd;
    this.mAnchorLayoutFromEnd = bool;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  boolean hasValidAnchor()
  {
    int i = this.mAnchorPosition;
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  void invalidateAnchor()
  {
    this.mAnchorPosition = -1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.mAnchorPosition;
    paramParcel.writeInt(i);
    i = this.mAnchorOffset;
    paramParcel.writeInt(i);
    int j = this.mAnchorLayoutFromEnd;
    if (j != 0) {}
    int k;
    for (j = 1;; k = 0)
    {
      paramParcel.writeInt(j);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearLayoutManager$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */