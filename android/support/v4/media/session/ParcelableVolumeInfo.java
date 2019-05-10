package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  static
  {
    ParcelableVolumeInfo.1 local1 = new android/support/v4/media/session/ParcelableVolumeInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.a = i;
    i = paramParcel.readInt();
    this.c = i;
    i = paramParcel.readInt();
    this.d = i;
    i = paramParcel.readInt();
    this.e = i;
    i = paramParcel.readInt();
    this.b = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.a;
    paramParcel.writeInt(i);
    i = this.c;
    paramParcel.writeInt(i);
    i = this.d;
    paramParcel.writeInt(i);
    i = this.e;
    paramParcel.writeInt(i);
    i = this.b;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\ParcelableVolumeInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */