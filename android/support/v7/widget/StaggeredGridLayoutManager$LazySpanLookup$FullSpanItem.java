package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  int mGapDir;
  int[] mGapPerSpan;
  boolean mHasUnwantedGapAfter;
  int mPosition;
  
  static
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1 local1 = new android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {}
  
  StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel paramParcel)
  {
    int j = paramParcel.readInt();
    this.mPosition = j;
    j = paramParcel.readInt();
    this.mGapDir = j;
    j = paramParcel.readInt();
    if (j == i) {}
    for (;;)
    {
      this.mHasUnwantedGapAfter = i;
      i = paramParcel.readInt();
      if (i > 0)
      {
        arrayOfInt = new int[i];
        this.mGapPerSpan = arrayOfInt;
        arrayOfInt = this.mGapPerSpan;
        paramParcel.readIntArray(arrayOfInt);
      }
      return;
      i = 0;
      int[] arrayOfInt = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getGapForSpan(int paramInt)
  {
    int[] arrayOfInt = this.mGapPerSpan;
    int i;
    if (arrayOfInt == null)
    {
      i = 0;
      arrayOfInt = null;
    }
    for (;;)
    {
      return i;
      arrayOfInt = this.mGapPerSpan;
      i = arrayOfInt[paramInt];
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("FullSpanItem{mPosition=");
    int i = this.mPosition;
    localStringBuilder = localStringBuilder.append(i).append(", mGapDir=");
    i = this.mGapDir;
    localStringBuilder = localStringBuilder.append(i).append(", mHasUnwantedGapAfter=");
    boolean bool = this.mHasUnwantedGapAfter;
    localStringBuilder = localStringBuilder.append(bool).append(", mGapPerSpan=");
    String str = Arrays.toString(this.mGapPerSpan);
    return str + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.mPosition;
    paramParcel.writeInt(i);
    i = this.mGapDir;
    paramParcel.writeInt(i);
    int j = this.mHasUnwantedGapAfter;
    int[] arrayOfInt;
    int k;
    if (j != 0)
    {
      j = 1;
      paramParcel.writeInt(j);
      arrayOfInt = this.mGapPerSpan;
      if (arrayOfInt == null) {
        break label93;
      }
      arrayOfInt = this.mGapPerSpan;
      k = arrayOfInt.length;
      if (k <= 0) {
        break label93;
      }
      k = this.mGapPerSpan.length;
      paramParcel.writeInt(k);
      arrayOfInt = this.mGapPerSpan;
      paramParcel.writeIntArray(arrayOfInt);
    }
    for (;;)
    {
      return;
      k = 0;
      arrayOfInt = null;
      break;
      label93:
      paramParcel.writeInt(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */