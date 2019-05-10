package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.app.AlertDialog;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.i;
import android.view.View;
import android.view.View.OnClickListener;
import id.ac.ugm.presensi.presensimahasiswa.Dashboard.response.DashboardActivity;
import id.ac.ugm.presensi.presensimahasiswa.utils.Common;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;

class c$7
  implements View.OnClickListener
{
  c$7(c paramc, AlertDialog paramAlertDialog, String[] paramArrayOfString, int paramInt, String paramString) {}
  
  public void onClick(View paramView)
  {
    this.a.dismiss();
    Object localObject1 = c.d(this.e);
    Object localObject2 = ((Vector)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (AlertDialog)((Iterator)localObject2).next();
      boolean bool2 = ((AlertDialog)localObject1).isShowing();
      if (bool2) {
        ((AlertDialog)localObject1).dismiss();
      }
    }
    localObject1 = this.b[0];
    localObject2 = "";
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool1)
    {
      localObject1 = this.b;
      localObject2 = "{\"history\":[],\"totalPage\":0}";
      localObject1[0] = localObject2;
    }
    localObject1 = this.e.getActivity();
    Object localObject3 = "";
    localObject1 = f.b((Context)localObject1, "at_current_mk", (String)localObject3);
    localObject2 = "";
    boolean bool3 = ((String)localObject1).equals(localObject2);
    if (bool3)
    {
      localObject1 = this.e;
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      c.a((c)localObject1, (JSONArray)localObject2);
    }
    for (;;)
    {
      try
      {
        localObject1 = this.e;
        localObject2 = this.e;
        localObject2 = c.e((c)localObject2);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        k = this.c;
        localObject3 = ((StringBuilder)localObject3).append(k);
        str = "";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).toString();
        bool1 = ((c)localObject1).a((JSONArray)localObject2, (String)localObject3);
        if (!bool1)
        {
          localObject1 = this.e;
          localObject1 = c.e((c)localObject1);
          int j = this.c;
          ((JSONArray)localObject1).put(j);
          localObject1 = this.e;
          localObject1 = ((c)localObject1).getActivity();
          localObject2 = "at_current_mk";
          localObject3 = this.e;
          localObject3 = c.e((c)localObject3);
          localObject3 = ((JSONArray)localObject3).toString();
          f.a((Context)localObject1, (String)localObject2, (String)localObject3);
        }
      }
      catch (JSONException localJSONException2)
      {
        int k;
        String str;
        localJSONException2.printStackTrace();
        continue;
      }
      localObject1 = new java/io/File;
      localObject2 = Common.a("/PresensiUGM").getAbsolutePath();
      ((File)localObject1).<init>((String)localObject2);
      localObject2 = Common.a("/PresensiUGM").getAbsolutePath();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = (String)localObject2 + "/logUgmPresence.db";
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((File)localObject1, "logUgmPresence.db");
      ((File)localObject3).exists();
      localObject1 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject1).<init>("dd-MM-yyyy HH:mm:ss");
      localObject3 = TimeZone.getTimeZone("GMT+0700");
      ((DateFormat)localObject1).setTimeZone((TimeZone)localObject3);
      localObject3 = Calendar.getInstance().getTime();
      localObject1 = ((DateFormat)localObject1).format((Date)localObject3);
      localObject3 = this.e.getActivity();
      k = 0;
      str = null;
      localObject2 = ((i)localObject3).openOrCreateDatabase((String)localObject2, 0, null);
      try
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        str = "CREATE TABLE IF NOT EXISTS log_presence (ID INTEGER primary key AUTOINCREMENT,CARDID TEXT,CARDNAME TEXT,DATEAT TEXT default '";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = "');";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((SQLiteDatabase)localObject2).execSQL((String)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "INSERT or replace INTO log_presence (CARDID, CARDNAME) VALUES('";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        int i = this.c;
        localObject1 = ((StringBuilder)localObject1).append(i);
        localObject3 = "','";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = this.d;
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject3 = "')";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).toString();
        ((SQLiteDatabase)localObject2).execSQL((String)localObject1);
      }
      catch (Exception localException)
      {
        continue;
      }
      localObject1 = c.f(this.e);
      bool1 = localObject1 instanceof DashboardActivity;
      if (bool1)
      {
        localObject1 = (DashboardActivity)c.f(this.e);
        ((DashboardActivity)localObject1).a();
      }
      return;
      try
      {
        localObject2 = this.e;
        localObject3 = new org/json/JSONArray;
        ((JSONArray)localObject3).<init>((String)localObject1);
        c.a((c)localObject2, (JSONArray)localObject3);
      }
      catch (JSONException localJSONException1)
      {
        localJSONException1.printStackTrace();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\c$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */