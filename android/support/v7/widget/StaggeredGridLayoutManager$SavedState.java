package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  boolean mAnchorLayoutFromEnd;
  int mAnchorPosition;
  List mFullSpanItems;
  boolean mLastLayoutRTL;
  boolean mReverseLayout;
  int[] mSpanLookup;
  int mSpanLookupSize;
  int[] mSpanOffsets;
  int mSpanOffsetsSize;
  int mVisibleAnchorPosition;
  
  static
  {
    StaggeredGridLayoutManager.SavedState.1 local1 = new android/support/v7/widget/StaggeredGridLayoutManager$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public StaggeredGridLayoutManager$SavedState() {}
  
  StaggeredGridLayoutManager$SavedState(Parcel paramParcel)
  {
    int j = paramParcel.readInt();
    this.mAnchorPosition = j;
    j = paramParcel.readInt();
    this.mVisibleAnchorPosition = j;
    j = paramParcel.readInt();
    this.mSpanOffsetsSize = j;
    j = this.mSpanOffsetsSize;
    Object localObject;
    if (j > 0)
    {
      j = this.mSpanOffsetsSize;
      localObject = new int[j];
      this.mSpanOffsets = ((int[])localObject);
      localObject = this.mSpanOffsets;
      paramParcel.readIntArray((int[])localObject);
    }
    j = paramParcel.readInt();
    this.mSpanLookupSize = j;
    j = this.mSpanLookupSize;
    if (j > 0)
    {
      j = this.mSpanLookupSize;
      localObject = new int[j];
      this.mSpanLookup = ((int[])localObject);
      localObject = this.mSpanLookup;
      paramParcel.readIntArray((int[])localObject);
    }
    j = paramParcel.readInt();
    if (j == i)
    {
      j = i;
      this.mReverseLayout = j;
      j = paramParcel.readInt();
      if (j != i) {
        break label199;
      }
      j = i;
      label149:
      this.mAnchorLayoutFromEnd = j;
      j = paramParcel.readInt();
      if (j != i) {
        break label207;
      }
    }
    for (;;)
    {
      this.mLastLayoutRTL = i;
      localObject = StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader();
      localObject = paramParcel.readArrayList((ClassLoader)localObject);
      this.mFullSpanItems = ((List)localObject);
      return;
      j = 0;
      localObject = null;
      break;
      label199:
      j = 0;
      localObject = null;
      break label149;
      label207:
      i = 0;
    }
  }
  
  public StaggeredGridLayoutManager$SavedState(SavedState paramSavedState)
  {
    int i = paramSavedState.mSpanOffsetsSize;
    this.mSpanOffsetsSize = i;
    i = paramSavedState.mAnchorPosition;
    this.mAnchorPosition = i;
    i = paramSavedState.mVisibleAnchorPosition;
    this.mVisibleAnchorPosition = i;
    Object localObject = paramSavedState.mSpanOffsets;
    this.mSpanOffsets = ((int[])localObject);
    i = paramSavedState.mSpanLookupSize;
    this.mSpanLookupSize = i;
    localObject = paramSavedState.mSpanLookup;
    this.mSpanLookup = ((int[])localObject);
    boolean bool = paramSavedState.mReverseLayout;
    this.mReverseLayout = bool;
    bool = paramSavedState.mAnchorLayoutFromEnd;
    this.mAnchorLayoutFromEnd = bool;
    bool = paramSavedState.mLastLayoutRTL;
    this.mLastLayoutRTL = bool;
    localObject = paramSavedState.mFullSpanItems;
    this.mFullSpanItems = ((List)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  void invalidateAnchorPositionInfo()
  {
    int i = -1;
    this.mSpanOffsets = null;
    this.mSpanOffsetsSize = 0;
    this.mAnchorPosition = i;
    this.mVisibleAnchorPosition = i;
  }
  
  void invalidateSpanInfo()
  {
    this.mSpanOffsets = null;
    this.mSpanOffsetsSize = 0;
    this.mSpanLookupSize = 0;
    this.mSpanLookup = null;
    this.mFullSpanItems = null;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    int j = this.mAnchorPosition;
    paramParcel.writeInt(j);
    j = this.mVisibleAnchorPosition;
    paramParcel.writeInt(j);
    j = this.mSpanOffsetsSize;
    paramParcel.writeInt(j);
    j = this.mSpanOffsetsSize;
    Object localObject;
    if (j > 0)
    {
      localObject = this.mSpanOffsets;
      paramParcel.writeIntArray((int[])localObject);
    }
    j = this.mSpanLookupSize;
    paramParcel.writeInt(j);
    j = this.mSpanLookupSize;
    if (j > 0)
    {
      localObject = this.mSpanLookup;
      paramParcel.writeIntArray((int[])localObject);
    }
    int k = this.mReverseLayout;
    label130:
    boolean bool;
    if (k != 0)
    {
      k = i;
      paramParcel.writeInt(k);
      int m = this.mAnchorLayoutFromEnd;
      if (m == 0) {
        break label174;
      }
      m = i;
      paramParcel.writeInt(m);
      bool = this.mLastLayoutRTL;
      if (!bool) {
        break label183;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      localObject = this.mFullSpanItems;
      paramParcel.writeList((List)localObject);
      return;
      bool = false;
      localObject = null;
      break;
      label174:
      bool = false;
      localObject = null;
      break label130;
      label183:
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager$SavedState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */