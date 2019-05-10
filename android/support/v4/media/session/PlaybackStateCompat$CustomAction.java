package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String a;
  private final CharSequence b;
  private final int c;
  private final Bundle d;
  private Object e;
  
  static
  {
    PlaybackStateCompat.CustomAction.1 local1 = new android/support/v4/media/session/PlaybackStateCompat$CustomAction$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.a = ((String)localObject);
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    this.b = ((CharSequence)localObject);
    int i = paramParcel.readInt();
    this.c = i;
    localObject = paramParcel.readBundle();
    this.d = ((Bundle)localObject);
  }
  
  PlaybackStateCompat$CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
  {
    this.a = paramString;
    this.b = paramCharSequence;
    this.c = paramInt;
    this.d = paramBundle;
  }
  
  public static CustomAction a(Object paramObject)
  {
    int i;
    CustomAction localCustomAction;
    if (paramObject != null)
    {
      i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j) {}
    }
    else
    {
      i = 0;
      localCustomAction = null;
    }
    for (;;)
    {
      return localCustomAction;
      localCustomAction = new android/support/v4/media/session/PlaybackStateCompat$CustomAction;
      String str = e.a.a(paramObject);
      CharSequence localCharSequence = e.a.b(paramObject);
      int k = e.a.c(paramObject);
      Bundle localBundle = e.a.d(paramObject);
      localCustomAction.<init>(str, localCharSequence, k, localBundle);
      localCustomAction.e = paramObject;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Action:mName='");
    Object localObject = this.b;
    localStringBuilder = localStringBuilder.append(localObject).append(", mIcon=");
    int i = this.c;
    localStringBuilder = localStringBuilder.append(i).append(", mExtras=");
    localObject = this.d;
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.a;
    paramParcel.writeString((String)localObject);
    TextUtils.writeToParcel(this.b, paramParcel, paramInt);
    int i = this.c;
    paramParcel.writeInt(i);
    localObject = this.d;
    paramParcel.writeBundle((Bundle)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\PlaybackStateCompat$CustomAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */