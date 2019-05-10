package id.ac.ugm.presensi.presensimahasiswa.Dashboard.response;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import b.a.a.a.e;
import com.loopj.android.http.AsyncHttpResponseHandler;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.c;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class DashboardActivity$7
  extends AsyncHttpResponseHandler
{
  DashboardActivity$7(DashboardActivity paramDashboardActivity) {}
  
  /* Error */
  public void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: ldc 15
    //   5: astore 6
    //   7: aload_0
    //   8: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   11: getfield 20	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:a	Landroid/app/ProgressDialog;
    //   14: astore 7
    //   16: aload 7
    //   18: ifnull +38 -> 56
    //   21: aload_0
    //   22: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   25: getfield 20	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:a	Landroid/app/ProgressDialog;
    //   28: astore 7
    //   30: aload 7
    //   32: invokevirtual 26	android/app/ProgressDialog:isShowing	()Z
    //   35: istore 8
    //   37: iload 8
    //   39: ifeq +17 -> 56
    //   42: aload_0
    //   43: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   46: getfield 20	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:a	Landroid/app/ProgressDialog;
    //   49: astore 7
    //   51: aload 7
    //   53: invokevirtual 29	android/app/ProgressDialog:dismiss	()V
    //   56: aload_3
    //   57: ifnull +74 -> 131
    //   60: new 31	java/lang/String
    //   63: astore 9
    //   65: ldc 33
    //   67: astore 7
    //   69: aload 9
    //   71: aload_3
    //   72: aload 7
    //   74: invokespecial 36	java/lang/String:<init>	([BLjava/lang/String;)V
    //   77: new 38	org/json/JSONObject
    //   80: astore 7
    //   82: new 31	java/lang/String
    //   85: astore 6
    //   87: ldc 33
    //   89: astore 10
    //   91: aload 6
    //   93: aload_3
    //   94: aload 10
    //   96: invokespecial 36	java/lang/String:<init>	([BLjava/lang/String;)V
    //   99: aload 7
    //   101: aload 6
    //   103: invokespecial 41	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   106: ldc 43
    //   108: astore 6
    //   110: aload 7
    //   112: aload 6
    //   114: invokevirtual 47	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   117: pop
    //   118: ldc 49
    //   120: astore 6
    //   122: aload 7
    //   124: aload 6
    //   126: invokevirtual 47	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   129: pop
    //   130: return
    //   131: invokestatic 52	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:c	()Z
    //   134: istore 8
    //   136: iload 8
    //   138: ifne +153 -> 291
    //   141: aload_0
    //   142: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   145: astore 7
    //   147: aload 7
    //   149: invokevirtual 56	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:getApplicationContext	()Landroid/content/Context;
    //   152: astore 7
    //   154: aload_0
    //   155: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   158: astore 9
    //   160: aload 9
    //   162: invokevirtual 60	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:getResources	()Landroid/content/res/Resources;
    //   165: astore 9
    //   167: ldc 61
    //   169: istore 11
    //   171: aload 9
    //   173: iload 11
    //   175: invokevirtual 68	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   178: astore 9
    //   180: iconst_1
    //   181: istore 11
    //   183: aload 7
    //   185: aload 9
    //   187: iload 11
    //   189: invokestatic 74	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   192: astore 7
    //   194: aload 7
    //   196: invokevirtual 77	android/widget/Toast:show	()V
    //   199: goto -69 -> 130
    //   202: astore 7
    //   204: aload 7
    //   206: invokevirtual 82	java/lang/InterruptedException:printStackTrace	()V
    //   209: goto -79 -> 130
    //   212: astore 7
    //   214: aload 6
    //   216: astore 9
    //   218: aload 7
    //   220: invokevirtual 85	org/json/JSONException:printStackTrace	()V
    //   223: aload_0
    //   224: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   227: invokevirtual 56	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:getApplicationContext	()Landroid/content/Context;
    //   230: astore 6
    //   232: new 87	java/lang/StringBuilder
    //   235: astore 10
    //   237: aload 10
    //   239: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   242: ldc 90
    //   244: astore 12
    //   246: aload 10
    //   248: aload 12
    //   250: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: astore 10
    //   255: aload 10
    //   257: aload 9
    //   259: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: astore 9
    //   267: aload 6
    //   269: aload 9
    //   271: iload 5
    //   273: invokestatic 74	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   276: astore 9
    //   278: aload 9
    //   280: invokevirtual 77	android/widget/Toast:show	()V
    //   283: aload 7
    //   285: invokevirtual 85	org/json/JSONException:printStackTrace	()V
    //   288: goto -158 -> 130
    //   291: aload_0
    //   292: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   295: astore 7
    //   297: aload 7
    //   299: invokevirtual 56	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:getApplicationContext	()Landroid/content/Context;
    //   302: astore 7
    //   304: aload_0
    //   305: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   308: astore 9
    //   310: aload 9
    //   312: invokevirtual 60	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:getResources	()Landroid/content/res/Resources;
    //   315: astore 9
    //   317: ldc 99
    //   319: istore 11
    //   321: aload 9
    //   323: iload 11
    //   325: invokevirtual 68	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   328: astore 9
    //   330: iconst_1
    //   331: istore 11
    //   333: aload 7
    //   335: aload 9
    //   337: iload 11
    //   339: invokestatic 74	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   342: astore 7
    //   344: aload 7
    //   346: invokevirtual 77	android/widget/Toast:show	()V
    //   349: goto -219 -> 130
    //   352: astore 7
    //   354: aload 7
    //   356: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   359: goto -229 -> 130
    //   362: astore 7
    //   364: aload_0
    //   365: getfield 8	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity$7:a	Lid/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity;
    //   368: invokevirtual 56	id/ac/ugm/presensi/presensimahasiswa/Dashboard/response/DashboardActivity:getApplicationContext	()Landroid/content/Context;
    //   371: astore 9
    //   373: new 87	java/lang/StringBuilder
    //   376: astore 10
    //   378: aload 10
    //   380: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   383: ldc 105
    //   385: astore 12
    //   387: aload 10
    //   389: aload 12
    //   391: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: astore 10
    //   396: aload 10
    //   398: aload 6
    //   400: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: astore 6
    //   408: aload 9
    //   410: aload 6
    //   412: iload 5
    //   414: invokestatic 74	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   417: astore 9
    //   419: aload 9
    //   421: invokevirtual 77	android/widget/Toast:show	()V
    //   424: aload 7
    //   426: invokevirtual 108	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   429: goto -299 -> 130
    //   432: astore 7
    //   434: aload 9
    //   436: astore 6
    //   438: goto -74 -> 364
    //   441: astore 7
    //   443: goto -225 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	446	0	this	7
    //   0	446	1	paramInt	int
    //   0	446	2	paramArrayOfe	e[]
    //   0	446	3	paramArrayOfByte	byte[]
    //   0	446	4	paramThrowable	Throwable
    //   1	412	5	i	int
    //   5	432	6	localObject1	Object
    //   14	181	7	localObject2	Object
    //   202	3	7	localInterruptedException	InterruptedException
    //   212	72	7	localJSONException1	JSONException
    //   295	50	7	localObject3	Object
    //   352	3	7	localIOException	java.io.IOException
    //   362	63	7	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   432	1	7	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   441	1	7	localJSONException2	JSONException
    //   35	102	8	bool	boolean
    //   63	372	9	localObject4	Object
    //   89	308	10	localObject5	Object
    //   169	169	11	j	int
    //   244	146	12	str	String
    // Exception table:
    //   from	to	target	type
    //   131	134	202	java/lang/InterruptedException
    //   141	145	202	java/lang/InterruptedException
    //   147	152	202	java/lang/InterruptedException
    //   154	158	202	java/lang/InterruptedException
    //   160	165	202	java/lang/InterruptedException
    //   173	178	202	java/lang/InterruptedException
    //   187	192	202	java/lang/InterruptedException
    //   194	199	202	java/lang/InterruptedException
    //   291	295	202	java/lang/InterruptedException
    //   297	302	202	java/lang/InterruptedException
    //   304	308	202	java/lang/InterruptedException
    //   310	315	202	java/lang/InterruptedException
    //   323	328	202	java/lang/InterruptedException
    //   337	342	202	java/lang/InterruptedException
    //   344	349	202	java/lang/InterruptedException
    //   60	63	212	org/json/JSONException
    //   72	77	212	org/json/JSONException
    //   131	134	212	org/json/JSONException
    //   141	145	212	org/json/JSONException
    //   147	152	212	org/json/JSONException
    //   154	158	212	org/json/JSONException
    //   160	165	212	org/json/JSONException
    //   173	178	212	org/json/JSONException
    //   187	192	212	org/json/JSONException
    //   194	199	212	org/json/JSONException
    //   204	209	212	org/json/JSONException
    //   291	295	212	org/json/JSONException
    //   297	302	212	org/json/JSONException
    //   304	308	212	org/json/JSONException
    //   310	315	212	org/json/JSONException
    //   323	328	212	org/json/JSONException
    //   337	342	212	org/json/JSONException
    //   344	349	212	org/json/JSONException
    //   354	359	212	org/json/JSONException
    //   131	134	352	java/io/IOException
    //   141	145	352	java/io/IOException
    //   147	152	352	java/io/IOException
    //   154	158	352	java/io/IOException
    //   160	165	352	java/io/IOException
    //   173	178	352	java/io/IOException
    //   187	192	352	java/io/IOException
    //   194	199	352	java/io/IOException
    //   291	295	352	java/io/IOException
    //   297	302	352	java/io/IOException
    //   304	308	352	java/io/IOException
    //   310	315	352	java/io/IOException
    //   323	328	352	java/io/IOException
    //   337	342	352	java/io/IOException
    //   344	349	352	java/io/IOException
    //   60	63	362	java/io/UnsupportedEncodingException
    //   72	77	362	java/io/UnsupportedEncodingException
    //   131	134	362	java/io/UnsupportedEncodingException
    //   141	145	362	java/io/UnsupportedEncodingException
    //   147	152	362	java/io/UnsupportedEncodingException
    //   154	158	362	java/io/UnsupportedEncodingException
    //   160	165	362	java/io/UnsupportedEncodingException
    //   173	178	362	java/io/UnsupportedEncodingException
    //   187	192	362	java/io/UnsupportedEncodingException
    //   194	199	362	java/io/UnsupportedEncodingException
    //   204	209	362	java/io/UnsupportedEncodingException
    //   291	295	362	java/io/UnsupportedEncodingException
    //   297	302	362	java/io/UnsupportedEncodingException
    //   304	308	362	java/io/UnsupportedEncodingException
    //   310	315	362	java/io/UnsupportedEncodingException
    //   323	328	362	java/io/UnsupportedEncodingException
    //   337	342	362	java/io/UnsupportedEncodingException
    //   344	349	362	java/io/UnsupportedEncodingException
    //   354	359	362	java/io/UnsupportedEncodingException
    //   77	80	432	java/io/UnsupportedEncodingException
    //   82	85	432	java/io/UnsupportedEncodingException
    //   94	99	432	java/io/UnsupportedEncodingException
    //   101	106	432	java/io/UnsupportedEncodingException
    //   112	118	432	java/io/UnsupportedEncodingException
    //   124	130	432	java/io/UnsupportedEncodingException
    //   77	80	441	org/json/JSONException
    //   82	85	441	org/json/JSONException
    //   94	99	441	org/json/JSONException
    //   101	106	441	org/json/JSONException
    //   112	118	441	org/json/JSONException
    //   124	130	441	org/json/JSONException
  }
  
  public void onFinish()
  {
    super.onFinish();
    ProgressDialog localProgressDialog = this.a.a;
    if (localProgressDialog != null)
    {
      localProgressDialog = this.a.a;
      boolean bool = localProgressDialog.isShowing();
      if (bool)
      {
        localProgressDialog = this.a.a;
        localProgressDialog.dismiss();
      }
    }
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        Object localObject2 = new java/lang/String;
        String str = "UTF-8";
        ((String)localObject2).<init>(paramArrayOfByte, str);
        ((JSONObject)localObject1).<init>((String)localObject2);
        localObject2 = "content";
        ((JSONObject)localObject1).getJSONObject((String)localObject2);
        localObject2 = "status";
        int i = ((JSONObject)localObject1).getInt((String)localObject2);
        int j = 200;
        if (i == j)
        {
          localObject1 = this.a;
          localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/c;
          ((c)localObject2).<init>();
          DashboardActivity.a((DashboardActivity)localObject1, (Fragment)localObject2);
          localObject1 = this.a;
          localObject2 = this.a;
          localObject2 = DashboardActivity.f((DashboardActivity)localObject2);
          DashboardActivity.b((DashboardActivity)localObject1, (Fragment)localObject2);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        Object localObject1;
        localJSONException.printStackTrace();
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        continue;
      }
      localObject1 = this.a;
      ((DashboardActivity)localObject1).d();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Dashboard\response\DashboardActivity$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */