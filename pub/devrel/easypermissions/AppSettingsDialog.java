package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;

public class AppSettingsDialog
  implements DialogInterface.OnClickListener, Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final String a;
  private final String b;
  private final String c;
  private final String d;
  private final int e;
  private Context f;
  private Object g;
  private DialogInterface.OnClickListener h;
  
  static
  {
    AppSettingsDialog.1 local1 = new pub/devrel/easypermissions/AppSettingsDialog$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  private AppSettingsDialog(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.a = str;
    str = paramParcel.readString();
    this.b = str;
    str = paramParcel.readString();
    this.c = str;
    str = paramParcel.readString();
    this.d = str;
    int i = paramParcel.readInt();
    this.e = i;
  }
  
  private void a(Intent paramIntent)
  {
    Object localObject = this.g;
    boolean bool = localObject instanceof Activity;
    int i;
    if (bool)
    {
      localObject = (Activity)this.g;
      i = this.e;
      ((Activity)localObject).startActivityForResult(paramIntent, i);
    }
    for (;;)
    {
      return;
      localObject = this.g;
      bool = localObject instanceof android.support.v4.app.Fragment;
      if (bool)
      {
        localObject = (android.support.v4.app.Fragment)this.g;
        i = this.e;
        ((android.support.v4.app.Fragment)localObject).startActivityForResult(paramIntent, i);
      }
      else
      {
        localObject = this.g;
        bool = localObject instanceof android.app.Fragment;
        if (bool)
        {
          localObject = (android.app.Fragment)this.g;
          i = this.e;
          ((android.app.Fragment)localObject).startActivityForResult(paramIntent, i);
        }
      }
    }
  }
  
  AlertDialog a()
  {
    AlertDialog.Builder localBuilder = new android/support/v7/app/AlertDialog$Builder;
    Object localObject = this.f;
    localBuilder.<init>((Context)localObject);
    localBuilder = localBuilder.setCancelable(false);
    localObject = this.b;
    localBuilder = localBuilder.setTitle((CharSequence)localObject);
    localObject = this.a;
    localBuilder = localBuilder.setMessage((CharSequence)localObject);
    localObject = this.c;
    localBuilder = localBuilder.setPositiveButton((CharSequence)localObject, this);
    localObject = this.d;
    DialogInterface.OnClickListener localOnClickListener = this.h;
    return localBuilder.setNegativeButton((CharSequence)localObject, localOnClickListener).show();
  }
  
  void a(Context paramContext)
  {
    this.f = paramContext;
  }
  
  void a(DialogInterface.OnClickListener paramOnClickListener)
  {
    this.h = paramOnClickListener;
  }
  
  void a(Object paramObject)
  {
    this.g = paramObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.settings.APPLICATION_DETAILS_SETTINGS");
    String str = this.f.getPackageName();
    Uri localUri = Uri.fromParts("package", str, null);
    localIntent.setData(localUri);
    a(localIntent);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.a;
    paramParcel.writeString(str);
    str = this.b;
    paramParcel.writeString(str);
    str = this.c;
    paramParcel.writeString(str);
    str = this.d;
    paramParcel.writeString(str);
    int i = this.e;
    paramParcel.writeInt(i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\pub\devrel\easypermissions\AppSettingsDialog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */