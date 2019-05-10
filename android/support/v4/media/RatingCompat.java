package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int a;
  private final float b;
  
  static
  {
    RatingCompat.1 local1 = new android/support/v4/media/RatingCompat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  RatingCompat(int paramInt, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public int describeContents()
  {
    return this.a;
  }
  
  public String toString()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Rating:style=");
    int i = this.a;
    localObject = ((StringBuilder)localObject).append(i);
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(" rating=");
    float f = this.b;
    boolean bool = f < 0.0F;
    if (bool) {}
    for (localObject = "unrated";; localObject = String.valueOf(f))
    {
      return (String)localObject;
      f = this.b;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.a;
    paramParcel.writeInt(i);
    float f = this.b;
    paramParcel.writeFloat(f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\RatingCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */