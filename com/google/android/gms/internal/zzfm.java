package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfm
  extends zzfs
{
  private final Context mContext;
  private String zzCU;
  private long zzCV;
  private long zzCW;
  private String zzCX;
  private String zzCY;
  private final Map zzxA;
  
  public zzfm(zzjp paramzzjp, Map paramMap)
  {
    super(paramzzjp, "createCalendarEvent");
    this.zzxA = paramMap;
    Activity localActivity = paramzzjp.zzhP();
    this.mContext = localActivity;
    zzeK();
  }
  
  private String zzaj(String paramString)
  {
    Object localObject = (CharSequence)this.zzxA.get(paramString);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool) {}
    for (localObject = "";; localObject = (String)this.zzxA.get(paramString)) {
      return (String)localObject;
    }
  }
  
  private long zzak(String paramString)
  {
    long l1 = -1;
    String str = (String)this.zzxA.get(paramString);
    long l2;
    if (str == null) {
      l2 = l1;
    }
    for (;;)
    {
      return l2;
      try
      {
        l2 = Long.parseLong(str);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        l2 = l1;
      }
    }
  }
  
  private void zzeK()
  {
    String str = zzaj("description");
    this.zzCU = str;
    str = zzaj("summary");
    this.zzCX = str;
    long l = zzak("start_ticks");
    this.zzCV = l;
    l = zzak("end_ticks");
    this.zzCW = l;
    str = zzaj("location");
    this.zzCY = str;
  }
  
  Intent createIntent()
  {
    long l1 = -1;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.EDIT");
    Object localObject = CalendarContract.Events.CONTENT_URI;
    localIntent = localIntent.setData((Uri)localObject);
    String str = this.zzCU;
    localIntent.putExtra("title", str);
    str = this.zzCY;
    localIntent.putExtra("eventLocation", str);
    localObject = "description";
    str = this.zzCX;
    localIntent.putExtra((String)localObject, str);
    long l2 = this.zzCV;
    boolean bool = l2 < l1;
    if (bool)
    {
      localObject = "beginTime";
      l2 = this.zzCV;
      localIntent.putExtra((String)localObject, l2);
    }
    l2 = this.zzCW;
    bool = l2 < l1;
    if (bool)
    {
      localObject = "endTime";
      l2 = this.zzCW;
      localIntent.putExtra((String)localObject, l2);
    }
    localIntent.setFlags(268435456);
    return localIntent;
  }
  
  public void execute()
  {
    Object localObject1 = this.mContext;
    if (localObject1 == null)
    {
      localObject1 = "Activity context is not available.";
      zzam((String)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = zzr.zzbC();
      Object localObject2 = this.mContext;
      localObject1 = ((zzir)localObject1).zzM((Context)localObject2);
      boolean bool = ((zzbl)localObject1).zzdo();
      if (!bool)
      {
        localObject1 = "This feature is not available on the device.";
        zzam((String)localObject1);
      }
      else
      {
        localObject1 = zzr.zzbC();
        localObject2 = this.mContext;
        localObject1 = ((zzir)localObject1).zzL((Context)localObject2);
        localObject2 = zzr.zzbF();
        int i = R.string.create_calendar_title;
        localObject2 = ((zzih)localObject2).zzd(i, "Create calendar event");
        ((AlertDialog.Builder)localObject1).setTitle((CharSequence)localObject2);
        localObject2 = zzr.zzbF();
        i = R.string.create_calendar_message;
        localObject2 = ((zzih)localObject2).zzd(i, "Allow Ad to create a calendar event?");
        ((AlertDialog.Builder)localObject1).setMessage((CharSequence)localObject2);
        localObject2 = zzr.zzbF();
        i = R.string.accept;
        localObject2 = ((zzih)localObject2).zzd(i, "Accept");
        Object localObject3 = new com/google/android/gms/internal/zzfm$1;
        ((zzfm.1)localObject3).<init>(this);
        ((AlertDialog.Builder)localObject1).setPositiveButton((CharSequence)localObject2, (DialogInterface.OnClickListener)localObject3);
        localObject2 = zzr.zzbF();
        i = R.string.decline;
        String str = "Decline";
        localObject2 = ((zzih)localObject2).zzd(i, str);
        localObject3 = new com/google/android/gms/internal/zzfm$2;
        ((zzfm.2)localObject3).<init>(this);
        ((AlertDialog.Builder)localObject1).setNegativeButton((CharSequence)localObject2, (DialogInterface.OnClickListener)localObject3);
        localObject1 = ((AlertDialog.Builder)localObject1).create();
        ((AlertDialog)localObject1).show();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */