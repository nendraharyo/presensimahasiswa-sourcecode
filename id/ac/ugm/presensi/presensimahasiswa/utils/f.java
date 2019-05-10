package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class f
{
  private static SharedPreferences a;
  
  public static void a(Context paramContext, String paramString, int paramInt)
  {
    a = paramContext.getSharedPreferences("loyalty_pref", 0);
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putInt(paramString, paramInt);
    localEditor.commit();
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    a = paramContext.getSharedPreferences("loyalty_pref", 0);
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putString(paramString1, paramString2);
    localEditor.commit();
  }
  
  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    a = paramContext.getSharedPreferences("loyalty_pref", 0);
    SharedPreferences.Editor localEditor = a.edit();
    localEditor.putBoolean(paramString, paramBoolean);
    localEditor.commit();
  }
  
  public static int b(Context paramContext, String paramString, int paramInt)
  {
    a = paramContext.getSharedPreferences("loyalty_pref", 0);
    return a.getInt(paramString, paramInt);
  }
  
  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    a = paramContext.getSharedPreferences("loyalty_pref", 0);
    return a.getString(paramString1, paramString2);
  }
  
  public static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    a = paramContext.getSharedPreferences("loyalty_pref", 0);
    return a.getBoolean(paramString, paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */